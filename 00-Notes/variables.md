# Variables in Java

In Java, a **variable** is a named container used to store data that your program can use and modify.

## Basic Syntax

```java
dataType variableName = value;
```

Example:

```java
int age = 20;
```

- `int` → data type
- `age` → variable name
- `20` → value stored

---

## Common Variable Types in Java

### Integer (`int`)

Stores whole numbers.

```java
int number = 10;
```

---

## Decimal Numbers (`double`)

Stores numbers with decimals.

```java
double price = 19.99;
```

---

### Text (`String`)

Stores text.

```java
String name = "Ismael";
```

---

### Character (`char`)

Stores a single character.

```java
char grade = 'A';
```

---

### Boolean (`boolean`)

Stores `true` or `false`.

```java
boolean isStudent = true;
```

---

## Example Program

```java
public class Main {
    public static void main(String[] args) {

        String name = "Loko";
        int age = 20;
        double height = 1.80;
        boolean learningJava = true;

        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(learningJava);
    }
}
```

---

## Rules for Naming Variables

- Must start with a letter, `$`, or `_`.
- Cannot start with a number.
- Cannot contain spaces or hyphens.
- Case-sensitive.
  ✅ Valid:

```java
int age;
String firstName;
double totalPrice;
```

❌ Invalid:

```java
int 2age;        // cannot start with number
String first-name; // no hyphens
```

---

## Types of Variables in Java

### Local Variable

Declared inside a method.

```java
public void test() {
    int x = 5;
}
```

---

### Instance Variable

Belongs to an object.

```java
class Person {
    String name;
}
```

---

### Static Variable

Shared by all objects.

```java
class Test {
    static int count = 0;
}
```

---

## Updating Variables

You can change the value of a variable after it has been declared.

```java
int score = 10;

score = 20;

System.out.println(score);
```

Output:

```java
20
```

---

## Constants (`final`)

Use `final` when the value should not change.

```java
final double PI = 3.14;
```

---

## Quick Practice

Try predicting the output:

```java
int a = 5;
int b = 3;

System.out.println(a + b);
```

Output:

```java
8
```

## Primitive vs Reference Variables

In Java, variables are divided into **two main categories**:

1. **Primitive variables**
2. **Reference variables**

Understanding the difference is very important because they behave differently in memory and when assigning values.

---

## 1. Primitive Variables

Primitive variables store the **actual value directly**.

## Java Primitive Types

| Type      | Example         |
| --------- | --------------- |
| `int`     | `10`            |
| `double`  | `3.14`          |
| `char`    | `'A'`           |
| `boolean` | `true`          |
| `byte`    | small integers  |
| `short`   | short integers  |
| `long`    | large integers  |
| `float`   | decimal numbers |

---

## Example

```java id="d69fnr"
int age = 20;
double price = 19.99;
char grade = 'A';
boolean isStudent = true;
```

---

## Important Characteristics

✅ Stores actual value
✅ Faster access
✅ Fixed size
✅ Independent copies

---

## Copy Behavior

```java id="7m5nn5"
int a = 10;
int b = a;

b = 20;

System.out.println(a);
System.out.println(b);
```

Output:

```java id="kqj8i0"
10
20
```

Why?

Because `b` gets its **own copy** of the value.

---

## 2. Reference Variables

Reference variables store the **memory address (reference)** of an object, not the object itself.

Used with:

- Objects
- Arrays
- Strings
- Classes

---

## Example

```java id="3d53md"
String name = "Loko";
```

`name` does NOT directly store `"Loko"`.

It stores a reference to the object in memory.

---

## Another Example

```java id="bb73j9"
int[] numbers = {1, 2, 3};
```

`numbers` stores a reference to the array object.

---

## Reference Copy Behavior

```java id="n8ye6d"
StringBuilder a = new StringBuilder("Hello");
StringBuilder b = a;

b.append(" World");

System.out.println(a);
System.out.println(b);
```

Output:

```java id="9hvq98"
Hello World
Hello World
```

Why?

Because both `a` and `b` point to the **same object** in memory.

---

## Memory Visualization

## Primitive

```java id="p7z3v6"
int x = 5;
```

Memory:

```text
x -> 5
```

---

## Reference

```java id="m1j1bk"
String name = "Loko";
```

Memory:

```text
name -----> "Loko"
             object
```

---

## Null References

Reference variables can be `null`.

```java id="8rz8f8"
String text = null;
```

Primitive variables cannot store `null`.

---

## Comparison Table

| Feature     | Primitive       | Reference                 |
| ----------- | --------------- | ------------------------- |
| Stores      | Actual value    | Memory address            |
| Size        | Fixed           | Depends on object         |
| Can be null | ❌              | ✅                        |
| Faster      | ✅              | Slightly slower           |
| Examples    | `int`, `double` | `String`, arrays, objects |
| Copying     | Copies value    | Copies reference          |

---

## Common Beginner Mistake

```java id="y8w4jk"
String a = "Hi";
String b = a;

b = "Hello";

System.out.println(a);
```

Output:

```java id="rbjclu"
Hi
```

Why?

Because `String` objects are immutable in Java.
Changing `b` creates a new object instead of modifying the old one.

---

## Easy Rule to Remember

### Primitive

> Stores the value itself

### Reference

> Stores where the object lives in memory
