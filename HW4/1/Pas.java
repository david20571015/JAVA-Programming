import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Graphics;

public class Pas extends JPanel {
    private int triSize;
    private int[][] element;

    public void genNum(int size) {
        triSize = size;

        element = new int[triSize][];
        for (int i = 0; i < element.length; i++)
            element[i] = new int[i + 1];

        for (int i = 0; i < element.length; i++) {
            element[i][0] = 1;
            element[i][i] = 1;
        }

        for (int i = 1; i < element.length; i++)
            for (int j = 1; j < element[i].length - 1; j++)
                element[i][j] = element[i - 1][j - 1] + element[i - 1][j];
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int dist = 15;

        for (int i = 0; i < triSize; i++) {
            for (int j = 0; j <= i; j++)
                g.drawString(String.valueOf(element[i][j]), (j * 2 - i) * dist + width / 2, i * dist + 15);
        }
    }
}