# Phase 3: Database & JDBC — Where to Start

Phase 3 is where your Java code meets persistent data. Everything before this lived in memory — the moment your program exits, it's gone. Phase 3 fixes that. It's also the phase that has the biggest impact on real-world application performance, because most bottlenecks in production systems are database bottlenecks.

---

## The right order to learn it

**Week 1–2 — SQL Fundamentals**
Do not touch JDBC until SQL feels natural. This order works well:

1. `SELECT`, `INSERT`, `UPDATE`, `DELETE` — the basics, fast
2. `WHERE`, `ORDER BY`, `LIMIT` — filtering and sorting
3. `JOIN` types — this is where most people get stuck; spend real time here
4. `GROUP BY` + `HAVING` — aggregations and filtered aggregations
5. Subqueries and `IN`, `EXISTS`, `ANY`
6. `UNION`, `INTERSECT`, `EXCEPT` — set operations
7. Window functions (`ROW_NUMBER`, `RANK`, `LAG`, `LEAD`) — these feel advanced but appear constantly in real analytics queries
8. `EXPLAIN` / `EXPLAIN ANALYZE` — learn to read a query plan early; it demystifies performance

Use **PostgreSQL** as your database. It's what most Java shops run in production, it has the best tooling, and its SQL is stricter than MySQL which forces better habits.

**Week 3 — Database Design**
Before writing a line of JDBC code, design a real schema. Learn normalization not as abstract rules but as answers to a concrete question: _what goes wrong if I don't do this?_ Understand 1NF (no repeating groups), 2NF (no partial dependencies), 3NF (no transitive dependencies). Then learn when to _intentionally_ denormalize for performance — that nuance is what separates junior from mid-level thinking.

Draw an ER diagram for your project database before writing any SQL. This habit saves enormous time later.

**Week 4 — JDBC Core**
Now JDBC makes sense because you understand what it's talking to. Learn in this order:

1. `DriverManager` + `Connection` — how Java connects to a DB
2. `Statement` — the basics, then immediately understand why it's dangerous (SQL injection)
3. `PreparedStatement` — always use this for any query with parameters
4. `ResultSet` — iterating and mapping rows to Java objects
5. Transaction management — `setAutoCommit(false)`, `commit()`, `rollback()`
6. Batch processing — inserting thousands of rows efficiently

**Week 5 — Connection Pooling & Advanced JDBC**
Raw `DriverManager` connections are expensive — opening one takes 50–200ms. In a real app serving concurrent requests this is catastrophic. Learn **HikariCP** (the fastest Java connection pool, used by default in Spring Boot). Understand pool sizing: too small causes queuing, too large wastes DB resources. The formula `connections = (core_count × 2) + effective_spindle_count` is a solid starting point.

Also cover Flyway or Liquibase for schema migrations — in real projects you never modify a database schema by hand in production. Every change is a versioned migration script.

---

## What to focus on hardest

**JOINs** — most developers can write a simple `INNER JOIN` but freeze on multi-table joins or self-joins. Practice until you can write a 4-table join from memory without hesitation. Every real application schema needs them constantly.

**`PreparedStatement` over `Statement`** — SQL injection is the #1 web vulnerability. Make `PreparedStatement` your default reflex, not something you remember to use sometimes.

**Transaction boundaries** — understand what a transaction _is_ (ACID), when to commit vs rollback, and what happens to data consistency if your app crashes mid-transaction. This mental model is essential before Spring transactions in Phase 5.

**Reading `EXPLAIN` output** — a query that works on 1,000 rows breaks on 1,000,000. Learn to spot sequential scans where index scans should be, and understand why an index isn't being used. This skill has direct, immediate production impact.

---

## What to skip (for now)

Don't go deep on stored procedures, triggers, or database-specific extensions yet. Don't touch ORM (Hibernate) here — that's Phase 5. Learning JDBC first means you'll actually understand what Hibernate is doing for you, rather than treating it as magic.

---

## Which project to build

**Build the Employee CRUD App, then immediately extend it into the Sales Analytics Dashboard.** Here's why this sequence is the best Phase 3 project:

**Part 1 — Employee CRUD App (Week 4)**

A CLI application that manages a company's employee database:

- Schema: `employees`, `departments`, `salaries`, `job_history` tables — properly normalized to 3NF
- Full CRUD via JDBC `PreparedStatement` — no raw `Statement` anywhere
- HikariCP connection pool configured and tuned
- Transaction management: a "transfer employee to department" operation that updates two tables atomically — if either update fails, the whole thing rolls back
- Batch insert: load 10,000 employees from a CSV file using JDBC batch processing (measure the time difference vs row-by-row)
- Custom exceptions: `EmployeeNotFoundException`, `DuplicateEmployeeException`
- Flyway migration scripts for schema versioning

This forces real JDBC discipline. No frameworks to hide behind.

**Part 2 — Sales Analytics Dashboard (Week 5)**

Extend the schema with `sales`, `products`, and `regions` tables, then write an analytics layer:

- Top 10 products by revenue this quarter — `GROUP BY` + `ORDER BY` + `LIMIT`
- Month-over-month sales growth — window functions (`LAG`)
- Sales rep performance ranking — `RANK()` over partition
- Department headcount vs revenue correlation — multi-table JOIN across 5 tables
- Slow query detection: run `EXPLAIN ANALYZE` on each query, add indexes where needed, document the before/after

The analytics dashboard is what pushes your SQL from basic to professional. Window functions and multi-table joins on real data (generate 100k+ rows with a script) will surface performance issues that teach you more than any tutorial.

**Schema design to start with:**

```sql
-- Run this as your first Flyway migration: V1__init.sql
CREATE TABLE departments (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    location VARCHAR(100)
);

CREATE TABLE employees (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    department_id INTEGER REFERENCES departments(id),
    hire_date DATE NOT NULL,
    salary NUMERIC(10,2)
);

CREATE TABLE sales (
    id SERIAL PRIMARY KEY,
    employee_id INTEGER REFERENCES employees(id),
    amount NUMERIC(12,2) NOT NULL,
    sale_date DATE NOT NULL,
    product_id INTEGER
);
```

---

### Resources to prioritize

**SQLBolt** is the fastest way to get SQL fundamentals hands-on — do every exercise. **Use the Index, Luke** (use-the-index-luke.com) is the best free resource on query performance and indexing — read the first three chapters before you look at `EXPLAIN` output. For JDBC specifically, **Amigoscode's JDBC tutorial** on YouTube is thorough and practical. For PostgreSQL, the **official docs** are unusually readable — the section on `EXPLAIN` is worth reading in full.

---

### GenAI tip for Phase 3

Two high-value uses here. First, paste your schema and ask: _"What normalization violations exist here, and what indexes would you add for these query patterns?"_ — great for learning DB design instincts. Second, build a small prototype of **natural language to SQL**: take a plain English question like "which department had the highest average salary last year?", send it to the OpenAI or Claude API, get SQL back, execute it with JDBC, and return the result. This is a real, production-used pattern (Text2SQL) and it puts GenAI integration directly into your Phase 3 project — a strong portfolio piece that shows you're thinking ahead.
