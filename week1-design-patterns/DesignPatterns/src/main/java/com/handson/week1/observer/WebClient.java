package com.handson.week1.observer;

public class WebClient implements Observer {

    @Override
    public void update(String news) {

        System.out.println("💻 Web Notification: " + news);
    }
}