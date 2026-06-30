# SQL Lesson 3: Queries with constraints (Pt. 2)

![alt text](image.png)

## Exercise 3 — Tasks

1 - Find all the Toy Story movies

```sql
SELECT title, director FROM movies
WHERE title LIKE "Toy Story%";
```

2 - Find all the movies directed by John Lasseter

```sql
SELECT title, director FROM movies
WHERE director = "John Lasseter";
```

3 - Find all the movies (and director) not directed by John Lasseter

```sql
SELECT title, director FROM movies
WHERE director != "John Lasseter";
```

4 - Find all the WALL-\* movies

```sql
SELECT * FROM movies
WHERE title LIKE "WALL-%";
```
