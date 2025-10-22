# 🧩 Spring Cloud TodoCode Course  

Exercise of the TodoCode Academy Spring Cloud course by Luisina de Paula.  

**Academy Website:** [https://todocodeacademy.com/](https://todocodeacademy.com/)

---

## 📘 Exercise 01 - Library Microservices API  
Two Spring Boot microservices to manage books and authors, connected through **Spring Cloud OpenFeign** for inter-service communication.

---

## 💡 What it does  
- Manage **books** and **authors** as independent microservices.  
- Demonstrates communication between services using **Feign Clients**.  
- Each microservice has its own database and REST API.  
- `/books/{id}/with-authors` endpoint retrieves a book along with full author details.

---

## 🗄️ Databases  

### **library_books**
**Book:**  
`id`, `isbn`, `title`, `year`, `description`, `authorIds` (list of IDs referring to authors)

### **library_authors**
**Author:**  
`id`, `fullName`, `birthDate`, `bookIds` (list of IDs referring to books)

---

## 🔗 Endpoints  

### 📚 Books (Book Service – port 9002)
| Method | Endpoint | Description |
|---------|-----------|-------------|
| POST | `/books` | Create a new book |
| GET | `/books` | Get all books |
| GET | `/books/{id}` | Get book by ID |
| PUT | `/books/{id}` | Update a book |
| DELETE | `/books/{id}` | Delete a book |
| GET | `/books/{id}/with-authors` | Get book with author details (via Feign) |

### ✍️ Authors (Author Service – port 9001)
| Method | Endpoint | Description |
|---------|-----------|-------------|
| POST | `/authors` | Create a new author |
| GET | `/authors` | Get all authors |
| GET | `/authors/{id}` | Get author by ID |
| PUT | `/authors/{id}` | Update an author |
| DELETE | `/authors/{id}` | Delete an author |

---
