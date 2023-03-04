package Interfaces;

public class NiceCar {

    // you have to create class for each interface to implements the methods and use it like multiple inheritance
    private Engine engine;
    private MediaPlayer mediaPlayer = new MediaPlayer();

    public  NiceCar(){
        this.engine = new PowerEngine();
    }

    public  NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void accelerate(){
        engine.accelerate();
    }

    public void startMusic(){
        mediaPlayer.start();
    }
    public void stopMusic(){
        mediaPlayer.stop();
    }

    public void upgrade(){
        this.engine = new ElecticEngine();
    }

}
