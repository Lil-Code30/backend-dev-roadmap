# Phase 6: Spring Boot & Microservices — Where to Start

Phase 6 is where individual Spring applications become distributed systems. It's also the most architecturally complex phase on the roadmap — not because any single concept is harder than Spring Security or JPA, but because the _interactions between moving parts_ multiply rapidly. A bug in a monolith has one location. A bug in a microservices system could live in the service, the gateway, the config server, the message broker, the circuit breaker, or the network between them.

The right mental model going in: **microservices solve organizational problems as much as technical ones.** They let teams deploy independently, scale selectively, and own bounded domains. If you don't have those organizational pressures, a well-structured monolith is often the better choice. Understanding _when_ to use microservices is as important as knowing _how_.

---

## The right order to learn it

**Week 1 — Spring Boot Internals**
Most developers use Spring Boot without understanding what it actually does. Fix that first.

1. Auto-configuration mechanism — how `@EnableAutoConfiguration` scans `META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports` and conditionally creates beans based on `@ConditionalOnClass`, `@ConditionalOnMissingBean`, `@ConditionalOnProperty`
2. The starter dependency model — a starter is just a POM that pulls in a curated set of dependencies plus an auto-configuration jar. `spring-boot-starter-data-jpa` pulls in Hibernate, Spring Data, HikariCP, and their auto-configs
3. `application.yml` structure — hierarchical config, type-safe binding with `@ConfigurationProperties`
4. Profiles — `application-dev.yml`, `application-prod.yml`, activating via `SPRING_PROFILES_ACTIVE`
5. Actuator endpoints — `/actuator/health`, `/actuator/metrics`, `/actuator/env`, `/actuator/beans`. Understand what each exposes and how to secure them
6. Spring Boot DevTools — what hot reload actually reloads and what it doesn't
7. Writing a custom auto-configuration — do this once; it makes all of Boot's behavior transparent

**Week 2 — Microservices Foundations**
Before touching Spring Cloud, internalize the architectural concepts:

1. Bounded context — each service owns one domain completely, including its database. No shared databases between services
2. The eight fallacies of distributed computing — the network is not reliable, latency is not zero, bandwidth is not infinite. These aren't abstract concerns; they shape every design decision
3. Synchronous vs asynchronous communication — REST/gRPC for request-response, Kafka/RabbitMQ for event-driven. Know when each is appropriate
4. The CAP theorem practically — in a network partition you choose consistency or availability. Most microservices choose availability and handle eventual consistency in application logic
5. Data consistency patterns — the Saga pattern for distributed transactions (choreography vs orchestration), outbox pattern for reliable event publishing

**Week 3 — Spring Cloud Ecosystem**
Now the tooling makes sense because you understand the problems it solves:

1. **Eureka (Service Discovery)** — services register themselves on startup, discover others by name not IP. Understand why hardcoded URLs break in dynamic environments
2. **Spring Cloud Gateway** — the single entry point for all external traffic. Routes, filters, rate limiting, authentication at the edge
3. **Spring Cloud Config** — externalized configuration stored in Git, served to all services. Understand why config-in-code breaks at scale
4. **Resilience4j** — circuit breaker, retry, rate limiter, bulkhead patterns. The circuit breaker state machine (closed → open → half-open) is the core mental model
5. **Micrometer + Zipkin** — distributed tracing. A single request becomes many spans across services; tracing connects them with a correlation ID

**Week 4 — Apache Kafka**
Kafka deserves its own week because it's architecturally different from everything before it:

1. Core concepts: topics, partitions, offsets, consumer groups, brokers
2. Why Kafka is a log, not a queue — messages are retained and replayable, not deleted on consumption
3. Producer configuration: `acks`, `retries`, `idempotence` — how to guarantee exactly-once delivery
4. Consumer configuration: `group.id`, `auto.offset.reset`, manual vs auto commit
5. Spring Kafka: `@KafkaListener`, `KafkaTemplate`, error handling with `@RetryableTopic`
6. Partition strategy — how Kafka scales horizontally, why message ordering is per-partition not per-topic

**Week 5 — gRPC & Advanced Communication**

1. Protocol Buffers — define your service contract in `.proto` files, generate Java code
2. gRPC service types: unary, server streaming, client streaming, bidirectional streaming
3. When gRPC over REST — internal service-to-service communication where performance matters
4. WebClient for reactive REST calls between services — non-blocking, with timeout and retry configuration
5. WebSockets with STOMP — for real-time push to connected clients

---

### What to focus on hardest

**Service boundaries and database isolation** — the most common microservices mistake is splitting the application layer while keeping a shared database. If two services share a database, they're not microservices — they're a distributed monolith, which has all the complexity of microservices with none of the benefits. Each service must own its data completely:

