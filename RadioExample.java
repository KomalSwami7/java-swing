import javax.swing.*;
public class RadioExample {
    JFrame f;
    JLabel l;

    public RadioExample() {
        f= new JFrame("Radio Button Example...");
        l= new JLabel("Gender");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setSize(100,40);
        JRadioButton r= new JRadioButton("a)Female");
        r.setBounds(70,70,100,30);
        JRadioButton r1= new JRadioButton("b)Male");
        r1.setBounds(70,125,70,30);
        ButtonGroup bg= new ButtonGroup();
        bg.add(r);
        bg.add(r1);
        f.add(r);
        f.add(r1);
        f.add(l);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
   public static void main(String[] args) {
       new RadioExample();
   } 
}
