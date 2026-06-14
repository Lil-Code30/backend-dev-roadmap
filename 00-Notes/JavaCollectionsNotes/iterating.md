# Iterating Java Collections: Maps and Sets

## 1. Iterating a HashMap

Suppose:

```java
HashMap<Integer, String> students = new HashMap<>();

students.put(101, "John");
students.put(102, "Emma");
students.put(103, "Tom");
```

## Method 1: Iterate Keys

```java
for (Integer key : students.keySet()) {
    System.out.println(key);
}
```

Output:

```text
101
102
103
```

---

## Method 2: Iterate Values

```java
for (String value : students.values()) {
    System.out.println(value);
}
```

Output:

```text
John
Emma
Tom
```

---

## Method 3: Iterate Key-Value Pairs (Most Common)

```java
for (Map.Entry<Integer, String> entry : students.entrySet()) {
    System.out.println(
        entry.getKey() + " -> " + entry.getValue()
    );
}
```

Output:

```text
101 -> John
102 -> Emma
103 -> Tom
```

### What is Map.Entry?

Think of each entry as:

```text
(key, value)
```

Example:

```text
(101, John)
```

Java gives you an object representing that pair.

---

## Method 4: forEach (Java 8+)

```java
students.forEach((id, name) ->
    System.out.println(id + " -> " + name)
);
```

---

## 2. Iterating a TreeMap

Exactly the same code.

```java
TreeMap<Integer, String> students = new TreeMap<>();

students.put(103, "Tom");
students.put(101, "John");
students.put(102, "Emma");
```

Iteration:

```java
for (Map.Entry<Integer, String> entry : students.entrySet()) {
    System.out.println(
        entry.getKey() + " -> " + entry.getValue()
    );
}
```

Output:

```text
101 -> John
102 -> Emma
103 -> Tom
```

Notice the keys are automatically sorted.

---

## 3. Iterating a HashSet

Suppose:

```java
HashSet<String> names = new HashSet<>();

names.add("John");
names.add("Emma");
names.add("Tom");
```

## Enhanced For Loop

```java
for (String name : names) {
    System.out.println(name);
}
```

Output:

```text
John
Emma
Tom
```

⚠️ Order is not guaranteed.

Could also be:

```text
Tom
John
Emma
```

---

## Iterator

```java
Iterator<String> it = names.iterator();

while (it.hasNext()) {
    System.out.println(it.next());
}
```

### How it works

```text
John → Emma → Tom
 ^
```

`next()` returns the current element and moves forward.

---

## 4. Iterating a TreeSet

```java
TreeSet<String> names = new TreeSet<>();

names.add("Tom");
names.add("John");
names.add("Emma");
```

Iterate:

```java
for (String name : names) {
    System.out.println(name);
}
```

Output:

```text
Emma
John
Tom
```

Automatically sorted.

---

# Removing While Iterating

❌ Wrong:

```java
for (String name : names) {
    if (name.equals("John")) {
        names.remove(name); // Exception!
    }
}
```

This causes:

```text
ConcurrentModificationException
```

---

✅ Correct:

```java
Iterator<String> it = names.iterator();

while (it.hasNext()) {
    String name = it.next();

    if (name.equals("John")) {
        it.remove();
    }
}
```

---

# Interview Tip

For Maps, the most efficient iteration is:

```java
for (Map.Entry<K, V> entry : map.entrySet()) {
    K key = entry.getKey();
    V value = entry.getValue();
}
```

Why?

Because:

```java
for (Integer key : map.keySet()) {
    map.get(key);
}
```

requires an additional lookup for every key.

---

# Quick Reference

### HashMap / TreeMap

```java
for (Map.Entry<K, V> entry : map.entrySet()) {
    System.out.println(
        entry.getKey() + " -> " + entry.getValue()
    );
}
```

---

### HashSet / TreeSet

```java
for (E element : set) {
    System.out.println(element);
}
```

---

### Iterator

```java
Iterator<E> it = collection.iterator();

while (it.hasNext()) {
    System.out.println(it.next());
}
```

---

### Java 8 forEach

```java
map.forEach((k, v) ->
    System.out.println(k + " -> " + v)
);
```

```java
set.forEach(System.out::println);
```

### Memory Trick

```text
Map
 ├─ keySet()   -> keys only
 ├─ values()   -> values only
 └─ entrySet() -> key + value

Set
 └─ iterate elements directly
```

Since a `Set` only stores values (no keys), iteration is simpler than a `Map`.
