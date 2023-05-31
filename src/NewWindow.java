import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewWindow {
    JFrame frame = new JFrame("Arithmetic Sequence");
    JLabel label = new JLabel("Enter the Starting Number:");
    JTextField  textField = new JTextField();
    JLabel label1 = new JLabel("Enter the Operation you want to do (s for subtraction, a for addition):");
    JTextField textField1 = new JTextField();
    JLabel label2 = new JLabel("Enter the Common Difference:");
    JTextField textField2 = new JTextField();
    JLabel label3 = new JLabel("Enter the number you want to find in the sequence:");
    JTextField textField3 = new JTextField();
    NewWindow() {
        label.setBounds(0,25,200,50);
        label.setFont(new Font(null,Font.PLAIN,15));
        label1.setBounds(0,75,500,50);
        label1.setFont(new Font(null,Font.PLAIN,15));
        label2.setBounds(0,125,300,50);
        label2.setFont(new Font(null,Font.PLAIN,15));
        label3.setBounds(0,175,500,50);
        label3.setFont(new Font(null,Font.PLAIN,15));

        textField.setBounds(175,40,100,20);


        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(textField);

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
