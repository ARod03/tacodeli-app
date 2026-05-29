package com.pluralsight.item;

public class Appetizer {


    //Create a tiny constructor for the appetizers
    private String dipping;
    private double price;

    public Appetizer(String dipping) {
        this.dipping = dipping;


        //If else-if statements to determine prices of each dipping
        if (dipping.equalsIgnoreCase("Salsa")) {
            this.price = 3.50;
        } else if (dipping.equalsIgnoreCase("Queso")) {
            this.price = 4.00;
        } else if (dipping.equalsIgnoreCase("Guacamole")) {
            this.price = 5.00;
        }

    }

    public String getDipping() {
        return dipping;
    }

    public double getPrice() {
        return price;
    }
}
