package com.pluralsight.item;

import java.util.ArrayList;

public class Taco {

    //Create a constructor for all parts that make a BYO taco
    private String size;
    private String tortilla;
    private ArrayList<String> protein;
    private ArrayList<String> dairy;
    private ArrayList<String> toppings;
    private String salsa;
    private ArrayList<String> sides;
    private double price;

    public Taco(String size, String tortilla, ArrayList<String> protein, ArrayList<String> dairy, ArrayList<String> toppings, String salsa, ArrayList<String> sides) {
        this.size = size;
        this.tortilla = tortilla;
        this.protein = protein;
        this.dairy = dairy;
        this.toppings = toppings;
        this.salsa = salsa;
        this.sides = sides;

        calculatePrice();
    }

    //Method to determine the price of the size of a base BYO taco
    private void calculatePrice() {
        price = 0;

        if (size.equalsIgnoreCase("S")) {
            price += 2.70;
        } else if (size.equalsIgnoreCase("L")) {
            price += 3.70;
        }


        //If statements for protein prices
        if (protein != null) {
            for (String p : protein) {
                if (p.equalsIgnoreCase("Chicken"))
                    price += 1.45;
                else if (p.equalsIgnoreCase("Sirloin"))
                    price += 1.45;
                else if (p.equalsIgnoreCase("Barbacoa"))
                    price += 1.45;
                else if (p.equalsIgnoreCase("Sausage"))
                    price += 0.75;
                else if (p.equalsIgnoreCase("Chorizo"))
                    price += 0.75;
                else if (p.equalsIgnoreCase("Eggs"))
                    price += 0.45;
                else if (p.equalsIgnoreCase("Bacon"))
                    price += 0.45;
                else if (p.equalsIgnoreCase("Veggie Nut Chorizo"))
                    price += 1.45;
                else if (p.equalsIgnoreCase("Picadillo"))
                    price += 1.45;
            }
        }

        //If statements for dairy prices
        if (dairy != null) {
            for (String d : dairy) {
                if (d.equalsIgnoreCase("Jack Cheese"))
                    price += 0.45;
                else if (d.equalsIgnoreCase("Queso Fresco"))
                    price += 0.45;
                else if (d.equalsIgnoreCase("Queso Liquido"))
                    price += 0.45;
                else if (d.equalsIgnoreCase("Sour Cream"))
                    price += 0.45;
            }
        }

        //If statements for toppings. Toppings are free except for premium toppings
        if (toppings != null) {
            for (String t : toppings) {
                if (t.equalsIgnoreCase("Avocado") || t.equalsIgnoreCase("Fresh Spinach") || t.equalsIgnoreCase("Sauteed Spinach")) {
                    price += 1.00;
                }
            }
        }

        //Salsas are free except the specialty Dona salsa
        if (salsa != null && salsa.equalsIgnoreCase("Dona")) {
            price += 0.10;
        }

        //Price for a side
        if (sides != null) {
            price += sides.size() * 1.75;
        }
    }

    public String getSize() {
        return size;
    }

    public String getTortilla() {
        return tortilla;
    }

    public ArrayList<String> getProtein() {
        return protein;
    }

    public ArrayList<String> getDairy() {
        return dairy;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public String getSalsa() {
        return salsa;
    }

    public ArrayList<String> getSides() {
        return sides;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Taco (" + size + ", " + tortilla +
                ", Proteins: " + protein +
                ", Dairy: " + dairy +
                ", Salsa: " + salsa +
                ", Toppings: " + toppings +
                ", Sides: " + sides +
                ") Price: $" + String.format("%.2f", price);
    }

}
