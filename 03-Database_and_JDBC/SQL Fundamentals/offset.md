# OFFSET

`OFFSET` is used to **skip a certain number of rows** before SQL starts returning results.

Let's break down your query:

```sql
SELECT title
FROM movies
ORDER BY title ASC
LIMIT 5 OFFSET 5;
```

### Step 1: Sort the data

```sql
ORDER BY title ASC
```

The movies are sorted alphabetically.

Example:

| Position | Title        |
| -------: | ------------ |
|        1 | Avatar       |
|        2 | Avengers     |
|        3 | Batman       |
|        4 | Dune         |
|        5 | Frozen       |
|        6 | Gladiator    |
|        7 | Inception    |
|        8 | Interstellar |
|        9 | Joker        |
|       10 | Titanic      |

---

### Step 2: OFFSET 5

```sql
OFFSET 5
```

This tells SQL:

> "Ignore the first **5 rows**."

Skipped:

- Avatar
- Avengers
- Batman
- Dune
- Frozen

Remaining:

- Gladiator
- Inception
- Interstellar
- Joker
- Titanic

---

### Step 3: LIMIT 5

```sql
LIMIT 5
```

Now SQL returns the next **5 rows** after the skipped ones.

Result:

| Title        |
| ------------ |
| Gladiator    |
| Inception    |
| Interstellar |
| Joker        |
| Titanic      |

---

## General purpose of `OFFSET`

In general, `OFFSET` lets you **start reading the result set from a later position instead of the beginning**.

Think of it like reading a book:

- `OFFSET 0` → Start at page 1.
- `OFFSET 10` → Skip the first 10 pages and start reading from page 11.

The same idea applies to database rows.

---

## The most common use: Pagination

Imagine a website showing 10 movies per page.

### Page 1

```sql
SELECT *
FROM movies
LIMIT 10 OFFSET 0;
```

Rows returned:

```
1–10
```

---

### Page 2

```sql
SELECT *
FROM movies
LIMIT 10 OFFSET 10;
```

Rows returned:

```
11–20
```

---

### Page 3

```sql
SELECT *
FROM movies
LIMIT 10 OFFSET 20;
```

Rows returned:

```
21–30
```

The general formula is:

```text
OFFSET = (page_number - 1) × page_size
```

For example, if each page has **20 items**:

| Page | LIMIT | OFFSET |
| ---: | ----: | -----: |
|    1 |    20 |      0 |
|    2 |    20 |     20 |
|    3 |    20 |     40 |
|    4 |    20 |     60 |

---

## A helpful analogy

Imagine 20 people standing in a line.

```
1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20
```

If you write:

```sql
LIMIT 5 OFFSET 10
```

SQL says:

1. Skip the first 10 people.
2. Return the next 5 people.

You get:

```
11 12 13 14 15
```

---

## Why `ORDER BY` is important

You should almost always use `OFFSET` together with `ORDER BY`.

Without ordering:

```sql
SELECT title
FROM movies
LIMIT 5 OFFSET 5;
```

the database is free to return rows in any order, which means the "first 5 rows" may change between executions. Using `ORDER BY` makes the results predictable and consistent.

---

### Summary

- **`OFFSET n`** → Skip the first `n` rows.
- **`LIMIT m`** → Return at most `m` rows after the skipped rows.
- They are commonly used together for **pagination**.
- Use **`ORDER BY`** with `OFFSET` to ensure consistent results.

Your query:

```sql
SELECT title
FROM movies
ORDER BY title ASC
LIMIT 5 OFFSET 5;
```

means:

> **Sort the movies alphabetically, skip the first 5 movies, then return the next 5 movies.**
