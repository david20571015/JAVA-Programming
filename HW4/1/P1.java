import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P1 extends JFrame {
    private JTextField inputText;
    private Pas pascalPanel;

    public P1() {
        super("Pascal Triangle");

        setLayout(new BorderLayout());

        TextFieldHandler handler = new TextFieldHandler();

        inputText = new JTextField();
        inputText.addActionListener(handler);
        add(inputText, BorderLayout.NORTH);

        pascalPanel = new Pas();
        add(pascalPanel, BorderLayout.CENTER);
    }

    private class TextFieldHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == inputText) {
                pascalPanel.genNum(Integer.parseInt(inputText.getText()));
                pascalPanel.repaint();
            }
        }
    }
}