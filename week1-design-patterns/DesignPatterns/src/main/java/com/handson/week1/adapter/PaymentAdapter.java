package com.handson.week1.adapter;

public class PaymentAdapter implements PaymentProcessor {

    private OldPaymentGateway oldGateway;

    public PaymentAdapter(OldPaymentGateway oldGateway) {
        this.oldGateway = oldGateway;
    }

    @Override
    public void pay(double amount) {
        oldGateway.makePayment(amount);
    }
}