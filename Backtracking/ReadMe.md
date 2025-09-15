## Backtracking

This folder contains classic backtracking problems implemented in Java.  
Backtracking is a refined brute-force approach where we build the solution step by step  
and backtrack when we reach an invalid state.

---

### 📝 About Backtracking  

Backtracking is a general algorithmic technique that incrementally builds candidates for solutions  
and abandons a candidate as soon as it determines the candidate cannot possibly lead to a valid solution.  
It’s especially useful for generating combinations, permutations, and solving constraint satisfaction problems  
such as Sudoku, N-Queens, and word searches.

---


### 📂 Files & Paths

- [Subsets Backtracking](SubsetsBacktracking.java)  
  **Description:**  
  Generates all possible subsets of a given set or array using backtracking.  
  This demonstrates how backtracking can explore all inclusion/exclusion possibilities.  

  **Key Points:**  
  - Uses recursion + backtracking to generate subsets.  
  - Similar to the power set problem.  
  - Handles duplicate avoidance when needed.  

  **Time Complexity:**  
  - `O(2^n)` subsets generated for `n` elements.  
  - Each subset takes `O(n)` to copy/print.

---

- [NQueens Problem](nQueens.java)  
  **Description:**  
  Solves the classic N-Queens problem using backtracking.  
  Places N queens on an `N × N` chessboard so that no two queens attack each other.  

  **Key Points:**  
  - Uses recursion to try placing queens row by row.  
  - Checks column and diagonal constraints at each step.  
  - Backtracks if placement is not valid.  

  **Time Complexity:**  
  - Worst case roughly `O(N!)` due to exploring all permutations of queen placement.  
  - Optimized with pruning for diagonals and columns.

---

## [Sudoku Solver](Sudoku.java)

- Standard 9×9 Sudoku grid with 3×3 subgrids.
- Each row, column, and box must contain digits 1–9 without repetition.
- Empty cells are represented by _.

**⚙️ How It Works**

- Uses backtracking to fill empty cells.
- Tries numbers 1–9, checks row/column/box constraints (isSafe()), recurses, and backtracks if needed.

**📝 Constraints**

- Input board size: 9×9 only.
- Valid chars: '1'–'9' or '_'.

**Time & Space Complexity** 

| Operation         | Complexity                |
|------------------|---------------------------|
| **Time (worst)** | O(9^m) — m = empty cells   |
| **Space**        | O(m) recursion stack + constant board storage |

- **Why:** For each empty cell, we may try up to 9 digits; recursion depth = number of empty cells.