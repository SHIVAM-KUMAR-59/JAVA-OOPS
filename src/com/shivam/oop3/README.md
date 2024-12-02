# OOP-3 Principles - Inheritance, Polymorphism, Encapsulation, Abstraction

---

## Table of Contents
1. [Inheritance](#inheritance)
    - Superclass and Subclass
    - `extends` Keyword
    - `super` Keyword
    - Access Modifiers and Inheritance
    - Types of Inheritance
2. [Polymorphism](#polymorphism)
    - Compile-Time Polymorphism (Method Overloading)
    - Run-Time Polymorphism (Method Overriding)
    - Key Features of Polymorphism
3. [Encapsulation](#encapsulation)
    - Key Points of Encapsulation
    - Steps to Achieve Encapsulation
    - Example: Bank Account System
4. [Abstraction](#abstraction)
    - Key Concepts of Abstraction
    - Achieved Through Abstract Classes and Interfaces
    - Example: Bank Loan Interest System
5. [Abstraction VS Encapsulation](#encapsulation-vs-abstraction)
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

--- 

## Encapsulation
It is the process of wrapping data (fields/variables) and code (methods) into a single unit (class) and restricting direct access to some of the object's components to ensure controlled manipulation.

- ### Key Points of Encapsulation:
     - **Data Hiding**: Encapsulation hides the internal state of the object from the outside world. It provides controlled access via getter and setter methods.
     - **Improved Security**: By restricting access, encapsulation prevents unauthorized or accidental modifications to an object's data.
     - **Modularity**: Encapsulation allows you to change the implementation details of a class without affecting other parts of the code.
     - **Ease of Maintenance**: Encapsulation makes it easier to debug and maintain the code.
- ### Steps to Achieve Encapsulation:
     - **Declare Fields as private**: This prevents direct access to the fields from outside the class.
     - **Provide public Getter and Setter Methods**: 
         - Use getter methods to access the value of private fields.
         - Use setter methods to modify the value of private fields.
- ### Example
```java
package com.shivam.oop3.encapsulation;

public class BankAccount {
    // Private fields
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for accountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
```

### Main Class
```java
package com.shivam.oop3.encapsulation;

public class Main {
    public static void main(String[] args) {
        // Create a new BankAccount object
        BankAccount account = new BankAccount("Shivam Kumar", 1000);

        // Access and modify fields using getter and setter
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit money
        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw money
        account.withdraw(300);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Attempt to withdraw an invalid amount
        account.withdraw(2000); // This should print an error message
    }
}
```

---

## Abstraction
Abstraction is one of the key principles of Object-Oriented Programming (OOP). It focuses on exposing only essential details and hiding the implementation specifics. By doing so, abstraction simplifies the complexity of a system by allowing users to interact with an object at a higher, more conceptual level.

- ### Key Concepts of Abstraction:
    - **Hiding Implementation**: Users of a class or method only see what it does, not how it does it.
    - **Improves Code Clarity**: By exposing only necessary features, abstraction reduces code complexity.
    - **Achieved Through**:
        - Abstract Classes 
        - Interfaces
- ### Example
```java
package com.shivam.oop3.abstraction;

// Abstract Class for Bank
abstract class Bank {
    abstract void loanInterestRate();

    public void displayBankName() {
        System.out.println("Welcome to Shivam Bank!");
    }
}

// Subclass 1
class SBI extends Bank {
    @Override
    void loanInterestRate() {
        System.out.println("SBI Loan Interest Rate: 7.5%");
    }
}

// Subclass 2
class HDFC extends Bank {
    @Override
    void loanInterestRate() {
        System.out.println("HDFC Loan Interest Rate: 8.2%");
    }
}

// Main Class
public class BankMain {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();

        sbi.displayBankName();
        sbi.loanInterestRate();   // Output: SBI Loan Interest Rate: 7.5%

        hdfc.displayBankName();
        hdfc.loanInterestRate();  // Output: HDFC Loan Interest Rate: 8.2%
    }
}
```

---

## Encapsulation VS Abstraction

| **Aspect**                  | **Abstraction**                                                                                                    | **Encapsulation**                                                                |
|-----------------------------|--------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------|
| **Definition**              | Hides the implementation details while showing only the functionality.                                             | Wraps data (variables) and methods into a single unit (class).                   |
| **Focus**                   | Focuses on *what* the object does.                                                                                 | Focuses on *how* the object is implemented.                                      |
| **Purpose**                 | To hide complex implementation from the user.                                                                      | To protect data and ensure controlled access through methods.                    |
| **Achieved By**             | Using `abstract` classes and `interfaces`.                                                                         | Using `private`, `protected`, and `public` access modifiers.                     |
| **Security**                | Provides partial security by hiding implementation details.                                                        | Provides full security by restricting direct access to data.                     |
| **Flexibility**             | Allows flexibility by enabling different implementations for the same functionality.                               | Restricts direct access but allows controlled changes via getter/setter methods. |
| **Real-World Example**      | **ATM Machine**: User knows how to withdraw cash (functionality) but not how it works internally (implementation). | **Capsule**: Medicine encapsulated within a protective outer shell.              |
| **Use Case**                | When defining a contract or exposing essential functionality to users.                                             | When securing sensitive data or enforcing specific constraints.                  |
| **Code Example**            | Abstract class or interface defining behaviors without implementation.                                             | A class with private fields and public getters/setters.                          |



