## OOP-1 Introduction and Basics 

**Classes** --> A class in Java is a blueprint for creating objects. It defines the structure and behavior that the objects created from the class will have. This includes:
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

**Objects** --> An object is an instance of a class. It represents a real-world entity with:
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
