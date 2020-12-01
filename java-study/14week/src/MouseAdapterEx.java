import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterEx extends JFrame {

    private JLabel label_java = new JLabel("Java");
    private JPanel p = new JPanel();

    MouseAdapterEx() {
        setTitle("MouseAdapter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        formDesign();
        eventHandler();
        setSize(250, 250);
        setVisible(true);
    }

    void formDesign() {
        add(p);
        p.setLayout(null);
        label_java.setSize(50, 20);
        label_java.setLocation(30, 30);
        p.add(label_java);
    }

    void eventHandler() {
        p.addMouseListener(new MyMouseAdapter());
    }

    class MyMouseAdapter extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            label_java.setLocation(e.getX(), e.getY());
        }
    }

    public static void main(String[] args) {
        new MouseEx();
    }
}
