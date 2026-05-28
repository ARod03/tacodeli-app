package com.pluralsight.item;

import java.util.ArrayList;

public class Taco {

    //Create a constructor for parts of a BYO taco
    private String size;
    private String tortilla;
    private ArrayList<String> protein;
    private ArrayList<String> dairy;
    private ArrayList<String> regularToppings;
    private String salsas;
    private ArrayList<String> sides;
    private double price;

    public Taco(String size, String tortilla, ArrayList<String> protein, ArrayList<String> dairy, ArrayList<String> regularToppings, String salsas, ArrayList<String> sides, double price) {
        this.size = size;
        this.tortilla = tortilla;
        this.protein = protein;
        this.dairy = dairy;
        this.regularToppings = regularToppings;
        this.salsas = salsas;
        this.sides = sides;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
