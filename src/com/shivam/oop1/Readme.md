# OOP-1 | Introduction and Basics

## **Table of Contents**

- [**Classes**](#classes)
- [**Objects**](#objects)
    - `new` Operator
    - Creating an Object
    - Accessing the instance variables
- [**Constructors**](#constructors)
    - Default Constructor
    - Parameterized Constructor
    - Copy Constructor
    - `this` Keyword
    - Constructor Overloading
- [**Class vs Object**](#class-vs-object)
- [**Wrapper Class**](#wrapper-class)
  - 'final' Keyword
  - Garbage Collector(GC)

---

- ## Classes
- A class in Java is a blueprint for creating objects. It defines the structure and behavior that the objects created from the class will have. This includes:
  - Fields (Attributes): Variables that hold the data or state of the objects.
  - Methods: Functions that define the behavior of the objects.
  - Constructors: Special methods used to initialize objects.
  Syntax:
```bash
   class ClassName {
          // Fields (Attributes)
          DataType fieldName;
   
          // Constructor
          ClassName(parameters) {
              // Initialize fields
          }
   
          // Methods
          ReturnType methodName(parameters) {
              // Method logic
          }
   }
   ```
---

- ## Objects 
- An object is an instance of a class. It represents a real-world entity with:
  - State: The data or attributes of the object, represented by fields in the class.
  - Behavior: The actions the object can perform, defined by methods in the class.
  - Objects are the building blocks of object-oriented programming (OOP) and are used to encapsulate data and behavior together.
- **Key Characteristics of Objects**:
  - Identity: A unique reference or name that distinguishes one object from another.
  - State: The values of an object's fields (attributes) at a given time.
  - Behavior: Actions or functions that the object can perform, defined by the class methods.

- ### `new` Operator
The new operator in Java is used to create new objects or allocate memory for objects or arrays dynamically. It plays a key role in instantiating a class.

- ### Creating an Object 
  - To create an object in Java, you use the new keyword to instantiate a class.
  ```bash
   ClassName objectName = new ClassName(parameters);
  ```

- ### Accessing the instance variables
  - The variables inside an object are called instance variables. To access the variables inside the object, we use dot `.` operator or separator.
  ```bash
  objectName.objectVariable;
  ```
  
---

- ## Constructors
- A constructor is a special method in Java used to initialize objects. It is called when an object of a class is created. Constructors set up the initial state of an object by assigning values to its fields and executing any setup logic required.
- **Features of Constructors**:
  - Same Name as Class: The name of the constructor must match the name of the class.
  - No Return Type: Constructors do not have a return type, not even void.
  - Automatically Called: Constructors are automatically invoked when an object is created.
    - Overloading Supported: Multiple constructors can exist in a class with different parameter lists.

- **Types of Constructors**:
    - Default Constructor:
        - A constructor with no parameters.
        - Automatically provided by Java if no constructors are explicitly defined in the class.
        ```bash
          class Example {
            int x;
            // Default Constructor
            Example() {
            x = 10;
            System.out.println("Default Constructor called. x = " + x);
            }
          }
        ``` 
    - Parameterized Constructor:
         - A constructor that accepts arguments to initialize the fields with specific values.
         ```bash
            class Example {
              int x;
              // Parameterized Constructor
              Example(int value) {
              x = value;
              System.out.println("Parameterized Constructor called. x = " + x);
              }
            }
         ```
    - Copy Constructor:
          - A constructor that creates an object by copying another object of the same class.
         ```bash
            class Example {
                int x;
                // Parameterized Constructor
                Example(int value) {
                   x = value;
                }
               // Copy Constructor
               Example(Example obj) {
                  x = obj.x;
               }
            }
         ```

- ### `this` Keyword
- The `this` keyword in Java is a reference variable that refers to the current instance of the class. It is primarily used to eliminate ambiguity when instance variables and parameters have the same name or to invoke other methods/constructors within the same class.
 - Example: 
    ```bash
   class Example {
      String name;
   
      // Parameterized Constructor
      Example (name){
        this.name = name;
      }  
   
      // A function that greets the user
      void Greeting(){
         System.out.println("Hello " + this.name); // This will print hello + name of the reference variable
      }
   }
    ```

---

- ### Constructor Overloading
- Constructor overloading in Java refers to the practice of defining multiple constructors in a class with different parameter lists. It allows objects of the class to be initialized in different ways, depending on the constructor used.

- **Key Features of Constructor Overloading**:
  - Multiple Constructors: A class can have multiple constructors, each with a unique parameter list.
  - Overloaded Based on Parameters: Constructors are differentiated by the number, type, or order of parameters.
  - Provides Flexibility: Allows initializing objects with different levels of detail or configurations.
  - Code Reusability: Reduces redundancy by enabling one constructor to call another using the this keyword.

- Example:
```bash
class Example {
    int x;
    String name;

    // Default Constructor
    Example() {
        this.x = 0;
        this.name = "Default";
        System.out.println("Default Constructor called: x = " + x + ", name = " + name);
    }

    // Parameterized Constructor (1 parameter)
    Example(int x) {
        this.x = x;
        this.name = "Default";
        System.out.println("Constructor with 1 parameter called: x = " + x + ", name = " + name);
    }

    // Parameterized Constructor (2 parameters)
    Example(int x, String name) {
        this.x = x;
        this.name = name;
        System.out.println("Constructor with 2 parameters called: x = " + x + ", name = " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj1 = new Example();                  // Calls Default Constructor
        Example obj2 = new Example(10);               // Calls Constructor with 1 parameter
        Example obj3 = new Example(20, "Shivam");     // Calls Constructor with 2 parameters
    }
}
```

---

## **Class vs Object**

| Feature                | **Class**                                                                                   | **Object**                                                                          |
|------------------------|---------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------|
| **Definition**         | A blueprint or template for creating objects.                                               | An instance of a class that represents real-world entities.                         |
| **Purpose**            | Defines the structure (fields) and behavior (methods) of objects.                           | Represents a specific entity with its unique state and behavior.                    |
| **Memory**             | Does not consume memory until instantiated.                                                 | Occupies memory in the heap when created.                                           |
| **Declaration**        | Declared using the `class` keyword.                                                         | Created using the `new` keyword.                                                    |
| **Example**            | `class Dog { String name; void bark() { ... } }`                                            | `Dog dog1 = new Dog();`                                                             |
| **Storage**            | Stored in **Method Area** of memory.                                                        | Stored in **Heap Memory**.                                                          |
| **Relationship**       | Acts as a factory or blueprint for creating objects.                                        | Is a concrete realization of the class blueprint.                                   |
| **Lifetime**           | Exists until the program is running.                                                        | Exists as long as there is a reference pointing to it, otherwise garbage collected. |
| **Access**             | Cannot directly access fields or methods; used to define them.                              | Accesses fields and methods defined by the class using the dot operator (`.`).      |
| **Real-World Analogy** | A **blueprint** for building a car.                                                         | A **specific car** built using the blueprint.                                       |

---

## **Wrapper Class**
- Wrapper classes in Java provide a way to use primitive data types as objects. Each primitive type (e.g., int, double, char) has a corresponding wrapper class in the java.lang package.

- Primitive Types and Their Wrapper Classes

| **Primitive Type**   | **Wrapper Class**   |
|----------------------|---------------------|
| `byte`               | `Byte`              |
| `short`              | `Short`             |
| `int`                | `Integer`           |
| `long`               | `Long`              |
| `float`              | `Float`             |
| `double`             | `Double`            |
| `char`               | `Character`         |
| `boolean`            | `Boolean`           |

---
- **Key Features of Wrapper Classes**:
  - Object Representation: Converts primitive data types into objects.
  - Utility Methods: Provides methods for converting between primitives, strings, and other data types.
  - Immutable: Wrapper class objects are immutable, meaning their state cannot be changed after creation.
  - Autoboxing and Unboxing:
    - Autoboxing: Automatic conversion of a primitive type to its corresponding wrapper class.
    - Unboxing: Automatic conversion of a wrapper class object to its corresponding primitive type.
- Example:
```bash
public class WrapperExample {
    public static void main(String[] args) {
        // Autoboxing: Primitive to Wrapper
        int a = 10;
        Integer wrapperA = a;  // Integer.valueOf(a)
        System.out.println("Autoboxing: " + wrapperA);

        // Unboxing: Wrapper to Primitive
        Integer wrapperB = 20;
        int b = wrapperB;  // wrapperB.intValue()
        System.out.println("Unboxing: " + b);
    }
}
```

- ###  `final` Keyword
- The `final` keyword in Java is used to define constants, prevent inheritance, and restrict modifications to variables, methods, or classes. It is an important part of the language to enforce immutability, code security, and clarity.
- When a variable is declared as `final`, its value cannot be changed once it is initialized. It becomes a constant after initialization.

- Syntax:
```bash
  final DataType variableName = value;
```
---

- ### Garbage Collector
- The Garbage Collector (GC) in Java is responsible for managing memory automatically. It helps reclaim memory by deleting objects that are no longer reachable or referenced in a program, freeing up space for new objects. This process ensures efficient memory management and reduces the risk of memory leaks.

- **Key Features of Garbage Collector**:
  - Automatic Memory Management:
    - Java programmers do not need to explicitly free memory (as in languages like C/C++).
    - The Garbage Collector handles memory deallocation for unused objects.
  - Heap Memory Management:
    - Objects are created in the heap memory, which is managed by the GC.
    - GC removes objects that are no longer referenced.
  - Finalization:
    - Before an object is removed, its finalize() method is called, if overridden. This can be used to release resources (e.g., closing files).
    - Note: The use of finalize() is discouraged in modern Java due to its unpredictable behavior and better alternatives (e.g., try-with-resources).
  
- **How the Garbage Collector Works**:
  - The Java GC works based on object reachability:
    - Reachable Objects: Objects that are still accessible through references in the application.
    - Unreachable Objects: Objects that no longer have any reference in the code and are eligible for garbage collection.

- Example:
```java
public class GarbageCollectorExample {
    public static void main(String[] args) {
        // Creating multiple objects in a loop
        for (int i = 0; i < 1000; i++) {
            A obj = new A("Object " + i); // Each iteration creates a new object
        }

        // Requesting garbage collection explicitly
        System.gc();

        System.out.println("Garbage collection requested.");
    }

    static class A {
        String name;

        public A(String name) {
            this.name = name;
            System.out.println("Created: " + name);
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Finalized: " + name);
        }
    }
}
```

- **Limitations of Garbage Collector**:
  - Unpredictability:
    - The timing of garbage collection is not guaranteed.
    - The GC runs in the background and prioritizes system performance.
  - Performance Overhead:
    - Frequent garbage collection can pause application threads (GC pause), affecting performance, especially in real-time systems.
  - No Control Over Execution:
    - Developers cannot control when the GC will reclaim memory; they can only suggest it using System.gc() or Runtime.getRuntime().gc().

