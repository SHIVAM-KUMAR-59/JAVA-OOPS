# OOP-3 Principles - Inheritance, Polymorphism, Encapsulation, Abstraction

---

## Inheritance
Inheritance is a fundamental concept in object-oriented programming (OOP) that allows one class (the child or subclass) to inherit fields and methods from another class (the parent or superclass). It promotes code reusability and establishes a hierarchical relationship between classes.
### Key Concepts
   - **Superclass and Subclass**:
        - **Superclass (Parent Class)**: The class whose properties and methods are inherited.
        - **Subclass (Child Class)**: The class that inherits from the superclass and can add its own fields and methods.
   - **`extends` Keyword**: Used to establish an inheritance relationship.
   - **`super` Keyword**: The super keyword in Java is a reference variable used to refer to the immediate parent class of the current object. It provides a way for subclasses to access fields, methods, and constructors of their superclass.
   - **Note**: It is the type of reference variable and not the type of object that determines what members can be accessed.
### Access Modifiers and Inheritance:
   - `public`: Accessible everywhere.
   - `protected`: Accessible within the same package and subclasses.
   - `default` (no modifier): Accessible only within the same package.
   - `private`: Not accessible in the subclass.
- ### Example
```java
// Superclass
class Parent {
    String name;

    void display() {
        System.out.println("This is the parent class.");
    }
}

// Subclass
class Child extends Parent {
    int age;

    void show() {
        System.out.println("This is the child class.");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "John";
        child.age = 10;

        child.display();  // Accessing parent class method
        child.show();     // Accessing child class method
    }
}
```
- ### Features of Inheritance
    - **Code Reusability**: Common logic in the parent class can be reused in the child class.
    - **Method Overriding**: A subclass can provide its own implementation of a method defined in the superclass.
    - **Dynamic Method Dispatch**: Methods are invoked based on the actual object type, enabling runtime polymorphism.

- ### Types of Inheritance:
    - **Single Inheritance**: A subclass inherits from one superclass.
    - **Multilevel Inheritance**: A subclass inherits from a superclass, and another class inherits from that subclass.
    - **Hierarchical Inheritance**: Multiple subclasses inherit from a single superclass.
    - **Multiple Inheritance**: Not supported in Java.
    - **Hybrid Inheritance**: A combination of two or more types (not supported directly in Java due to the lack of multiple inheritance through classes).
- ### Example Single Inheritance
```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Method from superclass
        dog.bark(); // Method from subclass
    }
}
```
- ### Example Multilevel Inheritance
```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.walk(); // Inherited from Mammal
        dog.bark(); // Method in Dog
    }
}
```
- ### Method Overriding
  When a subclass provides a specific implementation of a method already defined in its superclass.
- ### Example
```java
class Parent {
    void message() {
        System.out.println("Message from parent class.");
    }
}

class Child extends Parent {
    @Override
    void message() {
        System.out.println("Message from child class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Dynamic Method Dispatch
        obj.message(); // Calls the overridden method in Child
    }
}
```

---

## Polymorphism
Polymorphism is a core concept in Object-Oriented Programming (OOP) that allows objects to take many forms. It enables a single method or interface to work with different types of objects, promoting flexibility and reusability in code.

- ### Types of Polymorphism in Java
     - **Compile-Time Polymorphism (Method Overloading)**:
       - Achieved using method overloading.
       - The compiler determines which method to call based on the method signature (method name + parameters).
       - **Example**
       ```java
            class MathUtils {
           // Overloaded add method
           int add(int a, int b) {
               return a + b;
           }
       
           double add(double a, double b) {
               return a + b;
           }
       }
       ```
  
     - **Run-Time Polymorphism (Method Overriding)**:
       - Achieved using method overriding. 
       - The method to call is determined at runtime based on the object's actual type.
       - **How Overriding Works**:
          - ```java
            Parent obj = new Child();
            /*
            Here, which method will be called depends on the Child(), this is known as Upcasting
            */
            ```
       - **`final` Keyword**: A method declared as final in a parent class cannot be overridden in any subclass. This ensures that the method's behavior remains consistent and cannot be altered by any subclass.
       - `static` methods in Java cannot be overridden. They are bound to the class, not the instance. Therefore, the concept of overriding, which applies to instance methods that are dynamically dispatched at runtime, does not apply to static methods.
       - **Example**:
        ```java
        class Animal {
          void sound() {
            System.out.println("Animal makes a sound");
          }
        }
        
        class Dog extends Animal {
          @Override
          void sound() {
            System.out.println("Dog barks");
          }
        }
        
        public class Main {
          public static void main(String[] args) {
            Animal myAnimal = new Dog(); // Polymorphic reference
            myAnimal.sound(); // Output: Dog barks
          }
        }
        
        ```

- ### Key Features of Polymorphism
  - **Dynamic Binding**: In runtime polymorphism, method calls are resolved during execution.
  - **Code Reusability**: A single interface can be reused for multiple classes.
  - **Extensibility**: New implementations can be added without altering existing code.
  - **Flexibility**: Enables creating flexible and scalable systems.

- ### Example
```java
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape myShape;

        myShape = new Circle();
        myShape.draw(); // Output: Drawing a circle

        myShape = new Rectangle();
        myShape.draw(); // Output: Drawing a rectangle
    }
}
```