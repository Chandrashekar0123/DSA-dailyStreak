# 📚 Functions in Python & Methods in Java — Detailed Notes

## 🔹 Functions in Python
- A **function** in Python is a reusable block of code that performs a specific task.
- Defined using the `def` keyword.
- Improves **code reusability**, **organization**, and **readability**.
- Can accept **parameters** and **return values**.
- Python functions are **first-class objects** (can be passed as arguments, returned from other functions, or assigned to variables).
- Support **default parameters**, **variable-length arguments** (`*args`, `**kwargs`), and **anonymous functions** (lambdas).
- Scope of variables in functions is **local** unless declared `global` or `nonlocal`.

**Key Points**
- **Built-in functions**: Already provided (e.g., `len()`, `print()`).
- **User-defined functions**: Created by programmers.
- **Return values**: Optional — functions return `None` by default if no value is returned.
- **Docstrings**: Triple quotes used to document a function.
- **Function overloading**: Not natively supported; can be simulated with default parameters or type checks.

---

## 🔹 Methods in Java
- A **method** in Java is similar to a function but always defined inside a **class**.
- Methods describe the **behavior** of objects and enable **object-oriented programming**.
- Can accept **parameters** and **return values**.
- Two main types:
  - **Static methods**: Belong to the class; can be called without an object.
  - **Instance methods**: Belong to an object; require an instance to call.
- Java supports **method overloading** (same method name, different parameter list).
- Access controlled via **modifiers** (`public`, `private`, `protected`, `default`).
- Java methods cannot exist outside a class.

**Key Points**
- **Predefined methods**: Already in Java libraries (e.g., `Math.sqrt()`).
- **User-defined methods**: Created inside a class by programmers.
- **Return types**: Must be specified; use `void` for no return value.
- **Encapsulation**: Methods hide internal implementation details.

---

## 🔹 General Differences — Functions vs Methods

| Feature                        | Python Functions                                 | Java Methods                                   |
|--------------------------------|------------------------------------------------|----------------------------------------------|
| **Definition Location**         | Can be defined anywhere (inside or outside classes) | Always inside a class                        |
| **Keyword**                     | Defined using `def`                             | Defined with access modifier + return type + name |
| **First-class Objects**         | Yes — can be passed around as data              | No — methods are tied to classes/objects     |
| **Static Context**              | Functions are standalone by default             | Need `static` keyword to be standalone       |
| **Return Type**                 | Not required to declare; dynamic                | Must declare return type explicitly          |
| **Overloading**                 | Not directly supported                          | Fully supported                              |
| **Encapsulation / OOP**         | Not mandatory                                  | Central to Java’s OOP design                |
| **Modifiers**                   | None (Python has no access modifiers)           | Public, private, protected, default allowed  |
| **Scope Handling**              | Dynamic (LEGB rule: Local, Enclosing, Global, Built-in) | Fixed (class scope, method scope)           |

---

## 🔹 Summary
- **Python Functions** are lightweight, flexible, and can exist anywhere in the program.
- **Java Methods** are part of classes, enabling OOP and stricter typing.
- Both improve **reusability**, **modularity**, and **maintainability** of code.
- The main difference is that Python allows standalone functions, while Java enforces methods to be inside classes.
