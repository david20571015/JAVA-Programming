import javax.swing.JOptionPane;

public class Program3 {
    public static void main(String args[]) {

        int price = Integer.parseInt(JOptionPane
                .showInputDialog("Enter price of item:\n(from 25 cents to one dollar, in 5-cent increments):"));

        int quarter = (100 - price) / 25;
        int dime = (100 - price - quarter * 25) / 10;
        int nickel = (100 - price - quarter * 25 - dime * 10) / 5;

        JOptionPane.showMessageDialog(null,
                "You bought an item for " + price + " cents and gave me one dollar.\nSo your change is\n" + quarter
                        + " quarters,\n" + dime + " dime, and\n" + nickel + " nickel\n");
    }
}