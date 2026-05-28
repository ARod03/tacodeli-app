package com.pluralsight.item;

public class Appetizer {


    //Create a tiny constructor for the appetizers
    private String dipping;
    private double price;

    public Appetizer(String dipping, double price) {
        this.dipping = dipping;
        this.price = price;
    }

    public String getDipping() {
        return dipping;
    }

    public double getPrice() {
        return price;
    }
}
