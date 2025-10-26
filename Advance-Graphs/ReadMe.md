# 🚀 Advanced Graph Algorithms in Java

This folder contains **advanced graph algorithms** implemented in **Java** — essential for solving complex graph problems in **competitive programming, interviews, and real-world network applications**.

These algorithms go beyond basic traversal (DFS/BFS) and focus on **graph optimization, shortest paths, connectivity, and critical structures** such as **bridges and articulation points**.

---

## 🔍 Overview: What Are Advanced Graph Algorithms?

Graphs are powerful data structures used to represent real-world problems like **social networks**, **transportation routes**, **network reliability**, and **web crawling**.  
While basic algorithms (like BFS/DFS, Topological Sort) handle fundamental operations, advanced graph algorithms address deeper problems such as:

- Detecting **critical nodes/edges** that affect connectivity  
- Finding **shortest or minimum-cost paths** in weighted graphs  
- Identifying **strongly connected components (SCCs)** in directed graphs  
- Constructing **Minimum Spanning Trees (MSTs)** for cost optimization  

---
## 🌐 What Are Advanced Graph Algorithms?

A **graph** is a collection of nodes (vertices) and connections (edges) that represent relationships between entities.  
While basic algorithms like **DFS (Depth First Search)** and **BFS (Breadth First Search)** help traverse or explore graphs, **advanced graph algorithms** go further — they help **analyze, optimize, and decompose** complex networks.

### ⚡ Characteristics of Advanced Graph Algorithms
1. **Optimization-based:** Find the best or most efficient structure (e.g., shortest path, minimum spanning tree).  
2. **Connectivity-focused:** Detect critical points/edges, strong components, or cycles that determine graph stability.  
3. **Applicable to Weighted/Directed Graphs:** Handle both positive and negative weights efficiently.  
4. **Mathematically Rigorous:** Many are derived from **graph theory** and **network flow** principles.  
5. **Used in AI, Machine Learning, and Real Systems:** For network reliability, web graphs, transport systems, etc.

---

## 🧠 Why Study Advanced Graphs?

Advanced graph algorithms form the **backbone of intelligent systems and infrastructure**.  
They are used in:

- 🛰️ **Routing and Communication Networks** – optimizing internet packet paths (Bellman-Ford, Dijkstra).  
- 🔒 **Cybersecurity** – detecting vulnerabilities and articulation points in systems.  
- 🧬 **Bioinformatics** – analyzing gene/protein interaction networks.  
- 🧭 **Navigation Systems (Google Maps, GPS)** – shortest route computation.  
- 🧠 **Machine Learning** – graph embeddings, PageRank, and GNNs (Graph Neural Networks).  
- 🏗️ **Infrastructure Planning** – minimizing construction costs with MSTs.  
- 🌐 **Web & Social Networks** – identifying connected components (Kosaraju’s Algorithm).
---

## 🔍 Core Theoretical Concepts

### 1️⃣ Graph Representations
Graphs can be represented using:
- **Adjacency Matrix:** 2D array storing edge existence/weight between nodes.  
- **Adjacency List:** Array of lists storing neighbors of each node (used in this repo).  
- **Edge List:** List of all edges with weights, useful for algorithms like Bellman-Ford.

### 2️⃣ Types of Graphs
- **Directed vs Undirected**
- **Weighted vs Unweighted**
- **Cyclic vs Acyclic**
- **Connected vs Disconnected**

### 3️⃣ Graph Properties
- **Degree:** Number of edges connected to a vertex.  
- **Connectivity:** Existence of a path between vertices.  
- **Bridge/Articulation Point:** Edge or node whose removal increases disconnected components.  
- **Strongly Connected Component (SCC):** Every node reachable from every other node (in directed graphs).  
- **Minimum Spanning Tree (MST):** Tree connecting all vertices with minimum total weight.

---

## ⚙️ Algorithms Implemented

### 1️⃣ **Bellman-Ford Algorithm**
**File:** `BellmanFord.java`  
**Purpose:** Finds shortest paths from a single source in **weighted graphs with negative edges**.  
**Key Concept:**  
- Repeatedly **relaxes** all edges for `(V – 1)` times.  
- Can **detect negative weight cycles** (unlike Dijkstra).  
**Time Complexity:** O(V × E)  
**Applications:** Distance vector routing, detecting arbitrage opportunities in finance.

---

### 2️⃣ **Dijkstra’s Algorithm**
**File:** `Dijkstras.java`  
**Purpose:** Finds shortest paths in **weighted graphs without negative weights**.  
**Approach:**  
- Uses a **priority queue (min-heap)** to choose the nearest unvisited node.  
- Greedy algorithm ensuring minimal cost path expansion.  
**Time Complexity:** O((V + E) log V)  
**Applications:** GPS, network optimization, pathfinding in games.

---

### 3️⃣ **Prim’s Algorithm**
**File:** `PrimsAlgorithm.java`  
**Purpose:** Constructs a **Minimum Spanning Tree (MST)** connecting all vertices with minimal total weight.  
**Approach:**  
- Starts with any vertex and expands the MST by choosing the **minimum weight edge** connecting to new vertices.  
**Time Complexity:** O(E log V)  
**Applications:** Network design, circuit layout, cable routing.

---

### 4️⃣ **Bridge in Graph (Tarjan’s Algorithm)**
**File:** `BridgeInGraph.java`  
**Purpose:** Finds **bridges** — edges whose removal disconnects the graph.  
**Theory:**  
- Based on **DFS traversal**, maintaining two arrays:  
  - `dt[]`: Discovery time of each node.  
  - `low[]`: Earliest visited vertex reachable.  
- An edge `(u, v)` is a **bridge** if `low[v] > dt[u]`.  
**Time Complexity:** O(V + E)  
**Applications:** Detecting critical connections in networks and communication systems.

---

### 5️⃣ **Articulation Point (Tarjan’s Algorithm)**
**File:** `ArticulationPoint.java`  
**Purpose:** Identifies **articulation points** — vertices whose removal increases disconnected components.  
**Concept:**  
- Uses DFS timestamps to track node discovery.  
- Conditions:
  - Root node with multiple children → articulation point.  
  - For non-root nodes: if `low[v] >= dt[u]`, `u` is articulation point.  
**Time Complexity:** O(V + E)  
**Applications:** Server vulnerability detection, fault tolerance in systems.

---

### 6️⃣ **Kosaraju’s Algorithm**
**File:** `Kosaraju.java`  
**Purpose:** Detects **Strongly Connected Components (SCCs)** in a **directed graph**.  
**Process:**
1. Perform **DFS** and push vertices to a stack by finish time.  
2. **Transpose the graph** (reverse all edges).  
3. Perform **DFS** in the order of stack to find SCCs.  
**Time Complexity:** O(V + E)  
**Applications:** Web link analysis, compiler design (control flow analysis), clustering.

---

## 🧠 Conceptual Flow Diagram

    ┌──────────────────────────┐
    │        Graph Input       │
    └────────────┬─────────────┘
                 │
                 ▼
    ┌──────────────────────────┐
    │     Choose Algorithm     │
    ├──────────────────────────┤
    │ Bellman-Ford → Shortest  │
    │ Dijkstra → Shortest      │
    │ Prim’s → MST             │
    │ Bridge → Critical Edge   │
    │ Articulation → Critical  │
    │ Kosaraju → SCC           │
    └────────────┬─────────────┘
                 │
                 ▼
    ┌──────────────────────────┐
    │     Result / Analysis    │
    └──────────────────────────┘
