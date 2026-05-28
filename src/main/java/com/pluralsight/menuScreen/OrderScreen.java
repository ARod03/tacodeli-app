package com.pluralsight.menuScreen;

import com.pluralsight.item.Appetizer;
import com.pluralsight.item.Drink;
import com.pluralsight.item.Taco;
import com.pluralsight.order.Order;
import com.pluralsight.order.Receipt;

import java.util.Scanner;

public class OrderScreen {

    Scanner scanner = new Scanner(System.in);

    public OrderScreen() {
        this.scanner = new Scanner(System.in);
    }

    public void display() {
        Order order = new Order();
        boolean ordering = true;

        while(ordering) {
            System.out.println("\n==== Order Menu ====");
            System.out.println("1) Add Taco");
            System.out.println("2) Add Appetizer");
            System.out.println("3) Add Drink");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.println("Select an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    TacoScreen tacoScreen = new TacoScreen();
                    Taco taco = tacoScreen.buildTaco();
                    order.addTaco(taco);
                    System.out.println("The taco has been added!");
                    break;

                case 2:
                    AppetizerScreen appetizerScreen = new AppetizerScreen();
                    Appetizer appetizer = appetizerScreen.buildAppetizer();
                    order.addAppetizer(appetizer);
                    System.out.println("The appetizer has been added!");
                    break;

                case 3:
                    DrinkScreen drinkScreen = new DrinkScreen();
                    Drink drink = drinkScreen.buildDrink();
                    order.addDrink(drink);
                    System.out.println("The drink has been added!");

                case 4:
                    checkout(order);
                    ordering = false;
                    break;

                case 0:
                    System.out.println("Order canceled.");
                    ordering = false;
                    break;

                default:
                    System.out.println("Invalid choice.");

            }

        }

    }

    private void checkout(Order order) {
        System.out.println("\n=== Checkout Order ===");
        System.out.println("Total: $" + order.getTotalPrice());

        Receipt receipt = new Receipt();
        String receiptText = receipt.generateReceipt(order);

        System.out.println("\nReceipt:");
        System.out.println(receiptText);

        System.out.println("Receipt saved. Thank you for ordering!");
    }
}
