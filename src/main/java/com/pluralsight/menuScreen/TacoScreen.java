package com.pluralsight.menuScreen;

import com.pluralsight.item.Taco;

import java.util.ArrayList;
import java.util.Scanner;

public class TacoScreen {

    private Scanner scanner = new Scanner(System.in);

    public Taco buildTaco() {

        String size = "";
        while (true) {
            System.out.println("\nChoose Taco Size:");
            System.out.println("S) Small");
            System.out.println("L) Large");
            System.out.print("Enter choice: ");
            size = this.scanner.nextLine().trim().toUpperCase();

            if (size.equals("S") || size.equals("L"))
                break;
            System.out.println("Invalid size. Try again.");
        }

        String tortilla = "";
        while (true) {
            System.out.println("\nChoose Tortilla Type:");
            System.out.println("1) Flour");
            System.out.println("2) Corn");
            System.out.println("3) Wheat");
            System.out.println("N) No tortilla");
            System.out.print("Enter choice: ");

            String tortillaChoice = scanner.nextLine().trim();

            switch (tortillaChoice) {
                case "1":
                    tortilla = "Flour";
                    break;
                case "2":
                    tortilla = "Corn";
                    break;
                case "3":
                    tortilla = "Wheat";
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }
            break;
        }

        ArrayList<String> protein = new ArrayList<>();
        boolean choosingProtein = true;

        while (choosingProtein) {
            System.out.println("\nChoose Protein Options:");
            System.out.println("1) Chicken (+$1.45)");
            System.out.println("2) Sirloin (+$1.45)");
            System.out.println("3) Barbacoa (+$1.45)");
            System.out.println("4) Sausage (+$0.75)");
            System.out.println("5) Chorizo (+$0.75)");
            System.out.println("6) Eggs (+$0.45)");
            System.out.println("7) Bacon (+0.45)");
            System.out.println("8) Veggie Nut Chorizo (+$1.45)");
            System.out.println("9) Picadillo (+$1.45)");
            System.out.println("N) No Protein ");
            System.out.println("D) Done");
            System.out.print("Enter choice: ");

            String proteinChoice = scanner.nextLine().trim().toUpperCase();

            switch (proteinChoice) {
                case "1":
                    addIfNotExists(protein, "Chicken");
                    break;
                case "2":
                    addIfNotExists(protein, "Sirloin");
                    break;
                case "3":
                    addIfNotExists(protein, "Barbacoa");
                    break;
                case "4":
                    addIfNotExists(protein, "Sausage");
                    break;
                case "5":
                    addIfNotExists(protein, "Chorizo");
                    break;
                case "6":
                    addIfNotExists(protein, "Eggs");
                    break;
                case "7":
                    addIfNotExists(protein, "Bacon");
                    break;
                case "8":
                    addIfNotExists(protein, "Veggie Nut Chorizo");
                    break;
                case "9":
                    addIfNotExists(protein, "Picadillo");
                    break;
                case "N":
                    protein.clear();
                    choosingProtein = false;
                    System.out.println("No protein selected.");
                    break;
                case "D":
                    choosingProtein = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        ArrayList<String> dairy = new ArrayList<>();
        boolean choosingDairy = true;

        while (choosingDairy) {
            System.out.println("\nChoose Dairy Options (All dairy options are $0.45 each):");
            System.out.println("1) Jack Cheese");
            System.out.println("2) Queso Fresco");
            System.out.println("3) Queso Liquido");
            System.out.println("4) Sour Cream");
            System.out.println("N) No Dairy");
            System.out.println("D) Done");
            System.out.print("Enter choice: ");

            String dairyChoice = scanner.nextLine().trim().toUpperCase();

            switch (dairyChoice) {
                case "1":
                    addIfNotExists(dairy, "Jack Cheese");
                    break;
                case "2":
                    addIfNotExists(dairy, "Queso Fresco");
                    break;
                case "3":
                    addIfNotExists(dairy, "Queso Liquido");
                    break;
                case "4":
                    addIfNotExists(dairy, "Sour Cream");
                    break;
                case "N":
                    dairy.clear();
                    choosingDairy = false;
                    System.out.println("No dairy selected.");
                    break;
                case "D":
                    choosingDairy = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        ArrayList<String> toppings = new ArrayList<>();
        boolean choosingToppings = true;

        while (choosingToppings) {
            System.out.println("\nChoose Toppings:");
            System.out.println("1) Whole Black Beans");
            System.out.println("2) Refried Black Beans");
            System.out.println("3) Portobello Mushrooms");
            System.out.println("4) Poblanos");
            System.out.println("5) Cooked Onions");
            System.out.println("6) Fresh Onions");
            System.out.println("7) Pico de Gallo");
            System.out.println("8) Tomatoes");
            System.out.println("9) Cilantro");
            System.out.println("10) Jalapenos");
            System.out.println("11) Avocado (+$1.00)");
            System.out.println("12) Fresh Spinach (+$1.00)");
            System.out.println("13) Sauteed Spinach (+$1.00)");
            System.out.println("N) No Toppings");
            System.out.println("D) Done");
            System.out.print("Enter choice: ");

            String toppingsChoice = scanner.nextLine().trim().toUpperCase();

            switch (toppingsChoice) {
                case "1":
                    addIfNotExists(toppings, "Whole Black Beans");
                    break;
                case "2":
                    addIfNotExists(toppings, "Refried Black Beans");
                    break;
                case "3":
                    addIfNotExists(toppings, "Portobello Mushrooms");
                    break;
                case "4":
                    addIfNotExists(toppings, "Poblanos");
                    break;
                case "5":
                    addIfNotExists(toppings, "Cooked Onions");
                    break;
                case "6":
                    addIfNotExists(toppings, "Fresh Onions");
                    break;
                case "7":
                    addIfNotExists(toppings, "Pico de Gallo");
                    break;
                case "8":
                    addIfNotExists(toppings, "Tomatoes");
                    break;
                case "9":
                    addIfNotExists(toppings, "Cilantro");
                    break;
                case "10":
                    addIfNotExists(toppings, "Jalapenos");
                    break;
                case "11":
                    addIfNotExists(toppings, "Avocado");
                    break;
                case "12":
                    addIfNotExists(toppings, "Fresh Spinach");
                    break;
                case "13":
                    addIfNotExists(toppings, "Sauteed Spinach");
                    break;
                case "N":
                    toppings.clear();
                    choosingToppings = false;
                    System.out.println("No toppings selected.");
                    break;
                case "D":
                    choosingToppings = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        String salsa = "";
        while (true) {
            System.out.println("\nChoose Salsa:");
            System.out.println("1) Verde (Mild)");
            System.out.println("2) Roja (Medium)");
            System.out.println("3) Dona (Hot) (+$0.10)");
            System.out.println("4) Habanero (Very Hot)");
            System.out.println("N) No Salsa");
            System.out.print("Enter choice: ");

            String salsaChoice = scanner.nextLine().trim().toUpperCase();

            switch (salsaChoice) {
                case "1":
                    salsa = "Verde";
                    break;
                case "2":
                    salsa = "Roja";
                    break;
                case "3":
                    salsa = "Dona";
                    break;
                case "4":
                    salsa = "Habanero";
                    break;
                case "N":
                    salsa = "";
                    System.out.println("No salsa selected.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }
            break;
        }

        ArrayList<String> sides = new ArrayList<>();
        boolean choosingSides = true;

        while (choosingSides) {
            System.out.println("\nChoose Sides:");
            System.out.println("1) Chips");
            System.out.println("2) Rice");
            System.out.println("3) Beans");
            System.out.println("N) No Sides");
            System.out.println("D) Done");
            System.out.print("Enter choice: ");

            String sidesChoice = scanner.nextLine().trim().toUpperCase();

            switch (sidesChoice) {
                case "1":
                    addIfNotExists(sides, "Chips");
                    break;
                case "2":
                    addIfNotExists(sides, "Rice");
                    break;
                case "3":
                    addIfNotExists(sides, "Beans");
                    break;
                case "N":
                    sides.clear();
                    choosingSides = false;
                    System.out.println("No sides selected.");
                    break;
                case "D":
                    choosingSides = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        return new Taco(size, tortilla, protein, dairy, toppings, salsa, sides);
    }

    private void addIfNotExists(ArrayList<String> list, String item) {
        if (!list.contains(item)) {
            list.add(item);
            System.out.println(item + " added.");
        } else {
            System.out.println(item + " already selected.");
        }
    }
}
