# Phase 7: Build Tools & Testing — Where to Start

Phase 7 is the phase most developers treat as an afterthought and then regret. Build tools and testing aren't glamorous, but they're what separates code that works on your machine from software that ships reliably. In a professional team, untested code doesn't get merged. A broken build blocks everyone. Understanding this phase deeply is what makes you a developer other developers want to work with.

The good news: Phase 7 is narrower than the previous phases. You're not learning new architectural concepts — you're adding the professional layer on top of everything you've already built.

---

## The right order to learn it

**Week 1 — Maven Deep Dive**
Most Java developers use Maven without understanding it. Fix that.

1. The POM structure — `groupId`, `artifactId`, `version`, `packaging`, `parent`
2. The build lifecycle — `validate → compile → test → package → verify → install → deploy`. Each phase runs all previous phases. Understand what each does
3. Dependency scopes — `compile`, `provided`, `runtime`, `test`, `import`. Getting scope wrong causes `ClassNotFoundException` in production and missing test utilities in CI
4. Dependency management vs dependencies — `<dependencyManagement>` in a parent POM declares versions without adding them; child POMs inherit those versions without repeating them
5. Maven plugins — `maven-compiler-plugin`, `maven-surefire-plugin` (unit tests), `maven-failsafe-plugin` (integration tests), `maven-shade-plugin` (fat JARs)
6. Multi-module projects — a parent POM with `<modules>`, child modules inheriting config. This is how real enterprise projects are structured
7. The local repository (`~/.m2/repository`) and remote repositories (Maven Central, Nexus, Artifactory)
8. Running specific phases: `mvn clean package -DskipTests`, `mvn verify`, `mvn dependency:tree`

**Week 2 — Gradle**
After Maven, Gradle feels expressive. Learn it for two reasons: many modern projects (especially Android and Kotlin) use it, and understanding both makes you flexible.

1. `build.gradle` structure — `plugins`, `repositories`, `dependencies`, `tasks`
2. Groovy DSL vs Kotlin DSL — Kotlin DSL (`build.gradle.kts`) is now preferred; it has IDE completion and compile-time safety
3. Task graph — Gradle models builds as a DAG of tasks. `assemble` depends on `compileJava` which depends on `processResources`
4. Incremental builds — Gradle only recompiles what changed. Maven always recompiles everything. This is why Gradle is 2–4× faster on large projects
5. Custom tasks — writing a task that generates code, processes files, or runs a script
6. Dependency management with `platform()` and version catalogs (`libs.versions.toml`)
7. Multi-project builds — equivalent to Maven multi-module

**Week 3 — JUnit 5 & Mockito**
Unit testing is where you spend most of Phase 7. Learn it with the depth it deserves.

JUnit 5 first:

1. `@Test`, `@BeforeEach`, `@AfterEach`, `@BeforeAll`, `@AfterAll` — the lifecycle hooks
2. Assertions — `assertEquals`, `assertThrows`, `assertAll` (groups multiple assertions so all run even if one fails), `assertTimeout`
3. `@ParameterizedTest` with `@ValueSource`, `@CsvSource`, `@MethodSource` — test one method with dozens of inputs in one test method
4. `@Nested` — group related tests in inner classes, each with their own lifecycle
5. `@Tag` — categorize tests (unit, integration, slow) and run subsets in CI
6. `@TempDir` and `@ExtendWith` — test extensions for temporary directories and custom lifecycle hooks
7. `@DisplayName` — human-readable test names that make failure reports readable

Mockito immediately after:

1. `@Mock` — creates a mock of an interface or class
2. `@InjectMocks` — creates the class under test and injects its mocks
3. `@Spy` — wraps a real object; only specified methods are stubbed
4. `@Captor` — captures arguments passed to a mock method for assertion
5. `when().thenReturn()` — stubbing return values
6. `when().thenThrow()` — stubbing exceptions
7. `verify()` — asserting a method was called with specific arguments
8. `ArgumentMatchers` — `any()`, `eq()`, `anyString()`, `argThat()`
9. `@MockBean` — Spring-specific: replaces a bean in the application context with a mock

