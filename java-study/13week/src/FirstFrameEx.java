import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstFrameEx extends JFrame {
    private JButton jButton = new JButton("OK");

    public FirstFrameEx() {
        setTitle("첫번째 프레임");

        // 윈도우의 X 버튼 클릭 시, 프로그램 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300, 200);

        // 배치 관리자 지정
        setLayout(new FlowLayout());
//        setLayout(new BorderLayout());

        add(jButton);

        // 이벤트 처리
        // 이벤트 리스너 할당
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand() == "OK") {
                    jButton.setText("버튼클릭");
                } else {
                    jButton.setText("OK");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new FirstFrameEx();
    }
}
