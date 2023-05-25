import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class SwingCalculator extends JFrame {
    JTextField tf;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    JPanel p1;

    public SwingCalculator() {
        tf = new JTextField();
        p1 = new JPanel();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("0");
        b11 = new JButton("C");
        b12 = new JButton("=");
        b13 = new JButton("+");
        b14 = new JButton("-");
        b15 = new JButton("*");
        b16 = new JButton("/");

        p1.setLayout(new GridLayout(4, 4));
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(b13);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b14);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b15);
        p1.add(b11);
        p1.add(b10);
        p1.add(b12);
        p1.add(b16);

        add(tf, BorderLayout.NORTH);
        add(p1, BorderLayout.CENTER);

        // setLayout(new BorderLayout());
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new SwingCalculator();
    }
}