**Week 4 — Integration Testing**
This is where tests prove the _whole system_ works, not just individual units.

1. `@SpringBootTest` — loads the full application context. Use `webEnvironment = RANDOM_PORT` for HTTP tests
2. `TestRestTemplate` and `MockMvc` — two ways to test HTTP endpoints. `MockMvc` is faster (no real HTTP); `TestRestTemplate` tests the full stack
3. `@DataJpaTest` — loads only JPA-related beans and an in-memory H2 database. Fast repository tests without full context startup
4. `@WebMvcTest` — loads only the web layer (controllers, filters, security). Mock the service layer with `@MockBean`
5. TestContainers — spin up real PostgreSQL, Kafka, Redis in Docker for integration tests. No more H2 surprises in production
6. `@Transactional` on test methods — rolls back DB changes after each test
7. `@Sql` — execute SQL scripts to set up test data
8. WireMock — stub external HTTP services your code calls

**Week 5 — Performance Testing & Code Quality**

1. JMeter — load testing: define thread groups (concurrent users), ramp-up periods, assertions on response time
2. Gatling — Scala-based but with a Java DSL; generates beautiful HTML reports. Better for CI integration than JMeter
3. SonarQube — static analysis: code smells, bugs, security vulnerabilities, test coverage. Run it locally with Docker
4. ArchUnit — enforce architectural rules in code: "services must not call repositories directly", "controllers must not use `@Autowired` on fields"
5. JaCoCo — code coverage reports integrated with Maven/Gradle and SonarQube

---

## What to focus on hardest

**The testing pyramid** — understand why it exists and follow it deliberately:

```
         /\
        /  \          E2E Tests
       / E2E \        (few, slow, brittle, expensive)
      /────────\
     /          \     Integration Tests
    / Integration\    (moderate, real dependencies)
   /──────────────\
  /                \  Unit Tests
 /    Unit Tests    \ (many, fast, isolated, cheap)
/────────────────────\
```

Most codebases get this inverted — lots of slow integration tests and few unit tests. The result is a test suite that takes 20 minutes to run and developers who stop running it locally. Keep unit tests in the hundreds, integration tests in the dozens, E2E tests in the single digits.

**Test naming as documentation** — a good test name tells you exactly what broke when it fails:

```java
// Bad — tells you nothing when it fails
@Test
void testOrder() { }

// Good — reads as a specification
@Test
@DisplayName("placing an order reduces product stock by the ordered quantity")
void placingOrder_reducesProductStock_byOrderedQuantity() { }

// BDD style — Given/When/Then maps to Arrange/Act/Assert
@Test
@DisplayName("given insufficient stock, when placing order, then throws InsufficientStockException")
void givenInsufficientStock_whenPlacingOrder_thenThrowsException() { }
```

**TestContainers over H2** — H2 in-memory database is convenient but lies to you. It doesn't support PostgreSQL-specific features like `JSONB`, window functions, or advisory locks. Code that passes H2 tests fails against real PostgreSQL. TestContainers runs the actual database:

```java
@SpringBootTest
@Testcontainers
class OrderRepositoryTest {

    @Container
    static PostgreSQLContainer<?> postgres =
        new PostgreSQLContainer<>("postgres:16")
            .withDatabaseName("test_db")
            .withUsername("test")
            .withPassword("test");

    @DynamicPropertySource
    static void configureProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", postgres::getJdbcUrl);
        registry.add("spring.datasource.username", postgres::getUsername);
        registry.add("spring.datasource.password", postgres::getPassword);
    }

    @Autowired
    private OrderRepository orderRepository;

    @Test
    @Transactional
    void findByUserIdWithItems_returnsOrdersWithJoinFetchedItems() {
        // Uses real PostgreSQL — no H2 surprises
        List<Order> orders = orderRepository
            .findByUserIdWithItems(1L);
        assertThat(orders).isNotEmpty();
        assertThat(orders.get(0).getItems()).isNotEmpty();
    }
}
```

