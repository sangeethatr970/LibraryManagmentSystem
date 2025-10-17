# 📘 Learning Management System (LMS)

A **Spring Boot-based Learning Management System (LMS)** designed to simplify the process of managing courses, students, and instructors. This project provides a complete backend solution for educational institutions, enabling smooth handling of course registration, assignments, and performance tracking.

---

## 🚀 Features

- 👩‍🏫 **Admin Module**
  - Manage users (students, instructors)
  - Create, update, or delete courses
  - Monitor course progress and performance

- 🎓 **Student Module**
  - Register and login securely
  - Enroll in available courses
  - Submit assignments and view grades
  - View personal dashboard and course details

- 📚 **Instructor Module**
  - Manage courses and lessons
  - Upload learning materials and assignments
  - Grade students and provide feedback

- 🔐 **Security**
  - Role-based authentication and authorization using **Spring Security**
  - Password encryption with **BCrypt**

- 💾 **Database**
  - Fully integrated with **MySQL** using **Spring Data JPA**

- ⚙️ **Technologies Used**
  - Spring Boot
  - Spring MVC
  - Spring Security
  - Hibernate / JPA
  - MySQL Database
  - RESTful APIs
  - Maven
  - Swagger (for API Documentation)

---

## 🏗️ Project Structure

- `com.example.lms`
  - `controller` - REST controllers for handling HTTP requests
  - `service` - Business logic and service layer
  - `repository` - Data access layer using Spring Data JPA
  - `model` - Entity classes representing database tables
  - `config` - Configuration classes for security and application settings
  - `dto` - Data Transfer Objects for API communication
  - `exception` - Custom exception handling
    - `util` - Utility classes and helpers
- `resources`
  - `application.properties` - Application configuration file
  - `data.sql` - Initial data for the database (optional)
    - `schema.sql` - Database schema (optional)
---
## 📦 Getting Started

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/lms.git
   cd lms
   ```

2. **Configure Database**
   - Update `application.properties` with your database credentials.

3. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the API**
   - Swagger UI: `http://localhost:8080/swagger-ui.html`
   - Postman Collection: Import the provided Postman collection for testing the API endpoints.
---
## 🤝 Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.
---
## 📄 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
---
## 📞 Contact
For inquiries or support, please contact:
- Email: trsangeetha99@gmail.com
- Phone: +91 9901587287
