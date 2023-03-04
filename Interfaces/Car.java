package Interfaces;

public class Car implements Engine,Brake,Media{

    int a = 10;
    @Override
    public void start(){
        System.out.println("starts normal car");
    }

    @Override
    public void stop(){
        System.out.println("normal car stops");
    }

    @Override
    public void accelerate(){
        System.out.println("normal car accelerate");
    }
    @Override
    public void brake(){
        System.out.println("normal car brake");
    }
}
