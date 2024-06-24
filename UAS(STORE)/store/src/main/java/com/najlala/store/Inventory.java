package com.najlala.store;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class Inventory {
    protected final List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void viewInventory() {
        for (Product product : products) {
            System.out.println(product.getName() + " - " + product.getQuantity() + " units available");
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}