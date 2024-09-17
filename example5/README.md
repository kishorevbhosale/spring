# README: Spring `@PostConstruct` Example

### Overview
This project demonstrates the use of the `@PostConstruct` annotation in Spring. The annotation is used to perform initialization tasks after the Spring bean has been created and its dependencies have been injected. In this example, the `Vehicle` bean is initialized with a default name using the `@PostConstruct` method.

### Key Annotations

- **`@PostConstruct`**: This annotation is used on a method that needs to be executed after dependency injection is done to perform any initialization. In this case, it sets the name of the vehicle to "BMW" after the bean is created.

### Execution Flow

1. The Spring IoC container initializes the `Vehicle` bean.
2. After the bean is created and its dependencies are injected, the method annotated with `@PostConstruct` is executed.
3. The `initialize()` method sets the default name of the vehicle to "BMW".
4. In the `Example5` class, the `Vehicle` bean is retrieved, and its name is printed, followed by invoking the `printHello()` method.

   ```
   Component vehicle name from spring context is :BMW
   Printing hello from component vehicle beans
   ```

### Important Notes

- **Automatic Initialization**: The `@PostConstruct` method is automatically invoked after the bean is fully initialized, ensuring that any custom setup or initialization logic is executed.
- **No Explicit Invocation**: There's no need to call the `initialize()` method explicitly; Spring manages it behind the scenes.
