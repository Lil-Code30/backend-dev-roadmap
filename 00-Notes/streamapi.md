# Java Stream API Notes

The **Stream API** (introduced in Java 8) provides a functional way to process collections of data. It allows you to perform operations such as filtering, mapping, sorting, and reducing data in a concise and readable manner.

---

# What is a Stream?

A **Stream** is a sequence of elements that supports operations to process data.

A stream:

- Does **not** store data.
- Works on data from collections, arrays, files, etc.
- Can be processed sequentially or in parallel.
- Does not modify the original collection unless explicitly done.

```java
List<String> names = List.of("Alice", "Bob", "Charlie");

names.stream()
     .forEach(System.out::println);
```

---

# Creating Streams

## From a Collection

```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5);

Stream<Integer> stream = numbers.stream();
```

---

## From an Array

```java
int[] arr = {1, 2, 3, 4};

IntStream stream = Arrays.stream(arr);
```

---

## Using Stream.of()

```java
Stream<String> stream =
    Stream.of("Java", "Python", "C++");
```

---

# Stream Pipeline

A stream typically consists of:

1. Source
2. Intermediate Operations
3. Terminal Operation

```java
numbers.stream()
       .filter(n -> n % 2 == 0)
       .map(n -> n * 2)
       .forEach(System.out::println);
```

### Pipeline

```text
Collection
    ↓
filter()
    ↓
map()
    ↓
forEach()
```

---

# Intermediate Operations

Intermediate operations return another stream.

They are **lazy**, meaning they execute only when a terminal operation is called.

---

## filter()

Select elements matching a condition.

```java
List<Integer> nums = List.of(1,2,3,4,5,6);

nums.stream()
    .filter(n -> n % 2 == 0)
    .forEach(System.out::println);
```

Output:

```text
2
4
6
```

---

## map()

Transforms each element.

```java
nums.stream()
    .map(n -> n * n)
    .forEach(System.out::println);
```

Output:

```text
1
4
9
16
25
36
```

---

## sorted()

Sort elements.

```java
nums.stream()
    .sorted()
    .forEach(System.out::println);
```

---

### Reverse Order

```java
List<String> names =
    List.of("Bob", "Alice", "Charlie");

names.stream()
     .sorted(Comparator.reverseOrder())
     .forEach(System.out::println);
```

---

## distinct()

Removes duplicates.

```java
List<Integer> nums =
    List.of(1,1,2,2,3,4);

nums.stream()
    .distinct()
    .forEach(System.out::println);
```

Output:

```text
1 2 3 4
```

---

## limit()

Keeps first N elements.

```java
nums.stream()
    .limit(3)
    .forEach(System.out::println);
```

Output:

```text
1 2 3
```

---

## skip()

Skips first N elements.

```java
nums.stream()
    .skip(2)
    .forEach(System.out::println);
```

Output:

```text
3 4 5 6
```

---

# Terminal Operations

Terminal operations produce a result or side effect.

---

## forEach()

```java
nums.stream()
    .forEach(System.out::println);
```

---

## collect()

Converts stream into a collection.

```java
List<Integer> evens =
    nums.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());
```

---

## toList() (Java 16+)

```java
List<Integer> evens =
    nums.stream()
        .filter(n -> n % 2 == 0)
        .toList();
```

---

## count()

```java
long count =
    nums.stream()
        .filter(n -> n % 2 == 0)
        .count();
```

---

## findFirst()

```java
Optional<Integer> result =
    nums.stream()
        .filter(n -> n > 3)
        .findFirst();
```

---

## findAny()

```java
Optional<Integer> result =
    nums.stream()
        .findAny();
```

Mostly useful with parallel streams.

---

## anyMatch()

```java
boolean exists =
    nums.stream()
        .anyMatch(n -> n > 10);
```

---

## allMatch()

```java
boolean allPositive =
    nums.stream()
        .allMatch(n -> n > 0);
```

---

## noneMatch()

```java
boolean noneNegative =
    nums.stream()
        .noneMatch(n -> n < 0);
```

---

# reduce()

Combines all elements into a single value.

### Sum Example

```java
int sum =
    nums.stream()
        .reduce(0, (a, b) -> a + b);
```

Equivalent to:

```java
int sum = 0;

for (int n : nums)
    sum += n;
```

---

### Maximum Example

```java
Optional<Integer> max =
    nums.stream()
        .reduce(Integer::max);
```

---

# min() and max()

```java
Optional<Integer> max =
    nums.stream()
        .max(Integer::compareTo);

Optional<Integer> min =
    nums.stream()
        .min(Integer::compareTo);
```

---

# Working with Objects

```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

## Filter Objects

```java
students.stream()
        .filter(s -> s.age >= 18)
        .forEach(s -> System.out.println(s.name));
```

---

## Map Objects

Extract names:

```java
List<String> names =
    students.stream()
            .map(s -> s.name)
            .toList();
```

---

## Sort Objects

By age:

```java
students.stream()
        .sorted(
            Comparator.comparingInt(s -> s.age)
        )
        .forEach(System.out::println);
```

---

## Multiple Sorting Criteria

```java
students.stream()
        .sorted(
            Comparator.comparingInt(
                (Student s) -> s.age
            ).thenComparing(s -> s.name)
        )
        .forEach(System.out::println);
```

---

# flatMap()

Used when each element contains a collection.

Without flatMap:

```java
List<List<Integer>> lists =
    List.of(
        List.of(1,2),
        List.of(3,4)
    );
```

Result:

```java
Stream<List<Integer>>
```

---

With flatMap:

```java
lists.stream()
     .flatMap(List::stream)
     .forEach(System.out::println);
```

Output:

```text
1
2
3
4
```

---

# Primitive Streams

Avoid boxing/unboxing overhead.

## IntStream

```java
IntStream.range(1, 6)
         .forEach(System.out::println);
```

Output:

```text
1 2 3 4 5
```

---

## Sum

```java
int sum =
    IntStream.rangeClosed(1, 5)
             .sum();
```

Output:

```text
15
```

---

# Parallel Streams

Uses multiple threads.

```java
numbers.parallelStream()
       .forEach(System.out::println);
```

⚠ Order is not guaranteed.

---

# Common Interview Questions

### Difference between map() and flatMap()

| map()                     | flatMap()                       |
| ------------------------- | ------------------------------- |
| One element → One element | One element → Multiple elements |
| Keeps nested structure    | Flattens structure              |

---

### Difference between filter() and map()

| filter()         | map()                     |
| ---------------- | ------------------------- |
| Removes elements | Transforms elements       |
| Returns subset   | Returns modified elements |

Example:

```java
.filter(n -> n > 5)
```

Keeps only matching values.

```java
.map(n -> n * 2)
```

Changes every value.

---

### Why Streams?

Traditional approach:

```java
List<Integer> result = new ArrayList<>();

for (int n : nums) {
    if (n % 2 == 0) {
        result.add(n * 2);
    }
}
```

Stream approach:

```java
List<Integer> result =
    nums.stream()
        .filter(n -> n % 2 == 0)
        .map(n -> n * 2)
        .toList();
```

More concise, expressive, and easier to chain operations.
