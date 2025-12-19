import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CardLayoutExample1 extends JFrame implements ActionListener
{
CardLayout cd;

JButton b1,b2,b3;
Container cPane;
CardLayoutExample1()
{
cPane= getContentPane();
cd= new CardLayout();
cPane.setLayout(cd);

b1= new JButton("Apple");
b2= new JButton("Boy");
b3= new JButton("Cat");
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
cPane.add("a",b1);
cPane.add("b",b2);
cPane.add("c",b3);
}
public void actionPerformed(ActionEvent e)
{
cd.next(cPane);
}
public static void main(String args[])
{
CardLayoutExample1 crd= new CardLayoutExample1();
crd.setSize(300,300);
crd.setVisible(true);
crd.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}


