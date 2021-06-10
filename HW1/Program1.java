import javax.swing.JOptionPane;

public class Program1 {
    public static void main(String args[]) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("x =")),
                y = Integer.parseInt(JOptionPane.showInputDialog("y =")),
                z = Integer.parseInt(JOptionPane.showInputDialog("z = "));

        int max = (x > (y > z ? y : z) ? x : (y > z ? y : z)), min = (x < (y < z ? y : z) ? x : (y < z ? y : z));

        String mes = "sum = " + (x + y + z) + "\naverage = " + ((x + y + z) / 3.) + "\nproduct = " + (x * y * z)
                + "\nmax = " + max + "\nmin = " + min;

        JOptionPane.showMessageDialog(null, mes);
    }

    private static int smallest(int n1, int n2, int n3) {
        return (n1 < (n2 < n3 ? n2 : n3) ? n1 : (n2 < n3 ? n2 : n3));
    }

    private static int largest(int n1, int n2, int n3) {
        return (n1 > (n2 > n3 ? n2 : n3) ? n1 : (n2 > n3 ? n2 : n3));
    }
}