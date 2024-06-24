package com.najlala.store;

public class Customer {
    protected final String name;
    protected final ShoppingCart cart;

    public Customer(String name) {
        this.name = name;
        this.cart = new ShoppingCart();
    }

    public void addToCart(Product product, int quantity) {
        cart.addItem(product, quantity);
    }

    public void removeFromCart(Product product) {
        cart.removeItem(product);
    }

    public void viewCart() {
        cart.viewCart();
    }

    public void checkout(double discountRate) {
        double total = cart.calculateTotal();
        double discount = total * discountRate;
        double finalTotal = total - discount;
        System.out.println("Thank You, " + name + "! Payment of " + finalTotal + " has been processed after a discount of " + discount + ".");
    }

    public String getName() {
        return name;
    }

    public ShoppingCart getCart() {
        return cart;
    }
}
