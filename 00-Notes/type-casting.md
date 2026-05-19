# Type Casting in Java

In Java, **type casting** means converting a value from one data type to another.

Example:

- converting `int` → `double`
- converting `double` → `int`

---

# Two Types of Casting

1. **Implicit Casting** (Widening)
2. **Explicit Casting** (Narrowing)

---

# 1. Implicit Casting (Automatic)

Java automatically converts a smaller type into a larger compatible type.

```text id="xg6w7h"
byte → short → int → long → float → double
```

---

## Example

```java id="ozax2m"
int number = 10;
double result = number;

System.out.println(result);
```

Output:

```text id="m8cz53"
10.0
```

Why?

Because `double` can safely store an `int`.

---

# 2. Explicit Casting (Manual)

Used when converting a larger type into a smaller type.

You must manually tell Java to cast the value.

---

## Syntax

```java id="6q9hks"
dataType variable = (dataType) value;
```

---

## Example

```java id="wbhjkh"
double price = 19.99;
int newPrice = (int) price;

System.out.println(newPrice);
```

Output:

```text id="fwjlwm"
19
```

The decimal part is removed.

---

# Visual Example

```java id="5u3wd2"
double x = 9.8;
int y = (int) x;

System.out.println(y);
```

Output:

```text id="o7skwq"
9
```

---

# Why Explicit Casting Is Needed

Because narrowing conversions may lose data.

Example:

```java id="zg8iqp"
double big = 999.99;
int small = (int) big;
```

You lose `.99`.

---

# Character Casting

Characters are stored using Unicode numbers.

---

## Char → Int

```java id="7w3vpo"
char letter = 'A';
int value = letter;

System.out.println(value);
```

Output:

```text id="3tx8fj"
65
```

---

## Int → Char

```java id="5s4pdq"
int number = 66;
char letter = (char) number;

System.out.println(letter);
```

Output:

```text id="w1ujv4"
B
```

---

# Division and Casting

---

## Integer Division

```java id="3yg8x9"
int a = 5;
int b = 2;

System.out.println(a / b);
```

Output:

```text id="jmbf5r"
2
```

Because both are integers.

---

## Using Casting

```java id="v77bma"
int a = 5;
int b = 2;

double result = (double) a / b;

System.out.println(result);
```

Output:

```text id="k4ny0v"
2.5
```

---

# Common Primitive Conversions

| From             | To  | Automatic? |
| ---------------- | --- | ---------- |
| `int` → `double` | Yes | ✅         |
| `double` → `int` | No  | ❌         |
| `char` → `int`   | Yes | ✅         |
| `int` → `char`   | No  | ❌         |

---

# Important Note

Casting changes the interpretation of the value, not the original variable type.

```java id="q27k6o"
double x = 5.9;

System.out.println((int)x);
System.out.println(x);
```

Output:

```text id="l2wyq2"
5
5.9
```

`x` is still a `double`.

---

# Example Program

```java id="4h7k8y"
public class Main {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 3;

        double result = (double) num1 / num2;

        System.out.println("Result = " + result);
    }
}
```

---

# Easy Way to Remember

## Widening

Small → Large
Automatic

```java id="9u0o9y"
int → double
```

---

## Narrowing

Large → Small
Manual casting required

```java id="1mwdx1"
double → int
```
