package com.solid.i;

public class Tank implements Vehicle {
    public void drive() {
        System.out.println("Drive a Tank");
    }

    public void loadBaggage() {
        System.out.println("Not applicable :(");
    }

    public void roll() {
        System.out.println("Not applicable due to caterpillars :(");
    }

    public void washWindscreen() {
        System.out.println("Not sure if there is a windscreen. Not Applicable :(");
    }
}
