package com.najlala.store;

import org.springframework.stereotype.Component;

@Component
public class Cashier {

    public void processPurchase(Customer customer, double discountRate) {
        customer.checkout(discountRate);
    }
}
