# Input in Java

In Java, **input** means getting data from the user while the program is running.

The most common way to take input in Java is using the `Scanner` class.

---

# Using Scanner for Input

## Step 1: Import Scanner

```java id="dxtajv"
import java.util.Scanner;
```

---

## Step 2: Create a Scanner Object

```java id="d2nlmu"
Scanner scanner = new Scanner(System.in);
```

- `System.in` → keyboard input
- `scanner` → object used to read input

---

# Full Example

```java id="m0lxeh"
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        scanner.close();
    }
}
```

---

# Common Scanner Methods

| Method          | Reads             |
| --------------- | ----------------- |
| `nextLine()`    | Full line of text |
| `next()`        | Single word       |
| `nextInt()`     | Integer           |
| `nextDouble()`  | Decimal number    |
| `nextBoolean()` | `true` / `false`  |
| `nextFloat()`   | Float             |
| `nextLong()`    | Long integer      |

---

# Integer Input Example

```java id="ltxxr8"
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("You are " + age + " years old");

        scanner.close();
    }
}
```

---

# Multiple Inputs Example

```java id="lax5we"
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name);
        System.out.println("Age: " + age);

        scanner.close();
    }
}
```

---

# Common Beginner Problem

## Problem

```java id="lhw1ha"
int age = scanner.nextInt();
String name = scanner.nextLine();
```

`nextLine()` may get skipped.

---

## Why?

`nextInt()` leaves the Enter key (`\n`) in the buffer.

---

## Fix

```java id="3cs43m"
int age = scanner.nextInt();
scanner.nextLine(); // consume leftover newline

String name = scanner.nextLine();
```

---

# Input + Calculation Example

```java id="9tgm8f"
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

        scanner.close();
    }
}
```

---

# Output Example

```text id="0uk2qm"
Enter first number: 5
Enter second number: 3
Sum = 8
```

---

# Important Notes

✅ Always import `Scanner`
✅ Usually close the scanner with:

```java id="87uqrl"
scanner.close();
```

✅ `nextLine()` reads entire lines
✅ `next()` reads only one word

---

# Quick Mini Challenge

Try making a program that asks for:

- name
- age
- favorite programming language

Then print everything nicely.
