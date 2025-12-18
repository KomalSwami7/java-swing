import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Border2 {

    JFrame f;
    public Border2() {
         f= new JFrame();
        JButton b= new JButton("NORTH");
        JButton b1= new JButton("SOUTH");
        JButton b2= new JButton("EAST");
        JButton b3= new JButton("WEST");
        JButton b4= new JButton("CENTER");
        
        f.setLayout(new BorderLayout(7,7));
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setSize(500,500);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Border2();
    }
}
