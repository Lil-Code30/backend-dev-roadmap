# Phase 5: Spring Framework — Where to Start

Phase 5 is the pivot point of the entire roadmap. Everything before it was foundational — everything after it builds directly on Spring. This is also where most Java developers spend the majority of their careers, so depth here compounds for years.

If you did Phase 4 properly, Spring will feel like a revelation rather than magic. You'll recognize exactly what problem each Spring component is solving because you've already solved it by hand.

---

## The right order to learn it

**Week 1 — Spring Core: IoC & Dependency Injection**
Start here, not with Spring Boot. Understanding the container first means you'll never be confused by what Boot is automating.

Learn in this order:

1. What the IoC container _actually is_ — a `Map<String, Object>` of managed objects, essentially. The container creates them, wires them together, and controls their lifecycle
2. `ApplicationContext` vs `BeanFactory` — know the difference, use `ApplicationContext`
3. Java-based configuration (`@Configuration`, `@Bean`) — learn this before annotations; it makes the container tangible
4. Annotation-based configuration (`@Component`, `@Service`, `@Repository`, `@Controller`) — how component scanning works under the hood
5. `@Autowired` — constructor injection vs field injection vs setter injection, and _why_ constructor injection is strongly preferred
6. Bean scopes: `singleton` (default), `prototype`, `request`, `session` — what each means and when to use non-singleton scopes
7. Bean lifecycle: `@PostConstruct`, `@PreDestroy`, `InitializingBean`
8. `@Profile` — loading different beans for different environments

The single most important concept: **constructor injection is always preferred.** Field injection (`@Autowired` on a field) hides dependencies, makes testing harder, and allows objects to be created in an invalid state. Get this habit right from day one.

**Week 2 — Spring MVC**
Now the Servlet knowledge from Phase 4 pays off. Spring MVC is a Servlet-based framework — `DispatcherServlet` is the `FrontController` you built by hand, now fully automated.

1. `DispatcherServlet` request flow — draw it out: request → `HandlerMapping` → `HandlerAdapter` → your `@Controller` → `ViewResolver` → response
2. `@Controller` vs `@RestController` — the only difference is `@ResponseBody` on every method
3. `@RequestMapping`, `@GetMapping`, `@PostMapping` etc. — method and path mapping
4. `@PathVariable`, `@RequestParam`, `@RequestBody`, `@RequestHeader` — extracting data from requests
5. `@ResponseBody` and `ResponseEntity<T>` — controlling response body and status
6. Validation with `@Valid` + `BindingResult` — and a `@ControllerAdvice` with `@ExceptionHandler` for global error handling
7. `HandlerInterceptor` — the Spring equivalent of Servlet Filters for request pre/post processing
8. File upload with `MultipartFile`

**Week 3–4 — Spring Data JPA**
This is the deepest section of Phase 5 and the one with the most long-term impact. Take two weeks.

1. Hibernate fundamentals first — `SessionFactory`, `Session`, the persistence context, entity states (transient, persistent, detached, removed)
2. Entity mapping: `@Entity`, `@Table`, `@Id`, `@GeneratedValue`, `@Column`
3. Relationships: `@OneToOne`, `@OneToMany`, `@ManyToOne`, `@ManyToMany` — and the crucial `mappedBy` attribute
4. Fetch strategies: `EAGER` vs `LAZY` — this is where most Spring performance bugs live; understand it deeply
5. `JpaRepository` — how it generates queries from method names at startup
6. Custom queries: `@Query` with JPQL and native SQL
7. `Pageable` and `Sort` for pagination
8. `@Transactional` — propagation levels, isolation levels, readonly transactions, and why rollback rules matter
9. Auditing: `@CreatedDate`, `@LastModifiedDate`, `@CreatedBy`
10. Soft deletes: `@Where` annotation pattern

The N+1 query problem is the single most common Spring Data JPA performance bug. Understand it before you write your first `@OneToMany` relationship:

```java
// This causes N+1 — one query for orders, then one per order for items
List<Order> orders = orderRepository.findAll();
orders.forEach(o -> o.getItems().size()); // each triggers a SELECT

// Fix: JOIN FETCH in @Query
@Query("SELECT o FROM Order o JOIN FETCH o.items WHERE o.customerId = :id")
List<Order> findWithItems(@Param("id") Long customerId);
```

**Week 5 — Spring Security**
Spring Security has a steep learning curve because it's highly configurable. Fight the urge to copy-paste config you don't understand.

1. The security filter chain — how it wraps every request before it reaches your controller
2. `UserDetailsService` — loading user data from your database
3. `PasswordEncoder` — always BCrypt, never plain text or MD5
4. JWT authentication — stateless auth flow: login → sign token → send token → validate token per request
5. `SecurityFilterChain` bean configuration — `@EnableWebSecurity`, `authorizeHttpRequests`, `sessionManagement`
6. Method-level security: `@PreAuthorize("hasRole('ADMIN')")` on service methods
7. OAuth2 login — social login with Google/GitHub in ~20 lines of config
8. CORS configuration — allowing your frontend to call your API
9. CSRF — when to disable it (stateless JWT APIs) and when to keep it (session-based apps)

