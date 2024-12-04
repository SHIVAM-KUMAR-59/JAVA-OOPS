# OOP 6 | Generics, Custom ArrayList, Lambda Expressions, Exception Handling, Object Cloning

---

## Table of Contents
 - [Generics](#generics)
    - Why Use Generics?
    - How Generics Work
    - Advantages of Generics
 - [Wildcard in Generics](#wildcard-in-generics)
    - Types of Wildcards
 - [CompareTo Method](#compareto-method)
 - [Lambda Functions](#lambda-functions)
    - Key Characteristics
    - Advantages of Lambdas
 - [Exception Handling](#exception-handling)
    - Key Terms
    - Common Exception Handling Keywords
    - Hierarchy of Common Exceptions
 - [Object Cloning](#object-cloning)
    - Steps to Perform Cloning
    - Example Shallow Copy
    - Example Deep Copy
 - [Difference Between Shallow Copy and Deep Copy](#difference-between-shallow-copy-and-deep-copy)

---

## Generics
 - Generics in Java are a feature that allows you to define classes, interfaces, and methods with type parameters. They enable you to write flexible, reusable, and type-safe code by allowing types to be specified as parameters when defining and using a generic class, interface, or method.

 - ### Why Use Generics?
      - **Type Safety**: Ensures that you work with the specified type, reducing runtime errors caused by `ClassCastException`.
        ```java
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        // list.add(123); // Compile-time error
        ```
      - **Code Reusability**: Allows you to write code that works with any data type, avoiding duplication.
        ```java
        public class Box<T> {
          private T value;

          public void set(T value) {
             this.value = value;
          }

          public T get() {
             return value;
          }
        }
        ```
      - **Compile-Time Checking**: Detects errors during compilation, avoiding runtime issues. 
      - **Cleaner Code**: Reduces the need for explicit type casting.
 - ### How Generics Work
      - Generics work with type parameters (e.g., `<T>`), where `T` is a placeholder for a data type. 
      - The type parameter is replaced with an actual data type when the class, interface, or method is used.
 - ### Advantages of Generics
      - **No Type Casting**: Eliminates explicit type casting. 
      - **Reusable Code**: Can be used with any data type. 
      - **Compile-Time Type Checking**: Prevents invalid operations at runtime.

---

 - ## Wildcard in Generics
  - Wildcards in Java Generics represent an unknown type and are denoted by the ? symbol. They provide flexibility when working with generic types, especially when the exact type is unknown or when you want to work with a range of types.
  - ### Types of wildcards
      - **Unbounded Wildcard**: `<?>` accepts any type.
      ```java
       public void printList(List<?> list) {
           for (Object obj : list) {
               System.out.println(obj);
           }
       }
     ```
     - **Upper-Bounded Wildcard**: `<?` extends `T>` accepts `T` or its subclasses.
     ```java
      public void printNumbers(List<? extends Number> list) {
         for (Number num : list) {
            System.out.println(num);
         }
      }
     ```
     - **Lower-Bounded Wildcard**: `<?` super `T>` accepts `T` or its superclasses.
     ```java
     public void addNumbers(List<? super Integer> list) {
       list.add(42);
     }
     ```
 
---

## CompareTo Method
 - The `compareTo()` method in Java is part of the `Comparable` interface and is used to compare objects for order. It's a standard way to define the natural ordering of objects, such as numbers, strings, or custom types.
 - ### Syntax
   ```java
   public int compareTo(T o);
   ```
 - ### Why Use `compareTo(`)?
      - To enable sorting objects using collections like `TreeSet`, `TreeMap`, or methods like `Collections.sort()`.
      - To define custom ordering of objects.
 - ### Example
  ```java
   class Student implements Comparable<Student> {
      int rollNo;
      String name;

      public Student(int rollNo, String name) {
          this.rollNo = rollNo;
          this.name = name;
      }

      @Override
      public int compareTo(Student other) {
          // Natural ordering by roll number
         return this.rollNo - other.rollNo;
      }

      @Override
      public String toString() {
          return "Student{rollNo=" + rollNo + ", name='" + name + "'}";
      }
   }

   public class Main {
      public static void main(String[] args) {
          Student s1 = new Student(101, "Alice");
          Student s2 = new Student(99, "Bob");
          System.out.println(s1.compareTo(s2)); // Positive: s1 > s2
          System.out.println(s2.compareTo(s1)); // Negative: s2 < s1
      }
   }
   ```

---

## Lambda Functions
 - Lambda functions, introduced in Java 8, provide a way to represent functions or expressions in a concise and functional style. They are also known as anonymous functions because they do not have a name like regular methods. Lambdas are primarily used in functional programming and simplify the use of functional interfaces in Java.
 - ### Syntax
      ```bash
       (parameters) -> expression
      ```
 - ### Key Characteristics
      - **No Name**: Lambda functions are anonymous. 
      - **Implemented with Functional Interfaces**: A lambda works with any interface that has a single abstract method, also called a functional interface. For example, Runnable, Comparator, and custom functional interfaces marked with @FunctionalInterface. 
      - **Concise Syntax**: Lambdas avoid boilerplate code, such as defining an entire class for a single method.
 - ### Advantages of Lambdas
      - **Reduced Boilerplate Code**: Removes the need for anonymous inner classes. 
      - **Improved Readability**: Code is more concise and easier to understand. 
      - **Functional Programming**: Enables functional programming constructs in Java. 
      - **Effective for Parallelism**: Used with Java Streams for parallel operations.
 - ### Example
  ```java
  package com.shivam.oop6.generics;

  import java.util.ArrayList;
  import java.util.function.Consumer;

   public class LambdaFunctions {
     public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i < 6; i++){
            arr.add(i);
        }

        // arr.forEach((item) -> System.out.println(item * 2 + " "));

        Consumer<Integer> table = (item) -> System.out.println(item * 2 + " ");
        arr.forEach(table);

        Operation sum = (a, b) -> a + b;
        Operation diff = (a, b) -> a - b;
        Operation product = (a, b) -> a * b;

        LambdaFunctions myCalc = new LambdaFunctions();
        System.out.println(myCalc.operate(5, 3, sum));
        System.out.println(myCalc.operate(5, 3, diff));
        System.out.println(myCalc.operate(5, 3, product));
     }

     private int operate(int a, int b, Operation op){
        return op.operation(a, b);
     }
   }

   interface Operation{
     int operation(int a, int b);
   }
   ```

---

## Exception Handling
 - Exception handling in Java is a mechanism to handle runtime errors and ensure the normal flow of the application. It is a way to manage unexpected or exceptional situations (e.g., invalid input, file not found, network failure) gracefully.
 - ### Key Terms
      - **Exception**: An unexpected event or error that occurs during program execution.
          - **Checked Exceptions**: Exceptions checked at compile-time (e.g., `IOException`).
          - **Unchecked Exceptions**: Exceptions that occur at runtime (e.g., `ArithmeticException`, `NullPointerException`).
      - **Error**: Serious problems that cannot be handled by the program (e.g., `OutOfMemoryError`).
 - ### Common Exception Handling Keywords
      - **try**: Defines a block of code to test for exceptions. 
      - **catch**: Defines a block of code to handle exceptions. 
      - **finally**: Executes code after try and catch, regardless of whether an exception occurred or not. 
      - **throw**: Used to explicitly throw an exception. 
      - **throws**: Declares exceptions a method might throw.
 - ### Syntax: Try Catch Block
 ```bash
 try {
    // Code that might throw an exception
    } catch (ExceptionType1 e1) {
    // Handle ExceptionType1
    } catch (ExceptionType2 e2) {
    // Handle ExceptionType2
    } finally {
    // Optional block to execute cleanup code
    }
 ```
 -  ### Hierarchy of Common Exceptions
       - **Checked Exceptions**:
           - `IOException`
           - `SQLException`
       - **Unchecked Exceptions**:
           - `ArithmeticException`
           - `NullPointerException`
           - `ArrayIndexOutOfBoundsException`
           - `ClassCastException`

---

## Object Cloning
 - Object cloning refers to the process of creating a copy of an existing object. Java provides the Cloneable interface and the Object class's clone() method to achieve this. Cloning is a shallow copy by default, but you can implement deep copy manually.
 - ### Steps to Perform Cloning
      - **Implement Cloneable Interface**:
           - A class must implement the Cloneable interface to indicate that it supports cloning.
      - **Override the clone() Method**:
           - The clone() method of the Object class is used to create a copy of an object.
           - You must override it in your class and handle the CloneNotSupportedException.
      - **Perform a Shallow or Deep Copy**:
          - Shallow Copy: Copies the object's fields but not the referenced objects (nested objects).
          - Deep Copy: Creates copies of the object and its referenced objects.
 - ### Example Shallow Copy
 ```java
 class Student implements Cloneable {
    int id;
    String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding the clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Calls Object's clone method
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(101, "John");
            Student student2 = (Student) student1.clone(); // Cloning student1 into student2

            System.out.println("Original: " + student1);
            System.out.println("Clone: " + student2);

            // Verify if they are different objects
            System.out.println("Are they the same object? " + (student1 == student2));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
 ```

 - ### Example Deep Copy
 ```java
 class Address implements Cloneable {
    String city;

    public Address(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Address{city='" + city + "'}";
    }
}

class Employee implements Cloneable {
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Deep copy: clone the address explicitly
        Employee cloned = (Employee) super.clone();
        cloned.address = (Address) address.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', address=" + address + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Address address = new Address("New York");
            Employee emp1 = new Employee(1, "Alice", address);
            Employee emp2 = (Employee) emp1.clone(); // Deep cloning

            System.out.println("Original: " + emp1);
            System.out.println("Clone: " + emp2);

            // Modify the address in the clone
            emp2.address.city = "Los Angeles";

            // Verify that the original's address is unaffected
            System.out.println("After modification:");
            System.out.println("Original: " + emp1);
            System.out.println("Clone: " + emp2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
```

--- 

## Difference Between Shallow Copy and Deep Copy

| Aspect         | Shallow Copy                                                                                            | Deep Copy                                                                                             |
|----------------|---------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|
| Definition     | Creates a new object but copies only the<br/>references of nested objects, not their<br/>actual values. | Creates a new object and recursively<br/>copies all objects, including nested</br>ones.               |
| Data Copied    | Only the top-level object is duplicated;<br/>inner objects remain the same (shared<br/>references).     | Both the top-level object and all nested<br/>objects are duplicated to create<br/>independent copies. |
| Independence   | Changes in the nested objects of the<br/>original will reflect in the copied object.                    | Changes in the nested objects of the<br/>original do not affect the copied object.                    |
| Performance    | Faster because it only copies references,<br/>not the nested data.                                      | Slower because it involves recursively<br/>copying all nested objects.                                |
| Implementation | Achieved using methods like<br/>`Object.clone()` in Java (default<br/>behavior).                        | Requires custom logic or explicit<br/>recursive copying of nested objects.                            |










