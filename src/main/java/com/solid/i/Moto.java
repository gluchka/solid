package com.solid.i;

public class Moto implements Vehicle {
    public void drive() {
        System.out.println("Drive a Moto");
    }

    public void loadBaggage() {
        System.out.println("Not applicable :(");
    }

    public void roll() {
        System.out.println("Roll on wheels");
    }

    public void washWindscreen() {
        System.out.println("Not applicable :(");
    }
}
