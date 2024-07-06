import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public MainFrame() {
        setTitle("MMU Enrollment System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Adding different panels
        mainPanel.add(new LevelSelectionPanel(this), "LevelSelection");
        mainPanel.add(new StackCoursesPanel(this), "StackCourses");
        mainPanel.add(new CourseSelectionPanel(this), "CourseSelection");
        mainPanel.add(new AccommodationPanel(this), "Accommodation");
        mainPanel.add(new BillPanel(this), "Bill");
        mainPanel.add(new ThankYouPanel(), "ThankYou");

        add(mainPanel);
        cardLayout.show(mainPanel, "LevelSelection");
    }

    public void showPanel(String panelName) {
        cardLayout.show(mainPanel, panelName);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
