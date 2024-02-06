import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Main {
    ArrayList<item> itemArrayList = new ArrayList<>();
    // BillingSystem class definition
    public class BillingSystem {
        item finile = new item("finnile", 120); // Create an instance of Item
        JButton newItemButton = new JButton("New Item");
        JTextField newItemText = new JTextField(1);
        JSpinner newItemPrice = new JSpinner();
        public BillingSystem() {
            newItemButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String givenname = (newItemText.getText());
                    int givenprice = (Integer) newItemPrice.getValue();

                    itemArrayList.add(new item(givenname, givenprice));
                }
            });
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        BillingSystem billingSystem = main.new BillingSystem();
        JFrame frame = new JFrame("Billing System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout());
        frame.getContentPane().add(billingSystem.newItemButton);
        frame.getContentPane().add(billingSystem.newItemText);
        frame.getContentPane().add(billingSystem.newItemPrice);
        frame.setVisible(true);
    }
}
