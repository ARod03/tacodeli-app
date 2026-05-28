package com.pluralsight.menuScreen;

import com.pluralsight.item.Drink;

import java.util.Scanner;

public class DrinkScreen {

    private Scanner scanner;

    public DrinkScreen() {
        this.scanner = new Scanner(System.in);
    }

    public Drink buildDrink() {
        System.out.println("\n==== Drink Menu ====");

        System.out.println("Enter Drink number: ");
        System.out.println("1) Fountain Drink - Maine Root (Cola, Diet Cola, Root Beer, Ginger Brew, Pink Drink, Doppelganger)");
        System.out.println("2) Iced Tea (Black, Hibiscus)");
        System.out.println("3) Coffee (Bold Blend, Tacodeli Blend)");
        System.out.println("4) Aguas Frescas (Horchata, Melon, Jamaica, Limonada, Cold Brew, The Cha Cha)");
        System.out.println("5) Alcoholic Beverage (Guavarita, On The Rocks, Ranch Water, Frozen Margarita)");
    }

}
