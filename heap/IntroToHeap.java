package heap;

/*
 Heap: Heap is sort of a magical data structure, it feels magical when you understand its purpose. It isn't just a way to store data but a way to keep the most "important item" right at your fingertips.

 What is heap?: Heap is basically a tree based data structure i.e. a complete binary tree that satisfies the heap property.

There are 2 primary types:
1. Max-Heap: The value of root node must be greatest among all children. This property must stay true for all nodes in the tree.
2. Min-Heap: The value of root node must be the smallest among all it's children.

Complete Binary Tree?: Every level of the tree is fully filled except possible the last level, which is filled from left to right.

Why?: It allows us to find the smallest/largest element in o(1) time, and add or remove elements in O(log n) time.
Still to build a heap the total time is O(n) obviously :)

How to implement heap? -> The Array Trick
Although heap is visualised as a tree, still it is implemented using a simple array, cuz it saves memory(as no pointers are then needed).
If a node is at index i:
    its left child is at 2i + 1.
    its right child is at 2i + 2.
    its parent is at (i - 1)/2

When do we use heap?:
1. Heap are a gold standard for priority queue.
2. When you need to find one of the largest element from a large database
3. Graph Algorithms
4. Merging sorted streams like merging multiple arrays

The "Heap-ify" process:
When you add or remove an element, the "Heap Property" might be broken. The heap fixes itself through two operations:
1. Bubble Up (Sift-Up): Used during insertion. You put the new element at the bottom and move it up until it’s smaller/larger than its parent.
2. Bubble Down (Sift-Down): Used when you remove the root. You replace the root with the last element and sink it down until the property is restored.
 */

public class IntroToHeap {
}