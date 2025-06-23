# Student Management System – Spring Boot REST API

A simple and powerful Student Management RESTful API built with **Spring Boot**.

## 📚 Features

- ✅ Create Student (`POST /api/student/add`)
- 📖 Get All Students (`GET /api/students`)
- 🔍 Get Student by ID (`GET /api/students/{id}`)
- ✏️ Update Student (`PUT /api/student/update/{id}`)
- ❌ Delete Student (`DELETE /api/student/delete/{id}`)

## 🔧 Tech Stack

- Java 17+
- Spring Boot 3+
- Spring Web
- Spring Data JPA
- MySQL (or H2 for in-memory testing)
- Lombok

## 🚀 Getting Started

### 🔨 Requirements

- Java JDK 17+
- Maven
- MySQL
- IntelliJ IDEA or any IDE

### 🛠️ Setup

1. Clone the repo:
   ```bash
   git clone https://github.com/YOUR_USERNAME/student-management-api.git
   cd student-management-api
2. Configure your application.properties:
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
3. Run the application:
   ```bash
   ./mvnw spring-boot:run
4. Test APIs via Postman or browser.
