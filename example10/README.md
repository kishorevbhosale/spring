# Spring Dependency Injection Example with Annotations

The @Qualifier 
## Key Concepts

1. **@Qualifier**:
    - annotation is used to specify exactly which bean should be autowired when multiple beans of the same type are available. You attach @Qualifier to the field, constructor, or method where the bean is injected, and provide the name of the specific bean to inject.

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
