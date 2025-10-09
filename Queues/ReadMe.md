<div align="center">
	<img src="https://img.icons8.com/color/96/queue.png" width="80" alt="Queue Icon"/>
  
	# Queues in Data Structures
</div>

---

## 📖 Introduction
A **Queue** is a fundamental linear data structure that follows the First-In-First-Out (**FIFO**) principle. Imagine a line of people waiting for movie tickets: the first person to join the line is the first to get served. This real-world analogy perfectly describes how queues work in computer science.

## 📝 Definition
A queue is an ordered collection of items where:
- **Insertion (Enqueue)** happens at the rear (end).
- **Deletion (Dequeue)** happens at the front (beginning).

### Visual Example
```
FRONT [ 10 | 20 | 30 | 40 ] REAR
```
Enqueue adds to the REAR, Dequeue removes from the FRONT.

## ⚙️ Core Operations
- **Enqueue:** Add an element to the rear of the queue.
- **Dequeue:** Remove an element from the front of the queue.
- **Peek/Front:** View the front element without removing it.
- **isEmpty:** Check if the queue is empty.
- **isFull:** (For fixed-size queues) Check if the queue is full.

## 🌍 Real-World Applications
Queues are everywhere in computing and daily life:
- **CPU & Disk Scheduling:** OS uses queues to manage tasks and resources.
- **Breadth-First Search (BFS):** Graph traversal algorithms use queues.
- **Print Spoolers:** Print jobs are managed in a queue.
- **Web Servers:** Requests are queued for processing.
- **Messaging Systems:** Emails, notifications, and messages are queued before delivery.
- **Data Buffering:** Streaming and buffering use queues to manage data flow.
- **Resource Sharing:** Queues help manage access to shared resources.

## 🧩 Types of Queues
- **Simple Queue:** Basic FIFO queue.
- **Circular Queue:** Connects last position back to the first, optimizing space.
- **Priority Queue:** Elements are served based on priority, not just order.
- **Double-ended Queue (Deque):** Insertion and deletion can happen at both ends.
- **Queue using Stacks:** Queue operations implemented using two stacks.

## 💡 Why Learn Queues?
Queues are essential for:
- Efficient resource management
- Solving scheduling and traversal problems
- Building scalable systems
- Cracking coding interviews

---

## 📂 Programs in This Folder
This folder contains multiple ways to implement queues in Java:

- **QueueArray.java:** Queue using arrays (simple, fixed-size implementation).
- **QueueLL.java:** Queue using linked lists (dynamic size, no overflow).
- **CircularQ.java:** Circular queue for efficient space usage.
- **QueueCollection.java:** Queue using Java Collections Framework (`LinkedList`).
- **QusingStacks.java:** Queue implemented using two stacks (demonstrates algorithmic creativity).

Each program is well-commented and demonstrates different approaches to queue implementation. Explore each file for code, logic, and practical examples!

---

## ✨ Tips for Mastery
- Practice writing your own queue implementations.
- Modify the code to add new operations (like size, display, etc.).
- Try using queues in real-world mini-projects (task manager, ticketing system, etc.).
- Understand the pros and cons of each implementation.

---

> **Queues are a building block for many advanced algorithms. Master them to unlock deeper DSA concepts!**
