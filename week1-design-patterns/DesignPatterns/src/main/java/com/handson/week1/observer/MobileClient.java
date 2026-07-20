package com.handson.week1.observer;

public class MobileClient implements Observer {

    @Override
    public void update(String news) {

        System.out.println("📱 Mobile Notification: " + news);
    }
}