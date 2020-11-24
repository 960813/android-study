import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx1 extends JFrame {
    private JButton btn_calculate = new JButton("Calculate");
    private JButton btn_add = new JButton("add");
    private JButton btn_sub = new JButton("sub");
    private JButton btn_mul = new JButton("mul");
    private JButton btn_div = new JButton("div");

    BorderLayoutEx1() {
        setTitle("BorderLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formDesign();
        eventHandler();
        setSize(300, 200);
        setVisible(true);
    }

    void formDesign() {
        setLayout(new BorderLayout(30, 20));
        add(btn_calculate, BorderLayout.CENTER);
        add(btn_add, BorderLayout.NORTH);
        add(btn_sub, BorderLayout.SOUTH);
        add(btn_mul, BorderLayout.EAST);
        add(btn_div, BorderLayout.WEST);
    }

    void eventHandler() {
    }

    public static void main(String[] args) {
        new BorderLayoutEx1();
    }
}
