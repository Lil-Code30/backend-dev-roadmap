# Control Structures in Java

In Java, a **control structure** controls the order in which code executes.

Without control structures, Java programs would run line by line from top to bottom only.

Control structures let you:

- make decisions
- repeat code
- skip or stop execution

---

# Types of Control Structures

| Type                   | Purpose          |
| ---------------------- | ---------------- |
| Conditional Statements | Make decisions   |
| Loops                  | Repeat code      |
| Jump Statements        | Change loop flow |

---

# 1. Conditional Statements

Used when your program needs to choose between options.

---

## `if` Statement

Runs code only if a condition is true.

```java id="95azv1"
int age = 20;

if (age >= 18) {
    System.out.println("Adult");
}
```

---

## `if-else`

```java id="7v7xqs"
int age = 15;

if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

---

## `if-else if-else`

Checks multiple conditions.

```java id="hhgm1y"
int score = 85;

if (score >= 90) {
    System.out.println("A");
}
else if (score >= 80) {
    System.out.println("B");
}
else {
    System.out.println("C");
}
```

---

# Boolean Conditions

Control structures often use boolean expressions.

```java id="9aymbr"
int x = 10;

if (x > 5) {
    System.out.println("True");
}
```

---

# Relational Operators

| Operator | Meaning          |
| -------- | ---------------- |
| `==`     | equal to         |
| `!=`     | not equal        |
| `>`      | greater than     |
| `<`      | less than        |
| `>=`     | greater or equal |
| `<=`     | less or equal    |

---

# Logical Operators

| Operator | Meaning |
| -------- | ------- |
| `&&`     | AND     |
| `\|\|`   | OR      |
| `!`      | NOT     |

Example:

```java id="wr4m8e"
int age = 20;

if (age >= 18 && age <= 30) {
    System.out.println("Young Adult");
}
```

---

# 2. Switch Statement

Used when comparing many exact values.

```java id="ykq8ud"
int day = 3;

switch(day) {

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid");
}
```

---

# 3. Loops

Loops repeat code.

---

## `for` Loop

Best when you know the number of repetitions.

```java id="y3xsvd"
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

---

## `while` Loop

Runs while a condition is true.

```java id="03nrm5"
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

---

## `do-while` Loop

Runs at least once.

```java id="q06dqm"
int i = 1;

do {
    System.out.println(i);
    i++;
}
while (i <= 5);
```

---

# 4. Jump Statements

---

## `break`

Stops the loop immediately.

```java id="ppwz77"
for (int i = 1; i <= 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}
```

Output:

```text id="9g08sk"
1
2
3
4
```

---

## `continue`

Skips the current iteration.

```java id="tb5b4j"
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

Output:

```text id="rjlwmfh"
1
2
4
5
```

---

# Nested Control Structures

You can place structures inside others.

```java id="mgdzxe"
for (int i = 1; i <= 3; i++) {

    for (int j = 1; j <= 2; j++) {

        System.out.println(i + " " + j);
    }
}
```

---

# Real Example

```java id="jlwm8h"
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        }
        else if (number < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }

        scanner.close();
    }
}
```

---

# Flowchart Mental Model

```text id="9vyds8"
Condition true? → execute block
Condition false? → skip block
```

Loops:

```text id="c41e7h"
Check condition
↓
Run code
↓
Repeat
```

---

# Easy Way to Remember

| Structure  | Think              |
| ---------- | ------------------ |
| `if`       | decision           |
| `switch`   | multiple choices   |
| `for`      | counted repetition |
| `while`    | repeat while true  |
| `break`    | stop               |
| `continue` | skip               |
