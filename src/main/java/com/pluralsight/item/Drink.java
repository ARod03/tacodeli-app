package com.pluralsight.item;

import java.util.ArrayList;

public class Drink {

    //Create a constructor for the drink, include the name, size, and price
    private String drinkName;
    private String size;
    private double price;

    public Drink(String drinkName, String size, double price) {
        this.drinkName = drinkName;
        this.size = size;
        this.price = price;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

}
