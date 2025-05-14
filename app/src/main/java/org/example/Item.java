package org.example;

public class Item {
    private String name;
    private int quantity;
    private int price;
    private int discount;

    public Item(String name, int quantity, int price, int discount) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }
}
