import java.awt.event.*;
import javax.swing.*;
public class RadioExample2 extends JFrame implements ActionListener{
    JButton b;
    JRadioButton r1,r2;

    public RadioExample2() {
        r1= new JRadioButton("i) Female");
        r1.setBounds(70,50,100,30);
        r2= new JRadioButton("ii) Male");
        r2.setBounds(70,100,100,30);
        ButtonGroup bg= new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        b= new JButton("Click");
        b.setBounds(125,159,70,40);
        b.addActionListener(this);
        add(b);
        add(r1);
        add(r2);
        setSize(500,500);
        setLayout(null);
       setVisible(true); 

    }
    public void actionPerformed(ActionEvent e)
    {
        if(r1.isSelected()){
            JOptionPane.showMessageDialog(this,"You are Female.");  
        }
        if(r2.isSelected()){
            JOptionPane.showMessageDialog(this, "You are Male.");
        }
    }
    public static void main(String[] args) {
        new RadioExample2();
    }
}
