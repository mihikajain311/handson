package com.handson.week1.singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("First message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second message");

        if (logger1 == logger2) {
            System.out.println("Both objects are the same.");
        } else {
            System.out.println("Different objects created.");
        }
    }
}