# Basic OOP Concepts in Java

In Java, **OOP** stands for:

# Object-Oriented Programming

It is a programming style where code is organized using:

- **classes**
- **objects**

Java is heavily based on OOP.

---

# Real-World Analogy

Think about a car.

A car has:

- properties → color, brand, speed
- behaviors → drive, brake, start

In Java:

- a **class** is the blueprint
- an **object** is the real thing created from the blueprint

---

# 1. Class

A class defines the structure of objects.

```java id="t4n0dc"
class Car {

    String brand;
    String color;

    void drive() {
        System.out.println("The car is driving");
    }
}
```

---

# 2. Object

An object is an instance of a class.

```java id="k5hrdh"
Car myCar = new Car();
```

---

# Full Example

```java id="j9n8eo"
class Car {

    String brand;
    String color;

    void drive() {
        System.out.println(brand + " is driving");
    }
}

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "Toyota";
        car1.color = "Black";

        car1.drive();
    }
}
```

Output:

```text id="9j7m13"
Toyota is driving
```

---

# Main OOP Concepts

There are 4 major pillars of OOP:

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

---

# 1. Encapsulation

Encapsulation means:

> hiding data and controlling access to it.

Usually done using:

- `private`
- getters/setters

---

## Example

```java id="v9mpcb"
class Person {

    private String name;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}
```

Usage:

```java id="wwjlwm"
Person p = new Person();

p.setName("Loko");

System.out.println(p.getName());
```

---

# 2. Inheritance

Inheritance allows one class to inherit properties and methods from another class.

---

## Example

```java id="c3l57z"
class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }
}
```

Usage:

```java id="jlwmi6"
Dog d = new Dog();

d.eat();
d.bark();
```

---

# 3. Polymorphism

Polymorphism means:

> one method can behave differently depending on the object.

---

## Method Overriding

```java id="v7sjxe"
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

Usage:

```java id="u4dr4n"
Animal a = new Dog();

a.sound();
```

Output:

```text id="ym2tbc"
Bark
```

---

# 4. Abstraction

Abstraction means:

> hiding implementation details and showing only essential behavior.

Done using:

- abstract classes
- interfaces

---

## Abstract Class Example

```java id="lyjlwm"
abstract class Animal {

    abstract void sound();
}
```

---

## Interface Example

```java id="vjlwmn"
interface Flyable {

    void fly();
}
```

---

# Constructors

Constructors initialize objects.

---

## Example

```java id="g5w1m8"
class Student {

    String name;

    Student(String studentName) {
        name = studentName;
    }
}
```

Usage:

```java id="djlwm0"
Student s = new Student("Loko");
```

---

# `this` Keyword

Refers to the current object.

```java id="mjlwm7"
class Person {

    String name;

    Person(String name) {
        this.name = name;
    }
}
```

---

# Access Modifiers

| Modifier    | Access                    |
| ----------- | ------------------------- |
| `public`    | everywhere                |
| `private`   | inside class only         |
| `protected` | same package + subclasses |
| default     | same package              |

---

# Static Members

Belong to the class itself, not objects.

```java id="d8jlwm"
class Test {

    static int count = 0;
}
```

Access:

```java id="3jlwmc"
System.out.println(Test.count);
```

---

# Object Memory Concept

```text id="1jlwmx"
Class → blueprint
Object → actual instance in memory
```

---

# Simple OOP Example

```java id="jlwm1r"
class BankAccount {

    String owner;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void showBalance() {
        System.out.println(balance);
    }
}

public class Main {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.owner = "Loko";

        acc.deposit(500);

        acc.showBalance();
    }
}
```

---

# Why OOP Is Useful

✅ Reusable code
✅ Easier maintenance
✅ Better organization
✅ Scalable applications
✅ Real-world modeling

---

# Easy Way to Remember

| Concept       | Meaning          |
| ------------- | ---------------- |
| Class         | blueprint        |
| Object        | real instance    |
| Encapsulation | protect data     |
| Inheritance   | inherit features |
| Polymorphism  | many behaviors   |
| Abstraction   | hide details     |
