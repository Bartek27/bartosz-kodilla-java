package com.kodilla.good.paterns.challenges.service;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new ProductOrderService());
        orderProcessor.process(orderRequest);



    }
}
