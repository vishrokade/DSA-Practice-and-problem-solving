package Interfaces;

public class ElecticEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric engine start");
    }

    @Override
    public void stop() {

        System.out.println("Electric engine stop");
    }

    @Override
    public void accelerate() {

        System.out.println("Electric engine accelerate");
    }
}
