<div align="center">
  
# 🔑 Hashing in Data Structures & Algorithms

---

## 🌟 Introduction

Hashing is a powerful technique used in computer science to map data to unique keys for fast access, insertion, and deletion. It is the backbone of many efficient algorithms and data structures, such as hash tables, sets, and maps. Hashing enables constant time complexity for search operations, making it essential for large-scale applications.

---

## 📚 Definition

**Hashing** is the process of converting an input (or 'key') into a fixed-size string of bytes, typically using a hash function. The output, called a hash code, determines where the data is stored in a hash table. Hashing is widely used for:
- Fast data retrieval
- Duplicate detection
- Data integrity verification
- Implementing associative arrays/maps

---

## 🏗️ Background & Implementation

Hashing works by using a hash function to compute an index into an array of buckets or slots, from which the desired value can be found. The efficiency of hashing depends on:
- The quality of the hash function
- Collision resolution strategies (chaining, open addressing)
- Load factor and rehashing

---

### **Custom HashMap Implementation**
In this folder, you'll find a custom implementation of a HashMap in Java, demonstrating how hashing works under the hood. It covers:
- Node structure for key-value pairs
- Hash function for index calculation
- Collision handling using linked lists
- Dynamic resizing (rehashing)

---

## 🧩 Applications & Uses of Hashing

✅ Search Engines (Indexing data)  
✅ Databases (Indexing & Lookups)  
✅ Caching (Fast access to stored results)  
✅ Compilers (Symbol Tables)  
✅ Cryptography (Hashing passwords, data integrity)  
✅ Networking (Routing tables, load balancing)  
✅ Duplicate Detection (Emails, usernames, files)  
✅ Competitive Programming & Interview Problems

---

## 📂 Folder Structure & File Explanations

| File Name                | Description |
|-------------------------|-------------|
| **HashImplementation.java** | Custom implementation of a generic HashMap with put, get, remove, containsKey, keySet, and rehashing. Shows how hashing works internally. |
| **HighFreq.java**           | Finds the majority element in an array using a HashMap to count frequencies. Demonstrates frequency counting with hashing. |
| **IntersectionHash.java**   | Calculates the intersection of two arrays using a HashSet. Shows how hashing helps in set operations. |
| **IteneraryHash.java**      | Prints the itinerary from a set of tickets using HashMap. Illustrates mapping and reverse mapping with hashing. |
| **SubArraySum.java**        | Counts the number of subarrays with a given sum using HashMap. Demonstrates prefix sum and hashing for efficient lookup. |
| **UnionHash.java**          | Computes the union of two arrays using HashSet. Highlights uniqueness and set operations with hashing. |
| **hashmapexample.java**     | Basic usage of Java's built-in HashMap: insertion, update, search, removal, iteration, and keySet. |
| **hastsetexample.java**     | Basic usage of Java's built-in HashSet: add, search, delete, size, iteration, and using Iterator. |

---

## 📝 Detailed File Explanations

### 1. **HashImplementation.java**
- Implements a generic HashMap from scratch.
- Uses linked lists for collision resolution.
- Supports dynamic resizing (rehashing) when load factor exceeds threshold.
- Methods: `put`, `get`, `remove`, `containsKey`, `keySet`, `isEmpty`.
- **Sample Output:**
  ```
  US 50
  India 190
  China 200
  null
  ```

### 2. **HighFreq.java**
- Uses HashMap to count element frequencies in an array.
- Prints the majority element (appearing more than n/3 times).
- **Sample Output:**
  ```
  Majority element is: 1
  ```

### 3. **IntersectionHash.java**
- Uses HashSet to find intersection of two arrays.
- Removes duplicates to ensure unique intersection count.
- **Sample Output:**
  ```
  The intersection count is: 3
  ```

### 4. **IteneraryHash.java**
- Maps tickets (source → destination) and finds the starting point.
- Prints the complete itinerary in order using HashMap.
- **Sample Output:**
  ```
  Mumbai -> Delhi -> Goa -> Chennai -> Banglore
  ```

### 5. **SubArraySum.java**
- Uses HashMap to count subarrays with a given sum (prefix sum technique).
- Efficient O(n) solution for subarray sum problems.

### 6. **UnionHash.java**
- Uses HashSet to compute union of two arrays.
- Prints the union and its size.
- **Sample Output:**
  ```
  The union is: [1, 2, 3, 4, 5, 6, 7]
  The size of the union is: 7
  7
  ```

### 7. **hashmapexample.java**
- Demonstrates basic operations on Java's HashMap:
  - Insert, update, search, remove, iterate, keySet.
- **Sample Output:**
  ```
  Initial map: {USA=30, China=150, India=120}
  Updated map: {USA=35, China=150, India=120}
  Map contains key India
  Population of China: 150
  UK not found in map
  1 2 3 4 5 
  USA 35
  China 150
  India 120
  Keys: [USA, China, India]
  After removing India: {USA=35, China=150}
  ```

### 8. **hastsetexample.java**
- Demonstrates basic operations on Java's HashSet:
  - Add, search, delete, size, iterate, use Iterator.
- **Sample Output:**
  ```
  Set contains 1
  Set does not contain 4
  Set does not contain 1
  Size of set is: 2
  Elements in set are: 
  2
  3
  Using Iterator:
  2
  3
  ```

---

## 🎨 Why Hashing?
- **Speed:** O(1) average time for search, insert, delete.
- **Simplicity:** Easy to use and implement.
- **Versatility:** Used in maps, sets, caches, databases, cryptography, and more.

---

## 🚀 Explore & Experiment
Feel free to explore each file, run the code, and experiment with different inputs to deepen your understanding of hashing and its applications!

---

<div align="center">
  <b>✨ Happy Coding! ✨</b>
</div>
