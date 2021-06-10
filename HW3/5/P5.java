import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;
import java.math.BigInteger;

public class P5 extends JFrame {
    private final JTextField num1 = new JTextField("0");
    private final JTextField num2 = new JTextField("0");
    private final JLabel ans = new JLabel("=");

    private final JButton add = new JButton("+");
    private final JButton sub = new JButton("-");
    private final JButton mul = new JButton("*");
    private final JButton div = new JButton("/");
    private final JButton fac = new JButton("!");

    public P5() {
        setLayout(null);

        num1.setBounds(100, 50, 300, 20);
        num2.setBounds(100, 250, 300, 20);
        ans.setBounds(50, 300, 500, 20);
        add(num1);
        add(num2);
        add(ans);

        Calculate handler = new Calculate();

        add.setBounds(100, 100, 100, 20);
        sub.setBounds(300, 100, 100, 20);
        mul.setBounds(100, 150, 100, 20);
        div.setBounds(300, 150, 100, 20);
        fac.setBounds(200, 200, 100, 40);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(fac);
        add.addActionListener(handler);
        sub.addActionListener(handler);
        mul.addActionListener(handler);
        div.addActionListener(handler);
        fac.addActionListener(handler);
    }

    private class Calculate implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            BigInteger n1 = new BigInteger(num1.getText());
            BigInteger n2 = new BigInteger(num2.getText());

            if (event.getSource() == add)
                ans.setText("=" + String.valueOf(n1.add(n2)));
            else if (event.getSource() == sub)
                ans.setText("=" + String.valueOf(n1.subtract(n2)));
            else if (event.getSource() == mul)
                ans.setText("=" + String.valueOf(n1.multiply(n2)));
            else if (event.getSource() == div)
                ans.setText("=" + String.valueOf(n1.divide(n2)));
            else if (event.getSource() == fac) {
                BigInteger factorial = new BigInteger("1");
                int n = Integer.parseInt(num1.getText());
                for (int i = 1; i <= n; i++)
                    factorial = factorial.multiply(BigInteger.valueOf(i));
                ans.setText("=" + String.valueOf(factorial));
            }
        }
    }
}