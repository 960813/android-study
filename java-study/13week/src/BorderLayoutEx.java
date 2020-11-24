import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
    private JButton btn1 = new JButton("BTN1");
    private JButton btn2 = new JButton("BTN2");
    private JButton btn3 = new JButton("BTN3");
    private JButton btn4 = new JButton("BTN4");
    private JButton btn5 = new JButton("BTN5");
    BorderLayoutEx() {
        setTitle("BorderLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formDesign();
        eventHandler();
        setSize(300, 200);
        setVisible(true);
    }

    void formDesign() {
        setLayout(new BorderLayout());
        add(btn1, BorderLayout.NORTH);
        add(btn2, BorderLayout.SOUTH);
        add(btn3, BorderLayout.WEST);
        add(btn4, BorderLayout.EAST);
        add(btn5, BorderLayout.CENTER);
    }

    void eventHandler() {
    }

    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}
