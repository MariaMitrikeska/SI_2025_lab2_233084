package org.example;

import java.util.List;

public class SILab2 {

    public static boolean isValidCard(String number) {
        return number != null && number.length() == 16 && number.matches("\\d+");
    }

    public static double checkCart(List<Item> items, String paymentCard) {
        if (!isValidCard(paymentCard)) {
            throw new RuntimeException("Invalid payment card number!");
        }

        double total = 0;
        for (Item item : items) {
            int price = item.getPrice();
            int discount = item.getDiscount();
            int quantity = item.getQuantity();

            if (price > 300 || discount > 0 || quantity > 10) {
                total += price * (1 - discount / 100.0) * quantity;
            } else {
                total += price * quantity;
            }
        }

        if (isValidCard(paymentCard)) {
            total -= 30;
        }

        return total;
    }
}
