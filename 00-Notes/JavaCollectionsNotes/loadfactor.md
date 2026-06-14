# Load Factor in Java (HashMap / HashSet)

## 🔹 Simple meaning

**Load factor = how full a HashMap is allowed to get before it increases its size.**

It controls when Java should **resize (rehash)** the internal bucket array.

---

# 🔹 Formula idea

```text
Load Factor = (Number of elements) / (Number of buckets)
```

---

# 🔹 Default value

In Java:

```java
HashMap<K, V> map = new HashMap<>();
```

Internally:

```text
Default load factor = 0.75
```

---

# 🔹 What does 0.75 mean?

It means:

> When the HashMap is 75% full, it will resize itself (double its capacity).

---

## Example

Suppose:

```text
Initial capacity = 16 buckets
Load factor = 0.75
```

### Maximum entries before resize:

```text
16 × 0.75 = 12 elements
```

So:

- You can insert **12 elements safely**
- When you try to insert the **13th element**
  → HashMap will **resize (usually to 32 buckets)**

---

# 🔹 Why resizing is needed

Without resizing:

```text
Too many elements → too many collisions → slow performance
```

With resizing:

```text
More buckets → fewer collisions → faster access
```

---

# 🔹 Real-world analogy

Think of a parking lot:

- 16 parking spots (buckets)
- Load factor = 0.75 → you allow only 12 cars comfortably

When the 13th car arrives:

- You expand the parking lot (double size)

---

# 🔹 What happens during resize?

When threshold is reached:

1. New bigger array is created (usually ×2)
2. All existing entries are **rehashed**
3. They are redistributed into new buckets

⚠️ This is expensive (O(n)) operation.

---

# 🔹 Trade-off of load factor

| Load Factor    | Effect                             |
| -------------- | ---------------------------------- |
| Low (0.5)      | Less collisions, more memory usage |
| High (0.9)     | More collisions, less memory usage |
| Default (0.75) | Balanced performance               |

---

# 🔹 Why 0.75 is chosen

Because it balances:

✔ Speed (low collisions)
✔ Memory efficiency
✔ Fewer resizes

---

# 🔹 Custom example

You can set it manually:

```java
HashMap<Integer, String> map = new HashMap<>(16, 0.5f);
```

Here:

- capacity = 16
- load factor = 0.5

So resize happens at:

```text
16 × 0.5 = 8 elements
```

---

# 🔹 Key interview answer

> Load factor is a threshold in HashMap that determines when the map should be resized to maintain performance. It is calculated as size / capacity, and the default value is 0.75 in Java.

---

# 🔥 Quick summary

```text
Load Factor = how full before resizing

Default = 0.75

16 buckets → resize after 12 elements

Purpose:
→ avoid too many collisions
→ keep HashMap fast
```

---
