# Example_12 - Singleton Scope in Spring Beans

In this example, the primary change from **Example_11** is the addition of the `@Scope` annotation in the `VehicleService` class. 
This specifies the scope of the bean to be **singleton**, which is the default scope in Spring, but we've explicitly defined it here for clarity.

The key change is:

```java
@Scope(BeanDefinition.SCOPE_SINGLETON)
```

This annotation ensures that only one instance of the `VehicleService` bean is created and shared across the application.

## Main Highlights

- We have explicitly set the bean scope to **singleton** in `VehicleService`, which means the Spring container will create only one instance of the `VehicleService` bean and provide the same instance each time it's requested.

- In the main service, we check if both instances of the `VehicleService` bean have the same memory address, confirming that Spring is indeed using the same bean (singleton pattern).

## Code Sample

### VehicleService.java
```java
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class VehicleService {
    
}
```

### Main.java (Service Check)
In the main service class, we retrieve two instances of the `VehicleService` bean and compare their memory addresses.
```
public class Example12 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleService vehicleServices1 = context.getBean(VehicleService.class);
        VehicleService vehicleServices2 = context.getBean("vehicleService",VehicleService.class);
        System.out.println("Hashcode of the object vehicleServices1 : " +vehicleServices1.hashCode());
        System.out.println("Hashcode of the object vehicleServices2 : " +vehicleServices2.hashCode());
        if(vehicleServices1==vehicleServices2){
            System.out.println("VehicleServices bean is a singleton scoped bean");
        }

    }
}
```


### Output
The output will show that only one instance of the `VehicleService` bean is created, confirming the singleton behavior:

```plaintext
Hashcode of the object vehicleServices1 : 361398902
Hashcode of the object vehicleServices2 : 361398902
VehicleServices bean is a singleton scoped bean
```

## Key Points

- **Singleton Scope**: With `@Scope(BeanDefinition.SCOPE_SINGLETON)`, the Spring container creates only one instance of the `VehicleService` and shares it across the application.

- **Bean Comparison**: When comparing the two instances of the bean, they will have the same address, indicating that Spring is using the singleton pattern.

