import javax.swing.*;
import java.awt.*;

public class AccommodationPanel extends JPanel {

    private MainFrame mainFrame;
    private JCheckBox cbAccommodation;

    public AccommodationPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        setLayout(new BorderLayout(10, 10));

        JLabel lblTitle = new JLabel("Accommodation Selection", JLabel.CENTER);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        add(lblTitle, BorderLayout.NORTH);

        cbAccommodation = new JCheckBox("Do you want accommodation?");
        add(cbAccommodation, BorderLayout.CENTER);

        JButton btnNext = new JButton("Next");
        btnNext.addActionListener(e -> mainFrame.showPanel("Bill"));
        add(btnNext, BorderLayout.SOUTH);
    }

    public boolean isAccommodationSelected() {
        return cbAccommodation.isSelected();
    }
}
