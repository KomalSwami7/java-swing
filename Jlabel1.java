import javax.swing.*;
public class Jlabel1 {
    public static void main(String[] args) {
        JFrame f= new JFrame("Label in swing ...");
        JLabel l1,l2; 
        l1 = new JLabel("First Label...");
        l1.setBounds(50, 40, 90,30);
        l2= new JLabel("Second Label...");
        l2.setBounds(50,70,90,30);
        f.add(l1);
        f.add(l2);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
