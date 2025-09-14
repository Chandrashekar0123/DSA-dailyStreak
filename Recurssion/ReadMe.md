# 🌀 Recursion in Java

This section contains multiple **recursion-based Java programs** demonstrating basic to advanced problems solved using the recursive approach. Each file focuses on a particular concept, starting from simple printing to more complex string manipulations and combinatorial problems.

---

## Introduction to Recursion

Recursion is a programming technique in which a function calls itself directly or indirectly to solve a problem.
It is based on the concept of breaking a large problem into smaller subproblems, solving the smallest one first (base case) and then combining results.

---

## Key Components of Recursion:

Base Case – The condition where recursion stops.

Recursive Case – The part where the function calls itself with a smaller input.

Stack Usage – Every recursive call is pushed onto the call stack until the base case is reached.

---

## Types of Recursion:

Direct Recursion – Function calls itself directly.

Indirect Recursion – Function A calls B, and B calls A.

Tail Recursion – Recursive call is the last operation in the function.

Non-Tail Recursion – Recursive call is followed by more operations.

---

## Advantages:

Makes code shorter and easier to read for problems like tree traversal or divide-and-conquer.

---

## Disadvantages:

Uses more memory (stack frames).

Can lead to stack overflow if the base case is not defined properly.

---

## 📂 Files Overview

### 🔹 Basic Recursion Programs
- **[Printing elements using Recursion](Recurssion/PrintRecurssion.java)**  
  Recursively prints elements (numbers, arrays, or characters) without using loops.

- **[Sum of Natural Numbers](Recurssion/SumOfNaturalNumbers.java)**  
  Calculates the sum of the first `n` natural numbers using recursion.

- **[Factorial](Recurssion/Factorial.java)**  
  Computes factorial of a given number using recursion.

- **[Fibonacci](Recurssion/Fibonacci.java)**  
  Prints or returns Fibonacci numbers using recursion.

- **[Power Of n](Recurssion/PowerOfn.java)**  
  Calculates `x^n` using recursive exponentiation.

- **[Tower of Hanoi](Recurssion/TowerOfHanoi.java)**  
  Solves the Tower of Hanoi problem showing the moves from one peg to another.

- **[Reverse String](Recurssion/ReverseString.java)**  
  Reverses a given string using recursion.

---

### 🔹 String Manipulation using Recursion
- **[First and Last Occurrence](Recurssion/FirstLastOccurrence.java)**  
  Finds the first and last occurrence of a given character in a string.

- **[Strictly Sorted](Recurssion/StrictlySorted.java)**  
  Checks if an array is strictly sorted (handles duplicates as well).

- **[Move All X](Recurssion/MoveAllX.java)**  
  Moves all occurrences of a character (e.g., ‘x’) to the end of the string.

- **[Remove Duplicates](Recurssion/RemoveDuplicates.java)**  
  Removes duplicate characters from a string while preserving order.

- **[Subsequences](Recurssion/Subsequences.java)**  
  Prints all possible subsequences of a given string.

- **[Keypad Combinations](Recurssion/KeypadCombinations.java)**  
  Generates all possible letter combinations from a given number using the classic mobile keypad mapping.

- **[Unique Subsequences](Recurssion/UniqueSubsequences.java)**  
  Prints all **unique** subsequences of a string, avoiding duplicates.

---

## ⚙️ Topics Covered
- Printing and traversing recursively  
- Mathematical recursion (sum, factorial, power, Fibonacci)  
- Classic problems (Tower of Hanoi)  
- String recursion (reverse, remove duplicates, move characters)  
- Generating subsequences and keypad combinations  

---

## 🕒 Time Complexities (General)
| Problem | Time Complexity |
|----------|-----------------|
| Printing elements | O(n) |
| Sum of natural numbers | O(n) |
| Factorial | O(n) |
| Fibonacci (naive) | O(2ⁿ) |
| Power of n (optimized exponentiation) | O(log n) |
| Tower of Hanoi | O(2ⁿ) moves |
| Reverse String | O(n) |
| First & Last Occurrence | O(n) |
| Strictly Sorted Array Check | O(n) |
| Move All X | O(n) |
| Remove Duplicates | O(n) |
| Subsequences | O(2ⁿ) |
| Keypad Combinations | O(4ⁿ) (worst case) |
| Unique Subsequences | O(2ⁿ) but with extra space for uniqueness |

---

## 📝 Notes
- All these programs **use recursion instead of loops** to solve the problems.  
- Complexities vary depending on the nature of recursion and branching factor.  
- Great for understanding **backtracking**, **divide-and-conquer**, and **string recursion** concepts.

---
