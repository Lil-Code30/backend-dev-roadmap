# Escape Sequences in Java

In Java, **escape sequences** are special character combinations that start with a backslash `\`.

They are used inside strings or characters to represent things like:

- new lines
- tabs
- quotation marks
- special symbols

---

# Common Escape Sequences

| Escape Sequence | Meaning         |
| --------------- | --------------- |
| `\n`            | New line        |
| `\t`            | Tab space       |
| `\"`            | Double quote    |
| `\'`            | Single quote    |
| `\\`            | Backslash       |
| `\b`            | Backspace       |
| `\r`            | Carriage return |

---

# 1. New Line (`\n`)

Moves text to the next line.

```java id="4swzff"
System.out.println("Hello\nWorld");
```

Output:

```text id="ywlm4g"
Hello
World
```

---

# 2. Tab (`\t`)

Adds tab spacing.

```java id="n0l7o6"
System.out.println("Name\tAge");
```

Output:

```text id="bwjlwm"
Name    Age
```

---

# 3. Double Quotes (`\"`)

Used to print quotes inside a string.

```java id="9fqy1h"
System.out.println("He said \"Hello\"");
```

Output:

```text id="9b5c7x"
He said "Hello"
```

---

# 4. Single Quote (`\'`)

Used inside character/text formatting.

```java id="8pv9x8"
System.out.println("It\'s Java");
```

Output:

```text id="s7mtde"
It's Java
```

---

# 5. Backslash (`\\`)

Prints a backslash.

```java id="m5ik2n"
System.out.println("C:\\Users\\Loko");
```

Output:

```text id="w49ph5"
C:\Users\Loko
```

---

# Combining Escape Sequences

```java id="l3rt7z"
System.out.println("Name:\tLoko\nAge:\t20");
```

Output:

```text id="31c1rp"
Name:   Loko
Age:    20
```

---

# Why Escape Sequences Matter

Without escape sequences:

```java id="l4qqi6"
System.out.println("He said "Hello"");
```

❌ This causes an error because Java thinks the string ends before `"Hello"`.

Correct version:

```java id="6c0iqv"
System.out.println("He said \"Hello\"");
```

---

# Example Program

```java id="m9qv5x"
public class Main {
    public static void main(String[] args) {

        System.out.println("=== Student Info ===");
        System.out.println("Name:\tLoko");
        System.out.println("Program:\tComputer Science");
        System.out.println("Quote:\t\"Keep coding\"");
    }
}
```

---

# Quick Practice

Predict the output:

```java id="f96n1g"
System.out.println("Java\n\tProgramming");
```

Output:

```text id="3v0mwg"
Java
    Programming
```

---

# Easy Way to Remember

- `\n` → new line
- `\t` → tab
- `\"` → quote
- `\\` → backslash
