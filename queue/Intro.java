package queue;

public class Intro {
    // A queue is a linear data structure that follows the First-In, First-Out
    // (FIFO) principle. 🚶‍♂️➡️🚶‍♀️ This is like a real-life queue at a checkout
    // counter, where the first person in line is the first person to be served.

    // Core Operations
    // The primary operations for a queue are:

    // Enqueue: Adds an element to the back (or "rear") of the queue. Think of it as
    // joining the end of the line.

    // Dequeue: Removes an element from the front of the queue. This is like the
    // person at the front of the line being served and leaving.

    // Peek/Front: Lets you look at the element at the front of the queue without
    // removing it. It shows who's next in line.

    // Unlike stacks, which use a Last-In, First-Out (LIFO) approach, queues are
    // used in scenarios where the order of processing is important, such as
    // managing print jobs, handling network requests, or implementing breadth-first
    // search (BFS) algorithms.

    // implemetation of queue using array
    int[] arr;
    int front = 0;
    int rear = -1;
    int size;

    Intro(int n) {
        arr = new int[n];
        size = n;
    }

    void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue is Full.");
        } else {
            arr[++rear] = x;
        }
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty.");
        } else {
            System.out.println("Dequeued: " + arr[front++]);
        }
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    
    // // Linked List based queue Implementation
    // Node front = null, rear = null;

    // void enqueue(int x) {
    //     Node n = new Node(x);
    //     if (rear == null) {
    //         front = rear = n;
    //     } else {
    //         rear.next = n;
    //         rear = n;
    //     }
    // }

    // void dequeue(){
    //     if(front == null){
    //         System.out.println("Queue Empty");
    //     }else{
    //         System.out.println("Dequeued: " + front.data);
    //         front = front.next;
    //         if(front == null){
    //             rear = null;
    //         }
    //     }
    // }

    // void display(){
    //     for (Node t = front; t != null; t = t.next) {
    //         System.out.println(t.data + " ");
    //     }
    // }

    public static void main(String[] args) {
        Intro s = new Intro(5);
        s.enqueue(10);
        s.enqueue(21);
        s.display();

        s.dequeue();
        s.display();

    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
    }
}
