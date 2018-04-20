package com.solid.l;

public class SimpleObjArray extends Collection {
    Object[] arr = new Object[10];

    int size() {
        return arr.length;
    }

    void addItem(Object item) {
        //full array
    }
}