**The `@Transactional` test trap** — putting `@Transactional` on a test method rolls back all changes after the test, which is convenient for isolation. But it also means your code runs inside the test's transaction, which hides `LazyInitializationException` bugs that only appear in production where transactions have proper boundaries. Use `@Transactional` on test methods sparingly; prefer TestContainers with explicit data setup and teardown.

**ArchUnit as living documentation** — encode your architectural decisions as tests that fail if violated:

```java
@AnalyzeClasses(packages = "com.yourapp")
class ArchitectureTest {

    @ArchTest
    static final ArchRule controllers_should_not_access_repositories =
        noClasses()
            .that().resideInAPackage("..controller..")
            .should().accessClassesThat()
            .resideInAPackage("..repository..");

    @ArchTest
    static final ArchRule services_should_be_annotated =
        classes()
            .that().resideInAPackage("..service..")
            .and().haveNameMatching(".*Service")
            .should().beAnnotatedWith(Service.class);

    @ArchTest
    static final ArchRule no_field_injection =
        noFields()
            .that().areDeclaredInClassesThat()
            .resideInAPackage("com.yourapp..")
            .should().beAnnotatedWith(Autowired.class)
            .because("use constructor injection");

    @ArchTest
    static final ArchRule layered_architecture =
        layeredArchitecture()
            .consideringAllDependencies()
            .layer("Controller").definedBy("..controller..")
            .layer("Service").definedBy("..service..")
            .layer("Repository").definedBy("..repository..")
            .whereLayer("Controller").mayNotBeAccessedByAnyLayer()
            .whereLayer("Service").mayOnlyBeAccessedByLayers("Controller")
            .whereLayer("Repository").mayOnlyBeAccessedByLayers("Service");
}
```

If a developer accidentally calls a repository from a controller, the build fails with a clear message. This is architecture enforced as code, not architecture documented in a wiki nobody reads.

---

## Which project to build

**Build a comprehensive test suite for your Phase 5 Task Manager and Phase 6 E-Commerce system, targeting 85%+ coverage with all three test layers, a Gatling performance report, and ArchUnit architecture rules.**

This is the right Phase 7 project for one reason: real testing knowledge only comes from testing _existing, complex code_, not from writing tests for trivial examples. Your Phase 5 and 6 projects are complex enough that testing them is genuinely hard — and solving that hardness is the education.

**Part 1 — Unit Test Suite for Task Manager Service Layer**

Target: every service method has at least one unit test. No Spring context loaded — pure JUnit 5 + Mockito:

