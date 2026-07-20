package com.handson.week1.builder;

public class BuilderDemo {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32 GB")
                .setStorage("1 TB SSD")
                .setGraphicsCard(true)
                .setBluetooth(true)
                .build();

        System.out.println(gamingPC);

        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("16 GB")
                .setStorage("512 GB SSD")
                .setGraphicsCard(false)
                .setBluetooth(true)
                .build();

        System.out.println(officePC);
    }
}