package com.pluralsight.order;

import com.pluralsight.item.Appetizer;
import com.pluralsight.item.Drink;
import com.pluralsight.item.Taco;

import java.util.ArrayList;

public class Order {

    private ArrayList<Taco> tacos;
    private ArrayList<Appetizer>appetizers;
    private ArrayList<Drink>drinks;

    public Order() {
        this.tacos = new ArrayList<>();
        this.appetizers = new ArrayList<>();
        this.drinks = new ArrayList<>();
    }

    public void addTaco(Taco taco) {
        tacos.add(taco);
    }
    public void addAppetizer(Appetizer appetizer) {
        appetizers.add(appetizer);
    }
    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public ArrayList<Taco> getTacos() {
        return tacos;
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public ArrayList<Appetizer> getAppetizers() {
        return appetizers;
    }

    public double getTotalPrice() {
        double total = 0;

        for (Taco taco : tacos) {
            total += taco.getPrice();
        }
        for (Drink drink : drinks) {
            total += drink.getPrice();
        }
        for (Appetizer appetizer : appetizers) {
            total += appetizer.getPrice();
        }
        return total;
    }
}
