package com.najlala.store;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    protected final List<CartItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct().getName().equals(product.getName())) {
                item.increaseQuantity(quantity);
                product.reduceQuantity(quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
        product.reduceQuantity(quantity);
    }

    public void removeItem(Product product) {
        items.removeIf(item -> item.getProduct().getName().equals(product.getName()));
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        return total;
    }

    public void viewCart() {
        for (CartItem item : items) {
            System.out.println(item.getProduct().getName() + " - " + item.getQuantity() + " units");
        }
    }

    public List<CartItem> getItems() {
        return items;
    }
}
