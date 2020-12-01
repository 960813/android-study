import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx1 extends JFrame implements ActionListener {
    private JButton btn_action = new JButton("Action");

    EventEx1() {
        setTitle("프레임 자체에서 리스너 구현");
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
        btn_action.addActionListener(this);
    }

    public static void main(String[] args) {
        new EventEx1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Action")) {
            btn_action.setText("액션");
        } else {
            btn_action.setText("Action");
        }
    }
}
