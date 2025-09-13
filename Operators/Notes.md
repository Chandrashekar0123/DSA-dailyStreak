## Java Operators – Notes  

### 1. Arithmetic Operators (`Arithmatic.java`)
- Used for basic mathematical operations on numbers.
- **Operators:**  
  - `+` (Addition)  
  - `-` (Subtraction)  
  - `*` (Multiplication)  
  - `/` (Division)  
  - `%` (Modulus – remainder)  
- **Examples:**  
  - `int sum = a + b;`  
  - `int diff = a - b;`  
  - `int product = a * b;`  
  - `int quotient = a / b;`  
  - `int remainder = a % b;`  

---

### 2. Assignment Operators (including Bitwise) (`Assignment.java`)
- Used to assign and update values of variables.  
- **Basic Assignment:** `=`  
- **Arithmetic Compound Assignments:**  
  - `a += 5; // a = a + 5`  
  - `a -= 3; // a = a - 3`  
  - `a *= 2; // a = a * 2`  
  - `a /= 4; // a = a / 4`  
  - `a %= 3; // a = a % 3`  

- **Bitwise Compound Assignments:**  
  - `a &= b; // a = a & b` (bitwise AND)  
  - `a |= b; // a = a | b` (bitwise OR)  
  - `a ^= b; // a = a ^ b` (bitwise XOR)  
  - `a <<= 2; // a = a << 2` (left shift)  
  - `a >>= 2; // a = a >> 2` (right shift)  
  - `a >>>= 2; // a = a >>> 2` (unsigned right shift)  

💡 **Tip:** Bitwise assignments work at the binary level and are very fast.

---

### 3. Relational Operators (`Relational.java`)
- Compare two values, return a boolean (`true` or `false`).  
- **Operators:**  
  - `==` (equal to)  
  - `!=` (not equal to)  
  - `>`  (greater than)  
  - `<`  (less than)  
  - `>=` (greater or equal to)  
  - `<=` (less or equal to)  
- **Examples:**  
  - `(a == b)`  
  - `(a != b)`  
  - `(a > b)`  
  - `(a < b)`  
  - `(a >= b)`  
  - `(a <= b)`  

---

### 4. Logical Operators (`Logical.java`)
- Combine multiple conditions; operate on booleans.  
- **Operators:**  
  - `&&` (Logical AND) – true only if both conditions true  
  - `||` (Logical OR) – true if at least one condition true  
  - `!` (Logical NOT) – reverses boolean value  
- **Examples:**  
  - `(a > b) && (a > c)`  
  - `(a < b) || (a < c)`  
  - `!(a == b)`  

---

### 5. Bitwise Operators (used in arithmetic/assignment)
- Work at bit level on integer types.  
- **Operators:**  
  - `&`  (bitwise AND)  
  - `|`  (bitwise OR)  
  - `^`  (bitwise XOR)  
  - `~`  (bitwise NOT – unary)  
  - `<<` (left shift)  
  - `>>` (right shift)  
  - `>>>` (unsigned right shift)  
- **Examples:**  
  - `int c = a & b;`  
  - `int d = a | b;`  
  - `int e = a ^ b;`  
  - `int f = a << 1;`  
  - `int g = a >> 1;`  

---

### 📝 Summary Table  

| Category        | Operators                                     | Returns  |
|-----------------|-----------------------------------------------|-----------|
| Arithmetic      | `+ - * / %`                                    | Numeric  |
| Assignment      | `= += -= *= /= %= &= |= ^= <<= >>= >>>=`        | Numeric  |
| Relational      | `== != > < >= <=`                              | Boolean  |
| Logical         | `&&  ||  !`                                    | Boolean  |
| Bitwise         | `&  |  ^  ~  <<  >>  >>>`                      | Numeric/Boolean Context |

---

💡 **Quick Tips:**  
- **Arithmetic + Relational + Logical** → Used in conditions and loops.  
- **Bitwise + Assignment** → Fast low-level operations (common in optimization, cryptography, embedded).  
- **Logical** works on boolean expressions; **Bitwise** works on bits of integers.  

---
