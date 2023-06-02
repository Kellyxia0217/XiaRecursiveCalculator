import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainGUI extends JFrame implements ActionListener, KeyListener {
        JFrame frame = new JFrame("Sequence");
        JButton myButton = new JButton("Arithmetic Sequence");
        JButton myButton1 = new JButton("Geometric Sequence");
        JButton myButton2 = new JButton("Arithmetic Series");
        JButton myButton3 = new JButton("Geometric Series");
        MainGUI() {
        myButton.setBounds(100,25,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        myButton1.setBounds(100,125,200,40);
        myButton1.setFocusable(false);
        myButton1.addActionListener(this);
        myButton2.setBounds(100,225,200,40);
        myButton2.setFocusable(false);
        myButton2.addActionListener(this);
        myButton3.setBounds(100,325,200,40);
        myButton3.setFocusable(false);
        myButton3.addActionListener(this);


        frame.add(myButton);
        frame.add(myButton1);
        frame.add(myButton2);
        frame.add(myButton3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton button = (JButton) source;
            String text = button.getText();
            if (text.equals("Arithmetic Sequence")) {
                frame.dispose();
                NewWindow myWindow = new NewWindow();
            } else if (text.equals("Geometric Sequence")) {
                frame.dispose();
                NewWindow1 myWindow = new NewWindow1();
            } else if (text.equals("Arithmetic Series")) {
                frame.dispose();
                NewWindow2 myWindow = new NewWindow2();
            } else if (text.equals("Geometric Series")) {
                frame.dispose();
                NewWindow3 myWindow = new NewWindow3();
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