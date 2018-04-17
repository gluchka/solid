package com.solid.o;

public class Vegetable implements Product {
    private String vegetableType;
    private int cookingTime;

    Vegetable(String type, int time) {
        vegetableType = type;
        cookingTime = time;
    }

    public String getVegetableType() {
        return vegetableType;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void prepareForEating() {
        System.out.println("Vegetable: " + getVegetableType() + " will be ready in " + getCookingTime() + " min");
    }
}
