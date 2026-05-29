package com.pluralsight.menuScreen;


import com.pluralsight.item.Appetizer;

import java.util.Scanner;

public class AppetizerScreen {

    private Scanner scanner;

    public AppetizerScreen() {
        this.scanner = new Scanner(System.in);
    }

    public Appetizer buildAppetizer() {
        String dipping = null;

        while (dipping == null) {
            System.out.println("\n=== Appetizer Menu ===");
            System.out.println("S) Salsa");
            System.out.println("Q) Queso");
            System.out.println("G) Guacamole");
            System.out.print("Please choose dipping for your chips: ");

            String choice = scanner.nextLine().trim().toUpperCase();

            switch (choice) {
                case "S":
                    dipping = "Salsa";
                    break;
                case "Q":
                    dipping = "Queso";
                    break;
                case "G":
                    dipping = "Guacamole";
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }

        return new Appetizer(dipping);
    }

}
