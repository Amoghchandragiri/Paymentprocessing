# 💳 Payment Processing System

A Full-Stack Payment Processing Management System developed using **React.js**, **Spring Boot**, and **SQL Server**.

This application enables users to manage payment transactions through a modern web interface connected to a robust backend API and relational database.

---

# 🚀 Project Overview

The Payment Processing System is designed to simulate a real-world financial transaction management platform where users can:

- Add payment transactions
- View payment records
- Store transaction details securely in SQL Server
- Connect frontend and backend using REST APIs
- Perform CRUD operations efficiently

This project demonstrates complete Full-Stack Development using enterprise-level technologies.

---

# 🏗️ System Architecture

```text
+----------------------+
|   React Frontend     |
|     Port : 3000      |
+----------+-----------+
           |
           | Axios HTTP Requests
           v
+----------------------+
|  Spring Boot Backend |
|     Port : 8080      |
+----------+-----------+
           |
           | JPA / Hibernate
           v
+----------------------+
|    SQL Server DB     |
|      paymentdb       |
+----------------------+
```

---

# 🛠️ Tech Stack

## Frontend
- React.js
- Axios
- JavaScript
- HTML5
- CSS3

## Backend
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- REST APIs
- Gradle

## Database
- Microsoft SQL Server

## Tools & IDEs
- IntelliJ IDEA
- VS Code
- SQL Server Management Studio (SSMS)
- Git & GitHub
- Postman

---

# ✨ Features

## ✅ Payment Management
- Add new payment transactions
- View all stored payments
- Persist records in SQL Server database

## ✅ REST API Integration
- Frontend communicates with backend using Axios
- Backend exposes REST endpoints using Spring Boot

## ✅ Database Connectivity
- SQL Server integration using JDBC Driver
- ORM mapping using Hibernate & JPA

## ✅ Full Stack Architecture
- React frontend
- Spring Boot backend
- SQL Server database

---

# 📂 Project Structure

```text
Paymentprocessing/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/paymentprocessing/
│   │   │
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── repository/
│   │   │   ├── entity/
│   │   │   ├── config/
│   │   │   └── PaymentprocessingApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│
├── payment-frontend/
│   ├── public/
│   ├── src/
│   │   ├── components/
│   │   ├── services/
│   │   ├── App.js
│   │   └── index.js
│   │
│   └── package.json
│
└── README.md
```

---

# 🗄️ Database Schema

## payments Table

| Column Name | Data Type |
|-------------|------------|
| id | bigint |
| sender_name | varchar |
| receiver_name | varchar |
| amount | decimal |
| transaction_type | varchar |
| status | varchar |

---

# ⚙️ Backend Architecture

## 🔹 Controller Layer
Handles incoming HTTP requests and API endpoints.

### Example:
```java
@RestController
@RequestMapping("/api/payments")
public class PaymentController {
}
```

---

## 🔹 Service Layer
Contains business logic implementation.

### Example:
```java
@Service
public class PaymentService {
}
```

---

## 🔹 Repository Layer
Handles database operations using JPA Repository.

### Example:
```java
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
```

---

## 🔹 Entity Layer
Maps Java objects to SQL Server database tables.

### Example:
```java
@Entity
@Table(name = "payments")
public class Payment {
}
```

---

# 🎨 Frontend Architecture

## 🔹 PaymentForm.js
- Accepts payment details from user
- Sends POST request to backend

## 🔹 PaymentList.js
- Displays payment records
- Fetches data from backend APIs

## 🔹 PaymentService.js
- Handles Axios API calls
- Connects frontend with backend

---

# 🔗 REST API Endpoints

## ✅ Get All Payments

```http
GET /api/payments
```

---

## ✅ Create Payment

```http
POST /api/payments
```

### Sample Request Body

```json
{
  "senderName": "Amogh",
  "receiverName": "Rahul",
  "amount": 5000,
  "transactionType": "UPI",
  "status": "SUCCESS"
}
```

---

# 🔧 Installation & Setup Guide

# 1️⃣ Clone Repository

```bash
git clone https://github.com/Amoghchandragiri/Paymentprocessing.git
```

Repository:

:contentReference[oaicite:0]{index=0}

---

# 2️⃣ Backend Setup

## Open backend project

```bash
cd Paymentprocessing
```

---

## Configure Database

Update `application.properties`

```properties
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=paymentdb;encrypt=true;trustServerCertificate=true

spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## Run Spring Boot Application

```bash
./gradlew bootRun
```

Backend Server:

```text
http://localhost:8080
```

---

# 3️⃣ Frontend Setup

## Open frontend folder

```bash
cd payment-frontend
```

---

## Install Dependencies

```bash
npm install
```

---

## Start React Application

```bash
npm start
```

Frontend Server:

```text
http://localhost:3000
```

---

# 🌐 CORS Configuration

```java
@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {

        return new WebMvcConfigurer() {

            @Override
            public void addCorsMappings(CorsRegistry registry) {

                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:3000")
                        .allowedMethods("*");
            }
        };
    }
}
```

---

# 🧪 Testing

## Backend Testing
- Tested APIs using Postman
- Verified database insertion in SQL Server

## Frontend Testing
- Verified payment form submissions
- Verified API integration with Axios



# 📚 Learning Outcomes

This project demonstrates:

- Full-Stack Web Development
- REST API Development
- CRUD Operations
- SQL Server Integration
- Spring Boot Backend Development
- React State Management
- Axios API Integration
- JPA & Hibernate ORM
- Client-Server Communication
- Enterprise Application Architecture

---

# 📸 Screenshots

## Add screenshots here

Suggested screenshots:
- React Frontend UI
- Payment Form
- Payment Records Table
- SQL Server Database Table
- Postman API Testing



# 📄 License

This project is developed for learning, academic, and portfolio purposes.
