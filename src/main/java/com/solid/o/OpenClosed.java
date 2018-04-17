package com.solid.o;

public class OpenClosed {
    private void getListOfFruits(String category) {
        System.out.println("Get list of fruits by category: " + category);
    }

    private void getListOfVegetables(String category) {
        System.out.println("get list of vegetables by category: " + category);
    }

    public void getProduct(String type, String category) {
        if ("vegetable".equalsIgnoreCase(type)) {
            getListOfFruits(category);
        } else if ("fruit".equalsIgnoreCase(type)) {
            getListOfVegetables(category);
        }
    }

    public static void main(String[] args) {
        OpenClosed openClosed = new OpenClosed();
        openClosed.getProduct("vegetable", "roots");
        openClosed.getProduct("fruit", "exotic");
    }
}
