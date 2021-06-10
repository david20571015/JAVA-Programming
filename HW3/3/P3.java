import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextField;

public class P3 extends JFrame {
    private final JTextField input;
    private final JButton upperButton;
    private final JButton lowerButton;

    public P3() {
        super("P3");

        setLayout(null);

        input = new JTextField(15);
        input.setBounds(150, 100, 200, 20);
        add(input);

        upperButton = new JButton("upper");
        upperButton.setBounds(200, 200, 100, 20);
        add(upperButton);

        lowerButton = new JButton("lower");
        lowerButton.setBounds(200, 400, 100, 20);
        add(lowerButton);

        ButtonHandler handler = new ButtonHandler();
        upperButton.addActionListener(handler);
        lowerButton.addActionListener(handler);
    }

    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == upperButton) {
                String out = input.getText().toUpperCase();
                input.setText(out);
            } else if (event.getSource() == lowerButton) {
                String out = input.getText().toLowerCase();
                input.setText(out);
            }
        }
    }
}