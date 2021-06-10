import javax.swing.JFrame;

public class P2_test {
    public static void main(String[] args) {
        TurtleFrame frame = new TurtleFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.start();
    }
}