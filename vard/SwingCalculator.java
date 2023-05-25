import java.awt.*;
import java.awt.event.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;

public class SwingCalculator {
    private JFrame frame;
    private JTextField expressionField;
    private JTextField outputField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton;
    private JButton decButton, equButton, delButton, clrButton;
    private JPanel panel;

    private StringBuilder expression;

    public SwingCalculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 500);
        frame.setLayout(null);

        expressionField = new JTextField();
        expressionField.setBounds(30, 25, 280, 50);
        expressionField.setFont(new Font("Arial", Font.PLAIN, 24));
        expressionField.setEditable(false);

        outputField = new JTextField();
        outputField.setBounds(30, 85, 280, 50);
        outputField.setFont(new Font("Arial", Font.PLAIN, 24));
        outputField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");

        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("C");
        clrButton = new JButton("A");

        functionButtons = new JButton[] { addButton, subButton, mulButton, divButton, decButton, equButton, delButton,
                clrButton };

        panel = new JPanel();
        panel.setBounds(30, 145, 280, 295);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 18));
            panel.add(numberButtons[i]);
        }

        frame.add(expressionField);
        frame.add(outputField);
        frame.add(panel);

        for (JButton button : functionButtons) {
            panel.add(button);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(new ButtonClickListener());
        }

        for (JButton button : numberButtons) {
            button.addActionListener(new ButtonClickListener());
        }

        frame.setVisible(true);

        expression = new StringBuilder();
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();

            if (source == clrButton) {
                expression.setLength(0);
                expressionField.setText("");
                outputField.setText("");
            } else if (source == delButton) {
                if (expression.length() > 0) {
                    expression.deleteCharAt(expression.length() - 1);
                    expressionField.setText(expression.toString());
                }
            } else if (source == equButton) {
                try {
                    String expr = expression.toString();
                    double result = evaluateExpression(expr);
                    outputField.setText(String.valueOf(result));
                } catch (ArithmeticException ex) {
                    outputField.setText("Error");
                }
            } else {
                for (int i = 0; i < 10; i++) {
                    if (source == numberButtons[i]) {
                        expression.append(i);
                        expressionField.setText(expression.toString());
                    }
                }
                if (source == decButton) {
                    if (!expression.toString().contains(".")) {
                        expression.append(".");
                        expressionField.setText(expression.toString());
                    }
                }
                if (source == addButton) {
                    expression.append("+");
                    expressionField.setText(expression.toString());
                }
                if (source == subButton) {
                    expression.append("-");
                    expressionField.setText(expression.toString());
                }
                if (source == mulButton) {
                    expression.append("*");
                    expressionField.setText(expression.toString());
                }
                if (source == divButton) {
                    expression.append("/");
                    expressionField.setText(expression.toString());
                }
            }
        }

        private double evaluateExpression(String expr) {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");
            try {
                Object result = engine.eval(expr);
                if (result instanceof Integer) {
                    return (Integer) result;
                } else if (result instanceof Double) {
                    return (Double) result;
                } else {
                    throw new ArithmeticException("Invalid result");
                }
            } catch (ScriptException e) {
                throw new ArithmeticException("Error");
            }
        }

    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingCalculator();
            }
        });
    }
}
