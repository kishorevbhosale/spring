# Spring Dependency Injection Example

This project demonstrates basic dependency injection using Spring's `@Configuration` and `@Bean` annotations. It creates simple `Person` and `Vehicle` beans, where a `Person` has a dependency on a `Vehicle`.

## Project Structure

- `beans/Person.java`: Defines a `Person` class with a `name` and a dependency on a `Vehicle`.
- `beans/Vehicle.java`: Defines a `Vehicle` class with a `name` and a method to print a simple message.
- `config/ProjectConfig.java`: Contains the Spring configuration class where the `Person` and `Vehicle` beans are defined.
- `Example8.java`: The main class that initializes the Spring context, retrieves the beans, and prints out information about them.

## Spring Configuration

The configuration is done using the `@Configuration` and `@Bean` annotations in the `ProjectConfig` class:

## How Dependency Injection Works

1. **Vehicle Bean**: A `Vehicle` bean is created with its name set to "BMW".
2. **Person Bean**: A `Person` bean is created with its name set to "Mithil", and the `Vehicle` bean is injected into the `Person` bean.
3. Spring automatically manages the lifecycle and dependencies of these beans using its Application Context.

## Running the Application

Output:

```
Person bean is created by Spring
Vehicle bean is created by Spring
Person name from spring context is : Mithil
Vehicle name from spring context is : BMW
Vehicle that person own is : Vehicle(name=BMW)
```


## Key Concepts

- **Dependency Injection**: Spring injects dependencies between beans using the `@Bean` annotation. This example demonstrates constructor-based injection and the use of a configuration class to define beans.
- **Spring Context**: The `AnnotationConfigApplicationContext` is used to bootstrap the Spring application context and retrieve beans.

