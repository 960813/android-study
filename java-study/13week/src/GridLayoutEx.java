import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
    private JButton btn_calculate = new JButton("Calculate");
    private JButton btn_add = new JButton("add");
    private JButton btn_sub = new JButton("sub");
    private JButton btn_mul = new JButton("mul");
    private JButton btn_div = new JButton("div");

    GridLayoutEx() {
        setTitle("GridLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formDesign();
        eventHandler();
        setSize(300, 200);
        setVisible(true);
    }

    void formDesign() {
        setLayout(new GridLayout(3, 2, 5, 5));
        add(btn_add);
        add(btn_sub);
        add(btn_mul);
        add(btn_div);
        add(btn_calculate);
    }

    void eventHandler() {
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}
