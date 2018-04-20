package com.solid.d;

public class Manager {

    private Engineer engineer;

    public void manage() {
        engineer.perform();
    }

    public void setEngineer(Engineer engineer){
        this.engineer = engineer;
    }
}
