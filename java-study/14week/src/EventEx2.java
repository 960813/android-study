import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx2 extends JFrame {

    class MyActionEx implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Action")) {
                btn_action.setText("액션");
            } else {
                btn_action.setText("Action");
            }
        }
    }

    private JButton btn_action = new JButton("Action");

    EventEx2() {
        setTitle("내부클래스로 이벤트 리스너 구현");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        formDesign();
        eventHandler();
        setSize(350, 150);
        setVisible(true);
    }

    void formDesign() {
        setLayout(new FlowLayout());
        add(btn_action);
    }

    void eventHandler() {
        // 프레임 자체에서 리스너 구현
        btn_action.addActionListener(new MyActionEx());
    }

    public static void main(String[] args) {
        new EventEx2();
    }
}
