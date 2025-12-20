import java.awt.*;
import javax.swing.BoxLayout;

public class BoxLayoutExample2 extends Frame {
    Button b[];

    public BoxLayoutExample2() {
        b = new Button[5];
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        for (int i = 0; i < 5; i++) {
            b[i] = new Button("Button" + (i + 1));
            add(b[i]);
        }
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        setVisible(true);
        setSize(500, 500);
    }

    public static void main(String[] args) {
        BoxLayoutExample2 bl = new BoxLayoutExample2();
    }
}
