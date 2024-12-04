# OOP 6 | Generics, Custom ArrayList, Lambda Expressions, Exception Handling, Object Cloning

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

 - ### Wildcard in Generics
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

## Compare To Method
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








