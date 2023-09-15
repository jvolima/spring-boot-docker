# Spring Boot + Docker + PostgreSQL

In this repository I made a template to build an application using the stack on title.

## Stack
- Java 17
- Spring Boot 3.0.10
- JPA
- Hibernate
- PostgreSQL

## Prerequisites
- Docker
- Java

## How to use
1. Clone or install the repository
2. ```./mvnw clean package -DskipTests ``` to install the .jar of the project
3. ```docker-compose up -d``` to run the application and the database
4. ```docker ps``` to see if the app and database are running correctly