import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewWindow2 {
    JFrame frame = new JFrame("Arithmetic Series");
    JLabel label = new JLabel("Welcome");
    NewWindow2() {
        label.setBounds(50,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
