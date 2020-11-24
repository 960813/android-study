import javax.swing.*;
import java.awt.*;

public class GridLayoutEx1 extends JFrame {
    private JLabel lbl_name = new JLabel(" 이름");
    private JLabel lbl_identify = new JLabel(" 학번");
    private JLabel lbl_department = new JLabel(" 학과");
    private JLabel lbl_subject = new JLabel(" 과목");

    private JTextField textField_name = new JTextField("");
    private JTextField textField_identify = new JTextField("");
    private JTextField textField_department = new JTextField("");
    private JTextField textField_subject = new JTextField("");

    GridLayoutEx1() {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formDesign();
        eventHandler();
        setSize(300, 200);
        setVisible(true);
    }

    void formDesign() {
        GridLayout grid = new GridLayout(4, 2);
        grid.setVgap(5);
        setLayout(grid);

        add(lbl_name);
        add(textField_name);

        add(lbl_identify);
        add(textField_identify);

        add(lbl_department);
        add(textField_department);

        add(lbl_subject);
        add(textField_subject);
    }

    void eventHandler() {
    }

    public static void main(String[] args) {
        new GridLayoutEx1();
    }
}
