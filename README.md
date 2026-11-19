# ☕ spring-boot-employee-management-api

[![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io)
[![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker)](https://docker.com)

Enterprise Spring Boot RESTful API for Employee & Department Management with JPA/Hibernate.

## Architecture
- **Layered Enterprise Pattern:** Controller -> Service -> Repository -> Entity.
- **Data Validation:** Strict email and compensation validation constraints.
- **Concurrent Repository:** Thread-safe in-memory store for high-throughput concurrency.
