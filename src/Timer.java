import javafx.application.Platform;

import java.time.LocalTime;

public class Timer implements Runnable{

    LocalTime timer = LocalTime.of(0,0,0);
    Game game;

    public Timer(Game game){
        this.game = game;
    }

    @Override
    public void run() {
        try{
            while (!Thread.currentThread().isInterrupted()){
                Platform.runLater(()->{
                game.setTimeC(game.getTimeC().plusSeconds(1));
                this.timer = timer.plusSeconds(1);
                game.setTime();
                });
                Thread.sleep(1000);
            }


        }catch (InterruptedException ignored){

        }
    }
}
