import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainGUI extends JFrame implements ActionListener, KeyListener {
    private JPanel mainPanel;
    private JButton geometricSequenceButton;
    private JButton geometricSeriesButton;
    private JButton arithmeticSeriesButton;
    private JButton findTheMissingValueButton;
    private JButton arithmeticSequenceButton;

    private void createUIComponents() {

        setContentPane(mainPanel);
        setTitle("Sequence Calculator");
        setSize(300,400);
        setLocation(450,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        geometricSequenceButton.addActionListener(this);
        geometricSeriesButton.addActionListener(this);
        arithmeticSequenceButton.addActionListener(this);
        arithmeticSeriesButton.addActionListener(this);
        findTheMissingValueButton.addActionListener(this);
        setVisible(true);
    }
    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton button = (JButton) source;
            String text = button.getText();
            if (text.equals("arithmeticSequenceButton")) {
                close();
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
