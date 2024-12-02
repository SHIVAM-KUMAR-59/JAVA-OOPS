# OOP-4 | Access Control, In-built Packages, Object Class

---

## Table of Contents

1. [Access Modifiers](#access-modifiers)
    - Types of Access Modifiers
    - Examples for Each Modifier
    - When to Use Which Modifier

2. [In-Built Packages](#in-built-packages)
    - Overview
    - Commonly Used Packages

3. [Object Class](#object-class)
    - Overview
    - Common Methods
    - Usage

----

## Access Modifiers
  Access modifiers in Java define the scope or visibility of fields, methods, constructors, and classes. They help in implementing encapsulation and controlling access to the members of a class.

- ### Types of Access Modifiers

| Modifier              | Class  | Package | Subclass<br/>(same package) | Subclass<br/>(diff package) | World<br/>(diff package & not subclass) |
|-----------------------|--------|---------|-----------------------------|-----------------------------|-----------------------------------------|
| `public`              | ✅     | ✅      | ✅                          | ✅                           | ✅                                    | 
| `protected`           | ✅     | ✅      | ✅                          | ✅                           | ❌                                    |
| No Modifier (default) | ✅     | ✅      | ❌                          | ❌                           | ❌                                    |
| `private`             | ✅     | ❌      | ❌                          | ❌                           | ❌                                    |

---

1. ### `public` Modifier
   - The public modifier makes a class or its members accessible from anywhere in the program. 
   - **Scope**: Everywhere in the project. 
   - **Use**: When the class or member needs to be universally accessible.
**Example**
```java
public class MyClass {
    public int age = 25;

    public void show() {
        System.out.println("Public method accessible everywhere!");
    }
}
```

2. ### `protected` Modifier
    - The protected modifier allows access within the same package and subclasses (even in different packages). 
    - **Scope**: Package and subclasses. 
    - **Use**: When fields or methods should be accessible in subclasses but hidden from other classes.
**Example**
```java
class Parent {
    protected String name = "Shivam";

    protected void display() {
        System.out.println("Protected method accessible in subclass and package!");
    }
}

class Child extends Parent {
    public void show() {
        System.out.println(name); // Accessing protected field
        display(); // Accessing protected method
    }
}
```

3. ### Default (No Modifier)
    - When no access modifier is specified, the member has "package-private" visibility. This is the default access level. 
    - **Scope**: Within the same package. 
    - **Use**: For members that should only be accessed within the same package.
**Example**
```java
class MyClass {
    int age = 25; // Default access

    void display() {
        System.out.println("Default method accessible within the same package!");
    }
}
```

4. ### `private` Modifier
    - The private modifier restricts access to within the class only. 
    - **Scope**: Within the same class. 
    - **Use**: For encapsulation to hide internal implementation details.
**Example**
```java
class MyClass {
    private int age = 25;

    private void display() {
        System.out.println("Private method, not accessible outside the class!");
    }

    public void show() {
        display(); // Can be accessed within the same class
    }
}
```

---

- ### When to Use Which Modifier
   - **`public` Modifier**
     - Use public when you want a member or class to be accessible from anywhere in the application.
     - Ideal for methods or constants meant to be used universally across different packages.
   - **`protected` Modifier**
     - Use protected when a member should be accessible:
        - Within its class.
        - To classes in the same package.
        - To subclasses (even in different packages).
     - Best for members that are part of an inheritance hierarchy but should not be exposed globally.
   - **Default**
     - Use the default access (no modifier) when a member or class should only be accessible within the same package.
     - Good for tightly coupled classes that need to work together but shouldn't expose their details outside the package.
   - **`private` Modifier**
     - Use private when a member should only be accessible within the class it is defined.
     - Ideal for encapsulation: keep sensitive data or implementation details hidden from other classes.
     - Often used for fields, with public getter and setter methods to control access.

--- 

## In-Built Packages
 - In Java, built-in packages are a collection of predefined classes and interfaces provided by the Java Development Kit (JDK). These packages help developers perform common tasks like file manipulation, data structures, networking, database connectivity, etc., without needing to write everything from scratch.
 - **Here are some commonly used built-in packages in Java**:
    - `java.lang`: Provides classes that are fundamental to Java programming.
    - `java.util`: Provides utility classes like collections, date, and random number generation.
    - `java.io`: Provides classes for input and output operations, such as file handling.
    - `java.applet`: A legacy Java program embedded in web pages, executed within a browser or applet viewer, with lifecycle methods.
    - `java.net`: Provides classes for networking functionalities like HTTP requests and sockets.

---

## Object Class
 - The `Object` class in Java is the root of the class hierarchy. Every class in Java directly or indirectly inherits from this class. It provides fundamental methods that are available in all Java objects.
 - **Common Methods of the Object Class**:
    - `toString()`: Returns a string representation of the object.
    - `hashCode()`: Returns a hash code for the object.
    - `equals(Object obj)`: Compares the current object with another for equality.
    - `getClass()`: Returns the runtime class of the object.
    - `clone()`: Creates a new object as a shallow copy (requires implementing Cloneable).
    - `finalize()`: Called by the garbage collector before object destruction (deprecated in Java 9+).
    - `wait(), notify(), and notifyAll()`: Facilitate thread communication via object locks.
 - **Usage**:
    - Serves as a base for custom classes.
    - Provides default implementations that can be overridden for custom behavior.
    - Useful in generic programming as it represents the most general type.
 
---
 






