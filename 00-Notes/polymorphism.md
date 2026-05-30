# Polymorphism in Java

In Java, **Polymorphism** means:

> **"One interface, many forms."**

It allows the same method call to behave differently depending on the object that executes it.

Polymorphism is one of the **four pillars of OOP**:

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

---

## Why Use Polymorphism?

Without polymorphism:

```java
Dog dog = new Dog();
Cat cat = new Cat();

dog.sound();
cat.sound();
```

With polymorphism:

```java
Animal animal = new Dog();
animal.sound();

animal = new Cat();
animal.sound();
```

The same method call (`sound()`) produces different results.

---

## Types of Polymorphism in Java

### 1. Runtime Polymorphism (Method Overriding)

The most common type.

Occurs when a subclass overrides a parent method.

---

### Example

```java
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

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Meow");
    }
}
```

Usage:

```java
Animal animal;

animal = new Dog();
animal.sound();

animal = new Cat();
animal.sound();
```

Output:

```text
Bark
Meow
```

---

## How It Works

```java
Animal animal = new Dog();
```

- Reference type → `Animal`
- Actual object → `Dog`

When Java sees:

```java
animal.sound();
```

it executes the version belonging to the actual object (`Dog`).

This is called **dynamic method dispatch**.

---

## Visual Representation

```text
Animal animal
       |
       v
    Dog Object
```

Method calls are resolved using the object's real type.

---

## Method Overriding Rules

### Parent

```java
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}
```

### Child

```java
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

Requirements:

- Same method name
- Same parameters
- Same or compatible return type

---

## Using `@Override`

```java
@Override
void sound() {
    System.out.println("Bark");
}
```

This annotation tells Java:

> "I intend to override a parent method."

If you make a mistake, the compiler will warn you.

---

## Polymorphism with Collections

```java
Animal[] animals = {
    new Dog(),
    new Cat(),
    new Dog()
};

for (Animal animal : animals) {
    animal.sound();
}
```

Output:

```text
Bark
Meow
Bark
```

The same code works for many object types.

---

## Example: Vehicles

```java
class Vehicle {

    void start() {
        System.out.println("Vehicle started");
    }
}
```

```java
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car started");
    }
}
```

```java
class Motorcycle extends Vehicle {

    @Override
    void start() {
        System.out.println("Motorcycle started");
    }
}
```

Usage:

```java
Vehicle v1 = new Car();
Vehicle v2 = new Motorcycle();

v1.start();
v2.start();
```

Output:

```text
Car started
Motorcycle started
```

---

## Compile-Time Polymorphism (Method Overloading)

Java also supports another form of polymorphism called **method overloading**.

---

### Example

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

Usage:

```java
Calculator calc = new Calculator();

calc.add(2, 3);
calc.add(2.5, 3.5);
calc.add(1, 2, 3);
```

The method name is the same, but the parameters differ.

---

## Overloading vs Overriding

| Feature              | Overloading               | Overriding           |
| -------------------- | ------------------------- | -------------------- |
| Same class           | Usually ✅                | ❌                   |
| Inheritance required | ❌                        | ✅                   |
| Parameters           | Different                 | Same                 |
| Resolved at          | Compile time              | Runtime              |
| Type                 | Compile-time polymorphism | Runtime polymorphism |

---

## Benefits of Polymorphism

✅ Cleaner code
✅ More flexible design
✅ Easier maintenance
✅ Reusable code
✅ Extensible applications

---

## Real-World Analogy

Imagine a remote control:

```text
Remote -> Turn On
```

Depending on what device receives the signal:

- TV turns on
- Fan turns on
- Speaker turns on

Same action, different behavior.

That's polymorphism.

---

## Quick Mental Model

```text
Animal
   ↑
 ┌─┴─┐
Dog Cat
```

```java
Animal animal = new Dog();
animal.sound();
```

Java looks at the **actual object** (`Dog`) and executes:

```java
Bark
```

---

## Easy Way to Remember

### Overriding

```java
Animal a = new Dog();
a.sound();
```

➡️ Same method, different behavior at runtime.

### Overloading

```java
add(1, 2);
add(1.5, 2.5);
add(1, 2, 3);
```

➡️ Same method name, different parameter lists.

**Polymorphism = one method/interface, many possible behaviors.**
