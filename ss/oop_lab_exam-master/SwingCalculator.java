package programs;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCalculator extends JFrame {
    private JTextField textField;
    private JPanel buttonPanel;

    public SwingCalculator() {
        setTitle("Swing Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Text field at the top
        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        // Button panel in the center
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));
        add(buttonPanel, BorderLayout.CENTER);

        // Add buttons to the button panel
        addButton("7");
        addButton("8");
        addButton("9");
        addButton("*");

        addButton("4");
        addButton("5");
        addButton("6");
        addButton("-");

        addButton("1");
        addButton("2");
        addButton("3");
        addButton("+");

        addButton("C");
        addButton("0");
        addButton("=");
        addButton("/");

        pack();
        setLocationRelativeTo(null);
    }

    private void addButton(String label) {
        JButton button = new JButton(label);
        button.addActionListener(new ButtonClickListener());
        buttonPanel.add(button);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();
            if (command.equals("=")) {
                String expression = textField.getText();
                double result = calculateExpression(expression);
                textField.setText(Double.toString(result));
            } else if (command.equals("C")) {
                textField.setText("");
            } else {
                textField.setText(textField.getText() + command);
            }
        }

        private double calculateExpression(String expression) {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");
            try {
                Object result = engine.eval(expression);
                if (result instanceof Integer) {
                    return (Integer) result;
                } else if (result instanceof Double) {
                    return (Double) result;
                }
            } catch (ScriptException e) {
                JOptionPane.showMessageDialog(null, "Invalid Expression", "Error", JOptionPane.ERROR_MESSAGE);
            }
            return 0.0;
        }
    }

    public static void main(String[] args) {
        SwingCalculator calculator = new SwingCalculator();
        calculator.setVisible(true);
    }
}
