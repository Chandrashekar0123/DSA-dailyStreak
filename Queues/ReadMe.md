# Queues in Data Structures

## Introduction
A **Queue** is a linear data structure that follows the First-In-First-Out (FIFO) principle. This means the element added first is the one to be removed first, just like a real-life queue at a ticket counter or in a supermarket.

## Definition
A queue is an ordered collection of items where insertions happen at one end (the rear) and deletions happen at the other end (the front).

## Operations
- **Enqueue**: Add an element to the rear of the queue.
- **Dequeue**: Remove an element from the front of the queue.
- **Peek/Front**: View the element at the front without removing it.
- **isEmpty**: Check if the queue is empty.
- **isFull**: (For fixed-size queues) Check if the queue is full.

## Uses & Applications
Queues are widely used in:
- **CPU scheduling**
- **Disk scheduling**
- **Breadth-First Search (BFS) in graphs**
- **Handling requests in web servers**
- **Print job management**
- **Data buffering**
- **Resource sharing**

## Types of Queues
- **Simple Queue**: Basic FIFO queue.
- **Circular Queue**: Last position is connected back to the first, making the queue circular.
- **Priority Queue**: Elements are served based on priority.
- **Double-ended Queue (Deque)**: Insertion and deletion can happen at both ends.

---

# Programs in This Folder
This folder contains various implementations of queues in Java:

- **QueueArray.java**: Implementation of a queue using arrays.
- **QueueLL.java**: Implementation of a queue using linked lists.
- **CircularQ.java**: Circular queue implementation.
- **QueueCollection.java**: Queue using Java Collections Framework (`LinkedList`).
- **QusingStacks.java**: Queue implementation using two stacks.

Each program demonstrates different ways to implement and use queues, with comments and examples for easy understanding. Explore each file to learn how queues work and how they can be applied in real-world scenarios!

---

> **Tip:** Queues are fundamental for mastering data structures and algorithms. Practice these implementations and try modifying them for deeper learning!
