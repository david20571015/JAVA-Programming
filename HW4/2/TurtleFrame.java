import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JFrame;

public class TurtleFrame extends JFrame {
    private Scanner in;
    private TurtleGraphics panel;

    public TurtleFrame() {
        System.out.printf("Enter the width and height: ");
        in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();

        panel = new TurtleGraphics(width, height);
        add(panel);
    }

    public void start() {
        int command;
        in = new Scanner(System.in);

        do {
            System.out.printf("Enter command (9 to end input): ");
            command = in.nextInt();
            switch (command) {
                case 1:
                    panel.setPen(false);
                    break;
                case 2:
                    panel.setPen(true);
                    break;
                case 3:
                    panel.turnRight();
                    break;
                case 4:
                    panel.turnLeft();
                    break;
                case 5:
                case 10:
                    System.out.printf("Enter forward spaces: ");
                    panel.moveForward(in.nextInt());
                    break;
                case 6:
                    panel.repaint();
                    break;
                default:
                    command = 9;
                    break;
            }
        } while (command != 9);
    }
}