```
Order Service     → orders_db     (PostgreSQL)
Inventory Service → inventory_db  (PostgreSQL)
User Service      → users_db      (PostgreSQL)
Notification Svc  → (stateless — no DB needed)
API Gateway       → (stateless — Redis for rate limiting)
```

**The Saga pattern for distributed transactions** — when a monolith places an order it uses a single database transaction. When microservices place an order, the flow touches multiple services and multiple databases. ACID transactions don't span service boundaries. The Saga pattern solves this:

```
Choreography Saga — services react to events:
1. OrderService publishes OrderCreated event
2. InventoryService listens → reserves stock → publishes StockReserved
3. PaymentService listens → charges card → publishes PaymentCompleted
4. OrderService listens → marks order CONFIRMED

If PaymentService fails → publishes PaymentFailed
InventoryService listens → releases reserved stock (compensating transaction)
OrderService listens → marks order CANCELLED
```

Understanding compensating transactions — the microservices equivalent of rollback — is essential for building reliable distributed systems.

**Circuit breaker state machine** — memorize the three states and the transitions:

```
CLOSED (normal operation)
  → failure rate exceeds threshold → OPEN

OPEN (all calls fail immediately, no network calls made)
  → wait duration expires → HALF_OPEN

HALF_OPEN (limited calls allowed through as a test)
  → calls succeed → CLOSED
  → calls fail → OPEN
```

**Kafka consumer group semantics** — a consumer group processes each message exactly once across all members. Partition count = maximum parallelism. If you have 3 partitions and 5 consumers in a group, 2 consumers are idle. If you have 3 partitions and 1 consumer, that consumer processes all 3 partitions sequentially. Partition count is a deployment-time decision that's expensive to change later — think carefully upfront.

**Distributed tracing correlation** — in a system with 6 services, a single user request spawns 6+ spans. Without tracing, debugging means grepping 6 different log files for a request ID you hope was consistently propagated. With Micrometer + Zipkin, you see the full request tree in a UI. Add this from day one of building your project — retrofitting it is painful.

---

### What to skip (for now)

Don't build a service mesh (Istio, Linkerd) yet — that's infrastructure-level complexity for teams running hundreds of services. Don't go deep on Kubernetes operator patterns or custom resource definitions; that's Phase 8. Don't implement your own service discovery — Eureka handles it. The goal of Phase 6 is understanding the patterns; the infrastructure optimization comes later.

---

### Which project to build

**Build the Microservices E-Commerce System — 6 services, Kafka event bus, Spring Cloud infrastructure, and an AI service wired in.**

This is the capstone project of the entire roadmap up to this point. It reuses the domain from Phases 3–5 but rebuilds it as a proper distributed system. Budget 3–4 weeks for it.

**System architecture:**

```
                    ┌─────────────────┐
                    │   API Gateway   │  :8080
                    │ (Spring Cloud   │
                    │  Gateway)       │
                    └────────┬────────┘
                             │ routes
           ┌─────────────────┼─────────────────┐
           │                 │                 │
    ┌──────▼──────┐  ┌───────▼──────┐  ┌──────▼──────┐
    │   Order     │  │   Product    │  │    User     │
    │   Service   │  │   Service   │  │   Service   │
    │   :8081     │  │   :8082     │  │   :8083     │
    └──────┬──────┘  └──────────────┘  └─────────────┘
           │ publishes
    ┌──────▼──────────────────────────────┐
    │          Apache Kafka               │
    │  topics: order-events               │
    │          inventory-events           │
    │          notification-events        │
    └──────┬──────────────┬───────────────┘
           │ consumes     │ consumes
    ┌──────▼──────┐  ┌────▼──────────┐
    │  Inventory  │  │ Notification  │
    │   Service   │  │   Service     │
    │   :8084     │  │   :8085       │
    └─────────────┘  └───────────────┘
                             │
                    ┌────────▼────────┐
                    │   AI Service    │
                    │  (Spring AI)    │
                    │   :8086         │
                    └─────────────────┘

Infrastructure:
  Eureka Server    :8761
  Config Server    :8888
  Zipkin           :9411
  Redis            :6379   (gateway rate limiting)
```

**Service responsibilities:**

```
User Service      — registration, login, JWT issuance, profile
Product Service   — catalog, inventory reads, search
Order Service     — place orders, Saga orchestrator
Inventory Service — stock management, reservation, release
Notification Svc  — email/SMS on order events (Kafka consumer only)
AI Service        — product recommendations, order anomaly detection
API Gateway       — routing, auth filter, rate limiting, CORS
```

**Project structure — one Git repo, multiple modules:**

