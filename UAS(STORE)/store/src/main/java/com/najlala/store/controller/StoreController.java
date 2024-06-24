package com.najlala.store.controller;

import com.najlala.store.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/store")
public class StoreController {

    private final Inventory inventory;
    private final Cashier cashier;

    @Autowired
    public StoreController(Inventory inventory, Cashier cashier) {
        this.inventory = inventory;
        this.cashier = cashier;
        initializeInventory();
    }

    private void initializeInventory() {
        // Initialize inventory with sample products
        Product bread = new Product("Bread", 17.00, 10);
        Product milk = new Product("Milk", 23.00, 20);
        inventory.addProduct(bread);
        inventory.addProduct(milk);
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/inventory")
    public String viewInventory(Model model) {
        List<Product> products = inventory.getProducts();
        model.addAttribute("products", products);
        return "inventory";
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestParam String name, @RequestParam double price, @RequestParam int quantity) {
        Product product = new Product(name, price, quantity);
        inventory.addProduct(product);
        return "redirect:/store/inventory";
    }

    @PostMapping("/removeProduct")
    public String removeProduct(@RequestParam String name) {
        Product product = inventory.findProductByName(name);
        if (product != null) {
            inventory.removeProduct(product);
        }
        return "redirect:/store/inventory";
    }

    @PostMapping("/cart")
    public String addToCart(@RequestParam String customerName, @RequestParam String productName, @RequestParam int quantity, Model model) {
        Customer customer = new Customer(customerName);
        Product product = inventory.findProductByName(productName);
        if (product == null) {
            model.addAttribute("message", "Product not found");
            return "error";
        }
        customer.addToCart(product, quantity);
        model.addAttribute("message", "Added " + quantity + " units of " + productName + " to " + customerName + "'s cart");
        return "cart";
    }

    @GetMapping("/cart")
    public String viewCart(@RequestParam String customerName, Model model) {
        Customer customer = new Customer(customerName);
        List<CartItem> cartItems = customer.getCart().getItems();
        model.addAttribute("cartItems", cartItems);
        return "cart";
    }

    @PostMapping("/checkout")
    public String checkout(@RequestParam String customerName, Model model) {
        Customer customer = new Customer(customerName);
        cashier.processPurchase(customer, 0.1); // 10% discount
        model.addAttribute("message", "Checkout completed for " + customerName);
        return "checkout";
    }
}