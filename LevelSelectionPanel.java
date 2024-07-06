import javax.swing.*;
import java.awt.*;

public class LevelSelectionPanel extends JPanel {

    private MainFrame mainFrame;

    public LevelSelectionPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        setLayout(new BorderLayout(10, 10));

        JLabel lblTitle = new JLabel("Select Enrollment Option", JLabel.CENTER);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        add(lblTitle, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));

        JButton btnLevel1 = new JButton("Level 1: Remedial / Matriculation");
        JButton btnLevel2 = new JButton("Level 2: Undergraduate");
        JButton btnLevel3 = new JButton("Level 3: Postgraduate");
        JButton btnStackCourses = new JButton("Stack Courses (10% Discount)");

        panel.add(btnLevel1);
        panel.add(btnLevel2);
        panel.add(btnLevel3);
        panel.add(btnStackCourses);

        add(panel, BorderLayout.CENTER);

        btnLevel1.addActionListener(e -> showCourseSelectionPanel(1));
        btnLevel2.addActionListener(e -> showCourseSelectionPanel(2));
        btnLevel3.addActionListener(e -> showCourseSelectionPanel(3));
        btnStackCourses.addActionListener(e -> mainFrame.showPanel("StackCourses"));
    }

    private void showCourseSelectionPanel(int level) {
        CourseSelectionPanel courseSelectionPanel = (CourseSelectionPanel) mainFrame.getMainPanel().getComponent(2);
        courseSelectionPanel.setLevel(level);
        mainFrame.showPanel("CourseSelection");
    }
}
