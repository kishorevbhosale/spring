# Spring Dependency Injection Example with Annotations

This project demonstrates how to use Spring's dependency injection with annotations like `@Component` and `@Autowired`. It shows how beans can be automatically detected and injected into other beans without explicitly defining them in a configuration class.

## Project Overview

- **Vehicle Class**: A Spring-managed bean (`@Component`) representing a `Vehicle` with a default name set to "BMW".
- **Person Class**: A Spring-managed bean (`@Component`) representing a `Person` with a default name set to "Mithil". This bean has an injected dependency on the `Vehicle` class.
- **ProjectConfig Class**: A Spring configuration class (`@Configuration`) that uses `@ComponentScan` to automatically detect and configure beans within the specified package.
- **Main Class (Example9.java)**: The entry point that initializes the Spring context, retrieves the beans, and outputs their properties.

## Key Concepts

1. **Component Scanning**:
    - The `@ComponentScan` annotation in the `ProjectConfig` class tells Spring to scan the `com.preprationzone.beans` package for classes annotated with `@Component`.
    - Both `Person` and `Vehicle` classes are annotated with `@Component`, making them Spring-managed beans.

2. **Autowired Dependency Injection**:
    - The `@Autowired` annotation in the `Person` class automatically injects the `Vehicle` bean into the `Person` bean.

3. **Spring Application Context**:
    - `AnnotationConfigApplicationContext` is used to initialize the Spring container with the configuration provided by the `ProjectConfig` class.
    - Beans (`Person` and `Vehicle`) are retrieved from the Spring context and their properties are printed.

## Running the Application


Output:

```
Vehicle bean is created by spring
Person bean is created by Spring
Person name from spring context is : Mithil
Vehicle name from spring context is : BMW
Vehicle that person own is : Vehicle(name=BMW)
```

## Key Benefits of the Approach

- **No XML Configuration**: The project is fully annotation-based, making it simpler and more modern.
- **Automatic Bean Detection**: By using `@ComponentScan`, Spring automatically discovers and configures the beans, reducing the need for manual bean declaration.
- **Loose Coupling**: `@Autowired` helps in injecting dependencies, keeping the classes loosely coupled and easy to test.
