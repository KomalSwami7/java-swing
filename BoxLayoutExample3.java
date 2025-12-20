import java.awt.*;
import javax.swing.*;

public class BoxLayoutExample3 extends Frame {
    Button b[];

    public BoxLayoutExample3() {
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        b = new Button[5];
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.VERTICAL;
        for (int i = 0; i < 5; i++)
        {
            b[i] = new Button("Button" + (i + 1));
            add(b[i]);
        }
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String argvs[]) {
        BoxLayoutExample3 a = new BoxLayoutExample3();
    }
}