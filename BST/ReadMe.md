# 🌳 Binary Search Tree (BST) Operations in Java

This project implements core **Binary Search Tree (BST)** operations using Java.  
It is a great reference for understanding how BSTs work and how to perform common tasks like insert, search, delete, and traversal.

---

## 📁 Folder Structure (Navigation)

```
├── BSTCreation.java       # Create BST + Insert nodes + Traversals
├── SearchInBst.java       # Search for a key in BST
├── DeleteNode.java        # Delete a node from BST
├── PrintInRange.java      # Print nodes within a given range [low, high]
├── RootToLeaf.java        # Print all root-to-leaf paths
├── ReadMe.md              # Documentation (this file)
```

---

## 🌟 What is a Binary Search Tree?

A **Binary Search Tree (BST)** is a special type of **Binary Tree** where:
- Left subtree contains **smaller** values than the node.
- Right subtree contains **greater** values than the node.
- Both left and right subtrees must also be BSTs.
- Typically **no duplicate values** are allowed.

✅ This structure keeps data **sorted** and enables **fast searching.**

---

## ⚙️ Time Complexity of BST

| Operation | Average Case | Worst Case (Unbalanced) |
|-----------|----------------|-------------------------|
| Search    | O(log n)       | O(n)                    |
| Insert    | O(log n)       | O(n)                    |
| Delete    | O(log n)       | O(n)                    |

> If tree becomes skewed (like a linked list), performance drops!  
> Balanced BSTs (AVL, Red-Black Trees) solve this issue.

---

## 🔄 In-order Traversal = Sorted Output
Visiting BST using **In-order (Left → Root → Right)** gives elements in **increasing order.**

---

## 🌲 Example BST Structure

```
        50
       /  \
     30    70
    / \    / \
   20 40  60  80
```

---

# 📌 Explanation of Each Java File

## 1️⃣ BSTCreation.java
- Creates the BST by inserting nodes according to BST property
- Provides traversals: in-order, pre-order, post-order
- Builds the base tree for other operations

---

## 2️⃣ SearchInBst.java
- Searches for a value efficiently using BST property:
  - Key < node → go left
  - Key > node → go right
  - Key == node → found
- Fast searching compared to arrays

---

## 3️⃣ DeleteNode.java
- Deletes a node considering three cases:
  1. Leaf node → delete directly
  2. One child → replace with child
  3. Two children → replace with **in-order successor**
- Ensures BST remains valid after deletion

---

## 4️⃣ PrintInRange.java
- Prints all nodes with values in a range `[low, high]`
- Uses BST property to skip unnecessary subtrees for efficiency

---

## 5️⃣ RootToLeaf.java
- Prints all paths from **root to leaf**
- Uses recursion to track and print paths
- Example path: `Root → 8 → 5 → 3`

---

# 🚀 Real-Life Applications
- Database indexing (B-Trees, AVL, Red-Black Trees)  
- Fast searching in large datasets  
- Auto-complete suggestions  
- Dictionaries / Maps (TreeMap in Java)  
- Compilers (Symbol Tables)  
- Range queries (like PrintInRange.java)

---

# ✅ Advantages of BST
- Dynamic, grows and shrinks at runtime  
- Fast searching, insertion, deletion (`O(log n)` average)  
- Maintains sorted order  
- Supports efficient range queries  
- Easy traversal and path-based tasks

---

# ⚠ Limitations of BST
- Can become unbalanced → `O(n)` worst-case  
- Not ideal for sequentially sorted inputs  
- Solution: use self-balancing BSTs (AVL, Red-Black Trees)

---

# 🎯 Why These 5 Programs Matter
| File | Purpose |
|-----|---------|
| BSTCreation.java | Build tree + Traversal |
| SearchInBst.java | Find a value |
| DeleteNode.java | Remove a value correctly |
| PrintInRange.java | Range-based queries |
| RootToLeaf.java | Print all root-to-leaf paths |

Covers most common **BST interview questions**.

---

# 🎓 Educational Value
- Perfect for **DSA learning & interviews**  
- Shows both **theory + implementation**  
- Covers search, insert, delete, traverse, range queries, and paths  
- Demonstrates recursion, tree logic, and edge cases
