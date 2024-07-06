import javax.swing.*;
import java.awt.*;

public class BillPanel extends JPanel {

    private MainFrame mainFrame;
    private JTextArea taBill;
    private CourseManager courseManager;

    public BillPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        courseManager = CourseManager.getInstance();
        setLayout(new BorderLayout(10, 10));

        JLabel lblTitle = new JLabel("Bill Summary", JLabel.CENTER);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        add(lblTitle, BorderLayout.NORTH);

        taBill = new JTextArea(10, 40);
        taBill.setEditable(false);
        add(new JScrollPane(taBill), BorderLayout.CENTER);

        JButton btnProceed = new JButton("Proceed with Payment");
        btnProceed.addActionListener(e -> mainFrame.showPanel("ThankYou"));
        add(btnProceed, BorderLayout.SOUTH);
    }

    @Override
    public void setVisible(boolean aFlag) {
        if (aFlag) {
            generateBill();
        }
        super.setVisible(aFlag);
    }

    private void generateBill() {
        double totalCost = 0;
        double discount = 0;
        double netPayable = 0;

        StringBuilder bill = new StringBuilder("Bill Summary:\n");

        for (Course course : courseManager.getCourses()) {
            totalCost += course.getCost();
            bill.append(course).append("\n");
        }

        if (courseManager.getCourses().size() > 1) {
            discount = totalCost * 0.10; // 10% discount for stacking courses
        }

        if (((AccommodationPanel) mainFrame.getMainPanel().getComponent(3)).isAccommodationSelected()) {
            totalCost += 300; // Accommodation fee
            bill.append("Accommodation Fee: RM300\n");
        }

        bill.append("IT/Network Fee: RM200\n");
        totalCost += 200;

        bill.append("Library Fee: RM150\n");
        totalCost += 150;

        bill.append("Club and Society Fee: RM100\n");
        totalCost += 100;

        netPayable = totalCost - discount;
        bill.append("\nTotal Cost: RM").append(totalCost);
        bill.append("\nDiscount: RM").append(discount);
        bill.append("\nNet Payable: RM").append(netPayable);

        taBill.setText(bill.toString());
    }
}
