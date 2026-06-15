# Comparable vs Comparator in Java

In Java, **Comparable** and **Comparator** are both used for sorting, but they differ in **where the sorting logic is defined** and **how many sorting orders you can have**.

# 1. Comparable

`Comparable<T>` is implemented **inside the class itself**.

It defines the object's **natural ordering**.

### Example

```java
class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        return this.age - other.age; // sort by age
    }
}
```

### Usage

```java
List<Student> students = new ArrayList<>();

Collections.sort(students);
```

### Return Values

```java
compareTo(other)
```

| Return Value | Meaning                           |
| ------------ | --------------------------------- |
| Negative     | current object comes before other |
| 0            | equal                             |
| Positive     | current object comes after other  |

### Advantages

- Simple
- Natural/default ordering
- Works directly with `Collections.sort()`

### Limitation

Only **one natural ordering** can exist.

Example:

```java
Student -> sort by age
```

You cannot also define sorting by name in the same `compareTo()`.

---

# 2. Comparator

`Comparator<T>` is a **separate object/class** that contains sorting logic.

Useful when you want **multiple sorting criteria**.

### Example

Sort students by name:

```java
Comparator<Student> byName = (s1, s2) ->
        s1.name.compareTo(s2.name);
```

Sort students by age:

```java
Comparator<Student> byAge = (s1, s2) ->
        s1.age - s2.age;
```

### Usage

```java
Collections.sort(students, byName);
Collections.sort(students, byAge);
```

or

```java
students.sort(byName);
```

---

# Visual Comparison

### Comparable

```java
class Student implements Comparable<Student> {

    @Override
    public int compareTo(Student other) {
        return this.age - other.age;
    }
}
```

Sorting:

```java
Collections.sort(students);
```

---

### Comparator

```java
Comparator<Student> byName =
    (s1, s2) -> s1.name.compareTo(s2.name);
```

Sorting:

```java
Collections.sort(students, byName);
```

---

# TreeSet Example

### Using Comparable

```java
class Person implements Comparable<Person> {

    int age;

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }
}

TreeSet<Person> set = new TreeSet<>();
```

The set automatically sorts by age.

---

### Using Comparator

```java
TreeSet<Person> set =
    new TreeSet<>((p1, p2) ->
        p1.name.compareTo(p2.name));
```

The set automatically sorts by name.

---

# Comparator Chaining

One of the biggest advantages of `Comparator`:

```java
Comparator<Student> comp =
    Comparator.comparing(Student::getAge)
              .thenComparing(Student::getName);
```

Sort by:

1. Age
2. If ages are equal → Name

---

# Interview Summary

| Feature                      | Comparable       | Comparator            |
| ---------------------------- | ---------------- | --------------------- |
| Package                      | `java.lang`      | `java.util`           |
| Method                       | `compareTo(T o)` | `compare(T o1, T o2)` |
| Defined In                   | Same class       | Separate class/object |
| Natural Ordering             | Yes              | No                    |
| Multiple Sort Orders         | No               | Yes                   |
| Modify Original Class Needed | Yes              | No                    |
| Lambda Friendly              | No               | Yes                   |

### Easy way to remember

- **Comparable** → "**I know how to compare myself**" (inside the class).
- **Comparator** → "**Someone else compares two objects**" (external comparison logic).
