import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.layout.VBox;

import javax.swing.JOptionPane;

public class Program2 extends Application {
    int x, y, z;

    public void init() {
        x = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));
        z = Integer.parseInt(JOptionPane.showInputDialog("Enter third number"));
    }

    public void start(Stage stage) {
        Text sum = new Text("The sum is: " + (x + y + z));
        Text product = new Text("The product is: " + (x * y * z));
        Text average = new Text("The average is: " + (x + y + z) / 3.0);
        Text smallest = new Text("The smallest is: " + (x < (y < z ? y : z) ? x : (y < z ? y : z)));
        Text largest = new Text("The largest is: " + (x > (y > z ? y : z) ? x : (y > z ? y : z)));

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(sum, product, average, smallest, largest);

        // sum.setX(100);
        // sum.setY(50);

        Group root = new Group(vbox);
        // root.add();

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("JavaFx");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}