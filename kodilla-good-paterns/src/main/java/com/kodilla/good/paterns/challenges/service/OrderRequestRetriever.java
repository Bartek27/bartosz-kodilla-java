package com.kodilla.good.paterns.challenges.service;

import java.math.BigDecimal;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {


        User user = new User("user23", "John", "Johnson");

        Product product1 = new Product("Soap");
        Product product2 = new Product("Towel");

        Item item1 = new Item(1, product1, new BigDecimal("12"));
        Item item2 = new Item(2, product2, new BigDecimal("13"));

        Invoice invoice = new Invoice(256545);

        invoice.getItemList().add(item1);
        invoice.getItemList().add(item2);

        return new OrderRequest(user, invoice);
    }
}
