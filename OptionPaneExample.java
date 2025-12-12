import javax.swing.*;
public class OptionPaneExample {
    JFrame f;

    public OptionPaneExample() {
        f= new JFrame();
        JOptionPane.showMessageDialog(f, "Hello !!!Have a good day...");
    }
    public static void main(String[] args) {
        new OptionPaneExample();
    }
}
