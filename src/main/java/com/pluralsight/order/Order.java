package com.pluralsight.order;

import com.pluralsight.item.Appetizer;
import com.pluralsight.item.Drink;
import com.pluralsight.item.Taco;

import java.util.ArrayList;

public class Order {

    private ArrayList<Taco> tacoOrder;
    private ArrayList<Appetizer>appetizerOrder;
    private ArrayList<Drink>drinkOrder;
    private double totalPrice;

    public Order() {
        this.tacoOrder = new ArrayList<>();
        this.appetizerOrder = new ArrayList<>();
        this.drinkOrder = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addTaco(Taco taco) {
        tacoOrder.add(taco);
        totalPrice += taco.getPrice();
    }
    public void addAppetizer(Appetizer appetizer) {
        appetizerOrder.add(appetizer);
        totalPrice += appetizer.getPrice();
    }
    public void addDrink(Drink drink) {
        drinkOrder.add(drink);
        totalPrice += drink.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public ArrayList<Taco> getTacoOrder() {
        return tacoOrder;
    }
    public ArrayList<Appetizer> getAppetizerOrder() {
        return appetizerOrder;
    }
    public ArrayList<Drink> getDrinkOrder() {
        return drinkOrder;
    }

}