---

## What to focus on hardest

**`@Transactional` semantics** — this is the most misunderstood annotation in Spring. Key things to internalize:

- It only works on public methods called from _outside_ the bean (self-invocation bypasses the proxy)
- `readOnly = true` is a meaningful hint — use it on all read operations
- Default rollback is on `RuntimeException` — checked exceptions do _not_ trigger rollback unless configured
- Propagation `REQUIRED` (default) vs `REQUIRES_NEW` vs `SUPPORTS` — know when each applies

**Fetch type and the persistence context** — `LazyInitializationException` is the most common Spring Data JPA runtime error. It happens when you access a lazy collection outside a transaction. Understand why, and know your three solutions: `JOIN FETCH`, `@EntityGraph`, or `@Transactional` on the service method.

**Spring Security filter chain order** — filters execute in a specific order. Authentication happens before authorization. Your custom JWT filter must be placed correctly relative to `UsernamePasswordAuthenticationFilter`. Getting the order wrong produces security vulnerabilities or broken flows that are hard to debug.

**Constructor injection everywhere** — by the end of Week 1 this should be automatic:

```java
// Never do this
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository; // field injection — bad
}

// Always do this
@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) { // constructor injection — good
        this.orderRepository = orderRepository;
    }
}
```

---

## What to skip (for now)

Don't go deep on XML-based Spring configuration — it's legacy. Don't spend time on Spring WebMVC's Thymeleaf view layer unless you specifically want server-side rendering; modern architectures use a separate frontend. Spring Batch and Spring Integration are powerful but belong in a specialized phase — come back to them later.

---

## Which project to build

**Build the User Auth System with JWT, then extend it into the full Task Manager REST API.**

This project sequence covers every section of Phase 5 in a realistic, portfolio-worthy application — and it becomes the base you'll migrate to Spring Boot microservices in Phase 6.

**Part 1 — User Auth System (Week 5)**

Pure Spring Security focus first:

```java
// The JWT filter — place this before UsernamePasswordAuthenticationFilter
@Component
public class JwtAuthFilter extends OncePerRequestFilter {

    private final JwtService jwtService;
    private final UserDetailsService userDetailsService;

    // Constructor injection — always
    public JwtAuthFilter(JwtService jwtService,
                         UserDetailsService userDetailsService) {
        this.jwtService = jwtService;
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain chain)
            throws ServletException, IOException {
        final String header = request.getHeader("Authorization");
        if (header == null || !header.startsWith("Bearer ")) {
            chain.doFilter(request, response);
            return;
        }
        final String token = header.substring(7);
        final String username = jwtService.extractUsername(token);
        if (username != null && SecurityContextHolder
                .getContext().getAuthentication() == null) {
            UserDetails user = userDetailsService
                    .loadUserByUsername(username);
            if (jwtService.isTokenValid(token, user)) {
                UsernamePasswordAuthenticationToken auth =
                    new UsernamePasswordAuthenticationToken(
                        user, null, user.getAuthorities());
                SecurityContextHolder.getContext()
                    .setAuthentication(auth);
            }
        }
        chain.doFilter(request, response);
    }
}
```

Endpoints:

```
POST /api/auth/register    — create user, hash password, return JWT
POST /api/auth/login       — validate credentials, return JWT + refresh token
POST /api/auth/refresh     — exchange refresh token for new access token
POST /api/auth/logout      — invalidate refresh token in DB
GET  /api/auth/me          — return current user profile (requires valid JWT)
```

**Part 2 — Task Manager REST API (Weeks 2–4)**

Extend with a full domain built on Spring MVC + Spring Data JPA:

Schema:

```sql
-- V3__tasks.sql
CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    email VARCHAR(255) UNIQUE NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    role VARCHAR(50) DEFAULT 'USER',
    created_at TIMESTAMP DEFAULT NOW(),
    updated_at TIMESTAMP DEFAULT NOW()
);

CREATE TABLE projects (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(200) NOT NULL,
    description TEXT,
    owner_id BIGINT REFERENCES users(id),
    created_at TIMESTAMP DEFAULT NOW()
);

CREATE TABLE tasks (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(300) NOT NULL,
    description TEXT,
    status VARCHAR(50) DEFAULT 'TODO',
    priority VARCHAR(50) DEFAULT 'MEDIUM',
    project_id BIGINT REFERENCES projects(id),
    assignee_id BIGINT REFERENCES users(id),
    due_date DATE,
    created_at TIMESTAMP DEFAULT NOW(),
    updated_at TIMESTAMP DEFAULT NOW(),
    deleted_at TIMESTAMP             -- soft delete column
);
```

Entity design — put the JPA knowledge to work:

```java
@Entity
@Table(name = "tasks")
@Where(clause = "deleted_at IS NULL")   // soft delete filter
@EntityListeners(AuditingEntityListener.class)
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    @ManyToOne(fetch = FetchType.LAZY)   // always lazy on ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assignee_id")
    private User assignee;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;    // null = not deleted

    // constructor injection via builder pattern
}
```

