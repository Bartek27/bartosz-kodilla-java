package com.kodilla.good.paterns.challenges.service;

import java.math.BigDecimal;

public class Item {

    private int id;
    private Product product;
    private BigDecimal price;

    public Item (int id, Product product, BigDecimal price) {

        this.id = id;
        this.product = product;
        this.price = price;
    }
}