```java
@ExtendWith(MockitoExtension.class)
class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    @Mock
    private ProjectRepository projectRepository;

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private TaskService taskService;

    private User testUser;
    private Project testProject;

    @BeforeEach
    void setUp() {
        testUser = User.builder()
            .id(1L).email("user@test.com").role(Role.USER).build();
        testProject = Project.builder()
            .id(1L).name("Test Project").owner(testUser).build();
    }

    @Test
    @DisplayName("createTask — given valid request, saves task with TODO status")
    void createTask_givenValidRequest_savesTaskWithTodoStatus() {
        // Arrange
        CreateTaskRequest req = new CreateTaskRequest(
            "Fix login bug", Priority.HIGH, null);
        when(projectRepository.findById(1L))
            .thenReturn(Optional.of(testProject));
        when(taskRepository.save(any(Task.class)))
            .thenAnswer(inv -> inv.getArgument(0));

        // Act
        Task result = taskService.createTask(1L, req, 1L);

        // Assert
        assertThat(result.getStatus()).isEqualTo(TaskStatus.TODO);
        assertThat(result.getTitle()).isEqualTo("Fix login bug");
        assertThat(result.getPriority()).isEqualTo(Priority.HIGH);

        ArgumentCaptor<Task> taskCaptor = ArgumentCaptor.forClass(Task.class);
        verify(taskRepository).save(taskCaptor.capture());
        assertThat(taskCaptor.getValue().getProject()).isEqualTo(testProject);
    }

    @Test
    @DisplayName("createTask — given wrong owner, throws AccessDeniedException")
    void createTask_givenWrongOwner_throwsAccessDeniedException() {
        // Arrange — project owned by user 99, not user 1
        Project otherProject = Project.builder()
            .id(2L)
            .owner(User.builder().id(99L).build())
            .build();
        when(projectRepository.findById(2L))
            .thenReturn(Optional.of(otherProject));

        // Act + Assert
        assertThatThrownBy(() ->
            taskService.createTask(2L, new CreateTaskRequest("Task", Priority.LOW, null), 1L))
            .isInstanceOf(AccessDeniedException.class)
            .hasMessageContaining("Not your project");

        verify(taskRepository, never()).save(any());
    }

    @ParameterizedTest
    @DisplayName("createTask — handles all priority levels correctly")
    @EnumSource(Priority.class)
    void createTask_handlesAllPriorityLevels(Priority priority) {
        when(projectRepository.findById(anyLong()))
            .thenReturn(Optional.of(testProject));
        when(taskRepository.save(any())).thenAnswer(i -> i.getArgument(0));

        Task result = taskService.createTask(
            1L, new CreateTaskRequest("Task", priority, null), 1L);

        assertThat(result.getPriority()).isEqualTo(priority);
    }

    @Test
    @DisplayName("softDelete — sets deletedAt timestamp and saves")
    void softDelete_setsDeletedAtAndSaves() {
        Task task = Task.builder().id(1L)
            .project(testProject).build();
        when(taskRepository.findById(1L)).thenReturn(Optional.of(task));
        when(taskRepository.save(any())).thenAnswer(i -> i.getArgument(0));

        Task result = taskService.softDelete(1L, 1L);

        assertThat(result.getDeletedAt()).isNotNull();
        assertThat(result.getDeletedAt()).isBefore(LocalDateTime.now().plusSeconds(1));
    }

    @Test
    @DisplayName("softDelete — given non-existent task, throws TaskNotFoundException")
    void softDelete_givenNonExistentTask_throwsNotFoundException() {
        when(taskRepository.findById(999L)).thenReturn(Optional.empty());

        assertThatThrownBy(() -> taskService.softDelete(999L, 1L))
            .isInstanceOf(TaskNotFoundException.class);
    }
}
```

**Part 2 — Integration Tests with TestContainers**

Test the full stack from HTTP request to database and back:

