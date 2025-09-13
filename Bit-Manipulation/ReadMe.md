# 📝 Bit Manipulation – Complete Notes  

## 1️⃣ What is Bit Manipulation?
Bit manipulation is the process of using bitwise operators to directly modify bits of integers.  
It is faster and more memory-efficient than using arithmetic or logical operations on entire numbers.

---

## 2️⃣ Bitwise Operators Quick Reference
- **AND (&)** – Compares each bit and returns 1 only if both bits are 1.  
- **OR (|)** – Returns 1 if either bit is 1.  
- **XOR (^)** – Returns 1 if bits are different.  
- **NOT (~)** – Inverts all bits.  
- **Left Shift (<<)** – Shifts bits to the left (multiply by 2).  
- **Right Shift (>>)** – Shifts bits to the right (divide by 2).  

---

## 3️⃣ Bitmask Concept
A **bitmask** is a binary number used to isolate, set, clear, or toggle specific bits in another number.  
Example: `1 << position` puts a `1` at the required position (all other bits 0).

---

## 4️⃣ Bit Operations  

### 🔹 A. Set Bit  
- **Goal:** Change a bit at a specific position to **1**.  
- **Idea:** Use OR with a bitmask having `1` at the required position.  
- **Result:** Only that bit becomes 1, rest stay the same.  
- **Use Case:** Enabling a feature flag, turning ON a bit.

---

### 🔹 B. Get Bit  
- **Goal:** Check whether a bit at a specific position is **1** or **0**.  
- **Idea:** Use AND with a bitmask.  
- **Result:** If result ≠ 0 → bit is 1; if result = 0 → bit is 0.  
- **Use Case:** Reading a flag or status bit.

---

### 🔹 C. Clear Bit  
- **Goal:** Change a bit at a specific position to **0**.  
- **Idea:** Use AND with the **complement** of a bitmask.  
- **Result:** That bit becomes 0, rest stay the same.  
- **Use Case:** Turning OFF a flag or disabling a feature.

---

### 🔹 D. Update Bit  
- **Goal:** Set a bit to either **0** or **1** at a given position.  
- **Idea:** First clear the bit, then set it with the new value.  
- **Steps:**  
  1. Clear the bit using AND with complement of bitmask.  
  2. OR with (newBit shifted to position).  
- **Use Case:** Changing state of a specific bit without affecting others.

---

### 5️⃣ Why Use Bit Manipulation?
- Extremely fast operations (hardware-level).  
- Reduces memory usage.  
- Useful in low-level programming, graphics, compression, security, and embedded systems.

---

### 6️⃣ Common Applications
- Flags and permissions.  
- Masks in graphics programming.  
- Optimizing algorithms.  
- Cryptography and hashing.  
- Compression and encoding.

---

💡 **Tip:** Always remember:
- `1 << n` → Bitmask for nth position.  
- To **set**: use OR.  
- To **clear**: use AND with NOT.  
- To **toggle**: use XOR.  
- To **check**: use AND.  
