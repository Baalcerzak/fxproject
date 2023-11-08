import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class End extends Scene {

    Label gameO = new Label("KONIEC GRY!");

    public End(Group root, Stage stage) {
        super(root);

        setFill(Color.ORANGE);

        gameO.setLayoutX(250);
        gameO.setLayoutY(150);
        gameO.setFont(Font.font("Verdana", 40));
        root.getChildren().add(gameO);
    }
}
