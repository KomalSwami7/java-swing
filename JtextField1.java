import java.awt.event.*;
import javax.swing.*;
public class JtextField1 implements ActionListener{
    JTextField t,t1,t2;
    JButton b,b1;
    public JtextField1() 
    {
        JFrame f= new JFrame();
        t= new JTextField();
        t.setBounds(40,50,40,40);
        t1= new JTextField();
        t1.setBounds(40,100,40,40);
        t2= new JTextField();
        t2.setBounds(70,150,40,40);
        t2.setEditable(false);
        b= new JButton("+");
        b.setBounds(70,210,40,30);
        b1= new JButton("-");
        b1.setBounds(70,250,40,30);
        f.add(b);
        f.add(b1);
        b.addActionListener(this);
        b1.addActionListener(this);
        f.add(t);
        f.add(t1);
        f.add(t2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }    
    public void actionPerformed(ActionEvent e)
    {
        String s= t.getText();
        String s1= t1.getText();
        int a= Integer.parseInt(s);
        int a1= Integer.parseInt(s1);
        int c=0;
        if(e.getSource()==b)
        {
            c= a+a1;
        }
        else if(e.getSource()==b1)
        {
            c=a-a1;
        }
        String result= String.valueOf(c);
        t2.setText(result);
    }
    public static void main(String[] args) {
        new JtextField1();
    }
}