```java
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Testcontainers
@Sql(scripts = "/test-data/users.sql", executionPhase = BEFORE_TEST_METHOD)
@Sql(scripts = "/test-data/cleanup.sql", executionPhase = AFTER_TEST_METHOD)
class TaskControllerIntegrationTest {

    @Container
    static PostgreSQLContainer<?> postgres =
        new PostgreSQLContainer<>("postgres:16-alpine")
            .withDatabaseName("taskmanager_test")
            .withUsername("test")
            .withPassword("test");

    @DynamicPropertySource
    static void overrideProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", postgres::getJdbcUrl);
        registry.add("spring.datasource.username", postgres::getUsername);
        registry.add("spring.datasource.password", postgres::getPassword);
    }

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private TaskRepository taskRepository;

    private String jwtToken;

    @BeforeEach
    void authenticate() {
        LoginRequest login = new LoginRequest("test@test.com", "password");
        ResponseEntity<AuthResponse> response = restTemplate
            .postForEntity("/api/auth/login", login, AuthResponse.class);
        jwtToken = response.getBody().token();
    }

    @Test
    void createTask_withValidRequest_returns201AndPersistsTask() {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(jwtToken);
        headers.setContentType(MediaType.APPLICATION_JSON);

        CreateTaskRequest req = new CreateTaskRequest(
            "Integration test task", Priority.HIGH, null);

        ResponseEntity<TaskResponse> response = restTemplate.exchange(
            "/api/projects/1/tasks",
            HttpMethod.POST,
            new HttpEntity<>(req, headers),
            TaskResponse.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        assertThat(response.getBody().title())
            .isEqualTo("Integration test task");
        assertThat(response.getBody().status())
            .isEqualTo("TODO");

        // Verify it actually persisted
        assertThat(taskRepository.findById(
            response.getBody().id())).isPresent();
    }

    @Test
    void createTask_withoutAuth_returns401() {
        ResponseEntity<Void> response = restTemplate.postForEntity(
            "/api/projects/1/tasks",
            new CreateTaskRequest("Unauthorized", Priority.LOW, null),
            Void.class);

        assertThat(response.getStatusCode())
            .isEqualTo(HttpStatus.UNAUTHORIZED);
    }

    @Test
    void createTask_withInvalidPriority_returns422WithFieldErrors() {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(jwtToken);
        headers.setContentType(MediaType.APPLICATION_JSON);

        String invalidBody = """
            {"title": "", "priority": null}
            """;

        ResponseEntity<ErrorResponse> response = restTemplate.exchange(
            "/api/projects/1/tasks",
            HttpMethod.POST,
            new HttpEntity<>(invalidBody, headers),
            ErrorResponse.class);

        assertThat(response.getStatusCode())
            .isEqualTo(HttpStatus.UNPROCESSABLE_ENTITY);
        assertThat(response.getBody().errors())
            .containsKey("title")
            .containsKey("priority");
    }
}
```

**Part 3 — Kafka Integration Test for E-Commerce Saga**

Test the full order placement Saga with a real Kafka container:

```java
@SpringBootTest
@Testcontainers
class OrderSagaIntegrationTest {

    @Container
    static KafkaContainer kafka =
        new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:7.6.0"));

    @Container
    static PostgreSQLContainer<?> postgres =
        new PostgreSQLContainer<>("postgres:16-alpine");

    @DynamicPropertySource
    static void overrideProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.kafka.bootstrap-servers", kafka::getBootstrapServers);
        registry.add("spring.datasource.url", postgres::getJdbcUrl);
        registry.add("spring.datasource.username", postgres::getUsername);
        registry.add("spring.datasource.password", postgres::getPassword);
    }

    @Autowired
    private OrderSagaOrchestrator sagaOrchestrator;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Test
    @Timeout(30)  // fail if Saga doesn't complete in 30s
    @DisplayName("full order saga — stock reserved → order confirmed")
    void fullOrderSaga_stockReserved_orderConfirmed()
            throws InterruptedException {

        // Arrange
        PlaceOrderRequest req = PlaceOrderRequest.builder()
            .items(List.of(new OrderItem(1L, 2)))
            .totalAmount(new BigDecimal("99.99"))
            .build();

        // Act — place order, starts the Saga
        Order order = sagaOrchestrator.placeOrder(req, 1L);
        assertThat(order.getStatus()).isEqualTo(OrderStatus.PENDING);

        // Simulate Inventory Service responding with STOCK_RESERVED
        kafkaTemplate.send("inventory-events",
            new InventoryEvent(order.getId(), STOCK_RESERVED));

        // Wait for Saga to complete — poll until confirmed or timeout
        Awaitility.await()
            .atMost(Duration.ofSeconds(20))
            .pollInterval(Duration.ofMillis(500))
            .untilAsserted(() -> {
                Order updated = orderRepository
                    .findById(order.getId()).orElseThrow();
                assertThat(updated.getStatus())
                    .isEqualTo(OrderStatus.CONFIRMED);
            });
    }
}
```

**Part 4 — Gatling Performance Test**

