# TreeMap Constructors in Java

## 🌳 1. TreeMap() — Natural Ordering

### 👉 What it does

Creates an empty TreeMap that sorts keys using **natural ordering**:

- Numbers → ascending (1, 2, 3…)
- Strings → alphabetical (A → Z)

---

### Example

```java id="t3m1a1"
import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        System.out.println(map);
    }
}
```

### Output:

```text id="t3m1a2"
{1=A, 2=B, 3=C}
```

---

## 🌳 2. TreeMap(Comparator)

### 👉 What it does

Creates a TreeMap with a **custom sorting rule**.

---

## Example: Reverse Order

```java id="t3m2a1"
import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeMap<Integer, String> map =
                new TreeMap<>(Collections.reverseOrder());

        map.put(1, "A");
        map.put(3, "C");
        map.put(2, "B");

        System.out.println(map);
    }
}
```

### Output:

```text id="t3m2a2"
{3=C, 2=B, 1=A}
```

---

## Example: Custom Comparator (String length)

```java id="t3m2a3"
TreeMap<String, Integer> map =
        new TreeMap<>((a, b) -> a.length() - b.length());

map.put("Apple", 1);
map.put("Cat", 2);
map.put("Banana", 3);

System.out.println(map);
```

### Possible Output:

```text id="t3m2a4"
{Cat=2, Apple=1, Banana=3}
```

---

## 🌳 3. TreeMap(Map m)

### 👉 What it does

Creates a TreeMap from an existing Map and sorts it using **natural ordering** of keys.

---

## Example

```java id="t3m3a1"
import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(10, "X");
        hashMap.put(5, "Y");
        hashMap.put(20, "Z");

        TreeMap<Integer, String> treeMap =
                new TreeMap<>(hashMap);

        System.out.println(treeMap);
    }
}
```

### Output:

```text id="t3m3a2"
{5=Y, 10=X, 20=Z}
```

---

## Real-world meaning

You receive **unsorted data (API / database)** and convert it into a **sorted structure**.

---

## 🌳 4. TreeMap(SortedMap m)

### 👉 What it does

Creates a TreeMap from another SortedMap and **keeps the same sorting order**.

---

## Example

```java id="t3m4a1"
import java.util.*;

public class Main {
    public static void main(String[] args) {

        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        sortedMap.put(30, "C");
        sortedMap.put(10, "A");
        sortedMap.put(20, "B");

        TreeMap<Integer, String> treeMap =
                new TreeMap<>(sortedMap);

        System.out.println(treeMap);
    }
}
```

### Output:

```text id="t3m4a2"
{10=A, 20=B, 30=C}
```

---

## Key idea

Even though `sortedMap` is already sorted, this constructor:

```text
copies both:
- data
- sorting behavior
```

---

# 📊 Summary Table

| Constructor           | What it does    | Sorting              |
| --------------------- | --------------- | -------------------- |
| `TreeMap()`           | Empty TreeMap   | Natural order        |
| `TreeMap(Comparator)` | Custom sorting  | User-defined         |
| `TreeMap(Map)`        | Copy + sort map | Natural order        |
| `TreeMap(SortedMap)`  | Copy sorted map | Same order as source |

---

# 🧠 Easy Memory Trick

```text
No input        → default sorting
Comparator      → custom sorting
Map             → convert + sort
SortedMap       → copy + keep order
```

---
