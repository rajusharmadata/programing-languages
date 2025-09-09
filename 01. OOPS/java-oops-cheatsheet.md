# Java OOP Concepts Comprehensive Cheat Sheet

## 1. Class - Blueprint of Objects
**Definition**: A class is a user-defined data type that serves as a blueprint for creating objects. It encapsulates data (attributes) and behavior (methods) into a single unit.

**Key Characteristics**:
- Defines the structure and behavior of objects
- Acts as a template for creating instances
- Contains attributes, constructors, and methods

```java
public class Car {
    // Attributes (properties)
    private String model;
    private int year;
    
    // Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    
    // Method (behavior)
    public void drive() {
        System.out.println("The car is driving");
    }
}
```

## 2. Object - Instance of a Class
**Definition**: An object is a concrete instance of a class, representing a specific entity with its own unique state and behavior.

**Key Characteristics**:
- Created from a class blueprint
- Has its own memory allocation
- Can interact with other objects
- Represents a real-world entity

```java
// Object creation
Car myCar = new Car("Toyota", 2022);
myCar.drive(); // Calling object's method
```

## 3. Encapsulation - Data Hiding
**Definition**: Encapsulation is a mechanism of wrapping data and code acting on the data into a single unit, restricting direct access to some of an object's components.

**Key Characteristics**:
- Protects data from unauthorized access
- Provides controlled access through getter and setter methods
- Improves security and maintainability

```java
public class BankAccount {
    // Private attribute - cannot be directly accessed
    private double balance;
    
    // Public getter method
    public double getBalance() {
        return balance;
    }
    
    // Public setter method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

## 4. Inheritance - Code Reusability
**Definition**: Inheritance is a mechanism where a new class (child/derived class) is created from an existing class (parent/base class), inheriting its attributes and methods.

**Key Characteristics**:
- Promotes code reuse
- Establishes a hierarchical relationship between classes
- Supports the concept of parent and child classes
- Enables creation of specialized classes from general ones

```java
// Parent class
public class Animal {
    protected String name;
    
    public void eat() {
        System.out.println("The animal is eating");
    }
}

// Child class inheriting from Animal
public class Dog extends Animal {
    public void bark() {
        System.out.println(name + " is barking");
    }
}
```

## 5. Polymorphism - Many Forms
**Definition**: Polymorphism allows objects of different types to be treated uniformly, enabling a single interface to represent different underlying forms.

**Types of Polymorphism**:

### 5.1 Method Overloading (Compile-time Polymorphism)
**Definition**: Multiple methods in the same class with the same name but different parameters.

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
}
```

### 5.2 Method Overriding (Runtime Polymorphism)
**Definition**: A child class provides a specific implementation of a method already defined in its parent class.

```java
public class Shape {
    public double calculateArea() {
        return 0;
    }
}

public class Circle extends Shape {
    private double radius;
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
```

## 6. Abstraction - Hiding Complexity
**Definition**: Abstraction is the process of hiding complex implementation details and showing only the necessary features of an object.

### 6.1 Abstract Class
**Definition**: A class that cannot be instantiated and may contain abstract and non-abstract methods.

```java
public abstract class Vehicle {
    // Abstract method (no implementation)
    public abstract void start();
    
    // Concrete method
    public void stop() {
        System.out.println("Vehicle stopped");
    }
}
```

### 6.2 Interface
**Definition**: A contract that specifies methods a class must implement, supporting multiple inheritance of type.

```java
public interface Drawable {
    // All methods are public and abstract by default
    void draw();
}
```

## 7. Composition - Building Complex Objects
**Definition**: A design principle where a class is composed of one or more objects of other classes, representing a "has-a" relationship.

```java
public class Computer {
    // Composition: Computer has a Processor
    private Processor processor;
    
    public Computer() {
        this.processor = new Processor();
    }
}
```

## 8. Access Modifiers - Controlling Visibility
**Definition**: Keywords that set the accessibility of classes, methods, and variables.

- `public`: Accessible from anywhere
- `private`: Accessible only within the same class
- `protected`: Accessible within the same package and subclasses
- `default` (no modifier): Accessible within the same package

```java
public class AccessModifierExample {
    public int publicVar;     // Accessible everywhere
    private int privateVar;   // Accessible only in this class
    protected int protectedVar; // Accessible in package and subclasses
    int defaultVar;           // Accessible only in the same package
}
```

## Key OOP Principles
1. **Encapsulation**: Hide internal state, provide controlled access
2. **Inheritance**: Create new classes based on existing classes
3. **Polymorphism**: Objects can take multiple forms
4. **Abstraction**: Hide complex implementation details
