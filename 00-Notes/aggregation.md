# Aggregation in Java

In Java, **Aggregation** is an OOP relationship where one class **contains** another class, but both objects can exist independently.

It represents a **"has-a"** relationship.

---

## What is Aggregation?

Example:

```text
Department has Employees
```

A department can exist without a specific employee, and an employee can exist without a specific department.

The objects have their own lifecycles.

---

## Aggregation vs Inheritance

### Inheritance

```text
Dog is an Animal
```

```java
class Dog extends Animal {}
```

Relationship:

> **is-a**

---

### Aggregation

```text
Department has Employees
```

```java
class Department {
    Employee employee;
}
```

Relationship:

> **has-a**

---

## Example 1: Department and Employee

```java
class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }
}
```

```java
class Department {

    String departmentName;
    Employee employee;

    Department(String departmentName, Employee employee) {
        this.departmentName = departmentName;
        this.employee = employee;
    }

    void display() {
        System.out.println(
            employee.name + " works in " + departmentName
        );
    }
}
```

Usage:

```java
public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee("Loko");

        Department dept =
                new Department("IT", emp);

        dept.display();
    }
}
```

Output:

```text
Loko works in IT
```

---

## Memory Visualization

```text
Employee Object
+--------+
| Loko   |
+--------+
     ↑
     |
Department Object
+-----------+
| IT        |
| employee  |
+-----------+
```

The `Department` stores a reference to an existing `Employee`.

---

## Example 2: University and Student

```java
class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}
```

```java
class University {

    String universityName;
    Student student;

    University(String universityName,
               Student student) {

        this.universityName = universityName;
        this.student = student;
    }
}
```

A university **has a** student.

---

## Aggregation with Collections

Often one object contains many others.

```java
import java.util.ArrayList;

class Team {

    ArrayList<Player> players =
            new ArrayList<>();
}
```

```java
class Player {

    String name;

    Player(String name) {
        this.name = name;
    }
}
```

Usage:

```java
Team team = new Team();

team.players.add(new Player("Loko"));
team.players.add(new Player("Alex"));
```

---

## Aggregation vs Composition

These are commonly confused.

---

## Aggregation (Weak Ownership)

```text
Department ---- Employee
```

If the department is deleted:

```text
Department ❌
Employee ✅
```

Employee can still exist.

---

## Composition (Strong Ownership)

```text
House ---- Room
```

If the house is deleted:

```text
House ❌
Room ❌
```

Rooms belong exclusively to the house.

---

## Example of Composition

```java
class House {

    private Room room = new Room();
}
```

The `Room` is created and managed by `House`.

---

## UML Representation

Aggregation is usually shown as:

```text
Department ◇──── Employee
```

The hollow diamond (`◇`) represents aggregation.

Composition uses a filled diamond:

```text
House ◆──── Room
```

---

## Real-World Aggregation Examples

| Class      | Has-a     |
| ---------- | --------- |
| Department | Employees |
| Team       | Players   |
| University | Students  |
| Library    | Books     |
| Company    | Workers   |
| School     | Teachers  |

---

## Why Use Aggregation?

✅ Better code organization
✅ Models real-world relationships
✅ Encourages reuse of objects
✅ Reduces duplication
✅ Makes systems easier to maintain

---

## Easy Way to Remember

### Inheritance

```text
Dog is an Animal
```

➡️ **is-a**

---

### Aggregation

```text
Team has Players
```

➡️ **has-a**

---

### Quick Rule

Ask yourself:

> Can object B exist without object A?

- **Yes** → Aggregation
- **No** → Composition

Example:

```text
Company → Employee
```

Employee can still exist without that specific company.

✅ Aggregation

```text
House → Room
```

Room doesn't meaningfully exist without the house.

✅ Composition
