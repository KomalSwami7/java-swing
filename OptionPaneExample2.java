import javax.swing.*;
public class OptionPaneExample2 {
    JFrame f;

    public OptionPaneExample2() {
        f= new JFrame();
        String name= JOptionPane.showInputDialog(f,"Enter your name .");
    }
    public static void main(String[] args) {
        new OptionPaneExample2();
    }
}
