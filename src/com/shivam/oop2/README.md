## OOP-2 Packages, Static, Singleton Class, In-built Methods

---
# Table of Contents

- [Packages](#packages)
  - Why Use Packages?
  - Types of Packages in Java
  - How to Create a Package
  - Using a Class from a Package

- [Static Keyword](#static-keyword)
  - Uses of static Keyword
  - `this` Keyword in Static Context

- [Static Variables](#static-variables)

- [Static Methods](#static-methods)

- [Static Blocks](#static-blocks)

- [Static Nested Classes](#static-nested-classes)

- [Non-static Member Inside a Static Context](#non-static-member-inside-a-static-context)
  - Why Can't We Access Non-Static Members in Static Context?
  - How to Access Non-Static Members in a Static Context?

- [Accessing Static Members in a Non-Static Context](#accessing-static-members-in-a-non-static-context)

- [Initialization of Static Variables](#initialization-of-static-variables)
  - Definition
  - Default Initialization
  - Explicit Initialization
  - Static Block Initialization
  - Lazy Initialization

- [Singleton Class](#singleton-class)
  - Characteristics of a Singleton Class
  - How the Singleton Pattern works
---

- ## Packages
- A package in Java is a namespace that organizes classes and interfaces. Think of it as a folder in a directory that helps in structuring your projects, preventing name conflicts, and controlling access to classes.
- ### Why Use Packages?
    - **Organization**: Groups related classes and interfaces together.
    - **Avoid Name Conflicts**: Prevents class name clashes when using multiple libraries.
    - **Access Control**: Controls class and interface visibility (public, protected, etc.).
    - **Reusability**: Allows developers to reuse classes across multiple projects.
- ### Types of Packages in Java
    - **Built-in Packages**: Predefined packages like java.util, java.io, etc.
    - **User-defined Packages**: Created by developers to organize custom classes.
- ### How to Create a Package
    - Use the package keyword.
    - Place the package statement as the first line of the file.
- Example:
```java
package com.shivam.myapp;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello from my package!");
    }
}
```
- ### Using a Class from a Package
- To use a class from a different package we need to import it using `import` statement.
- The `import` statement in Java allows you to access classes and interfaces from other packages in your program without having to use their fully qualified names. It helps in keeping the code clean and readable.
- Example:
```bash
  import com.shivam.myapp.HelloWorld;
```
---
- ## Static Keyword
- The static keyword in Java is a non-access modifier that is used primarily for memory management. It can be applied to variables, methods, blocks, and nested classes. When a member is declared as static, it belongs to the class rather than any specific instance of the class.
- ### Uses of static Keyword:
   - Static Variables
   - Static Methods
   - Static Blocks
   - Static Nested Classes
- ### `this` Keyword in Static:
We cannot use `this` keyword in static methods because it represents an object but static is not dependent on object.

---

- ### Static Variables
   - Also known as class variables.
   - Shared among all objects of the class (i.e., only one copy exists, regardless of the number of instances).
   - Memory for static variables is allocated only once during class loading.
   - The `main` class is static so that we can use it without creating the object for the `main` class.
- **Syntax**
```bash
static data_type variable_name;
```
- **Example**
```java
class Example {
    static int count = 0; // Static variable

    Example() {
        count++;
    }

    public static void displayCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();
        Example.displayCount(); // Count: 2
    }
}
```

---

- ### Static Methods
   - Can be called without creating an instance of the class.
   - Only static data or other static methods can be accessed directly within a static method.
   - Cannot use this or super keywords because they are tied to instance context.
- **Syntax**
```java
static return_type method_name(parameters) {
  // Method body
}
```
- **Example**
```java
class Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = Calculator.add(5, 10); // Calling static method directly
        System.out.println("Sum: " + sum); // Output: Sum: 15
    }
}
```

---

- ### Static Blocks
   - A static block is a group of statements that runs once when the class is loaded into memory.
   - It is primarily used for initializing static variables.
- **Syntax**
```java
static {
    // Code to initialize static variables
}
```
- **Example**
```java
class StaticBlockExample {
    static int num;

    static {
        num = 100; // Static block initializes static variable
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Value of num: " + num);
    }
}
```
- **Output**
```bash
Static block executed
Value of num: 100
```

---

- ### Static Nested Classes
   - A static nested class is a nested class that can be accessed without creating an instance of the enclosing class.
   - It does not have access to instance variables or methods of the enclosing class.
- **Syntax**
```bash
class Outer {
    static class Nested {
        // Code
    }
}
```
- **Example**
```java
class Outer {
    static class Nested {
        void display() {
            System.out.println("Static Nested Class");
        }
    }

    public static void main(String[] args) {
        Outer.Nested nestedObj = new Outer.Nested();
        nestedObj.display();
    }
}
```
--- 

- ## Non-static Member Inside a Static
Accessing a non-static member inside a static context is not directly allowed in Java because static members belong to the class, whereas non-static members belong to an instance of the class. This means a static context does not have access to this, which represents the instance of the class.
- ### Why Can't We Access Non-Static Members in a Static Context?
    - Static Context: It exists independently of any instance. Static members (variables or methods) are loaded into memory when the class is loaded.
    - Non-Static Context: Non-static members belong to an instance and require an object to be accessed.
  Since a static context doesn't belong to any specific object, it doesn't know which instance's non-static members to refer to.
- ### How to Access Non-Static Members in a Static Context?
To access non-static members inside a static method or block, you need to create an object of the class and use it to call the non-static members.
**Example**
```java
class Example {
    int instanceVariable = 42; // Non-static variable

    void instanceMethod() { // Non-static method
        System.out.println("Non-static method called!");
    }

    static void staticMethod() {
        // System.out.println(instanceVariable); // Error: Non-static variable cannot be referenced from a static context
        // instanceMethod(); // Error: Non-static method cannot be referenced from a static context

        // Accessing non-static members using an object
        Example obj = new Example();
        System.out.println("Instance Variable: " + obj.instanceVariable); // Accessing non-static variable
        obj.instanceMethod(); // Calling non-static method
    }

    public static void main(String[] args) {
        // Calling static method
        staticMethod();
    }
}
```

---

## Accessing Static Members in a Non-Static Context
Accessing Static Members in a Non-Static Context is straightforward in Java because static members are shared among all instances of the class and belong to the class rather than any specific instance. A non-static context has access to both static and non-static members because a non-static context is associated with an instance of the class, which inherently "knows" its class.
- ### Why Can Non-Static Context Access Static Members?
    - Static members belong to the class, and they are initialized at class loading time.
    - Since the class information is available in every instance, the non-static context can directly access the static members.
- **Example**
```java
class Example {
    // Static member
    static int staticVariable = 42;

    // Non-static member
    int instanceVariable = 10;

    // Static method
    static void staticMethod() {
        System.out.println("Static method called!");
    }

    // Non-static method
    void instanceMethod() {
        // Accessing static member directly
        System.out.println("Static Variable: " + staticVariable);

        // Accessing static method directly
        staticMethod();

        // Accessing non-static members
        System.out.println("Instance Variable: " + instanceVariable);
    }

    public static void main(String[] args) {
        // Accessing static members without an instance
        System.out.println("Static Variable: " + Example.staticVariable);
        Example.staticMethod();

        // Accessing static and non-static members through an instance
        Example obj = new Example();
        obj.instanceMethod();
    }
}
```

---

## Initialization of Static Variables
  - ### Definition
  - Static variables are shared among all instances of a class and belong to the class rather than any specific instance.
  - ### Default Initialization
  - Static variables are automatically initialized with default values based on their data types:
      - `int` → `0`
      - `boolean` → `false`
      - `String` → `null`
  - ### Explicit Initialization
  - Static variables can be explicitly initialized at the time of declaration.
  - **Example**
```java
static int count = 100;
```
  - ### Static Block Initialization
  - For more complex initialization, static blocks can be used. They run once when the class is loaded.
  - **Example**
```java
static {
  count = 42;
}

```
  - ### Lazy Initialization
  - Static variables can be initialized only when they are accessed for the first time.
  - **Example**
```java
private static int lazyValue;
public static int getLazyValue() {
    if (lazyValue == 0) {
        lazyValue = 99;
    }
    return lazyValue;
}
```

--- 

## Singleton Class
A Singleton class is a design pattern that restricts the instantiation of a class to a single object. It ensures that only one instance of the class is created throughout the lifetime of the application and provides a global point of access to it.
- ### Characteristics of a Singleton Class
   - **Single Instance**: Only one instance of the class exists.
   - **Global Access**: The instance is accessible globally through a static method or variable.
   - **Lazy Initialization**: The instance is created when it is first needed, saving memory and resources.
- ### How the Singleton Pattern Works
    - Making the constructor private, preventing external instantiation.
    - Providing a static variable to hold the single instance of the class.
    - Using a static method to return the instance. This method ensures that the instance is created only once. 

