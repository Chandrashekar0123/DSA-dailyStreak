# 📘 Fundamentals of Programming – (Java vs Python)

## 1. Program
A program is a set of instructions written to perform a specific task.  
It tells the computer what to do step by step.  

**Java:** Needs to be written inside a class and compiled first, then run using JVM.  
**Python:** Can be written directly in a file or interpreter, no compilation needed.  

**🔹 Key Difference:** Java is compiled + run, Python is directly executed.

## 2. Source Code
The instructions written by the programmer in a programming language are called source code.  
It is human-readable and stored in files (`.py`, `.java`).  

**Java:** `.java` files → compiled to `.class` files.  
**Python:** `.py` files → executed directly.

## 3. Compiler & Interpreter
**Compiler:** Translates the whole program into machine code at once. Faster execution but takes time.  
**Interpreter:** Translates and executes line by line. Easier but slower.  

**Java:** Compiled to bytecode (`.class`) → executed by JVM.  
**Python:** Purely interpreted.

## 4. Variables
A variable is a name given to a memory location storing data.  

**Java:** Strongly typed.  
```java
int age = 20;

Python: Dynamically typed.

age = 20

```
===

# 🔹 Key Difference: Java needs type declaration; Python does not.

---

5. Data Types

Java: byte, short, int, float, double, char, boolean, String
Python: int, float, str, bool, list, tuple, dict

6. Input and Output
```
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
System.out.println("Hello");
```

Python:

```
n = int(input("Enter: "))
print("Hello")
```
===

7. Keywords
---
Java: ~50 reserved words (int, class, public, static, void)
Python: ~35 reserved words (def, class, if, else, import)

===

9. Conditional Statements
---
🔹 Conditional Statements (if-elif-else)

Used for decision making.

Program checks a condition (like is age > 18?) → if true, one block runs; otherwise, another.

You can chain multiple conditions using else if (Java) or elif (Python).

Ensures only one path of execution is chosen based on conditions.

Decision-making statements.

Java:

```
if(condition) {
    // code
} else if(condition2) {
    // code
} else {
    // code
}
```

python
```
if condition:
    # code
elif condition2:
    # code
else:
    # code
```
===

9. Switch Statement

---

A multi-way branching mechanism.

Instead of writing many if-else checks, you use switch to directly match a variable’s value with different cases.

Each case runs its block if matched; otherwise, the default case runs.

In Python (from version 3.10), match-case is used instead of switch.
Java:

```
switch(day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Other");
}
```

Python (3.10+):

```
match day:
    case 1: print("Monday")
    case 2: print("Tuesday")
    case _: print("Other")
```





