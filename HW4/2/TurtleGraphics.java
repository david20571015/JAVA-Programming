import javax.swing.JPanel;
import java.awt.Graphics;

public class TurtleGraphics extends JPanel {
    private String[][] graph;
    private boolean isPenDown;
    private int xPos, yPos;
    private int dir;// up=0,rigth=1,down=2,left=3;
    private int width, height;

    public TurtleGraphics(int w, int h) {
        width = w;
        height = h;
        graph = new String[width][height];
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
                graph[i][j] = "";

        xPos = height - 1;
        yPos = 0;
        dir = 0;
        isPenDown = false;
    }

    public void setPen(boolean pen) {
        isPenDown = pen;
    }

    public void moveForward(int dist) {
        switch (dir) {
            case 0:
                if (isPenDown)
                    for (int i = 0; i < dist; i++)
                        graph[xPos - i][yPos] = "*";
                xPos -= dist;
                break;
            case 1:
                if (isPenDown)
                    for (int i = 0; i < dist; i++)
                        graph[xPos][yPos + i] = "*";
                yPos += dist;
                break;
            case 2:
                if (isPenDown)
                    for (int i = 0; i < dist; i++)
                        graph[xPos + i][yPos] = "*";
                xPos += dist;
                break;
            case 3:
                if (isPenDown)
                    for (int i = 0; i < dist; i++)
                        graph[xPos][yPos - i] = "*";
                yPos -= dist;
                break;
        }
    }

    public void turnRight() {
        dir += 1;
        dir %= 4;
    }

    public void turnLeft() {
        dir += 3;
        dir %= 4;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
                g.drawString(graph[i][j], i * 15, j * 15 + 15);
    }
}