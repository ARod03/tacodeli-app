package com.pluralsight.order;

import com.pluralsight.item.Appetizer;
import com.pluralsight.item.Drink;
import com.pluralsight.item.Taco;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {

    public String generateReceipt(Order order) {
        StringBuilder receipt = new StringBuilder();

        //This portion will be the header for the receipt
        receipt.append("=========== TacoDeli Receipt ===========\n");
        receipt.append("Date: ").append(getFormattedDate()).append("\n");
        receipt.append("========================================\n\n");

        //Create the portion of the receipt for the tacos
        if (!order.getTacos().isEmpty()) {
            receipt.append("TACOS:\n");
            for (Taco taco : order.getTacos()) {
                receipt.append(formatTaco(taco)).append("\n");
            }
        }

        //Create the portion of the receipt for the included appetizers
        if (!order.getAppetizers().isEmpty()) {
            receipt.append("APPETIZERS:\n");
            for (Appetizer app : order.getAppetizers()) {
                receipt.append(" - Chips with ").append(app.getDipping()).append("  $").append(String.format("%.2f", app.getPrice())).append("\n");
            }
            receipt.append("\n");
        }

        //Create the portion of the receipt for the included drinks
        if (!order.getDrinks().isEmpty()) {
            receipt.append("DRINKS:\n");
            for (Drink drink : order.getDrinks()) {
                receipt.append(" - ").append(drink.getSize()).append(" ").append(drink.getDrinkName()).append("  $").append(String.format("%.2f", drink.getPrice())).append("\n");
            }
            receipt.append("\n");
        }

        //This displays the total of the users order
        receipt.append("========================================\n");
        receipt.append("TOTAL: $").append(String.format("%.2f", order.getTotalPrice())).append("\n");
        receipt.append("========================================\n");

        String receiptText = receipt.toString();
        writeReceiptToFile(receiptText);

        return receiptText;
    }

    //Method to format a taco in the receipt
    private String formatTaco(Taco taco) {
        StringBuilder sb = new StringBuilder();

        sb.append("Taco [").append(taco.getSize()).append(", ").append(taco.getTortilla().isEmpty() ? "No Tortilla" : taco.getTortilla()).append("]\n");
        sb.append("Proteins: ").append(listOrNone(taco.getProtein())).append("\n");
        sb.append("Dairy: ").append(listOrNone(taco.getDairy())).append("\n");
        sb.append("Salsa: ").append(taco.getSalsa().isEmpty() ? "None" : taco.getSalsa()).append("\n");

        sb.append("Toppings: ");
        if (taco.getToppings().isEmpty()) {
            sb.append("None\n");
        } else {
            for (String t : taco.getToppings()) {
                if (isPremium(t)) {
                    sb.append(t).append(" (+$1.00), ");
                } else {
                    sb.append(t).append(", ");
                }
            }
            sb.setLength(sb.length() - 2);
            sb.append("\n");
        }

        sb.append("Sides: ").append(listOrNone(taco.getSides())).append("\n");
        sb.append("   Price: $").append(String.format("%.2f", taco.getPrice())).append("\n");
        return sb.toString();
    }

    private boolean isPremium(String t) {
        return t.equalsIgnoreCase("Avocado") || t.equalsIgnoreCase("Fresh Spinach") || t.equalsIgnoreCase("Sauteed Spinach");
    }

    private String listOrNone(java.util.List<String> list) {
        return list.isEmpty() ? "None" : list.toString();
    }

    //Method write and store receipt files into a receipts folder
    private void writeReceiptToFile(String text) {
        try {
            String folderPath = "src/main/resources/receipts/";
            File folder = new File(folderPath);

            if (!folder.exists()) {
                folder.mkdirs();
            }

            String fileName = "receipt_" + System.currentTimeMillis() + ".txt";
            File file = new File(folderPath + fileName);

            FileWriter writer = new FileWriter(file);
            writer.write(text);
            writer.close();

            System.out.println("Receipt saved to: " + file.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error writing receipt: " + e.getMessage());
        }
    }

    //Method to format the current date
    private String getFormattedDate() {
        return LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"));
    }

}
