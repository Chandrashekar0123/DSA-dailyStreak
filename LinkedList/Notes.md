# 📚 Linked List Data Structures in Java

Welcome to the **Linked List Folder**! This Folder contains a collection of Java programs demonstrating various **Singly Linked List operations**, including reversing, palindrome checking, cycle detection, and node manipulation. It's perfect for students, learners, and developers looking to strengthen their understanding of linked lists.

---

## 🧩 Introduction to Linked Lists

A **Linked List** is a **linear data structure** where elements (called nodes) are connected using **pointers**. Unlike arrays, linked lists do not store elements in contiguous memory locations, making **dynamic memory allocation** possible and enabling **efficient insertions and deletions**.

### Key Features:
- Dynamic size (unlike arrays)
- Efficient insertion and deletion
- Nodes consist of **data** and **pointer to next node**
- Types:
  - **Singly Linked List**
  - **Doubly Linked List**
  - **Circular Linked List**

---

## 💡 Applications of Linked Lists

Linked Lists are widely used in various applications including:

- Implementing **Stacks and Queues**
- Memory management in operating systems
- Representing **polynomials or sparse matrices**
- Navigation systems (**Back/Forward feature in browsers**)
- Graph adjacency representation
- Real-time applications requiring **dynamic memory usage**

---

## 📂 Files in this Repository

| File | Description |
|------|-------------|
| **[SingleLL.java](SingleLL.java)** | Basic implementation of a **Singly Linked List** with insertion, traversal, and printing methods. |
| **[ReverseList_loop.java](ReverseList_loop.java)** | Demonstrates **reversing a linked list using iterative/loop approach**. |
| **[ReverseLL_Recursion.java](ReverseLL_Recursion.java)** | Demonstrates **reversing a linked list using recursion**. |
| **[nthNode.java](nthNode.java)** | Finds the **n-th node from the end** and deletes it from the linked list. |
| **[PalindromeLL.java](PalindromeLL.java)** | Checks whether the linked list is a **palindrome** (reads same forward and backward). |
| **[Cycle.java](Cycle.java)** | Detects whether a linked list contains a **loop/cycle** using **Floyd’s Tortoise and Hare algorithm**. |
| **[Notes.md](Notes.md)** | Contains **detailed notes on linked lists**, including types, operations, and tips. |

---

## 🔍 File Explanations in Detail

### 1. SingleLL.java
- Implements a basic **singly linked list**.
- **Features:**
  - Add elements
  - Print elements
  - Basic traversal

### 2. ReverseList_loop.java
- Reverses the linked list **iteratively**.
- **Logic:**
  - Use three pointers: `prev`, `current`, `next`
  - Reverse the `next` pointers of all nodes
  - Update `head` to new first node

### 3. ReverseLL_Recursion.java
- Reverses the linked list **recursively**.
- **Logic:**
  - Base case: if `head` is `null` or `head.next` is `null`
  - Recurse on `head.next`
  - Adjust pointers to reverse the link

### 4. nthNode.java
- Finds the **n-th node from the end** of the linked list and deletes it.
- **Logic:**
  - Calculate **size of the list**
  - Find the target node: `size - n`
  - Adjust `next` pointers to remove the node

### 5. PalindromeLL.java
- Checks if the linked list is a **palindrome**.
- **Logic:**
  - Find the **middle node**
  - Reverse the second half of the list
  - Compare the first and second halves

### 6. Cycle.java
- Detects a **loop/cycle** in a linked list.
- **Logic:**
  - Use **Floyd’s Tortoise and Hare algorithm**
  - Two pointers: `slow` moves 1 step, `fast` moves 2 steps
  - If they meet, a cycle exists

### 7. Notes.md
- Detailed notes for:
  - Linked list types
  - Common operations
  - Best practices
  - Applications in real-world problems

---

## 📌 Conclusion
This Folder is a complete toolkit for learning and practicing linked lists in Java. It covers:

- Fundamental operations
- Advanced manipulations like **reversing**, **palindrome check**, **n-th node deletion**, and **cycle detection**
- Practical notes and usage tips
