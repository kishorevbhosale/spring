# Spring Component Scanning Example

### Overview
This project demonstrates the use of Spring's `@Component` and `@ComponentScan` annotations to manage beans in the Spring IoC (Inversion of Control) container. Instead of explicitly declaring beans in a configuration class, Spring can automatically detect and register beans using these annotations.

### Key Concepts

1. **`@Component` Annotation**:
    - Marks the class as a Spring-managed bean. In this example, the `Vehicle` class is annotated with `@Component`, meaning it will be automatically picked up by Spring during component scanning.

2. **`@ComponentScan` Annotation**:
    - Configures the base packages to scan for Spring components (e.g., classes annotated with `@Component`). The `ProjectConfig` class uses `@ComponentScan("com.preprationzone.beans")` to scan the `com.preprationzone.beans` package for beans.

3. **IoC Container**:
    - The `AnnotationConfigApplicationContext` is used to bootstrap the Spring IoC container and retrieve beans managed by Spring.

### Execution Flow

1. Spring automatically scans the `com.preprationzone.beans` package for any classes annotated with `@Component`.
2. The `Vehicle` class is detected as a component and registered as a bean in the Spring IoC container.
3. In the `Example4` class, the `Vehicle` bean is retrieved using `context.getBean(Vehicle.class)`.
4. The vehicle's name is retrieved and printed, followed by invoking the `printHello` method, demonstrating how methods on the Spring bean can be accessed.

### How to Run

1. Compile and run the `Example4` class.
2. The Spring IoC container will automatically manage the `Vehicle` bean, and the console will display:
   ```
   Component vehicle name from spring context is :null
   Printing hello from component vehicle beans
   ```

### Important Points

- **Bean Name**: Since no name was set in the `Vehicle` bean, the `getName()` method will return `null`. You can set a name by using the `setName` method if required.
- **Component Scanning**: This approach is useful in large projects where manually declaring each bean in the configuration file is impractical. Spring automates this process by scanning the specified packages.
