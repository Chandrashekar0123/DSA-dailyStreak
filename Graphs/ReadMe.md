# 🌐 Graphs in Java

## 🧠 Introduction to Graphs
A **Graph** is a non-linear data structure consisting of **vertices (nodes)** and **edges** that connect pairs of vertices.  
Graphs are used to represent relationships between objects — such as roads between cities, links between web pages, or friendships in a social network.

---

## ⚙️ Types of Graphs

- **Undirected Graph:** Edges have no direction. (A connected to B means B connected to A)
- **Directed Graph (Digraph):** Edges have a direction from one vertex to another.
- **Weighted Graph:** Each edge carries a weight or cost.
- **Unweighted Graph:** All edges have equal cost.
- **Cyclic Graph:** Contains at least one cycle.
- **Acyclic Graph:** Contains no cycles (e.g., DAG — Directed Acyclic Graph).

---

## 📚 Applications of Graphs

- 🌍 **Navigation Systems:** Finding shortest paths (Dijkstra, A*).  
- 🔗 **Social Networks:** Representing friendships, followers, or connections.  
- 🧬 **Neural Networks:** Nodes as neurons, edges as connections.  
- 💡 **Web Crawlers & Search Engines:** Representing the link structure of the internet.  
- 🏗️ **Project Scheduling:** Using **Topological Sorting** to find valid task order.  
- 🧭 **Network Routing:** For packet transmission and path optimization.

---

## 🧩 Advantages of Graphs
- Efficient representation of real-world relationships.
- Helpful for shortest path, traversal, and connectivity analysis.
- Foundation for AI search, recommendation systems, and network algorithms.

## ⚠️ Disadvantages of Graphs
- May require large memory for dense graphs (especially adjacency matrix).
- Complex algorithms for cycle detection or path finding.
- Traversals (DFS/BFS) can be expensive for very large graphs.

---

## 💡 Common Graph Representations
- **Adjacency List:** Uses less space, efficient for sparse graphs.  
- **Adjacency Matrix:** Easier to implement but consumes O(V²) space.  

---

## ⏱️ Time Complexities

| Operation | Adjacency List | Adjacency Matrix |
|------------|----------------|------------------|
| Add Edge   | O(1)           | O(1)             |
| Remove Edge| O(V)           | O(1)             |
| Search Edge| O(V)           | O(1)             |
| Traversal  | O(V + E)       | O(V²)            |

---

## 🧭 Files Overview

### 1️⃣ **CreationOfGraph.java**
> Demonstrates how to create and represent a graph using an adjacency list in Java.
- Defines `Edge` class for source and destination.
- Initializes the adjacency list.
- Prints or traverses the graph structure.

---

### 2️⃣ **BFS.java**
> Implements **Breadth-First Search (BFS)** traversal of a graph.
- Uses a **Queue** to explore nodes level by level.
- Time Complexity: **O(V + E)**
- Space Complexity: **O(V)**

📌 BFS is widely used for:
- Shortest path in unweighted graphs
- Finding connected components
- Peer-to-peer network searches

---

### 3️⃣ **DFS.java**
> Implements **Depth-First Search (DFS)** traversal of a graph.
- Uses recursion or stack to explore nodes deeply before backtracking.
- Time Complexity: **O(V + E)**
- Space Complexity: **O(V)** (recursion stack)

📌 DFS is used for:
- Topological sorting
- Detecting cycles
- Path finding

---

### 4️⃣ **CycleDirected.java**
> Detects cycles in a **Directed Graph** using recursion stack (DFS-based approach).
- Uses `vis[]` and `stack[]` arrays to detect back edges.
- If a node is visited and present in the recursion stack → cycle detected.
- Time Complexity: **O(V + E)**

---

### 5️⃣ **CycleUndirected.java**
> Detects cycles in an **Undirected Graph** using DFS.
- Maintains a parent node to avoid false positives.
- If a visited neighbor is **not** the parent → cycle exists.
- Time Complexity: **O(V + E)**

📉 Example Cycle: `0 → 1 → 2 → 0`

---

### 6️⃣ **TopologicalSort.java**
> Performs **Topological Sorting** on a **Directed Acyclic Graph (DAG)**.
- Uses **DFS + Stack** approach.
- Prints vertices in order of dependencies.
- Applications:
  - Task Scheduling
  - Build Systems (like Makefiles)
  - Course Prerequisites

⏱️ Time Complexity: **O(V + E)**  
📦 Space Complexity: **O(V)**

---

### 7️⃣ **AllPathsFromStoD.java**
> Finds **all possible paths** from a **source vertex** to a **destination vertex** using DFS.
- Explores every path recursively.
- Prints all valid paths.
- Useful in route planning, network tracing, and maze problems.

---

## 🧠 Summary

Graphs are one of the most powerful data structures that bridge the gap between theory and real-world systems.  
This folder contains all essential Java programs to understand and implement:

- ✅ Graph creation  
- ✅ Traversals (BFS, DFS)  
- ✅ Cycle Detection (Directed & Undirected)  
- ✅ Topological Sorting  
- ✅ Path Finding
