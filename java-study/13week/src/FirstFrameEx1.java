import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstFrameEx1 extends JFrame implements ActionListener {
    private JButton jButton = new JButton("OK");

    public FirstFrameEx1() {
        setTitle("프레임 생성");

        // 윈도우의 X 버튼 클릭 시, 프로그램 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 화면 디자인
        formDesign();

        // 이벤트 처리
        eventHandler();

        setSize(300, 200);

        setVisible(true);
    }

    void formDesign() {
        // 배치 관리자 지정
        setLayout(new FlowLayout());
        add(jButton);
    }

    void eventHandler() {
        // 이벤트 리스너 할당
//        jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (e.getActionCommand().equals("OK")) {
//                    jButton.setText("버튼클릭");
//                } else {
//                    jButton.setText("OK");
//                }
//            }
//        });
        jButton.addActionListener(this);
    }


    public static void main(String[] args) {
        new FirstFrameEx1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jButton && e.getActionCommand().equals("OK"))
            jButton.setText("버튼클릭!!");
        else
            jButton.setText("OK");
    }
}
