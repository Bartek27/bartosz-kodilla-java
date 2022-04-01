package com.kodilla.good.paterns.challenges.service;

public class ProductOrderService implements OrderService {
    public boolean createOrder(final User user, final Invoice invoice) {
        System.out.println("Created an order for " +user.getFirstName() +" "+ user.getFamilyName() + " Invoice number is " + invoice.getId());
        return true;
    }
}
