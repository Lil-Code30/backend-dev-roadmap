# Phase 4: Enterprise Java (Jakarta EE) — Where to Start

Phase 4 is the one most modern tutorials tell you to skip. They say "just go straight to Spring Boot." That's bad advice. Jakarta EE is the foundation Spring is built on — understanding Servlets, the request lifecycle, session management, and JAX-RS means you'll never be confused by what Spring is doing _for_ you. You'll debug faster, design better, and interview stronger.

---

## The right order to learn it

**Week 1 — The HTTP Request Lifecycle**
Before writing a single Servlet, understand what happens between a browser sending a request and your Java code running. Learn:

- How a web server (Tomcat, WildFly) receives an HTTP request
- How it maps the URL to a Servlet class
- What the Servlet container manages (thread assignment, object lifecycle)
- The difference between `GET` and `POST` at the protocol level, not just the annotation level

This mental model makes everything else in Phase 4 — and Spring MVC in Phase 5 — immediately intuitive.

**Week 2 — Servlet Fundamentals**
Now write Servlets with this mental model in place:

1. `HttpServlet`, `doGet()`, `doPost()` — the core
2. `HttpServletRequest` — reading params, headers, body, path info
3. `HttpServletResponse` — setting status codes, headers, writing response body
4. `RequestDispatcher` — forwarding vs redirecting (understand the difference deeply — it trips up almost everyone)
5. `HttpSession` — how session tracking works, what's stored server-side, cookie vs URL rewriting
6. Servlet lifecycle: `init()`, `service()`, `destroy()` — when each runs and why

**Week 3 — Filters, Listeners & MVC**
Filters are middleware for Servlets — they sit in front of every request and can modify it, block it, or log it. This is the direct ancestor of Spring's `HandlerInterceptor` and security filter chains.

Build an MVC application using only Servlets and JSP — no frameworks. A `FrontController` Servlet routes requests to handler classes, handler classes contain business logic, JSP pages render the view. Doing this once makes Spring MVC's `DispatcherServlet` feel obvious rather than magical.

**Week 4 — RESTful Services with JAX-RS**
This is the most practically relevant section of Phase 4 for modern development:

1. JAX-RS annotations: `@Path`, `@GET`, `@POST`, `@PUT`, `@DELETE`, `@PathParam`, `@QueryParam`
2. Jackson integration — Java objects to JSON and back, including `@JsonIgnore`, `@JsonProperty`, custom serializers
3. Content negotiation — returning JSON vs XML based on `Accept` header
4. Exception mappers — converting Java exceptions to proper HTTP error responses
5. Bean Validation with `@Valid` on request bodies
6. OpenAPI / Swagger documentation — generate it from annotations

**Week 5 — Enterprise Integration (JMS + EJB basics)**
JMS and EJBs are less common in greenfield projects now, but you'll encounter them in enterprise environments and legacy codebases constantly. Learn:

- JMS concepts: producers, consumers, queues vs topics
- ActiveMQ setup and a basic producer/consumer pair
- Stateless vs stateful EJBs — when each makes sense
- JTA transactions — how distributed transactions work across multiple resources
- CDI (Contexts and Dependency Injection) — Jakarta's DI system, the direct predecessor of Spring's IoC

---

## What to focus on hardest

**Forward vs Redirect** — this is the most commonly confused concept in Servlet programming. `forward()` keeps the same request object and URL; `sendRedirect()` sends a 302 and the browser makes a new request. Getting this wrong causes subtle bugs with form resubmission, session data, and URL display. Understand it at the HTTP level, not just the API level.

**Session management security** — `HttpSession` stores data server-side, but the session ID is sent as a cookie. Understand session fixation attacks, session hijacking, when to `invalidate()` a session, and how to configure secure, HttpOnly cookies. Spring Security does this for you in Phase 5, but you should understand _why_.

**Jackson object mapping** — you'll use Jackson in every phase from here forward. Go beyond basic serialization: understand `ObjectMapper` configuration, handling of `null` values, date serialization, polymorphic types, and custom deserializers. Time spent here pays dividends in every phase ahead.

**HTTP status codes as a discipline** — most beginners return `200 OK` for everything including errors. Learn the full semantic meaning of `400`, `401`, `403`, `404`, `409`, `422`, `500`, and `503`. Returning the right status code is the difference between an API that's easy to integrate and one that's a nightmare.

---

## What to skip (for now)

Don't go deep on JSP tag libraries or JSTL — they're largely irrelevant in modern development where frontend frameworks handle rendering. Learn enough to understand the MVC pattern, then move on. Similarly, don't spend weeks on EJB internals — focus on the concepts (stateless, stateful, transaction demarcation) rather than the XML configuration details.

