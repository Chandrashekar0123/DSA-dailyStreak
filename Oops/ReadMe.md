# Object-Oriented Programming in Java – Examples & Concepts  

This Folder contains Java programs demonstrating the core concepts of **Object-Oriented Programming (OOP)**.  
Each file corresponds to an important OOP topic with practical examples.  

---

## 🧠 Introduction to OOP  

**Object-Oriented Programming (OOP)** is a programming paradigm that organizes software design around **objects** rather than functions or logic.  
An **object** bundles data (fields/attributes) and behavior (methods/functions) together, mimicking real-world entities.

### 🔹 Key Features of OOP:
- **Abstraction** – Hiding implementation details and showing only essential features.
- **Encapsulation** – Binding data and methods together, restricting direct access to data.
- **Inheritance** – Reusing properties and behaviors from existing classes.
- **Polymorphism** – Having multiple forms of the same behavior (method overloading/overriding).

### 🔹 Benefits of OOP:
- Reusability of code  
- Better organization & modularity  
- Scalability for large applications  
- Security & data hiding  
- Easier debugging & maintenance  

---

## 1️⃣ **Classes and Objects**

- [Basic Program for Classes and Objects](classandobject.java)

A **class** is a blueprint; an **object** is an instance of that class.  
Example: A `Car` class defines attributes like `brand`, `model`, `speed` and methods like `accelerate()` and `brake()`. An actual car you own is an **object** of the `Car` class.

**Applications:**  
- Real-world modeling (bank accounts, employees, students)  
- Modular application development  
- Game development (characters, weapons, environments)

---

## 2️⃣ **Constructors**

- [Constructor](Constructor.java)  
- [Copy Constructor](CopyConstructor.java)

**Constructors** are special methods automatically invoked when objects are created.  
They initialize the object’s state.  
- **Default Constructor**: no arguments  
- **Parameterized Constructor**: accepts parameters  
- **Copy Constructor**: creates a new object as a copy of another

**Applications:**  
- Setting default values during object creation  
- Ensuring objects are always initialized properly  
- Creating immutable or pre-configured objects easily  

---

## 3️⃣ **Polymorphism**

- [Polymorphism](Polymorphism.java)

**Polymorphism** means “many forms.”  
Two main types:  
- **Compile-time (Method Overloading)** – same method name, different parameters  
- **Runtime (Method Overriding)** – subclass provides a specific implementation of a method already defined in its parent class  

**Applications:**  
- Using one interface with multiple implementations  
- Flexible and reusable code  
- Implementing design patterns such as Strategy or State  

---

## 4️⃣ **Inheritance**

- [Single Inheritance](Vehicle.java)  
- [Multi-Level Inheritance](Transport.java)  
- [Hierarchical Inheritance](Circle.java)

**Inheritance** allows one class (child) to inherit fields and methods from another (parent).  
- **Single Inheritance:** one parent → one child  
- **Multi-Level Inheritance:** chain of inheritance (grandparent → parent → child)  
- **Hierarchical Inheritance:** one parent → multiple children  

**Applications:**  
- Reusing code across related classes  
- Creating class hierarchies (vehicles → car, bike, truck)  
- Implementing frameworks and libraries  

---

## 5️⃣ **Interfaces**

- [Interface Example](MusicPlayer.java)

An **interface** defines a contract (method signatures) that a class must implement.  
Interfaces achieve **abstraction** and **multiple inheritance** in Java.  

**Applications:**  
- Payment gateways (PayPal, Stripe implementing Payment interface)  
- Hardware device drivers  
- Event listeners and callbacks in GUI frameworks  

---

## 6️⃣ **Encapsulation**

- [Encapsulation](Encapsulation.java)

**Encapsulation** means wrapping data and methods into a single unit and restricting direct access to the data.  
We use **private fields** with **public getters and setters**.

**Applications:**  
- Securing sensitive data (bank balance, passwords)  
- Ensuring controlled access and validation  
- Decoupling internal logic from outside code  

---

## 7️⃣ **Abstraction**

- [Abstraction with Inheritance](ShapeDemo.java)  
- [Abstraction Using Interface](PaymentDemo.java)

**Abstraction** hides the implementation details from the user and shows only essential functionality.  
Two ways in Java:  
- Using **abstract classes**  
- Using **interfaces**  

**Applications:**  
- API and library development  
- Payment processing (common interface for different providers)  
- Vehicle types (abstract `Vehicle` with concrete subclasses Car, Bike)  

---

## 📝 Summary Table of Files

| Concept                    | Example File |
|----------------------------|--------------|
| Classes & Objects          | [classandobject.java](classandobject.java) |
| Constructor                | [Constructor.java](Constructor.java) |
| Copy Constructor           | [CopyConstructor.java](CopyConstructor.java) |
| Polymorphism               | [Polymorphism.java](Polymorphism.java) |
| Single Inheritance         | [Vehicle.java](Vehicle.java) |
| Multi-Level Inheritance    | [Transport.java](Transport.java) |
| Hierarchical Inheritance   | [Circle.java](Circle.java) |
| Interface Example          | [MusicPlayer.java](MusicPlayer.java) |
| Encapsulation              | [Encapsulation.java](Encapsulation.java) |
| Abstraction (Abstract Class)| [ShapeDemo.java](ShapeDemo.java) |
| Abstraction (Interface)    | [PaymentDemo.java](PaymentDemo.java) |

---

## 🌍 Real-World Use Cases of OOP  
- **Banking Systems**: encapsulating customer details, inheritance for account types, interfaces for payment methods  
- **E-Commerce Platforms**: products, orders, carts as classes with polymorphic behavior  
- **Game Development**: player classes, weapons, levels, events  
- **Healthcare Systems**: patient records, doctor scheduling, treatment hierarchies  
- **IoT Systems**: devices implementing a common interface, abstracting device protocols  

---

## 🚀 How to Run the Programs  

1. Clone the repository.  
2. Navigate to the folder containing the `.java` files.  
3. Compile any file using `javac FileName.java`.  
4. Run using `java FileName`.  

Example:  
```bash
javac classandobject.java
java classandobject
