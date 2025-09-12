## 📝 Time and Space Complexity – Notes

### ⏱️ Time Complexity  
Time complexity describes how the runtime of an algorithm grows with the size of the input (**n**). It measures **how fast** an algorithm runs.  
- **Constant Time – O(1):** Runtime does not change with input size.  
- **Logarithmic Time – O(log n):** Runtime grows slowly as input increases (e.g., binary search).  
- **Linear Time – O(n):** Runtime increases proportionally to input size (e.g., single loop).  
- **Linearithmic Time – O(n log n):** Often seen in efficient sorting algorithms (e.g., merge sort, quicksort average).  
- **Quadratic Time – O(n²):** Nested loops over the same data set (e.g., bubble sort).  
- **Cubic Time – O(n³):** Triple nested loops.  
- **Exponential Time – O(2ⁿ):** Algorithms that grow exponentially with input size (e.g., brute force on subsets).  
- **Factorial Time – O(n!):** Extremely expensive; grows faster than exponential.  

**Key Points:**  
- Best Case, Average Case, and Worst Case complexities matter.  
- Big-O expresses an **upper bound** on runtime.  
- Big-Ω expresses a **lower bound**, and Big-Θ expresses a **tight bound**.  

---

### 💾 Space Complexity  
Space complexity measures **how much memory** an algorithm uses relative to the input size. It includes:  
- **Fixed Part:** Memory for constants, program instructions, and variables not dependent on input size.  
- **Variable Part:** Memory for dynamically allocated structures, recursion stacks, etc.  

**Common Space Complexities:**  
- **O(1):** Constant extra space (in-place operations).  
- **O(n):** Memory grows linearly with input size (e.g., extra arrays, hash maps).  
- **O(n²):** 2D arrays or matrices.  

---

### 📊 Why Time & Space Complexity Matter  
- Predict performance before running code.  
- Identify scalability and efficiency issues.  
- Compare algorithms objectively.  

---

### ⚡ Tips for Analysis  
- **Ignore constants:** O(2n) → O(n).  
- **Consider dominant terms:** O(n² + n) → O(n²).  
- **Account for recursion:** Add stack space for recursive calls.  
- **Optimize trade-offs:** Sometimes more space leads to faster time.  

---

### 🔄 Time vs Space Trade-Off  
Often, algorithms can be optimized to use **less time but more space**, or **less space but more time**. Choose based on constraints (RAM vs speed).  

---

✅ **Summary Table**

| Complexity | Time Example            | Space Example            |
|------------|-------------------------|--------------------------|
| O(1)       | Accessing array element | Using a single counter   |
| O(log n)   | Binary search           | Balanced tree node ptrs  |
| O(n)       | Traversing a list       | Storing input copy       |
| O(n log n) | Merge sort              | Merging temp arrays      |
| O(n²)      | Nested loops (matrix)   | 2D matrix storage        |

---

**📚 In short:**  
- **Time Complexity = How long it runs**  
- **Space Complexity = How much memory it uses**  
- Always aim for the lowest possible complexities without sacrificing readability/maintainability.
