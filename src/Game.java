import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.time.LocalTime;

public class Game extends Scene {

    static int hp = 4;
    static int scoreW = 0;
    private  int droga = 1;
    private int degree = 0;
    private int degree2 = 0;
    LocalTime timeC = LocalTime.of(0,0,0);
    Label time = new Label("Czas: "+timeC);
    static Label score = new Label("Wynik: "+scoreW);
    static int mP = 1;
    static Label hpB = new Label("HP: "+hp);

    public Game(Group root, Stage stage){
        super(root);

        setFill(Color.CYAN);
    //HP
         hpB.setLayoutX(540);
         hpB.setFont(Font.font("Verdana", 15));
         root.getChildren().add(hpB);
    //WYNIK
        score.setLayoutX(370);
        score.setFont(Font.font("Verdana", 15));
        root.getChildren().add(score);
    //CZAS
        time.setLayoutX(200);
        time.setFont(Font.font("Verdana", 15));
        root.getChildren().add(time);

    //PODPARCIA
        Rectangle k1 = new Rectangle(0,80,80,8);
        Rectangle k2 = new Rectangle(712,220,80,8);
        Rectangle k3 = new Rectangle(712,80,80,8);
        Rectangle k4 = new Rectangle(0,220,80,8);
        root.getChildren().addAll(k1,k2,k3,k4);
        Rectangle p1 = new Rectangle(66,125,180,8);
        Rectangle p2 = new Rectangle(547,265,180,8);
        Rectangle p3 = new Rectangle(547,125,180,8);
        Rectangle p4 = new Rectangle(66,265,180,8);
        root.getChildren().addAll(p1,p2,p3,p4);
        degree = degree + 30;
        p1.setRotate(degree);
        p4.setRotate(degree);
        degree2 = degree2 - 30;
        p3.setRotate(degree2);
        p2.setRotate(degree2);

    //KURY
        Button kura1 = new Button();
        kura1.setLayoutX(0);
        kura1.setLayoutY(5);
        kura1.setFocusTraversable(false);
        kura1.setPrefSize(70,60);
        Image img = new Image("kura.png");
        ImageView view = new ImageView(img);
        view.setFitHeight(90);
        view.setPreserveRatio(true);
        kura1.setBackground(null);
        Button kura2 = new Button();
        kura2.setLayoutX(690);
        kura2.setLayoutY(5);
        kura2.setFocusTraversable(false);
        kura2.setPrefSize(70,60);
        Image img2 = new Image("kura2.png");
        ImageView view2 = new ImageView(img2);
        view2.setFitHeight(90);
        view2.setPreserveRatio(true);
        kura2.setBackground(null);
        Button kura3 = new Button();
        kura3.setLayoutX(690);
        kura3.setLayoutY(145);
        kura3.setFocusTraversable(false);
        kura3.setPrefSize(70,60);
        Image img3 = new Image("kura2.png");
        ImageView view3 = new ImageView(img3);
        view3.setFitHeight(90);
        view3.setPreserveRatio(true);
        kura3.setBackground(null);
        Button kura4 = new Button();
        kura4.setLayoutX(0);
        kura4.setLayoutY(145);
        kura4.setFocusTraversable(false);
        kura4.setPrefSize(70,60);
        Image img4 = new Image("kura.png");
        ImageView view4 = new ImageView(img4);
        view4.setFitHeight(90);
        view4.setPreserveRatio(true);
        kura4.setBackground(null);

        kura1.setGraphic(view);
        kura2.setGraphic(view2);
        kura3.setGraphic(view3);
        kura4.setGraphic(view4);
        root.getChildren().addAll(kura1,kura4,kura2,kura3);

    //MYSZ

        Button m = new Button();
        m.setLayoutX(230);
        m.setLayoutY(80);
        m.setFocusTraversable(false);
        m.setPrefSize(200,350);
        Image ig = new Image("mysz1.png");
        ImageView vie = new ImageView(ig);
        vie.setFitHeight(300);
        vie.setPreserveRatio(true);
        m.setBackground(null);
        m.setGraphic(vie);
        root.getChildren().add(m);

        Image kosz = new Image("kosz1.png");
        ImageView v = new ImageView(kosz);
        root.getChildren().add(v);
        v.setX(160);
        v.setY(95);
        v.setFitHeight(200);
        v.setFitWidth(200);


    //STEROWANIE
        TranslateTransition gora = new TranslateTransition();
        gora.setNode(v);
        gora.setToY(0);
        gora.setDuration(Duration.millis(1000));
        TranslateTransition dol = new TranslateTransition();
        dol.setNode(v);
        dol.setToY(140);
        dol.setDuration(Duration.millis(1000));
        TranslateTransition prawo = new TranslateTransition();
        prawo.setNode(v);
        prawo.setToX(280);
        prawo.setDuration(Duration.millis(1000));
        TranslateTransition lewo = new TranslateTransition();
        lewo.setNode(v);
        lewo.setToX(0);
        lewo.setDuration(Duration.millis(1000));
        ControlB c1 = new ControlB();
        c1.setLayoutX(100);
        c1.setLayoutY(350);
        c1.setFocusTraversable(false);
        ControlB c2 = new ControlB();
        c2.setLayoutX(100);
        c2.setLayoutY(450);
        c2.setFocusTraversable(false);
        ControlB c3 = new ControlB();
        c3.setLayoutX(600);
        c3.setLayoutY(350);
        c3.setFocusTraversable(false);
        ControlB c4 = new ControlB();
        c4.setLayoutX(600);
        c4.setLayoutY(450);
        c4.setFocusTraversable(false);
        root.getChildren().addAll(c1,c2,c3,c4);

        c1.setOnAction(actionEvent -> {
            mP = 1;
            switch (droga){
                case 1 -> {

                }
                case 2 ->{
                    gora.play();
                }
                case 3 ->{
                    lewo.play();
                }
                case 4 ->{
                    gora.play();
                    lewo.play();
                }
            }
            droga = 1;
        });
        c2.setOnAction(actionEvent -> {
            mP = 2;
            switch (droga){
                case 1 -> {
                    dol.play();
                }
                case 2 ->{

                }
                case 3 ->{
                    dol.play();
                    lewo.play();
                }
                case 4 ->{
                    lewo.play();
                }
            }
            droga = 2;
        });
        c3.setOnAction(actionEvent -> {
            mP = 3;
            switch (droga){
                case 1 -> {
                    prawo.play();
                }
                case 2 ->{
                    gora.play();
                    prawo.play();
                }
                case 3 ->{

                }
                case 4 ->{
                    gora.play();
                }
            }
            droga = 3;
        });
        c4.setOnAction(actionEvent -> {
            mP = 4;
            switch (droga){
                case 1 -> {
                    dol.play();
                    prawo.play();
                }
                case 2 ->{
                    prawo.play();
                }
                case 3 ->{
                    dol.play();
                }
                case 4 ->{

                }
            }
            droga = 4;
        });
        KeyCombination kc = new KeyCodeCombination(KeyCode.Q, KeyCombination.CONTROL_DOWN,KeyCombination.SHIFT_DOWN);
        setOnKeyPressed(event -> {
            if(kc.match(event)){
                Platform.exit();
                System.exit(0);
            }
        });

        //JAJKA
        Thread t = new Thread(
                ()->{
                    try{
                        while (!Thread.currentThread().isInterrupted()){
                            Platform.runLater(()->{
                                Egg egg = new Egg(root, stage);
                                root.getChildren().add(egg);
                            });

                            Thread.sleep(2000);
                        }
                    }catch (InterruptedException interruptedException){
                    }

                }
        );
        t.start();
        Timer timer = new Timer(this);
        Thread timerT = new Thread(timer);
        timerT.start();


        }
    public void setTimeC(LocalTime timeC){this.timeC = timeC;}
    public void setTime(){time.setText("Czas: "+timeC);}
    public LocalTime getTimeC(){return timeC;}
    public int getScoreW(){
        return scoreW;
    }

    }






