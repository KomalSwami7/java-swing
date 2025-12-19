 import java.awt.FlowLayout;
import javax.swing.*;

public class FlowLayoutExample2 {
    JFrame f;

    FlowLayoutExample2() {
        f = new JFrame();
        JButton b = new JButton("C");
        JButton b1 = new JButton("C++");
        JButton b2 = new JButton("Java");
        JButton b3 = new JButton("Python");
        JButton b4 = new JButton("HTML");

        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(new FlowLayout(FlowLayout.RIGHT));
        f.setSize(500, 500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutExample2();
    }
}
 
