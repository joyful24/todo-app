# Todo Application

A simple and clean web application built with the Spring Boot framework to manage your everyday tasks. This project helps you keep track of what needs to be done, ensuring you stay organized and productive.

## Features
- Create new tasks with descriptions.
- View a list of all your tasks.
- Mark tasks as 'completed'.
- Delete tasks you no longer need.

## Tech Stack
- **Framework:** Spring Boot
- **Template Engine:** Thymeleaf
- **Styling:** Bootstrap CSS
- **Database:** MySQL
- **Development IDE:** IntelliJ IDEA

## Getting Started

### Prerequisites
- Java (JDK 17 or newer)
- Apache Maven
- A running instance of MySQL server

### How to Run
1.  **Clone the repository:**
    ```sh
    git clone <your-repository-url>
    ```
2.  **Configure Database:**
    - Open the `src/main/resources/application.properties` file.
    - Update the `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` to match your local MySQL configuration.

3.  **Run the application:**
    - You can run the project directly from your IntelliJ IDEA or by using the Maven command line:
    ```sh
    mvn spring-boot:run
    ```
The application will be running at `http://localhost:8080`.
