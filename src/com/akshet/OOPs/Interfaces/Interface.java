package com.akshet.OOPs.Interfaces;

interface Engine{
    public void start();
    public void stop();
}

interface Music_Player{
    public void start();
    public void stop();
}

interface AC{
    public void start();
    public void stop();
}

interface Brake{
    public void apply();
}

interface Window{
    public void up();
    public void down();
}

// Here what ever we are defining it will call that no matter even if we have many methods with same name

// Instead we can have a separate class to implement interfaces
class Car implements Engine,Music_Player,AC,Brake,Window {

    @Override
    public void start() {
        System.out.println("start the car");
    }

    @Override
    public void stop() {
        System.out.println("stop the car");
    }

    @Override
    public void apply() {
        System.out.println("apply brake");
    }

    @Override
    public void up() {
        System.out.println("Window up");
    }

    @Override
    public void down() {
        System.out.println("Window down");
    }

}

    class mediaPlayer implements Music_Player{

        @Override
        public void start() {
            System.out.println("Start the music player");
        }

        @Override
        public void stop() {
            System.out.println("Stop the music player");
        }
    }


public class Interface {
    public static void main(String[] args) {
        System.out.println("Interface! ");
        Car newCar= new Car();
        newCar.start();;
        newCar.stop();

        mediaPlayer mp = new mediaPlayer();
        mp.start();
        mp.stop();

    }
}
