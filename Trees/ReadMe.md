# 🌳 Tree Data Structure Algorithms (Java)

A foundational collection of algorithms for working with Tree data structures, implemented in Java. This repository focuses specifically on Binary Tree operations, including construction, core traversals, and complex property calculations.

---

## 💡 What is a Tree?
A Tree is a non-linear, hierarchical data structure composed of nodes connected by edges. It represents data organized in a hierarchy, making it one of the most important structures in computer science. 

### Core Terminology
- **Root**: The single, topmost node of the tree. A tree always begins at the root.
- **Edge**: The link connecting two nodes.
- **Parent**: Any node that has one or more child nodes connected below it.
- **Child**: A node connected to a parent node (the one directly above it).
- **Leaf Node**: A node with no children. These are the nodes at the bottom of the hierarchy.
- **Sibling**: Nodes that share the same parent.
- **Subtree**: A portion of the tree structure that can itself be considered a complete tree, rooted at any node.

### Key Properties
- **Height**: The length of the longest path from a specific node down to a leaf. The Height of the Tree is the height of the root node.
- **Depth/Level**: The length of the path from the root to a specific node. The root node is often considered to be at Level 0 (or Depth 0).

---

## 🌐 Applications of Trees
Trees are versatile and are used extensively across various fields of computing:

- **Hierarchical Data Modeling**: Representing data with a natural parent-child relationship, such as the folder structure in a computer file system or the Document Object Model (DOM) in web development.
- **Expression Parsing**: Used by compilers to represent arithmetic expressions in the form of Expression Trees, enabling easy evaluation and optimization.
- **Search Optimization**: Specialized trees like Binary Search Trees (BSTs), AVL Trees, and Red-Black Trees are used for efficient data lookup, insertion, and deletion.
- **Database Indexing**: Advanced tree structures (like B-Trees and B+ Trees) form the basis of indexing mechanisms in large-scale databases.

---

## 🗂️ Files in this Repository

- [Create Tree](CreateTree.java)  
- [Breadth-First Search (BFS)](BFS.java)  
- [Count of Nodes](CountOfNodes.java)  
- [Diameter of Tree](DiameterOfTree.java)  
- [Height of Tree](HeightofTree.java)  
- [Inorder Traversal](InorderTraversal.java)  
- [Postorder Traversal](PostOrderTraversal.java)  
- [Preorder Traversal](Preorder.java)  
- [Check Subtree](SubTreeOfTree.java)  
- [Sum of Nodes](SumOfNodes.java)  
- [Optimized Tree Diameter](TreeDiameter.java) 

---

## 🗂️ Detailed File Breakdown
The following files implement specific algorithms for handling Binary Trees. They rely on the core structure defined in `CreateTree.java` to operate.

### Core Structure and Traversal
- **CreateTree.java**  
  This file is the backbone of the repository. It defines the fundamental `Node` class, which holds data and pointers to the left and right children. It also contains the main logic, typically within a nested class or static method, responsible for building the tree structure itself, often based on a predefined array sequence (e.g., using a Preorder approach).

- **Preorder.java**  
  Implements the Preorder Traversal algorithm. This is a Depth-First Search (DFS) method where the visiting order is Root → Left Subtree → Right Subtree. It is commonly used for copying a tree structure.

- **InorderTraversal.java**  
  Implements the Inorder Traversal algorithm. The visiting order is Left Subtree → Root → Right Subtree. For a Binary Search Tree (BST), this traversal yields the nodes in non-decreasing (sorted) order.

- **PostOrderTraversal.java**  
  Implements the Postorder Traversal algorithm. The visiting order is Left Subtree → Right Subtree → Root. This traversal is essential for deleting a tree from the bottom up, as it ensures child nodes are processed before the parent.

- **BFS.java**  
  Implements Breadth-First Search (BFS), also known as Level Order Traversal. Unlike the DFS methods above, BFS visits all nodes level by level, starting from the root. It typically uses a Queue data structure to manage nodes at the current level.

### Tree Properties and Calculations
- **HeightofTree.java**  
  Calculates the Height of the Binary Tree. The height is defined as the number of edges on the longest path from the root down to the farthest leaf node. This is solved using recursion, taking the maximum of the left and right subtree heights and adding one (for the root).

- **CountOfNodes.java**  
  Calculates the total Number of Nodes present in the Binary Tree. This is a straightforward recursive algorithm: the count of a tree is 1 (for the root) plus the count of the left subtree plus the count of the right subtree.

- **SumOfNodes.java**  
  Calculates the Sum of the Data Values of all nodes in the Binary Tree. Similar to the node count, this is a recursive solution that sums the root's value with the sums calculated from the left and right subtrees.

### Advanced Algorithms
- **DiameterOfTree.java**  
  Calculates the Diameter of the tree—the longest path between any two nodes. This file likely implements a straightforward O(N²) recursive solution where the height of the tree is calculated repeatedly at every node to find the maximum diameter.

- **TreeDiameter.java**  
  Calculates the Diameter using a more optimized approach, typically achieving O(N) time complexity. This is done by modifying the recursive function to simultaneously return both the height and the diameter of the current subtree in a single pass, avoiding redundant height calculations.

- **SubTreeOfTree.java**  
  Contains logic to determine if one given tree is an identical Subtree within a larger tree. This involves recursively comparing the structure and data of the smaller tree against every possible node of the larger tree.

---
