package com.handson.week1.observer;

public class ObserverDemo {

    public static void main(String[] args) {

        NewsAgency agency = new NewsAgency();

        Observer mobile = new MobileClient();
        Observer web = new WebClient();

        agency.registerObserver(mobile);
        agency.registerObserver(web);

        agency.setLatestNews("Java 25 Released!");

        System.out.println();

        agency.setLatestNews("Spring Boot 4 Coming Soon!");
    }
}