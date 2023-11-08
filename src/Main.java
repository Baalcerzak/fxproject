import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.awt.event.ActionEvent;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Group root = new Group();
    Scene menu = new Scene(root);

    @Override
    public void start(Stage stage) throws Exception {

        menu.setFill(Color.GREEN);
        Button b1 = new Button("New Game");
        b1.setLayoutX(250);
        b1.setLayoutY(60);
        b1.setFocusTraversable(false);
        b1.setPrefSize(300,70);
        Button b2 = new Button("High Scores");
        b2.setLayoutX(250);
        b2.setLayoutY(245);
        b2.setFocusTraversable(false);
        b2.setPrefSize(300,70);
        Button b3 = new Button("Exit");
        b3.setLayoutX(250);
        b3.setLayoutY(430);
        b3.setFocusTraversable(false);
        b3.setPrefSize(300,70);

        b1.setOnAction(actionEvent ->{
            stage.setScene(new Game(new Group(),stage));
        });

        b3.setOnAction(actionEvent -> {
            System.exit(0);
        });

        root.getChildren().addAll(b1,b2,b3);

        stage.setTitle("Catch these eggs!");
        stage.setWidth(800);
        stage.setHeight(600);
        stage.setScene(menu);
        stage.show();
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                try {
                    Platform.exit();
                    System.exit(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


}
