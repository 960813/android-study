import javax.swing.*;
import java.awt.*;

public class LayoutEx extends JFrame {
    private JButton btn_ok = new JButton("OK");
    private JButton btn_cancel = new JButton("Cancel");
//    private JButton btn_complex_panel = new JButton("Complex Panel");

    private JPanel p_north = new JPanel();

    private JPanel p_south = new JPanel();

    private JLabel lbl1 = new JLabel("Test");
    private JLabel lbl2 = new JLabel("Test1");

    private JPanel p_south_right = new JPanel();
    private JLabel lbl3 = new JLabel("Test2");

    private JPanel p_center = new JPanel();
    private JButton btn_center1 = new JButton("BTN1");
    private JButton btn_center2 = new JButton("BTN2");
    private JButton btn_center3 = new JButton("BTN3");
    private JButton btn_center4 = new JButton("BTN4");

    LayoutEx() {
        setTitle("Layout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        formDesign();
        eventHandler();
        setSize(300, 200);
        setVisible(true);
    }

    void formDesign() {
        // 생략 가능: Default is BorderLayout
//        setLayout(new BorderLayout());

        this.add(p_north, BorderLayout.NORTH);

        // 생략 가능: Default is FlowLayout
//        p.setLayout(new FlowLayout());
        p_north.add(btn_ok);
        p_north.add(btn_cancel);

//        this.add(btn_complex_panel, BorderLayout.CENTER);
        this.add(p_center, BorderLayout.CENTER);
        p_center.setLayout(new GridLayout(2,2));
        p_center.add(btn_center1);
        p_center.add(btn_center2);
        p_center.add(btn_center3);
        p_center.add(btn_center4);

        this.add(p_south, BorderLayout.SOUTH);
        p_south.setLayout(new GridLayout(1, 2));
        p_south.add(lbl1);
        p_south.add(p_south_right);

        p_south_right.setLayout(new GridLayout(2,1));

        p_south_right.add(lbl2);
        p_south_right.add(lbl3);

        lbl2.setOpaque(true);
        lbl2.setBackground(Color.YELLOW);
    }

    void eventHandler() {

    }

    public static void main(String[] args) {
        new LayoutEx();
    }
}
