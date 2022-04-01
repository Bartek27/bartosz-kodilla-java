package com.kodilla.good.paterns.challenges.service;

public class OrderProcessor {

    private OrderService orderService;


    public OrderProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderTo process(OrderRequest orderRequest) {
        boolean ordered = orderService.createOrder(orderRequest.getUser(), orderRequest.getInvoice());


        return new OrderTo(orderRequest.getUser(), orderRequest.getInvoice(), ordered);
    }
}
