package com.pluralsight.menuScreen;

import com.pluralsight.item.Drink;

import java.util.Scanner;

public class DrinkScreen {

    private Scanner scanner;

    public DrinkScreen() {
        this.scanner = new Scanner(System.in);
    }

    //Method to store two empty variables until the user decides to choose what type of drink and size they would like
    public Drink buildDrink() {
        String drinkName = null;
        String size = null;

        //Create a method to get the user's drink
        while (drinkName == null) {
            System.out.println("\n==== Drink Menu ====");
            System.out.println("1) Fountain Drink - Maine Root (Cola, Diet Cola, Root Beer, Ginger Brew, Pink Drink, Doppelganger)");
            System.out.println("2) Iced Tea (Black, Hibiscus)");
            System.out.println("3) Coffee (Bold Blend, Tacodeli Blend)");
            System.out.println("4) Aguas Frescas (Horchata, Melon, Jamaica, Limonada, Cold Brew, The Cha Cha)");
            System.out.println("5) Alcoholic Beverage (Guavarita, On The Rocks, Ranch Water, Frozen Margarita)");
            System.out.print("Enter Drink number: ");

            String drinkChoice = scanner.nextLine().trim();

            //Switch statement to grab the name of what the category the user wants to drink
            switch (drinkChoice) {
                case "1":
                    drinkName = "Fountain Drink";
                    break;
                case "2":
                    drinkName = "Iced Tea";
                    break;
                case "3":
                    drinkName = "Coffee";
                    break;
                case "4":
                    drinkName = "Aguas Frescas";
                    break;
                case "5":
                    drinkName = "Alcoholic Beverage";
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        //This is a while loop to force the user to pick a size
        while (size == null) {
            System.out.println("Select a size: ");
            System.out.println("S - Small");
            System.out.println("M - Medium");
            System.out.println("L - Large");
            String sizeChoice = scanner.nextLine().trim().toUpperCase();

            switch (sizeChoice) {
                case "S":
                    size = "Small";
                    break;
                case "M":
                    size = "Medium";
                    break;
                case "L":
                    size = "Large";
                    break;
                default:
                    System.out.println("Invalid choice, Please try again");
            }
        }

        return new Drink(drinkName, size);


    }

}
