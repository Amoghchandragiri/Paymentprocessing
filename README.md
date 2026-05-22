# Payment Processing System

A full-stack Payment Processing Management System built using:

- React.js (Frontend)
- Spring Boot (Backend)
- SQL Server (Database)
- REST APIs
- Axios
- JPA / Hibernate

This project allows users to:

- Add payment transactions
- View payment records
- Store payment details in SQL Server
- Connect React frontend with Spring Boot backend using REST APIs

---

# Project Architecture

```text
+-------------------+
|   React Frontend  |
|  (Port: 3000)     |
+---------+---------+
          |
          | Axios HTTP Requests
          v
+-------------------+
| Spring Boot APIs  |
|   (Port: 8080)    |
+---------+---------+
          |
          | JPA / Hibernate
          v
+-------------------+
|   SQL Server DB   |
|   paymentdb       |
+-------------------+
