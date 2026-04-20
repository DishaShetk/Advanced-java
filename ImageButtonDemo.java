package lab4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo implements ActionListener {

    JFrame frame;
    JButton btnClock, btnHourGlass;
    JLabel label;

    public ImageButtonDemo() {

        // Create Frame
        frame = new JFrame("Image Button Demo");
        frame.setLayout(new FlowLayout());

        // Load Images (Make sure images are in project folder)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        // Create Buttons with Images
        btnClock = new JButton("Digital Clock", clockIcon);
        btnHourGlass = new JButton("Hour Glass", hourglassIcon);

        // Create Label
        label = new JLabel("Click a button");

        // Add Action Listener
        btnClock.addActionListener(this);
        btnHourGlass.addActionListener(this);

        // Add components to frame
        frame.add(btnClock);
        frame.add(btnHourGlass);
        frame.add(label);

        // Frame settings
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Event Handling
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnClock) {
            label.setText("Digital Clock is pressed");
        } 
        else if (e.getSource() == btnHourGlass) {
            label.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new ImageButtonDemo();
    }
}