package oop.polymorphism;

// Java Example: Run Time Polymorphism
class Vehicle {
    public void displayInfo() {
        System.out.println("Some vehicles are there.");
    }
}

class Car extends Vehicle {
    // Method overriding
    @Override
    public void displayInfo() {
        System.out.println("I have a Car.");
    }
}

class Bike extends Vehicle {
    // Method overriding
    @Override
    public void displayInfo() {
        System.out.println("I have a Bike.");
    }
}

