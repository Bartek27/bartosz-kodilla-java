package com.kodilla.good.paterns.challenges.food2door;

public class GlutenFreeShop implements Shop {
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to GlutenFreeShop.");
        return true;
    }
}