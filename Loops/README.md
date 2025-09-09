# 🔄 Loops in Programming (Java vs Python)

Loops allow a program to **repeat a block of code multiple times** until a condition is met.  
They help reduce repetition and make programs more efficient.

---

## 1. For Loop
- **Purpose:** Best when the number of iterations is already known.  
- **Java:** Traditional `for(initialization; condition; update)`  
- **Python:** Uses `for variable in sequence` to iterate directly over ranges, lists, or other collections.  

👉 Example use cases: printing numbers 1–10, iterating through arrays or lists.

---

## 2. While Loop
- **Purpose:** Used when the number of iterations is **not known in advance**.  
- The loop continues as long as the condition remains true.  

👉 Example use cases: reading data until the end of a file, repeating until user enters valid input.

---

## 3. Do-While Loop (Java only)
- **Purpose:** Similar to `while`, but guarantees **at least one execution** before the condition is checked.  
- Python does not have a direct do-while loop, but it can be simulated using `while True` with a `break` condition.  

👉 Example use cases: menu-driven programs, running until the user chooses to exit.

---

## 4. Enhanced For Loop (Java) / For-Each Loop
- **Java:** Enhanced `for-each` loop simplifies iteration over arrays and collections.  
- **Python:** The normal `for` loop already behaves like a for-each loop.  

👉 Example use cases: iterating over elements in a list, dictionary, or set.

---

## 🔹 Key Differences Between Java and Python Loops
- Java has **more loop structures** (`for`, `while`, `do-while`, `enhanced for`).  
- Python keeps it simple with **`for` and `while`**, but its `for` loop is powerful since it can directly iterate over sequences and iterators.  
- Both languages support `break` (to exit early) and `continue` (to skip current iteration).  

---
