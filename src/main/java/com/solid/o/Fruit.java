package com.solid.o;

public class Fruit implements Product {
    private String fruitType;

    Fruit(String type) {
        fruitType = type;
    }


    public String getFruitType() {
        return fruitType;
    }

    public void prepareForEating() {
        System.out.println("You only need to wash fruit: " + getFruitType());
    }
}
