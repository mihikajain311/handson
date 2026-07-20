# Week 1 - Design Patterns

This project contains implementations of common design patterns in Java.

## Implemented Patterns

- Singleton Pattern
- Factory Method Pattern
- Builder Pattern
- Adapter Pattern
- Observer Pattern

## Technologies Used

- Java 17
- Maven

## How to Run

Compile:

```bash
mvn clean compile
```

Run a pattern:

```bash
mvn exec:java -Dexec.mainClass="com.handson.week1.singleton.SingletonDemo"
```

Replace the main class with:

- `com.handson.week1.factory.FactoryDemo`
- `com.handson.week1.builder.BuilderDemo`
- `com.handson.week1.adapter.AdapterDemo`
- `com.handson.week1.observer.ObserverDemo`