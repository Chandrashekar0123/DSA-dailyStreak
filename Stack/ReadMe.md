
# 📌 Stack in Java – Complete Documentation

## 🔹 What is a Stack?
A **Stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle.  
👉 The element inserted last is the first one to be removed.  

**Real-Life Analogy:**  
Think of a stack of plates: you always place a plate on the top and also remove from the top.

---

## 🔹 Core Stack Operations
| Operation | Description | Time Complexity |
|-----------|-------------|-----------------|
| `push(x)` | Insert element `x` at the **top** | O(1) |
| `pop()` | Remove and return the **top** element | O(1) |
| `peek()` | Return the **top element** without removing it | O(1) |
| `isEmpty()` | Check if the stack is empty | O(1) |
| `size()` | Return the total number of elements | O(1) |
| `search(x)` | Returns position of element `x` (Collections Stack) | O(n) |

---

## 🔹 Advanced Operations
| Operation | Description | Time Complexity |
|-----------|-------------|-----------------|
| `addAtBottom(x)` | Insert an element at the **bottom** using recursion | O(n) |
| `reverse()` | Reverse the entire stack using recursion | O(n²) |
| `display()` | Print all elements of stack | O(n) |
| `clear()` | Remove all elements from stack | O(n) |

---

## 📂 Files in this Folder

### 1️⃣ [Stack using Linked List](StackLL.java)
- Implemented **from scratch** using a custom `Node` class.  
- Each node stores `data` and a pointer `next`.  
- Operations:
  - `push()`
  - `pop()`
  - `peek()`
  - `isEmpty()`
  - `size()`
  - `display()`
- **Advantages:** Dynamic size, no resizing issues.  
- **Disadvantages:** Extra memory for pointers.  

---

### 2️⃣ [Stack using ArrayList](StackAL.java)
- Uses **Java ArrayList** internally.  
- Operations:
  - `push(x)` → `list.add(x)`
  - `pop()` → `list.remove(size-1)`
  - `peek()` → `list.get(size-1)`
  - `isEmpty()`, `size()`
- **Advantages:** Simpler, efficient random access.  
- **Disadvantages:** May require resizing internally.  

---

### 3️⃣ [Stack using Collections](StackCollections.java)
- Uses **`java.util.Stack`** (extends `Vector`).  
- Ready-made methods:
  - `push(x)`
  - `pop()`
  - `peek()`
  - `isEmpty()`
  - `search(x)`
- **Advantages:** Built-in, reliable, thread-safe.  
- **Best Choice:** When you don’t need to reinvent the wheel.  

---

### 4️⃣ [Adding (Pushing) an Element at Bottom](addAtBottom.java)
- Implemented using **recursion**.  
- Steps:
  1. Pop all elements until stack is empty.
  2. Insert the new element at bottom.
  3. Push back all popped elements.  
- Example:  
  Input: `[10, 20, 30]`, addAtBottom(40)  
  Output: `[40, 10, 20, 30]`  

---

### 5️⃣ [Reverse the Stack](ReverseStack.java)
- Implemented using **recursion**.  
- Steps:
  1. Pop top element.
  2. Reverse the remaining stack.
  3. Insert the popped element at the bottom.  
- Example:  
  Input: `[10, 20, 30]`  
  Output: `[30, 20, 10]`  

---

### 6️⃣ [Notes](ReadMe.md)
- This file (current one) contains **complete documentation**:
  - Definition
  - Operations
  - Implementations
  - Advanced Operations
  - Applications

---

## 🔹 Applications of Stack
1. **Function Calls (Recursion Stack):** Keeps track of function calls.  
2. **Undo/Redo in Editors:** Stores previous states.  
3. **Balanced Parentheses Check:** Used in compilers.  
4. **Expression Conversion:** Infix ↔ Postfix ↔ Prefix.  
5. **Backtracking Algorithms:** Maze solving, Sudoku, DFS.  
6. **Browser Navigation:** Backward/Forward history.  
7. **String Reversal:** Simple reversal using stack.  
8. **Parsing Expressions:** Arithmetic expression evaluation.  
9. **AI/ML Algorithms:** DFS in search problems.  

---

## 🔹 Example Run (Java Collections Stack)

```java
import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack); // [10, 20, 30]

        // Peek
        System.out.println("Top Element: " + stack.peek()); // 30

        // Pop
        System.out.println("Popped: " + stack.pop()); // 30

        // Size
        System.out.println("Size: " + stack.size()); // 2

        // Search
        System.out.println("Position of 10: " + stack.search(10)); // 2

        // Empty check
        System.out.println("Is Empty? " + stack.isEmpty()); // false
    }
}
```

OUTPUT : 

```
Stack: [10, 20, 30]
Top Element: 30
Popped: 30
Size: 2
Position of 10: 2
Is Empty? false
```

