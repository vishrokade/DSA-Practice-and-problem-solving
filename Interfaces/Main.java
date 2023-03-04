package Interfaces;

public class Main {

    public static void main(String[] args) {
  //      Car car = new Car();

//        System.out.println(car.a);
//        car.start();
//        car.stop();
//        car.accelerate();
//        car.brake();


        NiceCar car1 = new NiceCar();


        car1.start();
        car1.stop();
        car1.startMusic();

        car1.upgrade();

        car1.start();
        car1.stop();
        car1.startMusic();

    }
}
