# Spring Cloud Microservices TodoCode Course

My solutions for the TodoCode Academy Spring Cloud Microservices course by Luisina de Paula.

**Academy Website:** https://todocodeacademy.com/

---

## Projects

### Exercise 01 - Library Management System
Microservices architecture for managing books and authors.

- **Author Service:** CRUD for authors with birth dates
- **Book Service:** CRUD for books with ISBN validation
- **Feign Client** communication between services
- **RESTful APIs** with proper DTOs
- **MySQL + JPA** for persistence

[View project →](./exercise-01-library-management)

---

## Tech Stack

- Java 17
- Spring Boot 3.x
- Spring Cloud (Feign, Eureka, Gateway)
- Spring Data JPA
- MySQL
- Maven
- Lombok

---

## Running the Projects

Each exercise contains independent microservices. To run them:

1. Start MySQL server
2. Create required databases
3. Run each microservice separately
4. Services communicate via Feign Client

---