---

## Which project to build

**Build the Online Store REST API with JAX-RS, then add the Session-Based Auth System on top.**

This is the right Phase 4 project because it covers every section in a coherent, realistic domain — and it becomes the foundation you'll migrate to Spring in Phase 5, which is the best way to understand what Spring actually does.

**Part 1 — Online Store REST API (Weeks 4–5)**

A fully functional REST API for an e-commerce store, built with JAX-RS (Jersey) deployed on Tomcat or WildFly:

Schema — reuse and extend your Phase 3 database:

```sql
-- V2__store.sql (Flyway migration)
CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    name VARCHAR(200) NOT NULL,
    description TEXT,
    price NUMERIC(10,2) NOT NULL,
    stock_quantity INTEGER NOT NULL DEFAULT 0,
    category VARCHAR(100)
);

CREATE TABLE orders (
    id SERIAL PRIMARY KEY,
    customer_id INTEGER NOT NULL,
    status VARCHAR(50) DEFAULT 'PENDING',
    total_amount NUMERIC(12,2),
    created_at TIMESTAMP DEFAULT NOW()
);

CREATE TABLE order_items (
    id SERIAL PRIMARY KEY,
    order_id INTEGER REFERENCES orders(id),
    product_id INTEGER REFERENCES products(id),
    quantity INTEGER NOT NULL,
    unit_price NUMERIC(10,2) NOT NULL
);
```

Endpoints to build:

```
GET    /api/products              — list with pagination & category filter
GET    /api/products/{id}         — single product
POST   /api/products              — create (with @Valid Bean Validation)
PUT    /api/products/{id}         — update
DELETE /api/products/{id}         — delete

POST   /api/orders                — place order (reduce stock atomically via JDBC transaction)
GET    /api/orders/{id}           — order detail with items
PATCH  /api/orders/{id}/status    — update order status
GET    /api/orders?customerId=X   — orders by customer
```

Requirements that make it real:

- Custom exception mapper: `ProductNotFoundException` → `404`, `InsufficientStockException` → `409`, validation errors → `422` with field-level error messages
- Jackson configured to exclude `null` fields, serialize dates as ISO-8601
- HikariCP connection pool from Phase 3 reused
- OpenAPI/Swagger UI generated from annotations — a browser-accessible API explorer
- A `LoggingFilter` that logs every request: method, path, response status, duration in ms

**Part 2 — Session-Based Auth System (Week 3 revisited)**

Add authentication on top of the API:

- `POST /api/auth/login` — validates credentials against a `users` table (BCrypt-hashed passwords), creates an `HttpSession`, returns session cookie
- `POST /api/auth/logout` — invalidates the session
- A `AuthenticationFilter` that checks every `/api/*` request for a valid session, returns `401` if missing
- Role-based access: `ADMIN` role can create/delete products, `CUSTOMER` role can only read and place orders — enforced in the filter
- Secure session cookie: `HttpOnly`, `Secure`, `SameSite=Strict` flags set programmatically

**The migration exercise (bridge to Phase 5)**

Once both parts work, spend a day answering these questions in writing:

- What does `DispatcherServlet` replace in my code?
- What does `@Autowired` replace?
- What does Spring Security's filter chain replace?
- What does Spring Data JPA replace?

You'll discover that Spring Boot replaces roughly 80% of the boilerplate you just wrote — and you'll understand _exactly_ what it replaced and why. That understanding is worth more than any tutorial.

---

### Resources to prioritize

**Arjan EE's YouTube channel** is the best modern Jakarta EE resource — practical, opinionated, and up to date with Jakarta EE 10. The **Jakarta EE Tutorial** on eclipse-ee4j.github.io is the authoritative reference — use it alongside Arjan's videos. For JAX-RS specifically, the **Jersey documentation** is thorough and has good examples. **Adam Bien's blog** (adam-bien.com) has years of real-world Jakarta EE patterns and is worth reading for the design perspective even when the code examples are older.

---

### GenAI tip for Phase 4

Two high-value uses. First, after building your exception mapper hierarchy, ask: _"Review my HTTP status code choices across these endpoints — are any semantically wrong, and what would a strict REST purist change?"_ You'll get a fast education in REST semantics. Second, use the Claude or OpenAI API to **auto-generate OpenAPI specs from your endpoint descriptions** — paste your JAX-RS resource class and ask for the corresponding OpenAPI YAML. Compare it to what Swagger generates automatically. The differences teach you what annotations are doing under the hood.