```
ecommerce-microservices/
├── api-gateway/
├── eureka-server/
├── config-server/
│   └── configs/          ← Git-backed config files
├── user-service/
├── product-service/
├── order-service/
├── inventory-service/
├── notification-service/
├── ai-service/
├── docker-compose.yml    ← spins up all infrastructure
└── README.md
```

**The order placement Saga — the most important flow to implement:**

```java
// OrderService — Saga orchestrator
@Service
public class OrderSagaOrchestrator {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private final OrderRepository orderRepository;

    // Step 1: Create order in PENDING state, publish event
    @Transactional
    public Order placeOrder(PlaceOrderRequest req, Long userId) {
        Order order = Order.builder()
            .userId(userId)
            .status(OrderStatus.PENDING)
            .items(req.items())
            .totalAmount(req.totalAmount())
            .build();
        order = orderRepository.save(order);

        // Publish to Kafka — Inventory Service will listen
        kafkaTemplate.send("order-events",
            new OrderCreatedEvent(order.getId(),
                                  order.getItems(),
                                  userId));
        return order;
    }

    // Step 3: Listen for inventory result
    @KafkaListener(topics = "inventory-events",
                   groupId = "order-service")
    @Transactional
    public void handleInventoryEvent(InventoryEvent event) {
        Order order = orderRepository.findById(event.orderId())
            .orElseThrow();

        if (event.type() == STOCK_RESERVED) {
            order.setStatus(OrderStatus.CONFIRMED);
            orderRepository.save(order);
            // Trigger notification
            kafkaTemplate.send("notification-events",
                new OrderConfirmedEvent(order.getId(),
                                        order.getUserId()));
        } else {
            // Compensating transaction — cancel the order
            order.setStatus(OrderStatus.CANCELLED);
            order.setCancellationReason("Insufficient stock");
            orderRepository.save(order);
            kafkaTemplate.send("notification-events",
                new OrderCancelledEvent(order.getId(),
                                        order.getUserId(),
                                        "Out of stock"));
        }
    }
}
```

**Inventory Service — Saga participant:**

```java
@Service
public class InventoryService {

    private final InventoryRepository inventoryRepository;
    private final KafkaTemplate<String, Object> kafkaTemplate;

    // Step 2: Listen for order, attempt stock reservation
    @KafkaListener(topics = "order-events",
                   groupId = "inventory-service")
    @Transactional
    public void handleOrderCreated(OrderCreatedEvent event) {
        boolean allReserved = event.items().stream()
            .allMatch(item -> reserveStock(
                item.productId(), item.quantity()));

        if (allReserved) {
            kafkaTemplate.send("inventory-events",
                new InventoryEvent(event.orderId(),
                                   STOCK_RESERVED));
        } else {
            // Release any partially reserved stock
            event.items().forEach(item ->
                releaseStock(item.productId(), item.quantity()));
            kafkaTemplate.send("inventory-events",
                new InventoryEvent(event.orderId(),
                                   STOCK_INSUFFICIENT));
        }
    }

    private boolean reserveStock(Long productId, int quantity) {
        return inventoryRepository
            .findByProductId(productId)
            .map(inv -> {
                if (inv.getAvailable() >= quantity) {
                    inv.setReserved(inv.getReserved() + quantity);
                    inv.setAvailable(inv.getAvailable() - quantity);
                    inventoryRepository.save(inv);
                    return true;
                }
                return false;
            })
            .orElse(false);
    }
}
```

**API Gateway configuration — routing + auth + rate limiting:**

```yaml
# application.yml in api-gateway
spring:
  cloud:
    gateway:
      routes:
        - id: user-service
          uri: lb://USER-SERVICE # lb:// = load-balanced via Eureka
          predicates:
            - Path=/api/users/**
          filters:
            - name: RequestRateLimiter
              args:
                redis-rate-limiter.replenishRate: 10
                redis-rate-limiter.burstCapacity: 20

        - id: order-service
          uri: lb://ORDER-SERVICE
          predicates:
            - Path=/api/orders/**
          filters:
            - AuthenticationFilter # custom filter: validate JWT

        - id: product-service
          uri: lb://PRODUCT-SERVICE
          predicates:
            - Path=/api/products/**

      default-filters:
        - DedupeResponseHeader=Access-Control-Allow-Origin
        - name: CircuitBreaker
          args:
            name: defaultCB
            fallbackUri: forward:/fallback
```

**Resilience4j circuit breaker on the Order Service:**

