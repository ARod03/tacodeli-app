package com.pluralsight.menuScreen;


import com.pluralsight.item.Appetizer;

import java.util.Scanner;

public class AppetizerScreen {

    private Scanner scanner;

    public AppetizerScreen() {
        this.scanner = new Scanner(System.in);
    }

    public Appetizer buildAppetizer() {
        System.out.println("\n=== Appetizer Menu ===");
        System.out.println("S) Salsa");
        System.out.println("Q) Queso");
        System.out.println("G) Guacamole");
        System.out.print("Please choose dipping for your chips: ");

        String dipping = scanner.nextLine();

        return new Appetizer(dipping);
    }

}
