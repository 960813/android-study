import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
    private JButton btn = new JButton("OK");

    NullContainerEx() {
        setTitle("Null Container Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        formDesign();
        eventHandler();
        setSize(300, 200);
        setVisible(true);
    }

    void formDesign() {
        setLayout(null);

        JLabel label = new JLabel("Hello, Press Buttons!");
        label.setLocation(130, 50);
        label.setSize(200, 20);
        add(label);

        for (int i = 1; i <= 9; i++) {
            JButton b = new JButton(Integer.toString(i));
            b.setLocation(i * 15, i * 15);
            b.setSize(50, 20);
            add(b);
        }
    }

    void eventHandler() {

    }

    public static void main(String[] args) {
        new NullContainerEx();
    }
}
