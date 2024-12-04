# OOP 7 | Collections Framework, Vector Class, Enums in Java

---

## Table of Contents
 - [Collections Framework](#collections-framework)
    - Key Components of the Collections Framework
    - Advantages of Collections Framework
 - [`Vector` Class](#vector-class)
    - Key Features of Vector
    - When to Use Vector
    - Difference Between `Vector` and `ArrayList`
 - [Enums in Java](#enums-in-java)
    - Key Features of Enums
    - Advantages of Enums
    - When to Use Enums
 - [Enums in Inheritance](#enums-in-inheritance)
    - Key Points about Enums and Inheritance
    - Why Enums Cannot Extend Other Enums or Classes

---

## Collections Framework
![Screenshot 2024-12-04 at 14.54.37.png](Screenshot%202024-12-04%20at%2014.54.37.png)
 
 - The Collections Framework in Java is a unified architecture for handling groups of objects. It provides interfaces, classes, and algorithms to efficiently manage, store, and manipulate data. Introduced in Java 2, it has since become a core part of the Java programming language.

 - ### Key Components of the Collections Framework
      - **Interfaces**: Interfaces define the contract for data structures in the framework. The main interfaces are:
      - | Interface    | Description                                                                                          |
        |--------------|------------------------------------------------------------------------------------------------------|
        | `Collection` | The root interface representing a group of objects.                                                  |
        | `List`       | An ordered collection that allows duplicates (e.g., `ArrayList`, `LinkedList`).                      |
        | `Set `       | A collection that does not allow duplicate elements (e.g., `HashSet`, `TreeSet`).                    |
        | `Queue`      | A collection designed for holding elements prior to processing (e.g., `PriorityQueue`,<br/>`Deque`). |
        | `Deque`      | A double-ended queue allowing addition/removal from both ends.                                       |
        | `Map`        | Represents key-value pairs, where keys are unique (e.g., `HashMap`, `TreeMap`).                      |
        | `SortedSet`  | A Set that maintains elements in a sorted order.                                                     |
        | `SortedMap`  | A Map that maintains keys in a sorted order.                                                         |
      - **Implementations (Classes)**: Concrete implementations of the interfaces provide specific data structures with varying characteristics.
      - | Class           | Implements          | Characteristics                                                                |
        |-----------------|---------------------|--------------------------------------------------------------------------------|
        | `ArrayList`     | `List`              | Dynamic array; allows random access; resizable.                                |
        | `LinkedList`    | `List`,<br/>`Deque` | Doubly linked list; efficient insertions and deletions.                        |
        | `HashSet`       | `Set`               | Unordered; does not allow duplicates; backed by a `HashMap`.                   |
        | `HashMap`       | `Map`               | Unordered key-value pairs; allows one `null` key and multiple `null` values.   |
        | `PriorityQueue` | `Queue`             | 	Implements a priority heap; elements are ordered based on their<br/>priority. |
        | `Stack`         | `Dequeue`           | LIFO data structure; extends `Vector`.                                         |
      - **Utility Classes**: Java provides several utility classes in the java.util package to perform operations like sorting, searching, and synchronization on collections. 
          - `Collections`: A class with static methods for manipulating collections (e.g., sorting, reversing, shuffling). 
          - `Arrays`: Provides utility methods for arrays (e.g., converting arrays to lists, sorting arrays).
 - ### Advantages of Collections Framework
      - **Standardization**: Provides a common interface for various data structures. 
      - **Reusable Algorithms**: Ready-to-use methods for operations like sorting and searching. 
      - **Performance**: Efficient implementations for various scenarios. 
      - **Flexibility**: Supports dynamic resizing and various types of collections. 
      - **Interoperability**: Collections can be converted to arrays and vice versa.
   
---

## `Vector` Class
 - The `Vector` class in Java is part of the `java.util` package and represents a resizable array. It is similar to `ArrayList `but is synchronized, meaning it is thread-safe and can be used in multi-threaded environments.
 - ### Key Features of Vector
      - **Thread-Safety**: `Vector` is synchronized, making it thread-safe for concurrent access.
      - **Resizable Array**: Automatically grows as elements are added.
      - **Legacy Class**: Introduced in Java 1.0, it is part of Java's legacy collection classes but fully compatible with the Collections Framework since Java 2.
      - **Performance**: Slower compared to non-synchronized alternatives like `ArrayList` due to synchronization overhead.
 - ### When to Use Vector
      - Use `Vector` when you need a thread-safe dynamic array and are okay with the performance trade-off.
      - Prefer `ArrayList` or other modern alternatives if synchronization is not required, as they are faster and more efficient.
 - ### Difference Between `Vector` and `ArrayList`
 - | Aspect            | Vector                                  | ArrayList                            |
   |-------------------|-----------------------------------------|--------------------------------------|
   | **Thread-Safety** | Synchronized (thread-safe).             | Not synchronized (not thread-safe).  |
   | **Performance**   | Slower due to synchronization overhead. | Faster since it is not synchronized. |
   | **Growth Rate**   | Doubles its size when resized.          | Increases by 50% when resized.       |
   | **Legacy**        | Legacy class; part of Java 1.0.         | Modern class introduced in Java 2.   |
 - In general, `ArrayList` is preferred over `Vector` for modern applications unless thread-safety is explicitly required.

---

## Enums in Java
 - Enums (short for **enumerations**) in Java represent a special data type that defines a fixed set of constants. These constants are implicitly `public`, `static`, and `final`, meaning they are unchangeable and globally accessible. Enums are used to represent a group of named values, making the code more readable and type-safe.
 - ### Key Features of Enums
      - **Type Safety**: Enums restrict the values a variable can take, reducing bugs caused by invalid values.
      - **Predefined Constants**: Enums have predefined values, making them ideal for representing fixed sets like days of the week, months, etc.
      - **Methods and Fields**: Enums can have methods, fields, and constructors, making them versatile.
      - **Implements Interfaces**: Enums can implement interfaces.
      - **Built-in Methods**:
          - `values()` – Returns an array of all enum constants.
          - `ordinal()` – Returns the index (zero-based) of the constant.
          - `valueOf(String name)` – Converts a string to the corresponding enum constant.
 - ### Advantages of Enums
      - **Improved Readability**: Enums make code self-explanatory.
      - **Compile-Time Checking**: Errors are caught during compilation instead of runtime.
      - **Type Safety**: Prevents invalid assignments.
 - ### When to Use Enums
      - To represent fixed sets of constants, e.g., days of the week, directions, traffic lights.
      - When constants need to be grouped and associated with specific behaviors or data.

 - ### Syntax
   ```java
   enum EnumName {
    CONSTANT1, CONSTANT2, CONSTANT3;
   }
   ```
 - ### Example
   ```java
   enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
   }

   public class EnumExample {
       public static void main(String[] args) {
         // Accessing an Enum constant
         Day today = Day.MONDAY;

         // Print the Enum value
         System.out.println("Today is: " + today); // Output: Today is: MONDAY

         // Iterate over Enum values
         for (Day day : Day.values()) {
            System.out.println(day);
         }
       }
   }
   ```
   
---

## Enums in Inheritance
 - In Java, enums are a special data type that represent a fixed set of constants. Enums are implicitly final and cannot be subclassed. This means that they do not participate in inheritance like regular classes. However, you can still apply some inheritance-like behavior within an enum by using interfaces or methods. 
 - ### Key Points about Enums and Inheritance
  - **Cannot Extend Other Enums or Classes**:
      - An enum cannot inherit from any other class or enum, as all enums implicitly extend `java.lang.Enum`. 
      - An enum can implement interfaces, but it cannot extend any class (other than `Enum`). 
  - **Enum Constants as Objects**:
      - Enum constants themselves are objects of the enum type. You can override methods within each enum constant.
  - **Using Interfaces for Enum Inheritance**:
      - While enums cannot inherit from other enums or classes, they can implement interfaces, which allows them to exhibit behavior similar to inheritance.
 - ### Why Enums Cannot Extend Other Enums or Classes
      - **Final by Default**: Enums are implicitly `final` to ensure that no other class can extend or modify them. This makes them safer and guarantees that the set of constants defined by the enum is immutable. 
      - **Single Inheritance**: Java does not support multiple inheritance for classes, and since enums are implicitly `final`, they cannot extend any class or enum.

---
