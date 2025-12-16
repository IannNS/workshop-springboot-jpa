# Workshop: Spring Boot & JPA (Shop Workflow)

[![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.0-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)](https://www.postgresql.org/)

## About

This project is a RESTful Web Service application built to simulate the backend workflow of an e-commerce shop. It was developed as a workshop to master **Object-Relational Mapping (ORM)** using **JPA** and **Hibernate** within the **Spring Boot** ecosystem.

The application manages users, orders, products, and categories, demonstrating complex entity relationships and robust exception handling.

## Technologies Used

- **Java 17+**: Core programming language.
- **Spring Boot**: Framework for rapid application development.
- **Spring Data JPA**: For data persistence and ORM.
- **Hibernate**: The underlying JPA implementation.
- **H2 Database**: In-memory database for testing and development profiles.
- **PostgreSQL**: Relational database for the production profile.
- **Maven**: Dependency management and build tool.
- **Apache Tomcat**: Embedded web server.

## Domain Model

The project implements a comprehensive domain model with the following entities and relationships:

- **User**: Represents clients with contact info and a list of orders.
- **Order**: Contains status (WAITING, PAID, SHIPPED, etc.), timestamp, and payment details.
- **Category**: Classifies products (Many-to-Many relationship with Product).
- **Product**: Items available for purchase.
- **OrderItem**: Represents the link between an Order and a Product, including quantity and price at the time of purchase.
- **Payment**: One-to-One association with Order.

## Features

- **CRUD Operations**: Full Create, Read, Update, and Delete support for Users, Products, Categories, and Orders.
- **Database Seeding**: Automatic population of the database with dummy data for testing purposes.
- **Exception Handling**: Global exception handling for resource not found and database integrity violations.
- **DTO Pattern**: Use of Data Transfer Objects to decouple the internal domain model from the external API (optional/if implemented).
