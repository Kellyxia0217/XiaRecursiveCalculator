import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class NewWindow implements ActionListener, KeyListener {
    JFrame frame = new JFrame("Arithmetic Sequence");
    JLabel label = new JLabel("Enter the Starting Number:");
    JTextField  textField = new JTextField();
    JLabel label1 = new JLabel("Enter the Operation you want to do (s for subtraction, a for addition):");
    JTextField textField1 = new JTextField();
    JLabel label2 = new JLabel("Enter the Common Difference:");
    JTextField textField2 = new JTextField();
    JLabel label3 = new JLabel("Enter the number you want to find in the sequence:");
    JTextField textField3 = new JTextField();
    JButton button = new JButton("Submit");
    JTextArea textArea = new JTextArea();
    NewWindow() {
        label.setBounds(0,25,200,50);
        label.setFont(new Font(null,Font.PLAIN,15));
        label1.setBounds(0,75,500,50);
        label1.setFont(new Font(null,Font.PLAIN,15));
        label2.setBounds(0,125,300,50);
        label2.setFont(new Font(null,Font.PLAIN,15));
        label3.setBounds(0,175,500,50);
        label3.setFont(new Font(null,Font.PLAIN,15));

        textField.setBounds(175,42,100,20);
        textField.addActionListener(this);
        textField1.setBounds(440,92,100,20);
        textField1.addActionListener(this);
        textField2.setBounds(200,142,100,20);
        textField2.addActionListener(this);
        textField3.setBounds(330,192,100,20);
        textField3.addActionListener(this);
        button.setBounds(0,225,150,40);
        button.addActionListener(this);
        textArea.setBounds(0,300,1000,50);





        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(textField);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(textArea);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 420);
        frame.setLayout(null);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String a = e.getActionCommand();
            if (a.equals("Submit")) {
                int num = Integer.parseInt(textField.getText());
                String text1 = textField1.getText().toLowerCase();
                int num2 = Integer.parseInt(textField1.getText());
                double num3 = Double.parseDouble(textField1.getText());
               Sequence s1 = new Sequence(num,text1,num2,num3);

               for (Double s : s1.getList()) {
                   textArea.append(String.valueOf(s));
               }

            }
        }




    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
