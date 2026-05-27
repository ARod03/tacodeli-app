package com.pluralsight.order;

import com.pluralsight.item.Appetizer;
import com.pluralsight.item.Drink;
import com.pluralsight.item.Taco;

import java.util.ArrayList;

public class Order {

    private ArrayList<Taco> tacoOrder = new ArrayList<>();
    private ArrayList<Appetizer>appetizerOrder  = new ArrayList<>();
    private ArrayList<Drink>drinkOrder = new ArrayList<>();

    public void addTaco(Taco taco) {tacoOrder.add(taco);}
    public void addDrink(Drink drink) {drinkOrder.add(drink);}
    public void addAppetizer(Appetizer appetizer) {appetizerOrder.add(appetizer);}

    //This is to get the sum of the tacos, drinks, and appetizers ordered
    public double getTotalPrice() {
        double totalPrice = 0;
        return totalPrice;
    }

    public void display(){
        System.out.println("1) Add Taco");
        System.out.println("2) Add Drink");
        System.out.println("3) Add Appetizer");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel Order");
    }

}
