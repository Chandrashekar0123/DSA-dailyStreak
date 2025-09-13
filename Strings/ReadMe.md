<h2>Strings and StringBuilder</h2>

## Java: Strings

- Strings are **immutable** in Java.
- Stored as objects of the `String` class.
- Immutable nature means that every modification creates a **new String object**.
- **Initialization:**
  - `String s = "Hello";` (String literal)
  - `String s = new String("Hello");` (using constructor)
- **Important Methods:**
  - `length()`: Returns length of string
  - `charAt(index)`: Returns character at a specific index
  - `substring(start, end)`: Returns substring
  - `concat(str)`: Concatenates another string
  - `equals()`: Checks equality (content)
  - `equalsIgnoreCase()`: Checks equality ignoring case
  - `compareTo()`: Lexicographic comparison
  - `contains()`: Checks if string contains sequence
  - `indexOf()/lastIndexOf()`: Find index of char/substring
  - `toUpperCase()/toLowerCase()`: Change case
  - `trim()`: Remove leading and trailing spaces
  - `replace(oldChar, newChar)`: Replace character or substring
- **Memory Benefit:** String literals are stored in the **String Pool**, saving memory.

## Java: StringBuilder

- `StringBuilder` is **mutable**.
- Faster for **modifications** (append, insert, delete) than String.
- **Initialization:**
  - `StringBuilder sb = new StringBuilder("Hello");`
- **Important Methods:**
  - `append(str)`: Adds text at the end
  - `insert(index, str)`: Inserts text at index
  - `delete(start, end)`: Deletes a substring
  - `deleteCharAt(index)`: Deletes character at index
  - `reverse()`: Reverses the content
  - `replace(start, end, str)`: Replaces substring
  - `charAt(index)`: Returns character at index
  - `length()`: Returns length
  - `capacity()`: Current capacity of StringBuilder

**Key Difference:**  
| Feature            | String         | StringBuilder       |
|-------------------|----------------|------------------|
| Mutability         | Immutable      | Mutable           |
| Performance        | Slower (modifications create new object) | Faster for modifications |
| Thread-Safe        | Yes            | No (not synchronized) |
| Memory Pool        | Stored in String Pool | Not stored in pool |

## Python: Strings

- Strings are **immutable** in Python.
- Stored as sequences of characters.
- **Initialization:** 
  - `s = "Hello"`  
  - `s = 'World'`
- **Important Methods:**
  - `len(s)`: Length of string
  - `s[index]`: Access character at index
  - `s[start:end]`: Slicing
  - `s.upper()`, `s.lower()`: Change case
  - `s.strip()`: Remove leading/trailing spaces
  - `s.replace(old, new)`: Replace substring
  - `s.split(separator)`: Split string into list
  - `s.join(iterable)`: Join elements of iterable into string
  - `s.find(sub)`: Index of substring (-1 if not found)
  - `s.count(sub)`: Count occurrences
  - `s.startswith(prefix)`, `s.endswith(suffix)`: Check start/end
- Concatenation via `+` or `join()` (efficient for multiple strings)
- **Immutability:** Every modification creates a **new string object**

---

**Note:**  
- Use `StringBuilder` in Java when you need **frequent string modifications**.  
- In Python, for multiple string concatenations, use **`''.join(list_of_strings)`** for efficiency instead of repeated `+`.
