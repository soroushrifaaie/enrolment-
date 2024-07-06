import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class StackCoursesPanel extends JPanel {

    private MainFrame mainFrame;
    private List<JCheckBox> checkBoxes;
    private List<Course> selectedCourses;
    private CourseManager courseManager;

    public StackCoursesPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        selectedCourses = new ArrayList<>();
        courseManager = CourseManager.getInstance();
        setLayout(new BorderLayout(10, 10));

        JLabel lblTitle = new JLabel("Stack Courses Selection", JLabel.CENTER);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        add(lblTitle, BorderLayout.NORTH);

        JPanel coursePanel = new JPanel(new GridLayout(0, 1, 10, 10));
        checkBoxes = new ArrayList<>();

        for (CourseType courseType : CourseType.values()) {
            JCheckBox checkBox = new JCheckBox(courseType.toString());
            checkBox.setActionCommand(courseType.name());
            checkBoxes.add(checkBox);
            coursePanel.add(checkBox);
        }

        add(new JScrollPane(coursePanel), BorderLayout.CENTER);

        JButton btnNext = new JButton("Next");
        btnNext.addActionListener(e -> {
            selectedCourses.clear();
            for (JCheckBox checkBox : checkBoxes) {
                if (checkBox.isSelected()) {
                    selectedCourses.add(new Course(CourseType.valueOf(checkBox.getActionCommand())));
                }
            }
            courseManager.addCourses(selectedCourses);
            mainFrame.showPanel("Accommodation");
        });
        add(btnNext, BorderLayout.SOUTH);
    }
}
