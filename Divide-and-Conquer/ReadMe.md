# 🧠 Divide and Conquer Algorithms

**Definition:**  
Divide and Conquer is an algorithmic paradigm where a problem is:
1. **Divided** into smaller subproblems of the same type.
2. **Conquered** by solving each subproblem recursively.
3. **Combined** to get the solution to the original problem.

It breaks down complex problems into simpler ones until they are easy enough to solve directly.

---

### 🔹 Steps in Divide and Conquer
1. **Divide:** Break the original problem into subproblems (usually half the size).
2. **Conquer:** Solve the subproblems recursively.
3. **Combine:** Merge the solutions of the subproblems to get the final answer.

Example:  
- Sorting an array → split into two halves → sort each half → merge.

---

### 🔹 Advantages
- Reduces complex problems into simpler, easier ones.
- Often leads to optimal algorithms with better time complexities (e.g., O(n log n)).
- Suits parallel processing since subproblems can be solved independently.

---

### 🔹 Disadvantages
- Recursive calls may use more memory (stack frames).
- Overhead of merging or combining solutions.
- Sometimes simpler iterative approaches may be faster for small inputs.

---

### 🔹 Applications of Divide and Conquer
| Application Area                | Example Algorithms / Problems                               |
|---------------------------------|-------------------------------------------------------------|
| Sorting                         | Merge Sort, Quick Sort                                      |
| Searching                       | Binary Search                                               |
| Matrix Multiplication           | Strassen’s Algorithm                                        |
| Closest Pair of Points Problem  | Computational Geometry                                      |
| Large Integer Multiplication    | Karatsuba Algorithm                                         |
| Fast Fourier Transform (FFT)    | Signal Processing                                           |
| Maximum Subarray Sum            | Kadane’s (variation via Divide and Conquer)                 |
| Parallel Computing              | Tasks split into subtasks on multiple cores                 |

---

## 📝 Merge Sort

**Definition:**  
Merge Sort is a stable, comparison-based sorting algorithm that divides the array into two halves, recursively sorts them, and then merges the sorted halves.

**How it works:**
1. **Divide** the array into two halves (midpoint).
2. **Conquer** by recursively sorting each half.
3. **Merge** the two sorted halves into a single sorted array.

**Key Points:**
- Stable sorting algorithm (preserves order of equal elements).
- Works well for large datasets.
- Uses extra space for merging.

**Time Complexity:**
| Case        | Complexity |
|-------------|------------|
| Best Case   | O(n log n) |
| Average     | O(n log n) |
| Worst Case  | O(n log n) |

**Space Complexity:** O(n) for the temporary merged array.

---

## 📝 Quick Sort

**Definition:**  
Quick Sort is an efficient, comparison-based sorting algorithm that picks a **pivot** element and partitions the array around it such that elements smaller than the pivot are on the left and larger on the right. It then recursively sorts the partitions.

**How it works:**
1. **Pick a Pivot** (commonly the last element).
2. **Partition** the array so that:
   - All elements < pivot go to the left.
   - All elements > pivot go to the right.
3. **Recursively apply** the above steps to the left and right partitions.

**Key Points:**
- Faster in practice than Merge Sort for small or average datasets.
- In-place sorting (no extra array needed).
- Unstable sorting algorithm (does not preserve order of equal elements).

**Time Complexity:**
| Case        | Complexity |
|-------------|------------|
| Best Case   | O(n log n) |
| Average     | O(n log n) |
| Worst Case  | O(n²) (when pivot is chosen poorly, e.g. already sorted array with last element pivot) |

**Space Complexity:** O(log n) for recursion stack (best/avg), O(n) in the worst case.

---

## 🔑 Notes / Key Differences

| Feature        | Merge Sort                      | Quick Sort                      |
|----------------|---------------------------------|---------------------------------|
| Approach       | Divide array into halves, merge | Partition around pivot          |
| Space Needed   | O(n) extra                      | O(log n) stack (in-place sort)  |
| Stability      | Stable                          | Unstable (by default)           |
| Best for       | Large datasets, linked lists    | Arrays, average-case performance|
| Worst Case     | O(n log n)                      | O(n²)                          |

---

### ✅ Summary
Both Merge Sort and Quick Sort use the **Divide and Conquer** paradigm:
- Merge Sort guarantees O(n log n) but uses extra space.
- Quick Sort is usually faster but can degrade to O(n²) in worst cases.

Use Merge Sort when stability and predictable performance matter.  
Use Quick Sort for average-case speed and in-place sorting.

