# SQL Lesson 8: A short note on NULLs

![alt text](image.png)

## Exercise 8 — Tasks

1 - Find the name and role of all employees who have not been assigned to a building

```sql
SELECT name, role FROM employees
WHERE building IS NULL;
```

2 - Find the names of the buildings that hold no employees

```sql
SELECT DISTINCT building_name
FROM buildings
  LEFT JOIN employees
    ON building_name = building
WHERE role IS NULL;
```
