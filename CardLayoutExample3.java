import java.awt.*;
import javax.swing.*;

public class CardLayoutExample3 extends JFrame {
    private int currCard = 1;
    private CardLayout c1;

    public CardLayoutExample3() {
        setTitle("Card Layout Methods");
        setSize(310, 160);

        JPanel cp = new JPanel();
        c1 = new CardLayout();
        cp.setLayout(c1);

        JPanel jp = new JPanel();
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();

        jp.add(new JLabel("C1"));
        jp1.add(new JLabel("C2"));
        jp2.add(new JLabel("C3"));
        jp3.add(new JLabel("C4"));

        cp.add(jp, "1");
        cp.add(jp1, "2");
        cp.add(jp2, "3");
        cp.add(jp3, "4");

        JPanel bp = new JPanel();
        JButton a = new JButton("First");
        JButton b = new JButton("Next");
        JButton c = new JButton("Prev");
        JButton d = new JButton("Last");

        bp.add(a);
        bp.add(b);
        bp.add(c);
        bp.add(d);

        a.addActionListener(e -> {
            c1.first(cp);
            currCard = 1;
        });

        d.addActionListener(e -> {
            c1.last(cp);
            currCard = 4;
        });

        b.addActionListener(e -> {
            if (currCard < 4) {
                currCard++;
                c1.show(cp, "" + currCard);
            }
        });

        c.addActionListener(e -> {
            if (currCard > 1) {
                currCard--;
                c1.show(cp, "" + currCard);
            }
        });

        getContentPane().add(cp, BorderLayout.NORTH);
        getContentPane().add(bp, BorderLayout.SOUTH);
    }

    public static void main(String args[]) {
        CardLayoutExample3 c = new CardLayoutExample3();
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setVisible(true);
    }
}
