# Java Collections Notes: HashMap, HashSet, TreeMap, TreeSet

---

# 1. HashMap

## What is a HashMap?

A `HashMap` stores data as **key-value pairs**.

```java
HashMap<Integer, String> students = new HashMap<>();

students.put(1, "John");
students.put(2, "Emma");

System.out.println(students.get(1)); // John
```

Think of it like a dictionary:

| Key | Value |
| --- | ----- |
| 1   | John  |
| 2   | Emma  |
| 3   | Alice |

---

# Real World Example

Imagine a university database:

- Student ID = Key
- Student Name = Value

```java
HashMap<Integer, String> students = new HashMap<>();

students.put(1001, "John");
students.put(1002, "Emma");

String student = students.get(1001);
```

Instead of searching through thousands of students one by one, Java can find the student almost instantly.

---

# Why HashMap is Fast

Most operations are:

| Operation | Complexity |
| --------- | ---------- |
| put()     | O(1)       |
| get()     | O(1)       |
| remove()  | O(1)       |

Average case.

This speed comes from **hashing**.

---

# How Hashing Works Internally

When you insert:

```java
map.put("John", 95);
```

Java does NOT scan the whole map.

Instead:

## Step 1: Calculate hashCode()

```java
"John".hashCode()
```

Suppose:

```java
2314534
```

is returned.

---

## Step 2: Determine Bucket

HashMap contains an array of buckets.

Example:

```text
Bucket 0
Bucket 1
Bucket 2
Bucket 3
Bucket 4
Bucket 5
Bucket 6
Bucket 7
Bucket 8
Bucket 9
Bucket 10
Bucket 11
Bucket 12
Bucket 13
Bucket 14
Bucket 15
```

Java computes:

```java
bucket = hash % arraySize
```

Example:

```java
2314534 % 16 = 6
```

Store in:

```text
Bucket 6
```

---

## Step 3: Store Entry

```text
Bucket 6
 └── ("John",95)
```

---

## Retrieval

When:

```java
map.get("John");
```

Java:

1. Computes hashCode()
2. Finds bucket
3. Searches only that bucket

Not the entire map.

This is why lookup is extremely fast.

---

# Hash Collision

Different objects may produce the same bucket.

Example:

```java
"Alice"
"Bob"
```

might both land in bucket 6.

```text
Bucket 6
 ├── ("Alice",88)
 └── ("Bob",92)
```

This is called a **collision**.

---

# Collision Handling

Before Java 8:

```text
Bucket 6
 ├── Alice
 ├── Bob
 ├── Tom
 └── Sarah
```

Stored as a Linked List.

Searching:

```text
Alice → Bob → Tom → Sarah
```

---

# Java 8 Improvement

If too many collisions occur:

```text
Linked List
```

becomes

```text
Red-Black Tree
```

Automatically.

Result:

| Structure  | Search   |
| ---------- | -------- |
| LinkedList | O(n)     |
| Tree       | O(log n) |

Much faster.

---

# equals() and hashCode()

This is one of the most important interview topics.

---

## hashCode()

Produces an integer representing the object.

```java
String s = "John";

System.out.println(s.hashCode());
```

---

## equals()

Checks logical equality.

```java
String a = "John";
String b = "John";

System.out.println(a.equals(b));
```

Output:

```text
true
```

---

# Why They Must Work Together

Rule 1:

If:

```java
a.equals(b)
```

is true

Then:

```java
a.hashCode() == b.hashCode()
```

MUST be true.

---

Rule 2:

If hash codes are equal:

```java
a.hashCode() == b.hashCode()
```

objects MAY or MAY NOT be equal.

---

# Example Without Overriding

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

System.out.println(s1.equals(s2));
```

Output:

```text
false
```

Because default equals() compares memory addresses.

---

# Correct Implementation

```java
class Student {
    int id;

