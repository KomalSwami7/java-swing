import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ComboBoxExample2 {
    JFrame f;
    ComboBoxExample2()
    {
        f= new JFrame("ComboBox Example with Action Listner.");
        JLabel l= new JLabel();
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setSize(400,100);
        JButton b= new JButton("Click");
        b.setBounds(150,300,80,40);
        String language[]= {"C","C++","C#","Java","PHP"}; 
        JComboBox cb= new JComboBox<>(language);
        cb.setBounds(50,100,90,20);
        f.add(cb);
        f.add(b);
        f.add(l);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data = "Programming language Selected: " +
                cb.getItemAt(cb.getSelectedIndex());
                l.setText(data);
            }
        });
    }
    public static void main(String[] args) {
        new ComboBoxExample2();
    }
}
