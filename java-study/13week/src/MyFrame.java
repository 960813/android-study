import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        this.setTitle("300x300 스윙 프레임 만들기");
        this.setSize(300, 300);

        // 윈도우의 X 버튼 클릭 시, 프로그램 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 화면 디자인
        formDesign();

        // 이벤트 처리
        eventHandler();

        this.setVisible(true);
    }

    void formDesign() {

    }

    void eventHandler() {

    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
