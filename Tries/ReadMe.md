# 🌳 Comprehensive Trie (Prefix Tree) Implementations in Java

[![Java Logo](https://img.shields.io/badge/Language-Java-brightgreen?style=for-the-badge&logo=openjdk)](https://www.java.com/)
[![Data Structure](https://img.shields.io/badge/Data_Structure-Trie_Tree-blueviolet?style=for-the-badge&logo=treehouse)](https://en.wikipedia.org/wiki/Trie)
[![Focus](https://img.shields.io/badge/Focus-String_Algorithms-orange?style=for-the-badge)]()

This repository provides a complete, modular set of Java implementations for the **Trie** data structure, showcasing its core operations and powerful applications in string-based problems.

---

## 🎯 What is a Trie?

### Introduction, Definition, and Theory

A **Trie** (pronounced "try" or "tree," derived from *retrieval*) is an efficient tree-like data structure primarily used to store a dynamic set of strings, where the keys are usually strings.

The fundamental idea is that **nodes store single characters**, and the **position** of a node within the tree defines the entire string (prefix) accumulated from the root to that point.

* **Root:** Represents an empty string.
* **Path as Key:** To find a word, you follow the path of its characters from the root.
* **Node Structure:** Each node contains an array (size 26 for lowercase English letters) of pointers to its children.
* **EOW Flag:** A boolean flag (`eow` or `isEndOfWord`) indicates if the path to that node forms a **complete, valid word**.



---

## 🌟 Features, Advantages, and Analysis

Tries are a cornerstone of many text-based systems due to their unparalleled speed for prefix operations.

### Key Advantages and Features

1.  **Speed (Optimal Time Complexity):** Tries offer $O(L)$ complexity for insertion and lookup (where $L$ is the length of the key). This is often faster than hash maps because Tries avoid hash collisions.
2.  **Prefix-Based Queries:** They inherently support finding all words with a common prefix with great efficiency, making them ideal for search features.
3.  **Implicit Sorting:** The keys stored in the Trie are implicitly stored in alphabetical (lexicographical) order.

### Complexity Summary

| Operation | Time Complexity | Notes |
| :--- | :--- | :--- |
| **Insertion** | $O(L)$ | Depends only on the length of the word. |
| **Search (Word)** | $O(L)$ | Fastest for dictionary lookup. |
| **Search (Prefix)** | $O(L)$ | Finds the path for the prefix in linear time. |

### Limitations ⚠️

* **High Space Consumption:** Tries can consume significant memory, especially when dealing with a large alphabet (e.g., Unicode) or storing a sparse set of keys, as every node maintains an array of pointers (size 26, often many are null).

---

## 💡 Real-World Applications

Tries are crucial to performance in various computing scenarios:

1.  **Autocomplete / Autosuggestion:** The primary use case. As a user types, the Trie instantly finds and suggests all possible completions.
2.  **Spell Checkers:** Quickly checking if a word exists and suggesting words with similar prefixes if it doesn't.
3.  **Longest Prefix Matching:** Used extensively in **network routing** (e.g., finding the most specific rule for an IP address).
4.  **T9 Predictive Text:** Used in older mobile phones to map numeric keypad sequences back to possible words.

---

## 📚 Repository File Breakdown

This collection of files organizes the Trie logic into clear, functional components.

| File Name | Description | Key Concept |
| :--- | :--- | :--- |
| `TrieCreation.java` | **Structure Setup** | Defines the minimum structure: the `Node` class and the basic `root` initialization required to start building a Trie. |
| `Tries.java` | **Core Operations** | A combined file containing the correct, standard implementations of **`insert`** methods. This represents a functional, standalone Trie class. |
| `SearchInTrie.java` | **Exact Word Search** | Implements the **`search`** method: determines if a full, exact word exists in the Trie (i.e., the path exists AND the final node's `eow` flag is `true`). |
| `StartstWith.java` | **Prefix Check** | Implements the **`startsWith`** method: checks if any word in the dictionary begins with a given prefix. |
| `CountUnique.java` | **Unique Prefix Count** | Contains the logic to count the total number of unique prefixes present across all words in the Trie. This is often solved by counting the total number of nodes (excluding the root). |
| `LongestWord.java` | **Advanced DFS Application** | Solves the complex problem of finding the **longest word** such that **every prefix** of that word is also a valid word in the dictionary. This utilizes a specialized Depth-First Search (DFS). |
| `WordBreak.java` | **Word Segmentation Application** | Implements the recursive logic for the **Word Break Problem**: checks if a given input string can be entirely segmented into a sequence of one or more dictionary words stored in the Trie. |