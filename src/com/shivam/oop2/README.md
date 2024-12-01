## OOP-2 Packages, Static, Singleton Class, In-built Methods

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
```bash
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

---

- ### Static Variables
   - Also known as class variables.
   - Shared among all objects of the class (i.e., only one copy exists, regardless of the number of instances).
   - Memory for static variables is allocated only once during class loading.
- **Syntax**
```bash
static data_type variable_name;
```
- **Example**
```bash
-class Example {
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
```bash
static return_type method_name(parameters) {
  // Method body
}
```
- **Example**
```bash
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
```bash
static {
    // Code to initialize static variables
}
```
- **Example**
```bash
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
```bash
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