```java
@Service
public class ProductServiceClient {

    private final WebClient webClient;

    @CircuitBreaker(name = "product-service",
                    fallbackMethod = "getProductFallback")
    @Retry(name = "product-service")
    @TimeLimiter(name = "product-service")
    public CompletableFuture<ProductDto> getProduct(Long productId) {
        return webClient.get()
            .uri("/api/products/{id}", productId)
            .retrieve()
            .bodyToMono(ProductDto.class)
            .toFuture();
    }

    // Fallback — return cached or default data when circuit is open
    public CompletableFuture<ProductDto> getProductFallback(
            Long productId, Exception ex) {
        return CompletableFuture.completedFuture(
            ProductDto.unavailable(productId));
    }
}
```

**AI Service — product recommendations + anomaly detection:**

```java
@RestController
@RequestMapping("/api/ai")
public class AiController {

    private final ChatClient chatClient;
    private final OrderRepository orderRepository;

    @PostMapping("/recommendations")
    public RecommendationResponse getRecommendations(
            @RequestBody RecommendationRequest req) {

        List<String> recentPurchases = req.recentProductNames();
        String prompt = """
            A customer recently purchased: %s
            Suggest 3 complementary products from our catalog.
            Categories available: Electronics, Books, Clothing, Home.
            Return JSON: {"recommendations": [{"name": "...",
            "category": "...", "reason": "..."}]}
            """.formatted(String.join(", ", recentPurchases));

        String response = chatClient.prompt()
            .user(prompt)
            .call()
            .content();

        return parseRecommendations(response);
    }

    @GetMapping("/orders/{orderId}/anomaly")
    public AnomalyResponse detectAnomaly(@PathVariable Long orderId) {
        Order order = orderRepository.findById(orderId).orElseThrow();
        // Compare against user's historical average
        Double avgOrderValue = orderRepository
            .findAverageOrderValueByUser(order.getUserId());

        String prompt = """
            Order amount: $%.2f
            Customer's average order: $%.2f
            Order time: %s
            Is this potentially fraudulent? Reply with:
            {"anomaly": true/false, "confidence": 0-100,
             "reason": "..."}
            """.formatted(order.getTotalAmount(),
                          avgOrderValue,
                          order.getCreatedAt());

        String response = chatClient.prompt()
            .user(prompt)
            .call()
            .content();

        return parseAnomalyResponse(response);
    }
}
```

**Docker Compose to run everything locally:**

```yaml
version: "3.8"
services:
  postgres-orders:
    image: postgres:16
    environment:
      POSTGRES_DB: orders_db
      POSTGRES_USER: orders_user
      POSTGRES_PASSWORD: orders_pass
    ports: ["5432:5432"]

  postgres-inventory:
    image: postgres:16
    environment:
      POSTGRES_DB: inventory_db
      POSTGRES_USER: inventory_user
      POSTGRES_PASSWORD: inventory_pass
    ports: ["5433:5432"]

  kafka:
    image: confluentinc/cp-kafka:7.6.0
    environment:
      KAFKA_ZOOKEEPER_CONNECT: zookeeper:2181
      KAFKA_ADVERTISED_LISTENERS: PLAINTEXT://kafka:9092
    ports: ["9092:9092"]
    depends_on: [zookeeper]

  zookeeper:
    image: confluentinc/cp-zookeeper:7.6.0
    environment:
      ZOOKEEPER_CLIENT_PORT: 2181

  redis:
    image: redis:7-alpine
    ports: ["6379:6379"]

  zipkin:
    image: openzipkin/zipkin
    ports: ["9411:9411"]

  eureka-server:
    build: ./eureka-server
    ports: ["8761:8761"]

  config-server:
    build: ./config-server
    ports: ["8888:8888"]
    environment:
      SPRING_CLOUD_CONFIG_SERVER_GIT_URI: https://github.com/you/configs
```

---

### GenAI tip for Phase 6

The most powerful use of AI in this phase is **architecture decision review**. After designing your service boundaries, paste your architecture diagram description and ask: _"What are the failure modes of this design? Where would you add circuit breakers? What happens if the Inventory Service is down for 10 minutes while orders keep coming in?"_

LLMs are genuinely good at stress-testing distributed system designs because they've ingested enormous amounts of system design literature. Use them as a senior architect to challenge your decisions — not to generate the code, but to find the holes in your thinking before you write a line.

---

### Resources to prioritize

**Sam Newman — Building Microservices** is the definitive book; read chapters 1–4 and 8–10 at minimum. **Microservices.io** (Chris Richardson's site) is the best reference for patterns like Saga, Outbox, and CQRS — bookmark every pattern page. The **Confluent Kafka courses** (free on Confluent developer site) are the best Kafka learning resource, better than any book. For Spring Cloud specifically, the **official Spring Cloud documentation** is actually readable and the samples repository on GitHub is worth cloning and running. **InfoQ's microservices articles** give real-world war stories that no tutorial covers.
