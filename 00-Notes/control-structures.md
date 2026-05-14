# Control Structures in Java

In Java, **control structures** determine the flow of execution of your program.

They allow your program to:

- make decisions
- repeat actions
- choose between multiple options

---

# Main Types of Control Structures

1. **Conditional Statements** → decision making
2. **Loops** → repetition
3. **Jump Statements** → control loop flow

---

# 1. Conditional Statements

Used to execute code based on conditions.

---

## `if` Statement

```java id="oqb9mx"
int age = 18;

if (age >= 18) {
    System.out.println("Adult");
}
```

If the condition is `true`, the block runs.

---

## `if-else`

```java id="7sq9qx"
int age = 16;

if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

---

## `if-else if-else`

Used for multiple conditions.

```java id="gm7j3o"
int grade = 85;

if (grade >= 90) {
    System.out.println("A");
} else if (grade >= 80) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

---

# 2. `switch` Statement

Useful when checking many specific values.

```java id="g3yl3g"
int day = 2;

switch(day) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    default:
        System.out.println("Invalid day");
}
```

---

# 3. Loops

Loops repeat code multiple times.

---

## `for` Loop

Best when you know how many times to repeat.

```java id="j0v1pq"
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Output:

```text id="51nm5g"
1
2
3
4
5
```

---

## `while` Loop

Repeats while a condition is true.

```java id="0ryr3s"
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

---

## `do-while` Loop

Runs at least once.

```java id="0vxgfd"
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

---

# 4. Jump Statements

---

## `break`

Stops the loop immediately.

```java id="qfrw5y"
for (int i = 1; i <= 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}
```

Output:

```text id="0z4ovt"
1
2
3
4
```

---

## `continue`

Skips the current iteration.

```java id="8enw14"
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

Output:

```text id="jlwm0a"
1
2
4
5
```

---

# Nested Control Structures

You can place loops inside loops or conditions inside loops.

```java id="jlwmwb"
for (int i = 1; i <= 3; i++) {

    for (int j = 1; j <= 2; j++) {
        System.out.println(i + " " + j);
    }
}
```

---

# Comparison Table

| Structure  | Purpose                |
| ---------- | ---------------------- |
| `if`       | Decision making        |
| `switch`   | Multiple choices       |
| `for`      | Counted repetition     |
| `while`    | Conditional repetition |
| `do-while` | Runs at least once     |
| `break`    | Exit loop              |
| `continue` | Skip iteration         |

---

# Real Example

```java id="g6gqmo"
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        scanner.close();
    }
}
```

---

# Quick Mini Challenge

Try creating:

1. A loop that prints numbers from 1 to 100
2. A program that checks if a number is positive, negative, or zero
3. A multiplication table using nested loops
