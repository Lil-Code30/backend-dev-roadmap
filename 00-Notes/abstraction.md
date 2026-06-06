# Abstraction in Java

In Java, **Abstraction** is the OOP principle of:

> **Hiding implementation details and showing only the essential features.**

The user of a class knows **what** an object does, but not necessarily **how** it does it.

---

# Real-World Example

Think of a car:

```text
Start Car
   ↓
Car Starts
```

You press the start button, but you don't need to know:

- how the engine ignites
- how fuel is injected
- how the battery powers the starter

Those details are hidden.

That's abstraction.

---

# Why Use Abstraction?

✅ Reduce complexity
✅ Hide implementation details
✅ Improve code maintainability
✅ Focus on what an object does
✅ Create flexible designs

---

# How Java Implements Abstraction

Java provides two main ways:

1. **Abstract Classes**
2. **Interfaces**

---

# 1. Abstract Classes

An abstract class cannot be instantiated directly.

```java
abstract class Animal {

    abstract void sound();
}
```

❌ Not allowed:

```java
Animal animal = new Animal();
```

---

## Abstract Method

An abstract method has no body.

```java
abstract void sound();
```

The child class must implement it.

---

## Example

```java
abstract class Animal {

    abstract void sound();
}
```

```java
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

Usage:

```java
Animal dog = new Dog();

dog.sound();
```

Output:

```text
Bark
```

---

# Abstract Class Can Have Normal Methods

Unlike interfaces, abstract classes can contain both abstract and concrete methods.

```java
abstract class Animal {

    abstract void sound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}
```

Child class:

```java
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

Usage:

```java
Dog dog = new Dog();

dog.sound();
dog.sleep();
```

---

# 2. Interfaces

An interface defines a contract.

It specifies what methods a class must implement.

---

## Interface Example

```java
interface Flyable {

    void fly();
}
```

Implementation:

```java
class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
```

Usage:

```java
Flyable bird = new Bird();

bird.fly();
```

Output:

```text
Flying...
```

---

# Abstract Class vs Interface

| Feature                     | Abstract Class | Interface                   |
| --------------------------- | -------------- | --------------------------- |
| Can have constructors       | ✅             | ❌                          |
| Can have instance variables | ✅             | ❌                          |
| Can have abstract methods   | ✅             | ✅                          |
| Can have concrete methods   | ✅             | ✅ (default/static methods) |
| Inheritance keyword         | `extends`      | `implements`                |
| Multiple inheritance        | ❌             | ✅                          |

---

# Example: Payment System

Abstract class:

```java
abstract class Payment {

    abstract void pay(double amount);
}
```

Implementations:

```java
class CreditCardPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println(
            "Paid $" + amount + " using credit card"
        );
    }
}
```

```java
class PayPalPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println(
            "Paid $" + amount + " using PayPal"
        );
    }
}
```

Usage:

```java
Payment payment = new CreditCardPayment();

payment.pay(100);
```

Output:

```text
Paid $100 using credit card
```

The user only cares about:

```java
payment.pay(100);
```

Not how the payment is processed.

---

# Abstraction + Polymorphism

These concepts often work together.

```java
Animal animal = new Dog();

animal.sound();
```

### Abstraction

The user interacts with:

```java
Animal
```

### Polymorphism

At runtime Java executes:

```java
Dog.sound();
```

---

# When to Use an Abstract Class

Use an abstract class when:

- Classes share common fields
- Classes share common methods
- You want some implemented behavior and some abstract behavior

Example:

```java
abstract class Vehicle {

    String brand;

    void start() {
        System.out.println("Starting...");
    }

    abstract void drive();
}
```

---

# When to Use an Interface

Use an interface when:

- You want a contract
- Unrelated classes can implement the same behavior
- You need multiple inheritance of behavior

Example:

```java
interface Flyable {
    void fly();
}
```

```java
class Bird implements Flyable {}
class Airplane implements Flyable {}
```

---

# Quick Comparison with Other OOP Concepts

| Concept       | Purpose                       |
| ------------- | ----------------------------- |
| Encapsulation | Hide data                     |
| Inheritance   | Reuse code                    |
| Polymorphism  | One interface, many behaviors |
| Abstraction   | Hide implementation details   |

---

# Easy Way to Remember

### Encapsulation

```text
Hide the data
```

Example:

```java
private String name;
```

---

### Abstraction

```text
Hide the implementation
```

Example:

```java
abstract void sound();
```

You know **what** the method does, but not **how** it's implemented.

---

# One-Sentence Definition

**Abstraction is the process of exposing only the essential functionality of an object while hiding the internal implementation details, typically using abstract classes and interfaces in Java.**
