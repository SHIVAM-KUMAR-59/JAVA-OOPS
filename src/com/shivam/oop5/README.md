# OOP-5 | Abstract Classes, Interfaces, Annotations

---

## Abstract Classes
 - An abstract class in Java is a class that cannot be instantiated and is designed to be extended by subclasses. It can have both abstract methods (without a body) and concrete methods (with a body). Abstract classes are used when a common base class is needed for multiple subclasses, but the base class itself should not be instantiated.
 - ### When to Use Abstract Classes:
     - **Common Base**: When you want to define common fields or methods for multiple related classes. 
     - **Partial Implementation**: When some methods need to be implemented in the base class, and others must be left for subclasses. 
     - **Non-Instantiable Parent**: When you want to prevent the parent class from being instantiated but still allow inheritance.
 - ### Key Characteristics of Abstract Classes:
     - **Cannot Instantiate**: You cannot create an object of an abstract class.
     ```java
     abstract class Shape {
    // Abstract class
     }
    Shape s = new Shape(); // Not allowed
     ```
   - **Abstract Methods**: An abstract class can include methods without a body (abstract methods). Subclasses must provide an implementation for these methods.
   ```java
   abstract class Shape {
    abstract void draw(); // Abstract method
   }
   ```
   - **Concrete Methods**: An abstract class can also include regular methods with implementations.
   ```java
   abstract class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
    }
    ```
   - **Constructors**: Abstract classes can have constructors, which are invoked when a subclass object is created.
   ```java
   abstract class Shape {
    Shape() {
        System.out.println("Shape constructor called");
    }
   }
    ```
   - **Fields and Access Modifiers**: Abstract classes can have fields and access modifiers like regular classes.
   - **Inheritance**: Subclasses must provide implementations for all abstract methods of the parent abstract class unless they are also declared abstract.
 - ### Syntax
```java
abstract class ClassName {
    // Abstract method
    abstract returnType methodName();

    // Concrete method
    void methodWithBody() {
        // Method implementation
    }
}
```
- **Example**
```java
// Abstract class
abstract class Shape {
    // Abstract method
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Subclass
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Main class
public class AbstractExample {
    public static void main(String[] args) {
        Shape shape = new Circle(); // Upcasting
        shape.draw();
        shape.display();
    }
}
```
- **Output**
```css
Drawing a Circle.
This is a shape.
```

---

