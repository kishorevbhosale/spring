# README: Spring Dynamic Bean Registration Example

### Overview

This project demonstrates how to dynamically register beans in a Spring application context using `Supplier`. The decision of which bean to register (`Audi` or `BMW`) is made based on a random number. The program also handles potential exceptions when trying to retrieve non-existent beans.

### Key Concepts

1. **Dynamic Bean Registration**:
    - Using `context.registerBean()`, we can register beans dynamically in the Spring context at runtime. This allows for flexible bean management and creation.

2. **Supplier Interface**:
    - A `Supplier<Vehicle>` is used to create and supply the beans dynamically, either for the `Audi` or `BMW` vehicle.

3. **Random Logic**:
    - A random number is generated, and based on whether the number is even or odd, either the `Audi` or `BMW` bean is registered.

4. **Bean Retrieval with Exception Handling**:
    - The program attempts to retrieve both beans (`Audi` and `BMW`). If a bean doesn't exist, a `NoSuchBeanDefinitionException` is caught, and an error message is displayed.

### Execution Flow

1. **Dynamic Bean Creation**:
    - Two suppliers are created, one for `Audi` and another for `BMW`. Based on a randomly generated number, either the `Audi` or `BMW` vehicle is registered as a Spring bean.

2. **Exception Handling**:
    - The code handles scenarios where one of the beans might not have been registered. This is achieved by catching the `NoSuchBeanDefinitionException`.

3. **Bean Printing**:
    - Once the beans are registered and retrieved, their names (`Audi` or `BMW`) are printed based on the random logic.


### Output Example

If the random number `n` is 4 (even), you will see:
```
Random number : 4
Programming Vehicle name from Spring Context is: Audi
```

If the random number `n` is 3 (odd), you will see:
```
Random number : 3
Programming Vehicle name from Spring Context is: BMW
```


### Important Notes

- **Dynamic Bean Registration**: The `registerBean` method allows registering beans on the fly, which gives flexibility for applications that need to decide at runtime which beans should be present.

- **Exception Handling**: The use of `NoSuchBeanDefinitionException` ensures that the program doesn't crash when trying to access a bean that hasn't been registered.

- **Randomization**: The randomness in the bean registration simulates real-world scenarios where some decisions about bean registration may happen dynamically based on external factors.

