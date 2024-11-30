## OOP-1 Introduction and Basics

## **Contents**

- [**Introduction to OOP**](#introduction-to-oop)
- [**Classes**](#classes)
- [**Objects**](#objects)
- [**Creating Objects**](#creating-objects)
- [**Instance Variables**](#accessing-the-instance-variables)
- [**Constructors**](#constructors)
    - [Default Constructor](#1-default-constructor)
    - [Parameterized Constructor](#2-parameterized-constructor)
    - [Copy Constructor](#3-copy-constructor)
- [**Class vs Object**](#class-vs-object)

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

- ## Objects 
- An object is an instance of a class. It represents a real-world entity with:
  - State: The data or attributes of the object, represented by fields in the class.
  - Behavior: The actions the object can perform, defined by methods in the class.
  - Objects are the building blocks of object-oriented programming (OOP) and are used to encapsulate data and behavior together.
- Key Characteristics of Objects
  - Identity: A unique reference or name that distinguishes one object from another.
  - State: The values of an object's fields (attributes) at a given time.
  - Behavior: Actions or functions that the object can perform, defined by the class methods.

- `new` Operator --> The new operator in Java is used to create new objects or allocate memory for objects or arrays dynamically. It plays a key role in instantiating a class.

- Creating an Object 
  - To create an object in Java, you use the new keyword to instantiate a class.
  ```bash
   ClassName objectName = new ClassName(parameters);
  ```

- Accessing the instance variables
  - The variables inside an object are called instance variables. To access the variables inside the object, we use dot `.` operator or separator.
  ```bash
  objectName.objectVariable;
  ```
  
- ## Constructors
- A constructor is a special method in Java used to initialize objects. It is called when an object of a class is created. Constructors set up the initial state of an object by assigning values to its fields and executing any setup logic required.
- Features of Constructors:
  - Same Name as Class: The name of the constructor must match the name of the class.
  - No Return Type: Constructors do not have a return type, not even void.
  - Automatically Called: Constructors are automatically invoked when an object is created.
    - Overloading Supported: Multiple constructors can exist in a class with different parameter lists.

      - Types of Constructors:
          - 1. Default Constructor:
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
          - 2. Parameterized Constructor:
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
          - 3. Copy Constructor:
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

- `this` Keyword --> The `this` keyword in Java is a reference variable that refers to the current instance of the class. It is primarily used to eliminate ambiguity when instance variables and parameters have the same name or to invoke other methods/constructors within the same class.
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

# **Class vs Object**

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
