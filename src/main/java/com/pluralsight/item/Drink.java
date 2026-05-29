package com.pluralsight.item;


public class Drink {

    //Create a constructor for the drink, include the name, size, and price
    private String drinkName;
    private String size;
    private double price;

    public Drink(String drinkName, String size) {
        this.drinkName = drinkName;
        this.size = size;

        if (size.equalsIgnoreCase("Small")) {
            this.price = 2.50;
        }
        else if (size.equalsIgnoreCase("Medium")) {
            this.price = 3.00;
        }
        else if (size.equalsIgnoreCase("Large")) {
            this.price = 3.50;
        }
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
