import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Math;

public class P4 {
    public static void main(String[] args) {
        // --------------dialog-------------
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, "option"));

        switch (option) {
            case 1: {
                double x = Double.parseDouble(JOptionPane.showInputDialog(null, "x"));
                double y = Double.parseDouble(JOptionPane.showInputDialog(null, "y"));
                JOptionPane.showMessageDialog(null, Math.sqrt(x * x + y * y) + " " + Math.atan(y / x));
                break;
            }
            case 2: {
                double a = Double.parseDouble(JOptionPane.showInputDialog(null, "a"));
                double theta = Double.parseDouble(JOptionPane.showInputDialog(null, "theta"));
                JOptionPane.showMessageDialog(null, "i" + a * Math.cos(theta) + "+j" + a * Math.sin(theta));
                break;
            }
        }

        // -------------cmd----------------
        // Scanner input = new Scanner(System.in);
        // int option = input.nextInt();

        // switch (option) {
        // case 1: {
        // double x = input.nextDouble();
        // double y = input.nextDouble();
        // System.out.println(Math.sqrt(x * x + y * y) + " " + Math.atan(y / x));
        // break;
        // }
        // case 2: {
        // double a = input.nextDouble();
        // double theta = input.nextDouble();
        // System.out.println("i" + a * Math.cos(theta) + "+j" + a * Math.sin(theta));
        // break;
        // }
        // }

    }
}