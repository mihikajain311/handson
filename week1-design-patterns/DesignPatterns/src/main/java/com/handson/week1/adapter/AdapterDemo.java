package com.handson.week1.adapter;

public class AdapterDemo {

    public static void main(String[] args) {

        OldPaymentGateway oldGateway = new OldPaymentGateway();

        PaymentProcessor processor = new PaymentAdapter(oldGateway);

        processor.pay(2500);
    }
}