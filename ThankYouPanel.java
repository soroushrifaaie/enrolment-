import javax.swing.*;
import java.awt.*;

public class ThankYouPanel extends JPanel {

    public ThankYouPanel() {
        setLayout(new BorderLayout(10, 10));

        JLabel lblTitle = new JLabel("Thank You for Choosing MMU!", JLabel.CENTER);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        add(lblTitle, BorderLayout.CENTER);
    }
}
