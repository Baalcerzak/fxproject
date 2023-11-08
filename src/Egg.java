import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Egg extends Ellipse {


    int spawn;

    public Egg(Group root, Stage stage) {
        setFill(Color.WHITE);
        setStroke(Color.BLACK);
        setRadiusX(8);
        setRadiusY(10);

        spawn = (int) (Math.random() * 4) + 1;
        switch (spawn) {
            case 1 -> {
                setLayoutX(80);
                setLayoutY(75);
                RotateTransition right1 = new RotateTransition();
                right1.setNode(this);
                right1.setCycleCount(RotateTransition.INDEFINITE);
                right1.setByAngle(360);
                right1.setDuration(Duration.millis(1000));
                right1.play();
                TranslateTransition toRight1 = new TranslateTransition();
                toRight1.setNode(this);
                toRight1.setToX(160);
                toRight1.setToY(90);
                toRight1.setDuration(Duration.millis(4000));
                toRight1.play();
                toRight1.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        if (Game.mP == 1){
                            Game.scoreW++;
                            Platform.runLater(()->{
                                Game.score.setText("Wynik: " +Game.scoreW);
                                root.getChildren().remove(this);
                                setVisible(false);
                            });
                        }else {
                            Game.hp--;
                            Platform.runLater(()->{
                                Game.hpB.setText("HP: " +Game.hp);
                                setVisible(false);
                                if(Game.hp==0){
                                    stage.setScene(new End(new Group(),stage));
                                }
                            });
                        }
                    }
                });
                }
            case 2 -> {
                setLayoutX(80);
                setLayoutY(215);
                RotateTransition right2 = new RotateTransition();
                right2.setNode(this);
                right2.setCycleCount(RotateTransition.INDEFINITE);
                right2.setByAngle(360);
                right2.setDuration(Duration.millis(1000));
                right2.play();
                TranslateTransition toRight2 = new TranslateTransition();
                toRight2.setNode(this);
                toRight2.setByX(160);
                toRight2.setByY(90);
                toRight2.setDuration(Duration.millis(4000));
                toRight2.play();
                toRight2.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        if (Game.mP == 2){
                            Game.scoreW++;
                            Platform.runLater(()->{
                                Game.score.setText("Wynik: " +Game.scoreW);
                                root.getChildren().remove(this);
                                setVisible(false);
                            });
                        }else {
                            Game.hp--;
                            Platform.runLater(()->{
                                Game.hpB.setText("HP: " +Game.hp);
                                setVisible(false);
                                if(Game.hp==0){
                                    stage.setScene(new End(new Group(),stage));
                                }
                            });
                        }
                    }
                });

            }
            case 3 -> {
                setLayoutX(710);
                setLayoutY(75);
                RotateTransition left1 = new RotateTransition();
                left1.setNode(this);
                left1.setCycleCount(RotateTransition.INDEFINITE);
                left1.setByAngle(-360);
                left1.setDuration(Duration.millis(1000));
                left1.play();
                TranslateTransition toLeft = new TranslateTransition();
                toLeft.setNode(this);
                toLeft.setByX(-160);
                toLeft.setByY(90);
                toLeft.setDuration(Duration.millis(4000));
                toLeft.play();
                toLeft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        if (Game.mP == 3){
                            Game.scoreW++;
                            Platform.runLater(()->{
                                Game.score.setText("Wynik: " +Game.scoreW);
                                setVisible(false);
                            });
                        }else {
                            Game.hp--;
                            Platform.runLater(()->{
                                Game.hpB.setText("HP: " +Game.hp);
                                setVisible(false);
                                if(Game.hp==0){
                                    stage.setScene(new End(new Group(),stage));
                                }
                            });
                        }
                    }
                });
            }
            case 4 -> {
                setLayoutX(710);
                setLayoutY(215);
                RotateTransition left2 = new RotateTransition();
                left2.setNode(this);
                left2.setCycleCount(RotateTransition.INDEFINITE);
                left2.setByAngle(-360);
                left2.setDuration(Duration.millis(1000));
                left2.play();
                TranslateTransition toLeft2 = new TranslateTransition();
                toLeft2.setNode(this);
                toLeft2.setByX(-160);
                toLeft2.setByY(90);
                toLeft2.setDuration(Duration.millis(4000));
                toLeft2.play();
                toLeft2.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        if (Game.mP == 4){
                            Game.scoreW++;
                            Platform.runLater(()->{
                                Game.score.setText("Wynik: " +Game.scoreW);
                                root.getChildren().remove(this);
                                setVisible(false);
                            });
                        }else {
                            Game.hp--;
                            Platform.runLater(()->{
                                Game.hpB.setText("HP: " +Game.hp);
                                setVisible(false);
                                if(Game.hp==0){
                                    stage.setScene(new End(new Group(),stage));
                                }
                            });
                        }
                    }
                });

            }


        }

    }
}
