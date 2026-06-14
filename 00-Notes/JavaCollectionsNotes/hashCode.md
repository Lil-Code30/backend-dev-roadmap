# Understanding hashCode() in Java Collections

`hashCode()` is a method that returns an **integer representation of an object**, used by hash-based collections like `HashMap`, `HashSet`, and `Hashtable` to quickly determine where to store or find the object.

Think of it as a **shortcut number** that helps Java avoid searching through every element.

---

## Simple Example

```java
String name = "John";

System.out.println(name.hashCode());
```

Output:

```text
2314539
```

(Exact value depends on Java's hashing algorithm.)

Java uses this number to decide where `"John"` should be stored in a `HashMap`.

---

## Real-World Analogy

Imagine a library with 1 million books.

Without hashing:

```text
Need to search every shelf
```

With hashing:

```text
Book ID → Shelf Number
```

Example:

```text
Book ID: 123456
```

Java computes:

```text
hashCode = 123456
```

Then:

```text
123456 % 100 shelves = Shelf 56
```

The book is placed directly on Shelf 56.

Later, when you want the book again, Java computes the same hash code and goes straight to Shelf 56.

---

## HashMap Example

```java
HashMap<String, Integer> map = new HashMap<>();

map.put("John", 95);
```

Internally:

### Step 1

Java computes:

```java
"John".hashCode()
```

Suppose:

```text
2314539
```

### Step 2

Find bucket:

```java
2314539 % 16
```

Result:

```text
11
```

Store in Bucket 11.

```text
Bucket 11
 └── ("John",95)
```

---

## Why Not Use hashCode Alone?

Because two different objects can have the same hash code.

Example:

```java
String a = "FB";
String b = "Ea";

System.out.println(a.hashCode());
System.out.println(b.hashCode());
```

Output:

```text
2236
2236
```

Same hash code!

But:

```java
a.equals(b)
```

Output:

```text
false
```

So Java:

1. Uses `hashCode()` to find the bucket.
2. Uses `equals()` to identify the exact object.

---

## Why equals() and hashCode() Must Match

Suppose:

```java
class Student {
    int id;

    Student(int id) {
        this.id = id;
    }
}
```

```java
Student s1 = new Student(1);
Student s2 = new Student(1);
```

Even though both represent student 1:

```java
System.out.println(s1.equals(s2));
```

Output:

```text
false
```

because Java's default `equals()` compares memory addresses.

To make them logically equal:

```java
@Override
public boolean equals(Object obj) {
    Student other = (Student) obj;
    return id == other.id;
}

@Override
public int hashCode() {
    return Integer.hashCode(id);
}
```

Now:

```java
s1.equals(s2)
```

returns:

```text
true
```

and

```java
s1.hashCode() == s2.hashCode()
```

returns:

```text
true
```

which is exactly what `HashMap` and `HashSet` require.

---

## Key Rule to Memorize

```text
hashCode()
    ↓
Find the bucket

equals()
    ↓
Find the exact object inside that bucket
```

A common interview answer is:

> `hashCode()` is used for fast lookup, while `equals()` is used to verify logical equality. Hash-based collections use both together to efficiently store and retrieve objects.

Exactly. **Many objects can end up in the same bucket.** This is called a **hash collision**.

## Example

Suppose a `HashMap` has 16 buckets:

```text
Bucket 0
Bucket 1
Bucket 2
...
Bucket 15
```

You insert:

```java
map.put("Alice", 90);
map.put("Bob", 85);
map.put("Tom", 95);
```

After computing hash codes, imagine they all end up in Bucket 6:

```text
Bucket 6
 ├── ("Alice", 90)
 ├── ("Bob", 85)
 └── ("Tom", 95)
```

This is perfectly normal.

---

## How does Java find the correct object?

Suppose you do:

```java
map.get("Bob");
```

### Step 1: Compute hashCode()

Java computes:

```java
"Bob".hashCode()
```

and determines:

```text
Bucket 6
```

### Step 2: Go to Bucket 6

```text
Bucket 6
 ├── ("Alice", 90)
 ├── ("Bob", 85)
 └── ("Tom", 95)
```

### Step 3: Compare keys using equals()

Java checks:

```java
"Bob".equals("Alice") // false
```

Next:

```java
"Bob".equals("Bob") // true
```

Match found!

Return:

```text
85
```

So Java doesn't search the whole map. It searches only the bucket and uses `equals()` to find the exact key.

---

## Why hashCode() alone is not enough

Imagine:

```java
String a = "FB";
String b = "Ea";
```

These famously produce the same hash code:

```java
a.hashCode() == b.hashCode()
```

returns:

```text
true
```

But:

```java
a.equals(b)
```

returns:

```text
false
```

If Java relied only on `hashCode()`, it wouldn't know which object you want.

That's why:

```text
hashCode() → bucket
equals()   → exact object
```

---

## What does a bucket actually contain?

Before Java 8, a bucket was essentially a linked list:

```text
Bucket 6
   |
 Alice
   |
 Bob
   |
 Tom
```

To find Tom:

```text
Alice → Bob → Tom
```

one by one.

---

## Java 8+

If too many objects accumulate in a bucket, Java converts that linked list into a **Red-Black Tree**:

```text
       Bob
      /   \
   Alice  Tom
```

Searching becomes much faster:

| Structure      | Search Time |
| -------------- | ----------- |
| Linked List    | O(n)        |
| Red-Black Tree | O(log n)    |

---

## Interview Question

**Q: Can multiple keys exist in the same bucket of a HashMap?**

**Answer:**
Yes. Different keys can produce the same bucket index due to hash collisions. Java stores all entries in that bucket and uses `equals()` to locate the correct key during retrieval.

---

## Visual Summary

```text
Key
 ↓
hashCode()
 ↓
Bucket Number
 ↓

Bucket 6
 ├── Alice
 ├── Bob
 └── Tom

equals()
 ↓
Find exact key
 ↓
Return value
```

So when you call:

```java
map.get("Tom");
```

Java:

1. Calculates `"Tom".hashCode()`
2. Goes directly to the correct bucket
3. Checks each key in that bucket using `equals()`
4. Returns Tom's value when a match is found.
