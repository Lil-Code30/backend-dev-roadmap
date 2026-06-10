# Phase 2: Advanced Java — Where to Start

Phase 2 is where Java starts feeling like a _real_ language. You go from writing correct code to writing code that's efficient, safe under pressure, and expressive. It's also the phase that separates developers who "know Java" from those who can actually build things with it.

---

## The right order to learn it

### Week 1–2 — Collections Framework

This is your first priority, full stop. Collections are everywhere — in Spring, in JDBC, in every project you'll ever build. Learn them in this order:

1. `ArrayList` vs `LinkedList` — understand the performance tradeoff (O(1) random access vs O(1) insertion at head), not just the syntax
2. `HashMap` — how hashing works internally, why `equals()` and `hashCode()` matter together
3. `HashSet` — it's just a `HashMap` under the hood; once you get that, it clicks
4. `TreeMap` / `TreeSet` — when you need sorted order
5. `PriorityQueue` — critical for any algorithm or scheduling work
6. `Comparable` vs `Comparator` — you'll use this constantly for sorting custom objects

### Week 3 — Streams & Lambdas

Don't skip this or leave it for later. Modern Java code is written with Streams. Learn the pipeline model: `source → intermediate ops → terminal op`. Master `filter`, `map`, `collect`, `reduce`, `groupingBy`, and `flatMap`. The `Optional` class lives here too — use it to eliminate null checks properly.

### Week 4 — Exception Handling

Shorter to learn, but the _design decisions_ around exceptions take time to internalize. The key question is always: should this be checked or unchecked? Learn why modern Java (and Spring) strongly prefer unchecked exceptions, and how to build a clean custom exception hierarchy.

### Week 5–6 — Multithreading & Concurrency

This is the hardest section of Phase 2 — budget more time. Learn in this order:

1. `Thread` and `Runnable` — just to understand the primitives
2. `ExecutorService` and thread pools — this is what you'll actually use
3. `synchronized`, `volatile`, and atomic variables — understand _why_ shared state is dangerous before learning the fixes
4. `CompletableFuture` — this is modern async Java; learn it well
5. Concurrent collections (`ConcurrentHashMap`, `CopyOnWriteArrayList`) — thread-safe alternatives to the standard ones

### Week 7 — File I/O & NIO

Shorter section. Focus on `BufferedReader`/`BufferedWriter` for text, NIO's `Files` and `Path` for modern file operations, and serialization for object persistence. WatchService is a nice bonus.

---

## What to focus on hardest

**`equals()` and `hashCode()`** — violating the contract here causes silent, maddening bugs in `HashMap` and `HashSet`. Understand them deeply.

**`CompletableFuture`** — async programming is everywhere in real backends. Most tutorials underteach this; go beyond the basics into chaining (`thenCompose`, `thenCombine`) and error handling (`exceptionally`, `handle`).

**Thread safety mental model** — you don't need to memorize every lock type. You need to recognize _when_ shared mutable state exists and reach for the right tool (`synchronized`, `AtomicInteger`, `ConcurrentHashMap`, or redesign to avoid sharing).

---

## What to skip (for now)

`Vector`, `Stack`, and `Hashtable` are legacy — know they exist, don't use them. Don't go deep on `ForkJoinPool` or low-level `Lock` implementations yet; that's Phase 9 territory.

---

## Which project to build

**Build the Multi-threaded File Downloader.** It's the best Phase 2 project because it forces every major section to work together in a realistic scenario:

**What you'll build:**

- A CLI tool that takes a list of URLs and downloads them concurrently
- Each download runs in its own thread via `ExecutorService`
- Progress tracking uses `AtomicInteger` and `ConcurrentHashMap` (thread-safe)
- Results are collected with `CompletableFuture.allOf()`
- Downloaded content is written with NIO `Files` and `Path`
- A custom `DownloadException` (unchecked) handles network failures gracefully
- A `Stream`based summary report at the end: total size, success/failure counts, fastest/slowest download

**Why this project specifically:**
It's not contrived. File downloaders are real tools people use. The concurrency requirements are _genuine_ — you can't fake thread safety here, you'll see broken output immediately if you get it wrong. And the Stream-based reporting at the end makes you apply functional style to real data.

**Extend it into the Stock Price Simulator** once it works — generate random price movements across multiple "stocks" concurrently, track historical prices in a `TreeMap` (sorted by timestamp), and produce statistics with Streams. Same skills, different domain, and it introduces time-series thinking you'll need for databases in Phase 3.

---

## Resources to prioritize

**Java Concurrency in Practice** (Goetz) is the definitive book on multithreading — read chapters 1–5 and 10 at minimum. **Baeldung.com** is your best reference for Collections and Streams with practical examples. For `CompletableFuture` specifically, the **jenkov.com tutorial** on it is the clearest explanation anywhere.

---

## GenAI tip for Phase 2

Concurrency bugs are notoriously hard to reproduce. After writing any multithreaded code, paste it and ask: _"Find any race conditions, visibility issues, or deadlock risks in this code."_ LLMs are genuinely good at static analysis of thread-safety problems — better than most developers reading the same code quickly. Use that.
