# Spring Bean Configuration with `@Primary` Example

This project demonstrates how to resolve ambiguity when multiple beans of the same type exist in the Spring context by using the `@Primary` annotation. It also highlights how to retrieve beans by their names and how Spring uses the primary bean when no specific bean name is provided.

## Overview

In a Spring application, when multiple beans of the same type are registered, Spring needs a way to identify which bean to inject or return when no specific bean name is provided. This can be handled in two ways:

1. **By explicitly naming the bean and retrieving it using the name.**
2. **By designating one bean as the primary bean using the `@Primary` annotation.**

### Key Features

1. **Bean Naming**: Beans are explicitly named using the `@Bean` annotation's `name` or `value` attribute.
2. **Using `@Primary`**: The `@Primary` annotation is used to mark one of the beans as the default, or primary, bean that Spring should use when there are multiple beans of the same type.
3. **Bean Retrieval**: Beans can be retrieved by name, or Spring will automatically use the `@Primary` bean when no name is specified.

## Spring Bean Configuration

The `ProjectConfig` class defines three beans of type `Vehicle`, each with a different name:

- **`vehicle1`**: Named `"audi"`.
- **`vehicle2`**: Named `"bmw"` and marked as `@Primary`, meaning this bean will be used by default when no bean name is specified.
- **`vehicle3`**: Named `"ferrari"`.

### Example Bean Configuration

```java
@Configuration
public class ProjectConfig {

    @Bean(name = "audi")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Primary
    @Bean(value = "bmw")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    @Bean("ferrari")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }
}
