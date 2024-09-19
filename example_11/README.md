### Problem Statement

Design a **Spring Boot** application that models a **Person** who owns a **Vehicle**, with the **Vehicle** having various components like **Speakers** and **Tyres**. The system should allow the vehicle to perform actions such as playing music and moving. Multiple implementations of the **Speakers** and **Tyres** interfaces should be available, and the system should handle selecting the appropriate components. Moreover, this selection should be flexible, with the ability to prioritize default components using annotations like `@Primary`, while allowing manual overrides with `@Qualifier`.

### Solution Overview

This project leverages **Spring's Dependency Injection (DI)** mechanism and annotations like `@Autowired`, `@Component`, `@Primary`, and `@Qualifier` to manage the relationships between objects (beans). The system is designed to:
1. **Autowire dependencies** between beans.
2. **Manage multiple bean implementations** of the same type.
3. **Prioritize default components** using `@Primary`.
4. Allow flexibility for bean selection using `@Qualifier`.

---

### Code Explanation

#### 1. **Person Class**
```java
@Component
@Getter
@Setter
@Data
public class Person {
    private final Vehicle vehicle;
    private String name = "Mithil";

    @Autowired
    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
```
- **Functionality**: Represents a person who owns a vehicle.
- **Autowiring**: The constructor is annotated with `@Autowired` to inject the `Vehicle` dependency.

---

#### 2. **Vehicle Class**
```java
@Component
@Getter
@Setter
@ToString
public class Vehicle {
    private final VehicleService vehicleService;
    private String name = "BMW";

    @Autowired
    public Vehicle(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }
}
```
- **Functionality**: Represents a vehicle that belongs to the person.
- **Autowiring**: Injects a `VehicleService` instance that controls the vehicle's functionalities (like playing music or moving).
---

#### 3. **Speakers Interface and Implementations**
```java
public interface Speakers {
    String makeSound();
}

@Component
public class BoseSpeakers implements Speakers {
    public String makeSound() {
        return "Playing music with Bose speakers";
    }
}

@Component
@Primary
public class SonySpeakers implements Speakers {
    public String makeSound() {
        return "Playing music with Sony speakers";
    }
}
```
- **Functionality**: Represents the speakers used in the vehicle to play music.
- **Multiple Implementations**:
   - `BoseSpeakers`: Plays music with Bose speakers.
   - `SonySpeakers`: Plays music with Sony speakers, marked as `@Primary` which makes it the default speaker type.
- **@Primary Annotation**: Ensures that `SonySpeakers` is selected as the default when no specific speaker type is requested.

---

#### 4. **Tyres Interface and Implementations**
```java
public interface Tyres {
    String rotate();
}

@Component
public class BridgeStoneTyres implements Tyres {
    public String rotate() {
        return "Vehicle moving with BridgeStone tyres";
    }
}

@Component
@Primary
public class MichelinTyres implements Tyres {
    public String rotate() {
        return "Vehicle moving with Michelin tyres";
    }
}
```
- **Functionality**: Represents the tyres used by the vehicle.
- **Multiple Implementations**:
   - `BridgeStoneTyres`: A tyre implementation for vehicle movement.
   - `MichelinTyres`: Another implementation, marked as `@Primary`, making it the default choice.
- **@Primary Annotation**: Ensures `MichelinTyres` is the default tyre when no specific one is requested.

---

#### 5. **VehicleService Class**
```java
@Component
public class VehicleService {

   private final Speakers speakers;
   private final Tyres tyres;

   @Autowired
   public VehicleService(Speakers speakers, Tyres tyres) {
      this.speakers = speakers;
      this.tyres = tyres;
   }

   public void playMusic() {
      System.out.println(speakers.makeSound());
   }

   public void moveVehicle() {
      System.out.println(tyres.rotate());
   }
}
```
- **Functionality**: Manages the vehicle's actions (playing music, moving).
- **Autowiring**: Injects the `Speakers` and `Tyres` components using `@Autowired`.
- **Methods**:
   - `playMusic()`: Outputs the sound from the speakers.
   - `moveVehicle()`: Outputs the status from the tyres' rotation.

The class uses whichever `Speakers` and `Tyres` implementations are selected by Spring (defaulting to the `@Primary` ones if no `@Qualifier` is used).

---

#### 6. **Main Application (`Example11`)**
```java
public class Example11 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        person.setName("Mithil Bhosale");
        System.out.println("Person name is : " + person.getName());
        person.getVehicle().getVehicleService().playMusic();
        vehicle.getVehicleService().moveVehicle();
    }
}
```
- **Context Initialization**: The `AnnotationConfigApplicationContext` is used to load Spring's configuration and manage beans.
- **Person and Vehicle Beans**: Fetches `Person` and `Vehicle` beans from the Spring context.
- **Operations**:
   - Sets the person's name.
   - Calls `playMusic()` on the `VehicleService`, which invokes the selected speaker.
   - Calls `moveVehicle()` on the `VehicleService`, which invokes the selected tyres.

---


#### 3. **Add `@Qualifier` for Flexibility**:
If specific components (e.g., `BoseSpeakers` or `BridgeStoneTyres`) need to be injected in certain cases, use `@Qualifier` to explicitly inject the desired beans, enhancing the application's flexibility.

---

### Conclusion

The solution models a person and their vehicle using **Spring's Dependency Injection**. With the use of `@Primary` and `@Qualifier`, we handle the injection of multiple bean implementations efficiently, giving flexibility and control over which beans are used. The proposed optimizations focus on improving readability, testing, and immutability by using constructor injection over field injection.