```java
// OrderSimulation.java
public class OrderSimulation extends Simulation {

    private final HttpProtocolBuilder protocol = http
        .baseUrl("http://localhost:8080")
        .acceptHeader("application/json")
        .contentTypeHeader("application/json");

    private final ScenarioBuilder orderScenario = scenario("Place Order")
        .exec(http("Login")
            .post("/api/auth/login")
            .body(StringBody("""
                {"email":"perf@test.com","password":"password"}
                """))
            .check(jsonPath("$.token").saveAs("token")))
        .pause(1)
        .exec(http("Place Order")
            .post("/api/orders")
            .header("Authorization", "Bearer #{token}")
            .body(StringBody("""
                {"items":[{"productId":1,"quantity":1}]}
                """))
            .check(status().is(201))
            .check(responseTimeInMillis().lte(500)));

    {
        setUp(
            orderScenario.injectOpen(
                rampUsers(50).during(Duration.ofSeconds(30)),
                constantUsersPerSec(20).during(Duration.ofMinutes(2))
            )
        ).protocols(protocol)
         .assertions(
             global().responseTime().percentile(95).lte(500),
             global().successfulRequests().percent().gte(99.0)
         );
    }
}
```

**Part 5 — SonarQube Quality Gate**

Run SonarQube locally and enforce a quality gate:

```yaml
# sonar-project.properties
sonar.projectKey=taskmanager
sonar.sources=src/main/java
sonar.tests=src/test/java
sonar.java.coveragePlugin=jacoco
sonar.coverage.jacoco.xmlReportPaths=target/site/jacoco/jacoco.xml
sonar.qualitygate.wait=true
# Quality gate thresholds to set in SonarQube UI:
# Coverage > 80%
# Duplicated lines < 5%
# Maintainability rating = A
# Reliability rating = A
# Security rating = A
```

```xml
<!-- pom.xml — JaCoCo + Surefire + Failsafe config -->
<plugin>
    <groupId>org.jacoco</groupId>
    <artifactId>jacoco-maven-plugin</artifactId>
    <version>0.8.11</version>
    <executions>
        <execution>
            <goals><goal>prepare-agent</goal></goals>
        </execution>
        <execution>
            <id>report</id>
            <phase>verify</phase>
            <goals><goal>report</goal></goals>
        </execution>
        <execution>
            <id>check</id>
            <goals><goal>check</goal></goals>
            <configuration>
                <rules>
                    <rule>
                        <limits>
                            <limit>
                                <counter>LINE</counter>
                                <value>COVEREDRATIO</value>
                                <minimum>0.80</minimum>
                            </limit>
                        </limits>
                    </rule>
                </rules>
            </configuration>
        </execution>
    </executions>
</plugin>
```

---

## GenAI tip for Phase 7

Two genuinely high-value uses. First, paste any service method and ask: _"Write me an exhaustive JUnit 5 test suite for this method — cover the happy path, all edge cases, all exception paths, and suggest any boundary conditions I might have missed."_ LLMs write solid unit test skeletons faster than any developer — your job becomes reviewing, refining, and filling in domain-specific assertions they can't know.

Second, use AI to **generate test data at scale**. Ask: _"Generate 500 rows of realistic employee test data as SQL INSERT statements with varied names, salaries between $40k–$200k, hire dates spanning 2010–2024, and 8 departments."_ Feeding realistic data volumes into your Gatling and TestContainers tests reveals performance issues that sanitized test data never would.

---

## Resources to prioritize

The **JUnit 5 User Guide** (junit.org/junit5) is comprehensive and well-written — read the parameterized tests and extensions chapters fully. **Mockito documentation** (site.mockito.org) is the authoritative reference; the FAQ section addresses the most common mistakes. **Testcontainers.org** has getting-started guides for every database and broker — follow them exactly the first time. For Gatling, the **Gatling Academy** (free tier) teaches the DSL well with practical examples. **Vladimir Khorikov — Unit Testing: Principles, Practices, and Patterns** is the best book on testing philosophy; it will permanently change how you think about what makes a test valuable versus what makes it noise.