## Interfaces
 - An interface in Java is a blueprint for a class that contains abstract methods and static/final fields. It specifies the behavior a class must implement but does not provide any method implementation (until Java 8+).
 - ### Key Features of Interfaces:
     - **Pure Abstraction**: 
        - Interfaces allow 100% abstraction (before Java 8). 
        - All methods are implicitly `public` and `abstract`.
     - **Default and Static Methods (since Java 8)**:
        - Default methods can have a method body and can be overridden by implementing classes. 
        - Static methods can be accessed using the interface name and are not inherited.
     - **Fields**:
        - All fields are implicitly `public`, `static`, and `final`. 
     - **Multiple Inheritance**:
        - A class can implement multiple interfaces, overcoming the limitation of single inheritance in classes.
     - **Functional Interfaces (Java 8+)**:
        - Interfaces with a single abstract method can be implemented using lambda expressions (e.g., `Runnable`, `Comparator
 - ### Define the Interface
```java
package com.shivam.oop6.interfaces;

public interface Animal {
    // Abstract methods (implicitly public and abstract)
    void eat();
    void sleep();
}
 ```
 - ### Implement the Interface
```java
package com.shivam.oop6.interfaces;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }
   
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}
```
 - ### Usage in Main
```java
package com.shivam.oop6.interfaces;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
    }
}
```
 
 - ### Variable of Interface type:
   In Java, a variable of an interface type can hold references to objects of any class that implements the interface. This feature allows you to use interfaces to define a common type for a set of classes, enabling polymorphism.

   - **Key Points about Interface-Type Variables**:
      - **Declaration**: A variable of interface type is declared just like any other variable.
      - Example:
      - ```java
        InterfaceName varName;
        ```
      - **Instantiation**: An interface cannot be instantiated directly. The variable can hold references to objects of any class that implements the interface.
      - Example:
      - ```java
        InterfaceName varName = new ImplementingClass();
        ```
     - **Polymorphism**: Interface-type variables are useful for achieving polymorphism, where the actual object can be of any class implementing the interface.

---

## Difference Between Abstract Classes and Interfaces

| Feature          | Abstract Class                              | Interface                                      |
|------------------|---------------------------------------------|------------------------------------------------| 
| Inheritance      | Can extend one class.                       | Can implement multiple interfaces.             |
| Methods          | Can have abstract and concrete methods.     | Before Java 8: only abstract methods.          |
| Fields           | Can have instance variables.                | Fields are `public`, `static`, `final`.        |
| Access Modifiers | Supports all modifiers.                     | Methods are `public` by default.               |
| Use Case         | When sharing implementation among classes.  | For defining a contract for unrelated classes. |   

---

## Annotations
 - Annotations in Java are a powerful tool that provide metadata about the code but do not affect the execution directly. They are used to provide information about the program to the compiler, runtime, or tools that process the code. Annotations can be used for a variety of purposes like marking methods, classes, or fields, or even for processing during compilation or runtime.
 - ### Types of Annotations in Java
     - **Built-in Annotations**: Java provides a set of predefined annotations that are commonly used. 
        - `@Override`: Indicates that a method is overriding a method from a superclass. 
        - `@Deprecated`: Marks a method or class as deprecated, meaning it should no longer be used. 
        - `@SuppressWarnings`: Instructs the compiler to suppress specific warnings. 
        - `@SafeVarargs`: Ensures that the variable-length argument method does not perform unsafe operations. 
        - `@FunctionalInterface`: Denotes that an interface is a functional interface (an interface with just one abstract method).
     - **Custom Annotations**: You can create your own annotations to be used throughout your code. Custom annotations are defined using `@interface`.
 - ### Creating and Using Custom Annotations
     - 1. **Defining a Custom Annotation**:
     ```java
   package com.shivam.oop5.annotations;
   // Defining a custom annotation
   public @interface MyCustomAnnotation {
       String description() default "No description provided";  // Optional value
       int version() default 1;  // Default version
   }
   ```
    - **In the above example**:
       - `@interface`: This defines an annotation. 
       - The annotation has two elements: description and version. These can be accessed when the annotation is used.
    - 2. **Using the Custom Annotation**:
    ```java
   package com.shivam.oop5.annotations;
   public class MyClass {
       // Applying the custom annotation to a method
       @MyCustomAnnotation(description = "This is a test method", version = 2)
       public void testMethod() {
           System.out.println("Test Method Executed");
       }
   }
   ```
    - 3. **Accessing the Annotation at Runtime (Reflection)**: If you want to access annotations at runtime, you can use reflection.
    ```java
    Copy code
    package com.shivam.oop5.annotations;

    import java.lang.annotation.Annotation;
    import java.lang.reflect.Method;

    public class AnnotationProcessor {

        public static void main(String[] args) throws Exception {
            Method method = MyClass.class.getMethod("testMethod");
        
            // Check if the method has MyCustomAnnotation
            if (method.isAnnotationPresent(MyCustomAnnotation.class)) {
                // Retrieve the annotation
                MyCustomAnnotation annotation = method.getAnnotation(MyCustomAnnotation.class);
            
                // Access the values of the annotation
                System.out.println("Description: " + annotation.description());
                System.out.println("Version: " + annotation.version());
            }
        }
    }
   ```
    - **In this code**:
      - We use reflection `(Method.isAnnotationPresent())` to check if a method is annotated with `MyCustomAnnotation`. 
      - Then, we retrieve the annotation and print its values using `getAnnotation()`.
---

