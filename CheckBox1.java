import javax.swing.*;
public class CheckBox1 {

    public CheckBox1() 
    {
        JFrame f= new JFrame("Checkbox example...");
        JCheckBox c1= new JCheckBox("C++");
        c1.setBounds(50,50,50,50);
        JCheckBox c2= new JCheckBox("Java");
        c2.setBounds(50,120,70,50);
        f.add(c2);
        f.add(c1);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new CheckBox1();
    }
}
