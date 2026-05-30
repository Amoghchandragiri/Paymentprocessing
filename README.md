# 💳 Payment Processing System

A full-stack **Payment Processing System** built using **Spring Boot**, **Spring Security**, **JWT Authentication**, **Spring Data JPA**, **SQL Server**, and **React.js**.

This project demonstrates secure payment transaction management with user authentication, authorization, REST APIs, and database integration.

---

## 🚀 Features

### Authentication & Security
- User Registration
- User Login
- Password Encryption using BCrypt
- JWT Token Generation
- Spring Security Integration
- Protected API Endpoints

### Payment Management
- Create Payment Transactions
- View All Transactions
- Track Transaction Details
- Store Payment Records in SQL Server
- RESTful API Architecture

### Database
- Microsoft SQL Server Integration
- JPA/Hibernate ORM
- Automatic Entity Mapping
- Repository Pattern

---

# 🏗️ Tech Stack

## Backend
- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- JWT (JSON Web Token)
- Lombok

## Frontend
- React.js
- Axios
- Bootstrap / CSS

## Database
- Microsoft SQL Server

## Build Tool
- Gradle

---

# 📂 Project Structure

```text
payment-processing-system/
│
├── backend/
│   ├── controller/
│   │   ├── AuthController.java
│   │   └── PaymentController.java
│   │
│   ├── entity/
│   │   ├── User.java
│   │   └── Payment.java
│   │
│   ├── repository/
│   │   ├── UserRepository.java
│   │   └── PaymentRepository.java
│   │
│   ├── security/
│   │   ├── JwtUtil.java
│   │   ├── JwtFilter.java
│   │   └── SecurityConfig.java
│   │
│   ├── service/
│   │
│   └── PaymentprocessingApplication.java
│
├── frontend/
│   ├── components/
│   ├── pages/
│   ├── App.js
│   └── package.json
│
└── README.md
```

---

# ⚙️ Installation & Setup

## 1️⃣ Clone Repository

```bash
git clone https://github.com/yourusername/payment-processing-system.git

cd payment-processing-system
```

---

## 2️⃣ Configure SQL Server

Create Database:

```sql
CREATE DATABASE paymentdb;
```

---

## 3️⃣ Configure application.properties

```properties
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=paymentdb;encrypt=true;trustServerCertificate=true

spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## 4️⃣ Run Backend

```bash
./gradlew bootRun
```

Application starts at:

```text
http://localhost:8080
```

---

## 5️⃣ Run Frontend

```bash
cd frontend

npm install

npm start
```

Frontend starts at:

```text
http://localhost:3000
```

---

# 🔐 Authentication APIs

## Register User

### Request

```http
POST /auth/register
```

### Request Body

```json
{
    "username":"amogh",
    "password":"password123"
}
```

### Response

```text
User Registered Successfully
```

---

## Login User

### Request

```http
POST /auth/login
```

### Request Body

```json
{
    "username":"amogh",
    "password":"password123"
}
```

### Response

```json
{
    "token":"eyJhbGciOiJIUzI1NiJ9..."
}
```

---

# 💰 Payment APIs

## Create Payment

### Request

```http
POST /payments
```

### Headers

```http
Authorization: Bearer <JWT_TOKEN>
```

### Request Body

```json
{
    "senderName":"Amogh",
    "receiverName":"Rahul",
    "amount":1000,
    "transactionType":"UPI"
}
```

### Response

```json
{
    "id":1,
    "senderName":"Amogh",
    "receiverName":"Rahul",
    "amount":1000,
    "status":"SUCCESS"
}
```

---

## Get All Payments

### Request

```http
GET /payments
```

### Headers

```http
Authorization: Bearer <JWT_TOKEN>
```

### Response

```json
[
  {
    "id":1,
    "senderName":"Amogh",
    "receiverName":"Rahul",
    "amount":1000
  }
]
```

---

# 🗄️ Database Schema

## User Table

| Column | Type |
|----------|----------|
| id | BIGINT |
| username | VARCHAR |
| password | VARCHAR |
| role | VARCHAR |

---

## Payment Table

| Column | Type |
|----------|----------|
| id | BIGINT |
| sender_name | VARCHAR |
| receiver_name | VARCHAR |
| amount | DOUBLE |
| status | VARCHAR |
| transaction_type | VARCHAR |
| created_at | TIMESTAMP |

---

# 🧪 Sample Workflow

### Step 1

Register User

```http
POST /auth/register
```

### Step 2

Login User

```http
POST /auth/login
```

### Step 3

Receive JWT Token

```json
{
  "token":"eyJhbGc..."
}
```

### Step 4

Use Token in Authorization Header

```http
Authorization: Bearer eyJhbGc...
```

### Step 5

Create Payment Transaction

```http
POST /payments
```

### Step 6

View All Transactions

```http
GET /payments
```

---

# 🔒 Security Implementation

- BCrypt Password Encryption
- JWT Based Authentication
- Stateless Session Management
- Spring Security Filters
- Protected REST Endpoints
- Role-Based Foundation Ready for Future Enhancements

---

# 📈 Future Enhancements

- Role Based Access Control (ADMIN/USER)
- Payment Status Tracking
- Transaction History Dashboard
- Refund Management
- Email Notifications
- OTP Verification
- Swagger API Documentation
- Docker Deployment
- CI/CD Pipeline
- Microservices Architecture
- Payment Gateway Integration (Razorpay/Stripe)

---

# 🎯 Learning Outcomes

This project demonstrates:

- Spring Boot REST API Development
- Spring Security Authentication
- JWT Authorization
- Database Integration using JPA/Hibernate
- SQL Server Connectivity
- Full Stack Development with React
- Secure Password Storage
- Enterprise Application Architecture

---

