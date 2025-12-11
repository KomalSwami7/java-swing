import javax.swing.*;
public class ComboBoxExample {
    JFrame f;

    public ComboBoxExample() {
        f= new JFrame();
        String one[]= {"India","Aus","U.S.A","England","Newzealand"}; 
        JComboBox cb= new JComboBox<>(one);
        cb.setBounds(50,50,100,30);
        f.add(cb);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new ComboBoxExample();
    }
}
