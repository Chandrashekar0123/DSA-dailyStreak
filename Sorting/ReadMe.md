# 📚 Sorting & Searching Algorithms (Quick Notes)

## 🔹 1. Bubble Sort
- **Idea:** Repeatedly compare adjacent elements and swap them if they are in the wrong order.
- **How it works:**
  1. Start at the beginning of the array.
  2. Compare each pair of adjacent items and swap if needed.
  3. After each pass, the largest element "bubbles up" to the end.
  4. Repeat until no swaps are needed.
- **Complexity:**
  - Best Case (Already Sorted): O(n)
  - Average Case: O(n²)
  - Worst Case: O(n²)
- **Space Complexity:** O(1) (in-place)
- **Stable:** ✅ (Preserves order of equal elements)

---

## 🔹 2. Selection Sort
- **Idea:** Find the smallest element from the unsorted part and place it at the beginning.
- **How it works:**
  1. Divide the array into a sorted and an unsorted part.
  2. Find the minimum element from the unsorted part.
  3. Swap it with the first unsorted element.
  4. Move the boundary of the sorted part forward.
  5. Repeat until the entire array is sorted.
- **Complexity:**
  - Best Case: O(n²)
  - Average Case: O(n²)
  - Worst Case: O(n²)
- **Space Complexity:** O(1)
- **Stable:** ❌ (Unless modified, it can change order of equal elements)

---

## 🔹 3. Insertion Sort
- **Idea:** Build the sorted array one element at a time by inserting each new element into its correct position.
- **How it works:**
  1. Start from the second element (index 1).
  2. Compare it with the elements before it.
  3. Shift larger elements one position to the right.
  4. Insert the current element into the correct spot.
  5. Repeat for all elements.
- **Complexity:**
  - Best Case (Nearly Sorted): O(n)
  - Average Case: O(n²)
  - Worst Case: O(n²)
- **Space Complexity:** O(1)
- **Stable:** ✅

---

## 🔹 4. Binary Search
- **Idea:** Efficiently find a target element in a **sorted** array by repeatedly halving the search space.
- **How it works:**
  1. Set low = 0 and high = n-1.
  2. Find the middle index `mid = ⌊(low + high)/2⌋`.
  3. If `arr[mid] == target` → found.
  4. If `arr[mid] < target` → search right half (`low = mid + 1`).
  5. If `arr[mid] > target` → search left half (`high = mid - 1`).
  6. Repeat until low > high.
- **Complexity:**
  - Best Case: O(1)
  - Average Case: O(log n)
  - Worst Case: O(log n)
- **Space Complexity:** 
  - Iterative: O(1)
  - Recursive: O(log n) (stack)
- **Requires Sorted Data:** ✅

---

### 📝 Quick Comparison Table

| Algorithm       | Best Case | Average Case | Worst Case | Space  | Stable |
|-----------------|-----------|-------------|------------|--------|--------|
| Bubble Sort     | O(n)      | O(n²)        | O(n²)       | O(1)   | Yes    |
| Selection Sort  | O(n²)     | O(n²)        | O(n²)       | O(1)   | No     |
| Insertion Sort  | O(n)      | O(n²)        | O(n²)       | O(1)   | Yes    |
| Binary Search   | O(1)      | O(log n)     | O(log n)    | O(1)*  | –      |

*(O(log n) space if recursive)*

---

✅ **Tip:**  
- Use **Insertion Sort** for small or nearly sorted datasets.  
- Use **Binary Search** only on **sorted arrays**.  
- Bubble & Selection are mostly educational but good for understanding fundamentals.
