# E-Commerce Order & Analytics System

A robust, RESTful backend service built with **Java** and **Spring Boot** to manage e-commerce transaction data, customer purchase histories, and paginated product searches backed by a **PostgreSQL** database.

## 🛠️ Tech Stack & Tools
* **Language:** Java
* **Framework:** Spring Boot, Spring Data JPA
* **Database:** PostgreSQL
* **Tooling:** Eclipse IDE, Maven, Git/GitHub

## 🏗️ Key Features & Architecture
* **Layered Architecture:** Implements a strict separation of concerns using Entities, Repositories, Services, and REST Controllers.
* **Dynamic Pagination & Sorting:** Integrated Spring's `Pageable` and `PageRequest` interfaces to support custom dynamic sorting across fields (e.g., unit price, customer ID, invoice numbers).
* **Defensive Fallback Design:** Configured `@PageableDefault` annotations across API controllers to prevent edge-case errors when pagination query parameters are omitted.
* **Optimized JPA Queries:** Custom derived repository methods (`findByCustomerID`, `findByInvoiceNo`, `findByCountry`) with native pagination support.

## 📡 API Endpoints Summary

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/products` | View all products (Default: page 0, size 20) |
| `GET` | `/products/findInvoiceNo/search?invoiceNo=...` | Search products by invoice number |
| `GET` | `/products/filterByCountry/{country}` | Filter transactions by country with sorting |
| `GET` | `/products/SearchByCustomerIDHistory/{id}` | Retrieve paginated purchase history for a customer |

## 🚀 Getting Started

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/Embbrz/order-system.git](https://github.com/Embbrz/order-system.git)