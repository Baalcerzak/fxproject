import javafx.animation.FadeTransition;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class ControlB extends Button {

    public ControlB() {
        double w = 30;
        Circle kolo = new Circle(w);
        kolo.setFill(Color.GREEN);
        kolo.setStroke(Color.BLACK);
        setBackground(Background.fill(Color.GREEN));
        setBorder(Border.stroke(Color.BLACK));
        setShape(kolo);
        setMinSize(2*w,2*w);
        setMaxSize(2*w,2*w);
        setFocusTraversable(false);

        setOnMouseReleased(e -> setBackground(Background.fill(Color.GREEN)));
        setOnMousePressed(e -> setBackground(Background.fill(Color.DARKGREEN)));
    }
}
