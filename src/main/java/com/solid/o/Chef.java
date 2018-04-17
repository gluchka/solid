package com.solid.o;

public class Chef {
    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public void cook() {
        product.prepareForEating();
    }
}
