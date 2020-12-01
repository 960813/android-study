import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerEx extends JFrame {

    private JLabel label_hello = new JLabel("Hello");
    private JPanel p = new JPanel();

    MouseListenerEx() {
        setTitle("Mouse Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        formDesign();
        eventHandler();
        setSize(250, 250);
        setVisible(true);
    }

    void formDesign() {
        add(p);
        p.setLayout(null);
        label_hello.setSize(50, 20);
        label_hello.setLocation(30, 30);
        p.add(label_hello);
    }

    void eventHandler() {
        // 내부 클래스
        label_hello.addMouseListener(new MyMouseListener());
    }

    public static void main(String[] args) {
        new MouseEx();
    }

    class MyMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            label_hello.setLocation(e.getPoint());
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}
