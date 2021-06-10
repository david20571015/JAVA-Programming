import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.security.SecureRandom;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P2 extends JFrame {
    private final JTextField guessNumField;
    private int answerNum;
    private final JLabel statusBar;

    public P2() {
        super("P2");

        guessNumField = new JTextField(10);
        add(guessNumField);

        TextFieldHandler handler = new TextFieldHandler();
        guessNumField.addActionListener(handler);

        SecureRandom randomNum = new SecureRandom();
        answerNum = randomNum.nextInt(1000);

        statusBar = new JLabel("enter a number");
        add(statusBar, BorderLayout.SOUTH);
    }

    private class TextFieldHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == guessNumField) {
                if (Integer.parseInt(guessNumField.getText()) < answerNum)
                    statusBar.setText("too small");
                else if (Integer.parseInt(guessNumField.getText()) > answerNum)
                    statusBar.setText("too big");
                else if (Integer.parseInt(guessNumField.getText()) == answerNum)
                    statusBar.setText("Bingo");
                guessNumField.setText("");
            }
        }
    }
}