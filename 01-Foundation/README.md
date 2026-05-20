## Phase 1: Java Fundamentals — Where to Start

The goal of Phase 1 is simple: get comfortable *thinking* in Java before you touch any framework. Everything in phases 2–10 assumes this foundation is solid.

---

### The right order to learn it

**Week 1–2 — JVM + Core Syntax**
Start here, not with OOP. Understanding that Java compiles to bytecode and runs on the JVM (not directly on your OS) explains *why* Java behaves the way it does — why primitives and objects are different, why `==` doesn't compare Strings the way you'd expect, why there's a `null`. Don't memorize the JVM internals — just get the mental model.

Then do variables, operators, control flow, and arrays. These are boring but fast. A week of deliberate practice is enough.

**Week 3–4 — OOP**
This is the real work of Phase 1. Java is *designed* around objects, so if OOP feels shaky everything downstream will too. Learn in this order:

1. Classes & objects (what *is* an object in memory?)
2. Constructors + `this`
3. Encapsulation (private fields, getters/setters — and *why*)
4. Inheritance + `super`
5. Polymorphism (method overriding first, then overloading)
6. Abstract classes vs interfaces (this trips up almost everyone — spend extra time here)

**Week 5 — Standard Library APIs**`String` manipulation, `Math`, `Scanner` for input, and the `java.time` package. These come up constantly in real projects and interviews.

---

### What to skip (for now)

Don't get pulled into generics, design patterns, or Streams yet. Those belong in Phase 2. Phase 1 is about fluency with the fundamentals, not completeness.

---

### Which project to build first

**Build the Student Grade Tracker.** Here's why it's the best Phase 1 project:

It forces you to use *everything* at once — not in isolation like exercises do. You'll need classes (`Student`, `Course`, `Grade`), encapsulation, constructors, arrays or basic lists, Scanner for input, String formatting for output, and control flow for grade calculations. It's also a real enough domain that you'll make design decisions (should `Grade` be a field of `Student` or its own class?) — which is exactly the OOP muscle you need to build.

**What to build into it:**

- A `Student` class with name, ID, and an array of grades
- A `GradeCalculator` that computes averages, letter grades, and GPA
- A simple CLI menu: add student → enter grades → view report
- Edge cases: no grades entered, invalid input, max class size

Once that works, extend it into the **Library Book Manager** — it reuses the same OOP patterns but adds the concept of *relationships* between objects (a `Book` belongs to a `Member`, a `Loan` connects both). That's the bridge into Phase 2 collections thinking.

---

### Resources to prioritize

Start with **Coding with John on YouTube** for visual explanations of OOP — he's unusually good at making `abstract` vs `interface` click. Then **Head First Java** for depth, but use it as a reference, not a cover-to-cover read. Use **Oracle's Java Tutorials** when you need the authoritative answer on something specific.

---

### GenAI tip for Phase 1

Use Claude or ChatGPT as a *rubber duck*, not an answer machine. When you write a class, paste it and ask: *"What would you change about the encapsulation here, and why?"* You'll learn faster from critique of your own code than from generated examples.
