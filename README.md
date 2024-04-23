# School Management API (Java Spring Boot)

This repository contains the source code for a School Management System API implemented in Java Spring Boot. The API provides CRUD operations for managing students, parents, and teachers.

## Requirements

- Java Development Kit (JDK) installed on your machine
- Maven installed on your machine
- MySQL database server running locally
- Postman (or any similar tool) for testing APIs
  
## Features

- CRUD operations for managing students, parents, and teachers.
- RESTful API endpoints for easy integration with other systems.
- MySQL database integration for data persistence.
- Modular and scalable project structure.

## Running the Project Locally

To run the School Management API locally, follow these steps:

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/school-management-api-java-spring-boot.git
   cd school-management-api-java-spring-boot
   ```

2. **Configure MySQL Database:**
   - Create a MySQL database for the project.
   - Update the `application.properties` file in `src/main/resources` with your MySQL database configuration.

3. **Update the database configuration:**
    - Open the `application.properties` file located in the `src/main/resources` directory.
    - Modify the `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` properties to match your MySQL database configuration.

4. **Build the project using Maven:**

    ```
    mvn clean package
    ```

5. **Run the project:**

    ```
    java -jar target/<jar-file-name>.jar
    ```

6. **The application should now be running locally. You can access it using the following base URL:**

    ```
    http://localhost:8080
    ```

## Error Handling

- Proper error handling is implemented in the API endpoints to handle failures gracefully.
- HTTP status codes and error messages are returned in case of failures, providing meaningful feedback to clients.

## API Endpoints

- **Students:**
  - `GET /api/students`: Get all students.
  - `GET /api/students/{id}`: Get student by ID.
  - `POST /api/students`: Create a new student.
  - `PUT /api/students/{id}`: Update student information.
  - `DELETE /api/students/{id}`: Delete student by ID.

- **Parents:**
  - `GET /api/parents`: Get all parents.
  - `GET /api/parents/{id}`: Get parent by ID.
  - `POST /api/parents`: Create a new parent.
  - `PUT /api/parents/{id}`: Update parent information.
  - `DELETE /api/parents/{id}`: Delete parent by ID.

- **Teachers:**
  - `GET /api/teachers`: Get all teachers.
  - `GET /api/teachers/{id}`: Get teacher by ID.
  - `POST /api/teachers`: Create a new teacher.
  - `PUT /api/teachers/{id}`: Update teacher information.
  - `DELETE /api/teachers/{id}`: Delete teacher by ID.

## Contributing

Contributions to the School Management API are welcome! If you find any bugs or have suggestions for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
