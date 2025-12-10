
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextArea1 {
    TextArea1()
    {
        JFrame f= new JFrame("Text area example...");
        JTextArea a= new JTextArea("Hello");
        a.setBounds(30,40,300,300);
        f.add(a);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new TextArea1();
    }
}
