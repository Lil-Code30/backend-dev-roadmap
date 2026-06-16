# Java - Lambda Expressions

Lambda Expressions were introduced in **Java 8** to provide a concise way to implement **functional interfaces** (interfaces with exactly one abstract method).

They are heavily used with:

- Stream API
- Collections
- Comparator
- Runnable
- Event handling
- Functional programming

---

# What is a Lambda Expression?

A lambda expression is an **anonymous function**.

Instead of creating a class and overriding a method, you can write the implementation directly.

### Syntax

```java
(parameters) -> expression
```

or

```java
(parameters) -> {
    statements;
}
```

---

# Before Java 8

Using an anonymous class:

```java
Runnable task = new Runnable() {
    @Override
    public void run() {
        System.out.println("Running...");
    }
};
```

---

# Using Lambda

```java
Runnable task = () -> {
    System.out.println("Running...");
};
```

Much shorter and easier to read.

---

# Functional Interface

A lambda can only be used with a **functional interface**.

A functional interface has:

- Exactly one abstract method
- Can have multiple default methods
- Can have multiple static methods

### Example

```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
```

---

# Lambda Examples

## No Parameters

```java
Runnable task = () -> {
    System.out.println("Hello");
};

task.run();
```

---

## One Parameter

Parentheses are optional.

```java
x -> x * x
```

Equivalent:

```java
(x) -> x * x
```

---

## Multiple Parameters

```java
(a, b) -> a + b
```

---

## Multiple Statements

```java
(a, b) -> {
    int result = a + b;
    return result;
}
```

---

# Example with Functional Interface

```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
```

Implementation:

```java
Calculator add = (a, b) -> a + b;

System.out.println(
    add.calculate(10, 5)
);
```

Output:

```text
15
```

---

# Lambda with Comparator

Before Java 8:

```java
Comparator<String> comp =
    new Comparator<String>() {
        @Override
        public int compare(
            String a,
            String b
        ) {
            return a.length() - b.length();
        }
    };
```

Lambda version:

```java
Comparator<String> comp =
    (a, b) -> a.length() - b.length();
```

---

# Lambda with Collections Sort

```java
List<String> names =
    Arrays.asList(
        "Charlie",
        "Bob",
        "Alice"
    );

names.sort(
    (a, b) -> a.compareTo(b)
);
```

---

## Sort by Length

```java
names.sort(
    (a, b) ->
        a.length() - b.length()
);
```

Output:

```text
[Bob, Alice, Charlie]
```

---

# Lambda with TreeMap

```java
TreeMap<String, Integer> map =
    new TreeMap<>(
        (a, b) ->
            a.length() - b.length()
    );
```

The lambda is used as the Comparator.

---

# Lambda with Threads

Before Java 8:

```java
Thread t = new Thread(
    new Runnable() {
        @Override
        public void run() {
            System.out.println("Thread");
        }
    }
);
```

Lambda:

```java
Thread t = new Thread(
    () -> System.out.println("Thread")
);
```

---

# Lambda with Stream API

```java
List<Integer> nums =
    List.of(1, 2, 3, 4, 5);
```

Filter even numbers:

```java
nums.stream()
    .filter(n -> n % 2 == 0)
    .forEach(System.out::println);
```

---

# Method References

Many lambdas can be simplified.

Lambda:

```java
nums.forEach(
    n -> System.out.println(n)
);
```

Method Reference:

```java
nums.forEach(
    System.out::println
);
```

Syntax:

```java
ClassName::methodName
```

---

# Built-in Functional Interfaces

Package:

```java
java.util.function
```

---

## Predicate<T>

Takes one parameter and returns boolean.

```java
Predicate<Integer> isEven =
    n -> n % 2 == 0;

System.out.println(
    isEven.test(4)
);
```

Output:

```text
true
```

---

## Function<T, R>

Transforms a value.

```java
Function<Integer, Integer> square =
    n -> n * n;

System.out.println(
    square.apply(5)
);
```

Output:

```text
25
```

---

## Consumer<T>

Consumes a value and returns nothing.

```java
Consumer<String> printer =
    s -> System.out.println(s);

printer.accept("Hello");
```

---

## Supplier<T>

Provides a value.

```java
Supplier<Double> random =
    () -> Math.random();

System.out.println(
    random.get()
);
```

---

# Variable Capture

A lambda can access local variables only if they are **final or effectively final**.

### Valid

```java
int x = 10;

Runnable r =
    () -> System.out.println(x);
```

---

### Invalid

```java
int x = 10;

Runnable r =
    () -> System.out.println(x);

x++;
```

Compilation error.

Reason:

```text
Variable used in lambda should be
final or effectively final.
```

---

# Common Syntax Rules

### No Parameter

```java
() -> System.out.println("Hello")
```

---

### One Parameter

```java
x -> x * 2
```

---

### Multiple Parameters

```java
(a, b) -> a + b
```

---

### Explicit Types

Usually unnecessary.

```java
(int a, int b) -> a + b
```

Java can infer types.

---

# Lambda vs Anonymous Class

| Feature                       | Lambda            | Anonymous Class         |
| ----------------------------- | ----------------- | ----------------------- |
| Syntax                        | Short             | Verbose                 |
| Creates class                 | No explicit class | Creates anonymous class |
| Readability                   | Better            | More code               |
| Functional Interface Required | Yes               | No                      |
| Used with Streams             | Yes               | Rarely                  |

---

# Interview Questions

### Can lambda be used with any interface?

No.

Only with a **functional interface** (one abstract method).

---

### What is `@FunctionalInterface`?

```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
```

The annotation ensures the interface has exactly one abstract method.

---

### Why use lambdas?

- Less boilerplate code
- Cleaner syntax
- Works perfectly with Streams
- Supports functional programming style
- Improves readability

---

# Quick Summary

| Syntax                | Meaning                      |
| --------------------- | ---------------------------- |
| `() -> {}`            | No parameters                |
| `x -> x * 2`          | One parameter                |
| `(a,b) -> a+b`        | Multiple parameters          |
| `Predicate<T>`        | Returns boolean              |
| `Function<T,R>`       | Converts T → R               |
| `Consumer<T>`         | Takes value, returns nothing |
| `Supplier<T>`         | Produces value               |
| `System.out::println` | Method reference             |

### Most common real-world usage

```java
List<String> names =
    List.of("Alice", "Bob", "Charlie");

names.stream()
     .filter(name -> name.length() > 3)
     .sorted()
     .forEach(System.out::println);
```

Here lambdas are used with:

- `filter()`
- `sorted()`
- `forEach()`

which is why **Lambda Expressions and Stream API are usually learned together.**
