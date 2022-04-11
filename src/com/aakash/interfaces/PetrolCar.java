package com.aakash.interfaces;

public class PetrolCar implements Brake,Engine{
    @Override
    public void brake() {
        System.out.println("I brake like a petrol like");
    }

    @Override
    public void start() {
        System.out.println("I start like a petrol like");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a petrol like");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a petrol like");
    }
}
