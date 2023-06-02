import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewWindow1 {
    JFrame frame = new JFrame("Geometric Sequence");
    JLabel label = new JLabel("Enter the Starting Number:");
    JTextField  textField = new JTextField();
    JLabel label1 = new JLabel("Enter the Operation you want to do (m for multiplication, d for division):");
    JTextField textField1 = new JTextField();
    JLabel label2 = new JLabel("Enter the Common Difference:");
    JTextField textField2 = new JTextField();
    JLabel label3 = new JLabel("Enter the number you want to find in the sequence:");
    JTextField textField3 = new JTextField();
    NewWindow1() {
        label.setBounds(0,25,100,50);
        label.setFont(new Font(null,Font.PLAIN,12));
        label1.setBounds(0,25,100,50);
        label1.setFont(new Font(null,Font.PLAIN,25));
        label2.setBounds(0,25,100,50);
        label2.setFont(new Font(null,Font.PLAIN,25));
        label3.setBounds(0,25,100,50);
        label3.setFont(new Font(null,Font.PLAIN,25));

        textField.setBounds(25,25,100,40);


        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(textField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}