package com.solid.i;

public class Car implements Vehicle{
    public void drive() {
        System.out.println("Drive a Car");
    }

    public void loadBaggage() {
        System.out.println("Load baggage in the Car");
    }

    public void roll() {
        System.out.println("Roll on wheels");
    }

    public void washWindscreen() {
        System.out.println("Wash with wipers");
    }
}
