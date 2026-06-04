# Compile-Time vs Runtime in Java

In Java, **compile-time** and **runtime** refer to two different phases of a program's life.

---

# Compile-Time

Compile-time is when the Java compiler (`javac`) checks your code and converts it into bytecode.

```text
MyProgram.java
      ↓
    javac
      ↓
MyProgram.class
```

During compile-time, Java checks for:

- Syntax errors
- Missing semicolons
- Type mismatches
- Undefined variables/methods
- Access modifier violations

---

## Example of a Compile-Time Error

```java
int age = "20";
```

Error:

```text
incompatible types: String cannot be converted to int
```

The program won't compile.

---

## Another Example

```java
System.out.println(name);
```

If `name` was never declared:

```text
cannot find symbol
```

Again, the program won't compile.

---

# Runtime

Runtime is when the compiled program is actually executing.

```text
java Main
```

At this stage, the JVM runs your code.

---

## Example of a Runtime Error

```java
int result = 10 / 0;
```

Compiles successfully ✅

But when you run it:

```text
Exception in thread "main"
java.lang.ArithmeticException: / by zero
```

The error happens during execution.

---

## Another Runtime Error

```java
String text = null;

System.out.println(text.length());
```

Compiles successfully ✅

Runtime:

```text
NullPointerException
```

---

# Comparison Table

| Feature            | Compile-Time               | Runtime                       |
| ------------------ | -------------------------- | ----------------------------- |
| Happens when       | Before execution           | During execution              |
| Checked by         | Compiler (`javac`)         | JVM                           |
| Purpose            | Verify code correctness    | Execute code                  |
| Stops compilation? | Yes                        | No, program starts then fails |
| Example errors     | Syntax errors, type errors | Exceptions                    |

---

# OOP Connection: Polymorphism

Remember when you learned polymorphism?

```java
Animal animal = new Dog();
animal.sound();
```

Here:

### Compile-Time

Java sees:

```java
Animal animal
```

and verifies that `sound()` exists in `Animal`.

### Runtime

Java sees the actual object:

```java
new Dog()
```

and executes:

```java
Dog.sound()
```

This is called **runtime polymorphism** (dynamic method dispatch).

---

# Compile-Time Polymorphism (Method Overloading)

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

When you write:

```java
calc.add(2, 3);
```

Java decides which method to call **during compilation**.

That's why overloading is called:

> Compile-time polymorphism

---

# Runtime Polymorphism (Method Overriding)

```java
Animal animal = new Dog();
animal.sound();
```

Java decides which method to execute **during runtime**.

That's why overriding is called:

> Runtime polymorphism

---

# Easy Memory Trick

### Compile-Time

> "Can this code be compiled?"

Checks structure and correctness.

```java
int x = "hello"; // ❌
```

---

### Runtime

> "What happens when the program actually runs?"

Checks real execution.

```java
int x = 10 / 0; // ❌ at runtime
```

---

# Interview-Style Summary

| Concept                   | Example                                                                         |
| ------------------------- | ------------------------------------------------------------------------------- |
| Compile-Time Error        | Missing semicolon, wrong type, undeclared variable                              |
| Runtime Error             | `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException` |
| Compile-Time Polymorphism | Method Overloading                                                              |
| Runtime Polymorphism      | Method Overriding                                                               |

### One-Sentence Rule

**Compile-time = code verification before execution. Runtime = actual execution of the program by the JVM.**

In terms of **polymorphism** in Java:

| Compile-Time Polymorphism              | Runtime Polymorphism                              |
| -------------------------------------- | ------------------------------------------------- |
| Method **Overloading**                 | Method **Overriding**                             |
| Decided by the compiler                | Decided by the JVM during execution               |
| Same method name, different parameters | Same method signature in parent and child classes |
| Faster (resolved before execution)     | More flexible (resolved while running)            |

---

# 1. Compile-Time Polymorphism (Method Overloading)

The compiler knows exactly which method to call based on the arguments.

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

Usage:

```java
Calculator calc = new Calculator();

calc.add(2, 3);       // int version
calc.add(2.5, 3.5);   // double version
```

### What happens?

Before the program runs, the compiler determines:

```java
calc.add(2, 3);
```

→ Call:

```java
add(int, int)
```

This decision is made at **compile time**.

---

# 2. Runtime Polymorphism (Method Overriding)

The compiler only knows the reference type.

The JVM decides which method to execute based on the actual object.

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
```

Usage:

```java
Animal animal = new Dog();

animal.sound();
```

### What happens?

At compile time:

```java
Animal animal
```

The compiler verifies that `Animal` has a `sound()` method.

At runtime:

```java
new Dog()
```

The JVM sees the actual object is a `Dog` and calls:

```java
Dog.sound();
```

Output:

```text
Bark
```

---

# Why Runtime Polymorphism Is Powerful

Imagine:

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

You can write one piece of code:

```java
animal.sound();
```

But get different behaviors:

```text
Bark
Meow
Bark
```

The JVM chooses the correct method at runtime.

---

# Visual Example

```text
Compile Time:
Animal animal = new Dog();
^^^^^^

Runtime:
               Dog Object
Animal Ref ─────────────► sound() = "Bark"
```

The **reference type** is `Animal`, but the **actual object** is `Dog`.

---

# Exam Shortcut

### Compile-Time Polymorphism

```java
add(1, 2);
add(1.5, 2.5);
```

➡️ **Method Overloading**

Compiler chooses the method.

---

### Runtime Polymorphism

```java
Animal a = new Dog();
a.sound();
```

➡️ **Method Overriding**

JVM chooses the method.

---

# One-Line Rule

**Overloading = compile-time polymorphism because the compiler decides which method to call.**

**Overriding = runtime polymorphism because the JVM decides which method to call based on the object's actual type.**
