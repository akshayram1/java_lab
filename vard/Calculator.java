import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {

    private JTextField display;
    private JButton[] buttons;

    public Calculator() {
        super("Calculator");

        display = new JTextField(10);
        display.setEditable(false);

        buttons = new JButton[16];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(String.valueOf(i));
        }

        buttons[12].setText("+");
        buttons[13].setText("-");
        buttons[14].setText("*");
        buttons[15].setText("/");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < buttons.length; i++) {
            panel.add(buttons[i]);
        }

        add(display, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add event listeners to the buttons
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = display.getText();
                    int value = Integer.parseInt(text);

                    switch (e.getActionCommand()) {
                        case "+":
                            value += Integer.parseInt(buttons[i].getText());
                            break;
                        case "-":
                            value -= Integer.parseInt(buttons[i].getText());
                            break;
                        case "*":
                            value *= Integer.parseInt(buttons[i].getText());
                            break;
                        case "/":
                            value /= Integer.parseInt(buttons[i].getText());
                            break;
                    }

                    display.setText(String.valueOf(value));
                }
            });
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}