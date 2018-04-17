package com.solid.o;

public class Demo {
    public static void main(String[] args) {
        Product veg = new Vegetable("potato", 30);
        Product fruit = new Fruit("apple");

        Chef chef = new Chef();
        System.out.println("first product");
        chef.setProduct(veg);
        chef.cook();

        System.out.println("second product");
        chef.setProduct(fruit);
        chef.cook();
    }
}
