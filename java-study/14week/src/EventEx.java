import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx extends JFrame {
    private JButton btn_action = new JButton("Action");

    EventEx() {
        setTitle("Event - 익명중첩클래스");
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
        // 익명 중첩 클래스를 이용한 리스너 구현
        btn_action.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                if (e.getActionCommand().equals("Action")){
//                    btn_action.setText("액션");
//                } else {
//                    btn_action.setText("Action");
//                }

//                if (btn_action.getText().equals("Action")) {
//                    btn_action.setText("액션");
//                } else {
//                    btn_action.setText("Action");
//                }

                JButton b = (JButton) e.getSource();
                if(b.getText().equals("Action"))
                    b.setText("액션");
                else
                    b.setText("Action");
            }
        });
    }

    public static void main(String[] args) {
        new EventEx();
    }
}
