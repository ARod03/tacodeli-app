package com.pluralsight.menuScreen;

import com.pluralsight.item.Appetizer;
import com.pluralsight.item.Drink;
import com.pluralsight.item.Taco;
import com.pluralsight.order.Order;
import com.pluralsight.order.Receipt;

import java.util.Scanner;

public class HomeScreen {

    private Scanner scanner;
    private Order order;

    public HomeScreen() {
        this.scanner = new Scanner(System.in);
        this.order = new Order();
    }

    //This is the Home Screen display
    public void displayHomeScreen() {
        boolean running = true;
        while (running) {
            System.out.println("\n======== TacoDeli Ordering ========");
            System.out.println("1) Build a Taco");
            System.out.println("2) Add a Drink");
            System.out.println("3) Add an Appetizer");
            System.out.println("4) Checkout");
            System.out.println("5) Exit App");
            System.out.print("Enter your choice: ");

            String menuChoice = scanner.nextLine().trim();

            //Switch statements to open up different screens that the user chooses
            switch (menuChoice) {
                case "1":
                    boolean addMoreTacos = true;

                    //While loops to make sure the user wants to add another taco, drink, or appetizer
                    while (addMoreTacos) {
                        TacoScreen tacoScreen = new TacoScreen();
                        Taco taco = tacoScreen.buildTaco();
                        order.addTaco(taco);
                        System.out.println("Taco added successfully");

                        System.out.println("\nWould you like to add another taco?");
                        System.out.println("1) Yes");
                        System.out.println("2) No");
                        System.out.print("Enter your choice: ");

                        String againTaco = scanner.nextLine().trim();
                        if (!againTaco.equals("1")) {
                            addMoreTacos = false;
                        }
                    }
                    break;
                case "2":
                    boolean addMoreDrinks = true;
                    while (addMoreDrinks) {
                        DrinkScreen drinkScreen = new DrinkScreen();
                        Drink drink = drinkScreen.buildDrink();
                        order.addDrink(drink);
                        System.out.println("Drink added successfully");

                        System.out.println("\nWould you like to add another drink?");
                        System.out.println("1) Yes");
                        System.out.println("2) No");
                        System.out.print("Enter your choice: ");
                        String againDrink = scanner.nextLine().trim();
                        if (!againDrink.equals("1")) {
                            addMoreDrinks = false;
                        }
                    }
                    break;
                case "3":
                    boolean addMoreAppetizers = true;
                    while (addMoreAppetizers) {
                        AppetizerScreen appetizerScreen = new AppetizerScreen();
                        Appetizer appetizer = appetizerScreen.buildAppetizer();
                        order.addAppetizer(appetizer);
                        System.out.println("Appetizer added successfully");

                        System.out.println("\nWould you like to add another appetizer?");
                        System.out.println("1) Yes");
                        System.out.println("2) No");
                        System.out.print("Enter your choice: ");
                        String againAppetizer = scanner.nextLine().trim();
                        if (!againAppetizer.equals("1")) {
                            addMoreAppetizers = false;
                        }
                    }
                    break;
                case "4":
                    Receipt receipt = new Receipt();
                    String text = receipt.generateReceipt(order);

                    System.out.println("\n" + text);
                    System.out.println("Thank you for placing your order.");
                    running = false;
                    break;
                case "5":
                    System.out.println("Thank you for choosing TacoDeli!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
