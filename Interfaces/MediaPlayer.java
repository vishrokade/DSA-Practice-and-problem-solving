package Interfaces;

public class MediaPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Media player start");
    }

    @Override
    public void stop() {

        System.out.println("media player stop");
    }
}
