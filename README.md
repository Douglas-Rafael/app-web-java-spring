<div align="center">
  
![project-screen-match-logo](https://github.com/Douglas-Rafael/app-web-java-spring/assets/137113815/8a12d979-1758-4b31-a4f4-f01c7d9bbb43)

# ScreenMatch - Simple Movie CRUD Project

</div>
 
[![Java Version](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/technologies/javase-downloads.html)
[![Spring Boot Version](https://img.shields.io/badge/Spring%20Boot-3.1.4-brightgreen)](https://spring.io/projects/spring-boot)

## Description

ScreenMatch is a simple Spring Boot project that demonstrates basic CRUD (Create, Read, Update, Delete) operations for managing movies.

## Technologies Used

- Java 17
- Spring Boot 3.1.4
- Thymeleaf
- MySQL
- Flyway
- Lombok

## Configuration

### Prerequisites

- [JDK 17](https://www.oracle.com/br/java/technologies/downloads/#jdk17-windows) installed
- [Maven](https://maven.apache.org/download.cgi) installed
- [MySQL](https://dev.mysql.com/downloads/installer/) installed and configured

### Database Configuration

Edit the database connection settings in the `application.properties` file.

```properties
spring.datasource.url=jdbc:mysql://localhost/screenmatch?createDatabaseIfNotExist=true
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.mvc.hiddenmethod.filter.enabled=true
```
## Running the Project

Clone the repository and navigate to the project directory. Then, run the following command:

```
mvn spring-boot:run
```

The application will be available at http://localhost:8080/movies
