## 📚 Arrays & 2D Arrays – Detailed Notes

### 🔹 1. What is an Array?
- **Definition:** An array is a **collection of elements of the same data type** stored at contiguous memory locations.
- **Indexing:** Arrays are **zero-based** (first element at index 0).
- **Fixed Size:** In Java & C-like languages, array size is fixed after creation.
- **Homogeneous:** All elements have the same type (int, float, char, etc.).

---

### 🔹 2. Arrays in Java
- **Declaration:** `int[] arr;`
- **Initialization:** `int[] arr = {1, 2, 3, 4};`  
- **Access Elements:** `arr[0]` (first element).
- **Length:** `arr.length`
- **Iteration:** `for` loop or `for-each` loop.
- **Key Properties:**
  - Stored in **heap memory**.
  - **Default values**: int → 0, boolean → false, objects → null.
  - **IndexOutOfBoundsException** if you access outside valid indices.

---

### 🔹 3. Arrays in Python (Lists)
- Python has **lists** (dynamic arrays):
  - `arr = [1, 2, 3, 4]`
  - Can store **mixed types** (not strictly typed).
  - No fixed size – can append or remove elements anytime.
- **Indexing & Slicing:** `arr[0]`, `arr[1:3]`
- **Iteration:** `for i in arr:` or using indices.

---

### 🔹 4. Advantages of Arrays
- Fast random access using indices.
- Efficient memory usage compared to multiple variables.
- Easy to iterate and manipulate.

---

### 🔹 5. Limitations of Arrays
- Fixed size (in Java/C).
- Insertion/Deletion at arbitrary positions is costly.
- Only holds elements of the same type (Java).

---

### 🔹 6. 2D Arrays
- **Definition:** An array of arrays (matrix-like structure).
- **Indexing:** Two indices — `row` and `column`.

---

### 🔹 7. 2D Arrays in Java
- **Declaration:** `int[][] arr = new int[rows][cols];`
- **Initialization:**  
  ```java
  int[][] arr = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
  };
```

---


### 🔹 8. 2D Arrays in Python
- Python uses **lists of lists** to mimic 2D arrays:
  ```python
  arr = [
      [1, 2, 3],
      [4, 5, 6],
      [7, 8, 9]
  ]
  ```

  ---

## 📚 Arrays & 2D Arrays – Quick Reference (From Common Operations Onwards)

### 🔹 9. Common Operations on Arrays

| Operation             | Java Example                     | Python Example      |
|-----------------------|---------------------------------|---------------------|
| **Access element**    | `arr[i]`                       | `arr[i]`            |
| **Modify element**    | `arr[i] = 10;`                 | `arr[i] = 10`       |
| **Length**            | `arr.length`                   | `len(arr)`          |
| **Iteration**         | `for(int i: arr)`              | `for i in arr:`     |
| **Sort**              | `Arrays.sort(arr);`            | `arr.sort()`        |
| **Find element**      | Linear search manually          | `if x in arr:`      |

---

### 🔹 10. Advantages of 2D Arrays
- Easy representation of **matrices, grids, tables**.
- Useful for games, graphs, image data, etc.
- Reduces code complexity compared to multiple 1D arrays.

---

### 🔹 11. Limitations of 2D Arrays
- Fixed size once declared (Java).
- Adding/removing rows or columns dynamically is complex.
- In Python, lists are flexible but not as memory-efficient as NumPy arrays.

---

### 🔹 12. Key Differences Between Arrays in Java vs Python

| Feature              | Java Arrays                               | Python Lists (Arrays) |
|----------------------|-------------------------------------------|-----------------------|
| **Size**             | Fixed                                     | Dynamic               |
| **Type**             | Homogeneous                               | Heterogeneous allowed |
| **Memory**           | Continuous                                | Pointers to objects   |
| **2D Arrays**        | Built-in `int[][]`                        | List of Lists         |
| **Performance**      | Faster for primitive types                | Slower for large data |

---

### 🔹 13. Use Cases
- Storing lists of data (scores, names, IDs).
- Representing matrices in math operations.
- Storing tabular data like a spreadsheet.

---

### 🔹 14. Summary
- **Arrays** = One-dimensional, fixed-size sequence of elements.
- **2D Arrays** = Array of arrays, useful for matrices and grids.
- **Java** arrays are strictly typed and fixed size.
- **Python** lists/2D lists are dynamic but less efficient.
- Arrays provide **fast indexing** and **structured storage**.
