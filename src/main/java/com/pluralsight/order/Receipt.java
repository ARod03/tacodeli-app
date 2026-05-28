package com.pluralsight.order;

import com.pluralsight.item.Appetizer;
import com.pluralsight.item.Drink;
import com.pluralsight.item.Taco;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {

    public String generateReceipt(Order order) {
        StringBuilder receipt = new StringBuilder();

        //This portion will be the header for the receipt
        receipt.append("=== TacoDeli Receipt ===\n");
        receipt.append("Date: ").append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))).append("\n\n");

        //Create the portion of the receipt for the tacos
        receipt.append("Tacos:\n");
        for (Taco taco: order.getTacoOrder()) {
            receipt.append(" - Taco: ").append(taco.getPrice()).append("\n");
        }
        receipt.append("\n");

        //Create the portion of the receipt for the included appetizers
        receipt.append("Appetizers:\n");
        for (Appetizer appetizer: order.getAppetizerOrder()) {
            receipt.append(" - ").append(appetizer.getDipping()).append(" - $").append(appetizer.getPrice()).append("\n");
        }
        receipt.append("\n");

        //Create the portion of the receipt for the included drinks
        receipt.append("Drinks:\n");
        for (Drink drink: order.getDrinkOrder()) {
            receipt.append(" - ").append(drink.getDrinkName()).append(" (").append(drink.getSize()).append(") - $").append(drink.getPrice()).append("\n");
        }

        receipt.append("Total Price $").append(order.getTotalPrice()).append("\n");
        receipt.append("================\n");

        String receiptText = receipt.toString();
        return receiptText;



    }

}
