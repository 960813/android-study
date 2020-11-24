import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    private JButton btn_ok = new JButton("OK");
    private JButton btn_cancel = new JButton("Cancel");
    private JButton btn_ignore = new JButton("Ignore");

    private JPanel panel = new JPanel();

    public ContentPaneEx() {
        // 화면 디자인
        formDesign();

        // 이벤트 처리
        eventHandler();
    }

    void formDesign() {
        setTitle("ContentPane과 JFrame");

        // 윈도우의 X 버튼 클릭 시, 프로그램 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // setBackground 는 ContentPane 에만 적용되는 것으로 보임.
//        Container contentPane = getContentPane();
//        contentPane.setBackground(Color.ORANGE);
//        contentPane.setLayout(new FlowLayout());
//        contentPane.add(btn_ok);
//        contentPane.add(btn_cancel);
//        contentPane.add(btn_ignore);

//        setBackground(Color.ORANGE);
//        add(btn_ok);
//        add(btn_cancel);
//        add(btn_ignore);
//        setLayout(new FlowLayout());

        add(panel);
        panel.setLayout(new FlowLayout());
        panel.add(btn_ok);
        panel.add(btn_cancel);
        panel.add(btn_ignore);
        panel.setBackground(Color.ORANGE);

        setSize(300, 150);

        setVisible(true);
    }

    void eventHandler() {

    }

    public static void main(String[] args) {
        new ContentPaneEx();
    }
}