    Student(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Student other = (Student) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
```

Now:

```java
Student s1 = new Student(1);
Student s2 = new Student(1);

System.out.println(s1.equals(s2));
```

Output:

```text
true
```

---

# Why HashMap Needs Both

Imagine:

```java
Student s1 = new Student(1);
Student s2 = new Student(1);
```

Insert:

```java
map.put(s1, "John");
```

Retrieve:

```java
map.get(s2);
```

HashMap:

1. Uses hashCode() to find bucket
2. Uses equals() to identify exact key

Without proper implementation:

```java
null
```

may be returned.

---

# HashSet

## What is HashSet?

A collection of unique values.

```java
HashSet<String> names = new HashSet<>();
```

No duplicates allowed.

---

## Example

```java
HashSet<String> names = new HashSet<>();

names.add("John");
names.add("John");
names.add("Emma");

System.out.println(names);
```

Output:

```text
[John, Emma]
```

Only one "John".

---

# Internal Secret: HashSet Uses HashMap

This is a favorite interview question.

Internally:

```java
HashSet
```

is basically:

```java
HashMap
```

---

When you do:

```java
set.add("John");
```

Java actually does something similar to:

```java
map.put("John", PRESENT);
```

Where:

```java
PRESENT
```

is a dummy object.

---

Internally:

```text
HashMap

Key      Value
----     -----
John     PRESENT
Emma     PRESENT
Tom      PRESENT
```

Only keys matter.

Values are ignored.

---

# Why Duplicates Are Rejected

Adding:

```java
set.add("John");
```

again:

HashMap sees key already exists.

Therefore insertion fails.

---

# Time Complexity

| Operation  | Complexity |
| ---------- | ---------- |
| add()      | O(1)       |
| contains() | O(1)       |
| remove()   | O(1)       |

Average case.

---

# Real World Example

Employee badge IDs:

```java
HashSet<Integer> badges = new HashSet<>();
```

Need unique badge numbers.

Duplicates must not exist.

---

# TreeMap

## What is TreeMap?

Stores key-value pairs in sorted order.

```java
TreeMap<Integer, String> map = new TreeMap<>();
```

---

# Example

```java
TreeMap<Integer, String> map = new TreeMap<>();

map.put(3, "C");
map.put(1, "A");
map.put(2, "B");

System.out.println(map);
```

Output:

```text
{1=A, 2=B, 3=C}
```

Automatically sorted.

---

# Internal Structure

TreeMap uses a:

```text
Red-Black Tree
```

A self-balancing binary search tree.

---

Visualization

```text
      2
     / \
    1   3
```

Search:

```text
O(log n)
```

---

# Time Complexity

| Operation | Complexity |
| --------- | ---------- |
| put()     | O(log n)   |
| get()     | O(log n)   |
| remove()  | O(log n)   |

---

# Real World Example

Leaderboard ranking.

```java
TreeMap<Integer, String> ranking = new TreeMap<>();
```

```text
1 -> John
2 -> Emma
3 -> Tom
```

Always sorted.

---

# TreeSet

## What is TreeSet?

Unique elements + sorted order.

```java
TreeSet<Integer> numbers = new TreeSet<>();
```

---

# Example

```java
TreeSet<Integer> numbers = new TreeSet<>();

numbers.add(50);
numbers.add(10);
numbers.add(30);

System.out.println(numbers);
```

Output:

```text
[10, 30, 50]
```

Sorted automatically.

---

# Internal Structure

TreeSet internally uses:

```java
TreeMap
```

Just like:

```java
HashSet
```

uses

```java
HashMap
```

---

Internally:

```text
TreeMap

Key     Value
10      PRESENT
30      PRESENT
50      PRESENT
```

---

# TreeSet vs HashSet

| Feature            | HashSet | TreeSet  |
| ------------------ | ------- | -------- |
| Duplicate Allowed  | No      | No       |
| Sorted             | No      | Yes      |
| Internal Structure | HashMap | TreeMap  |
| Search             | O(1)    | O(log n) |
| Insertion          | O(1)    | O(log n) |

---

# HashMap vs TreeMap

| Feature            | HashMap      | TreeMap        |
| ------------------ | ------------ | -------------- |
| Ordering           | No guarantee | Sorted         |
| Speed              | Faster       | Slower         |
| Internal Structure | Hash Table   | Red-Black Tree |
| Lookup             | O(1)         | O(log n)       |
| Null Key           | One allowed  | Not allowed    |

---

# HashSet vs TreeSet

| Feature     | HashSet | TreeSet  |
| ----------- | ------- | -------- |
| Sorted      | No      | Yes      |
| Performance | Faster  | Slower   |
| Structure   | HashMap | TreeMap  |
| Complexity  | O(1)    | O(log n) |

---

# Exam & Interview Questions

### Q1: Why is HashMap fast?

Because it uses hashing to locate data directly in buckets instead of scanning every element.

---

### Q2: What happens during a collision?

Multiple keys are stored in the same bucket. Java uses linked lists or red-black trees to handle collisions.

---

### Q3: Why override both equals() and hashCode()?

HashMap uses:

- `hashCode()` → find bucket
- `equals()` → find exact object

Overriding only one can break lookups.

---

### Q4: Is HashSet implemented using HashMap?

Yes. Internally, a HashSet stores elements as keys in a HashMap with a dummy value.

---

### Q5: When should I use TreeMap instead of HashMap?

Use TreeMap when you need keys to remain automatically sorted.

Example:

- Rankings
- Schedules
- Sorted reports
- Dictionary-like applications

---

# Quick Memory Trick

```text
HashMap
= Key + Value
= Fast lookup
= Unordered

HashSet
= Unique values
= Built on HashMap

TreeMap
= Key + Value
= Sorted
= Red-Black Tree

TreeSet
= Unique + Sorted
= Built on TreeMap
```

This relationship is worth memorizing:

```text
HashSet  ---> HashMap
TreeSet  ---> TreeMap

HashMap  ---> Hash Table
TreeMap  ---> Red-Black Tree
```
