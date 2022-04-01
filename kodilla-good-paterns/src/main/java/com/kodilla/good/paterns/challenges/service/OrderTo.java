package com.kodilla.good.paterns.challenges.service;

public class OrderTo {
    private User user;
    private Invoice invoice;
    private boolean isOrdered;

    public OrderTo(final User user, final Invoice invoice, boolean isOrdered) {
        this.user = user;
        this.invoice = invoice;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

}
