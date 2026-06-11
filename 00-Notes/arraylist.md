# Java ArrayList Notes

## What is an ArrayList?

`ArrayList` is a resizable array implementation provided by Java in the `java.util` package.

Unlike normal arrays, an `ArrayList` can grow and shrink dynamically during runtime.

```java
import java.util.ArrayList;
```

---

## Characteristics of ArrayList

✅ Dynamic size

✅ Maintains insertion order

✅ Allows duplicate elements

✅ Allows null values

✅ Fast random access using index (`get()`)

❌ Slow insertion/deletion in the middle of the list

❌ Not synchronized (not thread-safe)

---

## Creating an ArrayList

## Empty ArrayList

```java
ArrayList<String> names = new ArrayList<>();
```

## With Initial Capacity

```java
ArrayList<String> names = new ArrayList<>(100);
```

---

# Generic Types

ArrayLists should usually use Generics.

```java
ArrayList<Integer> numbers = new ArrayList<>();
ArrayList<Double> grades = new ArrayList<>();
ArrayList<String> names = new ArrayList<>();
```

Without Generics:

```java
ArrayList list = new ArrayList();
```

This is not recommended because it loses type safety.

---

## Common Methods

### add()

Adds an element to the end.

```java
ArrayList<String> fruits = new ArrayList<>();

fruits.add("Apple");
fruits.add("Banana");
```

Result:

```text
[Apple, Banana]
```

---

### add(index, element)

Insert at specific position.

```java
fruits.add(1, "Orange");
```

Result:

```text
[Apple, Orange, Banana]
```

---

### get(index)

Retrieve an element.

```java
String fruit = fruits.get(0);

System.out.println(fruit);
```

Output:

```text
Apple
```

---

### set(index, element)

Replace an element.

```java
fruits.set(1, "Mango");
```

Result:

```text
[Apple, Mango, Banana]
```

---

### remove()

#### Remove by index

```java
fruits.remove(1);
```

#### Remove by value

```java
fruits.remove("Banana");
```

---

### clear()

Removes all elements.

```java
fruits.clear();
```

Result:

```text
[]
```

---

### size()

Returns number of elements.

```java
int count = fruits.size();
```

---

### isEmpty()

Checks if list contains elements.

```java
if (fruits.isEmpty()) {
    System.out.println("Empty");
}
```

---

### contains()

Checks if value exists.

```java
boolean exists = fruits.contains("Apple");
```

---

### indexOf()

Returns first occurrence index.

```java
int index = fruits.indexOf("Apple");
```

---

### Traversing an ArrayList

### Using for Loop

```java
for (int i = 0; i < fruits.size(); i++) {
    System.out.println(fruits.get(i));
}
```

---

### Enhanced For Loop

```java
for (String fruit : fruits) {
    System.out.println(fruit);
}
```

---

### forEach()

```java
fruits.forEach(System.out::println);
```

---

**Example**

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Size: " + fruits.size());

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.remove("Banana");

        System.out.println(fruits);
    }
}
```

Output:

```text
Size: 3
Apple
Banana
Orange
[Apple, Orange]
```

---

## Array vs ArrayList

| Feature                | Array     | ArrayList          |
| ---------------------- | --------- | ------------------ |
| Fixed Size             | Yes       | No                 |
| Dynamic Size           | No        | Yes                |
| Stores Objects         | Yes       | Yes                |
| Stores Primitive Types | Yes       | No (uses wrappers) |
| Easy Insert/Delete     | No        | Yes                |
| Access Speed           | Very Fast | Fast               |

Example:

```java
int[] numbers = {1, 2, 3};
```

ArrayList equivalent:

```java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
```

---

## Wrapper Classes

ArrayList cannot store primitive types directly.

| Primitive | Wrapper   |
| --------- | --------- |
| int       | Integer   |
| double    | Double    |
| char      | Character |
| boolean   | Boolean   |
| long      | Long      |
| float     | Float     |

Example:

```java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
```

Java automatically performs **Autoboxing**:

```java
int x = 10;
numbers.add(x);
```

Equivalent to:

```java
numbers.add(Integer.valueOf(x));
```

---

## Sorting an ArrayList

```java
import java.util.Collections;

Collections.sort(fruits);
```

Numbers:

```java
Collections.sort(numbers);
```

Descending order:

```java
Collections.sort(numbers, Collections.reverseOrder());
```

---

## Converting ArrayList to Array

```java
String[] array = fruits.toArray(new String[0]);
```

---

## Converting Array to ArrayList

```java
String[] arr = {"A", "B", "C"};

ArrayList<String> list =
        new ArrayList<>(java.util.Arrays.asList(arr));
```

---

## Time Complexity

| Operation      | Complexity   |
| -------------- | ------------ |
| get(index)     | O(1)         |
| set(index)     | O(1)         |
| add(end)       | O(1) average |
| add(middle)    | O(n)         |
| remove(end)    | O(1)         |
| remove(middle) | O(n)         |
| contains()     | O(n)         |
| indexOf()      | O(n)         |

---

## Interview / Exam Points

1. `ArrayList` belongs to `java.util`.
2. Uses a dynamic array internally.
3. Maintains insertion order.
4. Allows duplicates.
5. Allows `null`.
6. Access by index is O(1).
7. Insertion/deletion in the middle is O(n).
8. Cannot store primitive types directly.
9. Uses wrapper classes (`Integer`, `Double`, etc.).
10. Implements the `List` interface.

---

## Quick Cheat Sheet

```java
ArrayList<String> list = new ArrayList<>();

list.add("Java");
list.add("Python");

list.get(0);
list.set(0, "C++");

list.remove("Python");
list.remove(0);

list.contains("Java");

list.size();

list.isEmpty();

list.clear();
```

**Memory Trick:**
**Array = Fixed Size** → `int[] arr = new int[10]`
**ArrayList = Dynamic Size** → `ArrayList<Integer> list = new ArrayList<>()`
