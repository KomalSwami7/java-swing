import java.awt.*;
import javax.swing.*;

public class BoxLayoutExample extends Frame
{
Button b[];


    public BoxLayoutExample() {
        b = new Button[5];
        for (int i = 0; i < 5; i++) {
            b[i] = new Button("Button" + (i + 1));
            add(b[i]);
        }
       // setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setLayout (new BoxLayout(this, BoxLayout.X_AXIS));   
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String args[]) {
        BoxLayoutExample b1 = new BoxLayoutExample();
    }
}