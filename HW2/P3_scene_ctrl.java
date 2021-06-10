import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.*;
import javafx.scene.canvas.GraphicsContext;

public class P3_scene_ctrl {
    @FXML
    Button button1;
    @FXML
    Canvas canvas1;

    public void onButton1Click() {
        GraphicsContext gc = canvas1.getGraphicsContext2D();

        for (int j = 0; j <= 16; j++) {
            gc.strokeLine(canvas1.getWidth() * (j / 16.), 0, 0, canvas1.getHeight() * (1 - j / 16.));
            gc.strokeLine(canvas1.getWidth() * (j / 16.), 0, canvas1.getWidth(), canvas1.getHeight() * (j / 16.));
            gc.strokeLine(canvas1.getWidth() * (j / 16.), canvas1.getHeight(), 0, canvas1.getHeight() * (j / 16.));
            gc.strokeLine(canvas1.getWidth() * (j / 16.), canvas1.getHeight(), canvas1.getWidth(),
                    canvas1.getHeight() * (1 - j / 16.));
        }
    }
}