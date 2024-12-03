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