Repository with no N+1:

```java
public interface TaskRepository extends JpaRepository<Task, Long> {

    // Spring Data generates this from the method name
    List<Task> findByProjectIdAndStatus(Long projectId, TaskStatus status);

    // JOIN FETCH to avoid N+1 when loading tasks with assignees
    @Query("""
        SELECT t FROM Task t
        JOIN FETCH t.assignee
        JOIN FETCH t.project
        WHERE t.project.id = :projectId
        ORDER BY t.priority DESC, t.createdAt ASC
        """)
    List<Task> findWithDetailsForProject(@Param("projectId") Long projectId);

    // Paginated query for dashboard
    Page<Task> findByAssigneeIdAndDeletedAtIsNull(
        Long assigneeId, Pageable pageable);
}
```

Full REST surface:

```
GET    /api/projects                        — user's projects
POST   /api/projects                        — create project
GET    /api/projects/{id}/tasks             — tasks with JOIN FETCH (no N+1)
POST   /api/projects/{id}/tasks             — create task
PATCH  /api/tasks/{id}/status              — update status
PUT    /api/tasks/{id}                      — full update
DELETE /api/tasks/{id}                      — soft delete (sets deleted_at)
GET    /api/tasks/my?page=0&size=20        — paginated assigned tasks
GET    /api/tasks/overdue                   — due_date < NOW, status != DONE
```

Service layer with proper transaction handling:

```java
@Service
@Transactional(readOnly = true)   // default all methods to read-only
public class TaskService {

    private final TaskRepository taskRepository;
    private final ProjectRepository projectRepository;
    private final UserRepository userRepository;

    public TaskService(TaskRepository taskRepository,
                       ProjectRepository projectRepository,
                       UserRepository userRepository) {
        this.taskRepository = taskRepository;
        this.projectRepository = projectRepository;
        this.userRepository = userRepository;
    }

    @Transactional   // overrides readOnly=true — this one writes
    public Task createTask(Long projectId, CreateTaskRequest req,
                           Long currentUserId) {
        Project project = projectRepository.findById(projectId)
            .orElseThrow(() -> new ProjectNotFoundException(projectId));

        if (!project.getOwner().getId().equals(currentUserId)) {
            throw new AccessDeniedException("Not your project");
        }

        Task task = Task.builder()
            .title(req.title())
            .priority(req.priority())
            .status(TaskStatus.TODO)
            .project(project)
            .build();

        return taskRepository.save(task);
    }

    @Transactional
    public Task softDelete(Long taskId, Long currentUserId) {
        Task task = taskRepository.findById(taskId)
            .orElseThrow(() -> new TaskNotFoundException(taskId));
        task.setDeletedAt(LocalDateTime.now());
        return taskRepository.save(task);   // @Where filters it from all future queries
    }
}
```

**Global exception handler — the professional touch:**

```java
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TaskNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFound(
            TaskNotFoundException ex) {
        return ResponseEntity.status(404)
            .body(new ErrorResponse("NOT_FOUND", ex.getMessage()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidation(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = ex.getBindingResult()
            .getFieldErrors().stream()
            .collect(Collectors.toMap(
                FieldError::getField,
                FieldError::getDefaultMessage));
        return ResponseEntity.status(422)
            .body(new ErrorResponse("VALIDATION_FAILED", errors));
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<ErrorResponse> handleForbidden(
            AccessDeniedException ex) {
        return ResponseEntity.status(403)
            .body(new ErrorResponse("FORBIDDEN", ex.getMessage()));
    }
}
```

---

### GenAI tip for Phase 5

Spring AI integrates directly with Spring's IoC container — a `ChatClient` bean is autowired just like any repository. Add it to your Task Manager:

```java
@Service
public class TaskAiService {

    private final ChatClient chatClient;

    public TaskAiService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public String suggestPriority(String taskTitle, String description) {
        return chatClient.prompt()
            .user(u -> u.text("""
                Given this task:
                Title: {title}
                Description: {desc}
                Suggest a priority: LOW, MEDIUM, HIGH, or CRITICAL.
                Respond with only the priority word and a one-sentence reason.
                """)
                .param("title", taskTitle)
                .param("desc", description))
            .call()
            .content();
    }
}
```

Wire it to a `POST /api/tasks/{id}/suggest-priority` endpoint. It's a small addition that makes your portfolio project genuinely stand out — an AI-powered task prioritization feature built with real Spring patterns, not a tutorial toy.

---

### Resources to prioritize

**Craig Walls — Spring in Action** is the definitive book; read it cover to cover for Phase 5, it's worth every page. **Baeldung's Spring Security series** is the best free reference for JWT and OAuth2 — more practical than the official docs. **Amigoscode's Spring Boot full course** on YouTube covers Spring Data JPA particularly well with visual explanations of entity relationships. For `@Transactional` specifically, Vlad Mihalcea's blog (vladmihalcea.com) is the world's best resource on Hibernate and JPA performance — bookmark it and return to it throughout your career.
