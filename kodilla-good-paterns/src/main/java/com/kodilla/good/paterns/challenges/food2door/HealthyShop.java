package com.kodilla.good.paterns.challenges.food2door;

public class HealthyShop implements Shop{
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to HealthyFoodShop.");
        return true;
    }
}
