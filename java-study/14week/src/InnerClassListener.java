import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassListener extends JFrame {
    private JButton btn_action = new JButton("Action");

    InnerClassListener() {
        setTitle("Action 이벤트 리스너 예제");
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
        btn_action.addActionListener(new MyActionListener());
    }

    public static void main(String[] args) {
        new InnerClassListener();
    }

    class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if (b.getText().equals("Action"))
                b.setText("액션");
            else
                b.setText("Action");

            InnerClassListener.this.setTitle(b.getText());
        }
    }
}
