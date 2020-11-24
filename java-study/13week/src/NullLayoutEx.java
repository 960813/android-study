import javax.swing.*;
import java.awt.*;

public class NullLayoutEx extends JFrame {
    private JButton btn = new JButton("OK");

    NullLayoutEx() {
        setTitle("Null Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        formDesign();
        eventHandler();
        setSize(300, 300);
        setVisible(true);
    }

    void formDesign() {
        setLayout(null);
//        btn.setBounds(100,100,100,50);
        btn.setSize(100, 50);
        btn.setLocation(100, 100);
        add(btn);

        // 배경색 설정을 위해선 setOpaque(true) 필수
        btn.setOpaque(true);
        btn.setBackground(Color.yellow);
        btn.setForeground(Color.red);
    }

    void eventHandler() {

    }

    public static void main(String[] args) {
        new NullLayoutEx();
    }
}
