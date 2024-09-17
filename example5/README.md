# Spring `@PostConstruct` and `@PreDestroy` Example

### Overview
This project showcases the use of two important annotations in Spring: `@PostConstruct` and `@PreDestroy`. These annotations allow you to define lifecycle methods for your Spring beans, where initialization and cleanup tasks can be managed easily.

- **`@PostConstruct`**: Runs after the bean has been created and dependencies have been injected.
- **`@PreDestroy`**: Runs just before the bean is removed from the Spring context, typically when the application context is closed.

### Key Annotations

- **`@PostConstruct`**: Automatically executes a method after the bean initialization process is complete. In this example, it sets the default name of the `Vehicle` bean to "BMW".

- **`@PreDestroy`**: Automatically executes a method just before the bean is destroyed, typically when the Spring application context is closing. In this case, it logs a message indicating that the `Vehicle` bean is being destroyed.

### Execution Flow

1. **Bean Initialization:**
   - The Spring IoC container creates and manages the `Vehicle` bean.
   - After the `Vehicle` bean is fully initialized, the `initialize()` method (annotated with `@PostConstruct`) sets the vehicle's name to "BMW".

2. **Application Lifecycle Management:**
   - The application retrieves the `Vehicle` bean from the Spring context and interacts with it.
   - Once the application context is closed using `context.close()`, the method annotated with `@PreDestroy` is called, logging the destruction process.

### How to Run

1. Compile and run the `Example5` class.
2. The console output will display the following:
   ```
   Component vehicle name from spring context is :BMW
   Printing hello from component vehicle beans
   Destroying vehicle
   ```

### Important Notes

- **Automatic Initialization with `@PostConstruct`**: You don't need to call the initialization method manually. Spring automatically invokes the method annotated with `@PostConstruct` after the bean has been created and its dependencies injected.

- **Automatic Cleanup with `@PreDestroy`**: Spring ensures that the `destroy()` method is invoked before the bean is removed from the context. This is particularly useful for closing resources or performing any cleanup tasks.

- **Context Closing**: The `context.close()` method triggers the `@PreDestroy` method, simulating the application shutdown phase where beans are cleaned up.
