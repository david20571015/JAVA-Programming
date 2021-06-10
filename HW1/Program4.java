import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class Program4 extends Application {
    public void start(Stage stage) {
        String input = JOptionPane.showInputDialog("Enter the filename");
        String extension = input.substring(input.lastIndexOf(".") + 1, input.length());
        Label label = new Label("File extension is " + extension);
        Scene scene = new Scene(label, 400, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}