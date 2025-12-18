import java.awt.BorderLayout;
import javax.swing.*;
public class BorderLayoutExample {

    JFrame jf;

    BorderLayoutExample() {
        jf = new JFrame();
        JButton b = new JButton("NORTH");
        JButton b1 = new JButton("South");
        JButton b2 = new JButton("EAST");
        JButton b3 = new JButton("WEST");
        JButton b4 = new JButton("CENTER");
        jf.setLayout(new BorderLayout(12, 12));
        jf.add(b, BorderLayout.NORTH);
        jf.add(b1, BorderLayout.SOUTH);
        jf.add(b2, BorderLayout.EAST);
        jf.add(b3, BorderLayout.WEST);
        jf.add(b4, BorderLayout.CENTER);
        jf.setSize(500, 500);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
