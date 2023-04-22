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

class Car implements Engine,Music_Player,AC,Brake,Window{

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
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

public class Interface {
    public static void main(String[] args) {
        System.out.println("Interface! ");
        Car newCar= new Car();
        
    }
}
