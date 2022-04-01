package com.kodilla.good.paterns.challenges.service;

public interface OrderService {
    boolean createOrder(final User user, final Invoice invoice);
}
