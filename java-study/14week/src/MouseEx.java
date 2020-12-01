import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyMouseEx implements MouseListener {
    JLabel jLabel;
    MyMouseEx(JLabel jLabel) {
        this.jLabel = jLabel;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        jLabel.setLocation(e.getPoint());
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


public class MouseEx extends JFrame {

    private JLabel label_hello = new JLabel("Hello");
    private JPanel p = new JPanel();

    MouseEx() {
        setTitle("Mouse Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        formDesign();
        eventHandler();
        setSize(300, 300);
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
        // 외부클래스
        p.addMouseListener(new MyMouseEx(label_hello));
    }

    public static void main(String[] args) {
        new MouseEx();
    }
}
