package lab4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo implements ActionListener {

    JFrame frame;
    JButton btnIndia, btnSrilanka;
    JLabel label;

    public CountryButtonDemo() {

        // Create Frame
        frame = new JFrame("Country Button Demo");
        frame.setLayout(new FlowLayout());

        // Create Buttons
        btnIndia = new JButton("India");
        btnSrilanka = new JButton("Srilanka");

        // Create Label
        label = new JLabel("Click a button");

        // Add Action Listener
        btnIndia.addActionListener(this);
        btnSrilanka.addActionListener(this);

        // Add components to frame
        frame.add(btnIndia);
        frame.add(btnSrilanka);
        frame.add(label);

        // Frame settings
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Event Handling Method
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnIndia) {
            label.setText("India is pressed");
        } 
        else if (e.getSource() == btnSrilanka) {
            label.setText("Srilanka is pressed");
        }
    }

    public static void main(String[] args) {
        new CountryButtonDemo();
    }
}