package heap;

import java.util.PriorityQueue;

//Min Heap
/*
Priority class is a built-in way to use heap, so we will use PQ to implement min heap.

In a min heap parent or root is always smaller than its children

Algo:

 */
public class MinHeap {
    private final int[] heap;
    private int size;
    private final int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    // helper methods to find parent and child indices

    private int getParentIndex(int i) {
        return (i - 1) / 2;
    }

    private int getLeftChildIndex(int i) {
        return 2 * i + 1;
    }

    private int getRightChildIndex(int i) {
        return 2 * i + 2;
    }

    private void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    // bubble up: put the new element at it's right place by moving it up.
    private void bubbleUp(int index) {
        while (index > 0 && heap[getParentIndex(index)] > heap[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    private void bubbleDown(int index) {
        int smallest = index;
        int left = getLeftChildIndex(index);
        int right = getRightChildIndex(index);

        // find if left or right child is smaller then current node
        if(left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if(right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        // if the smallest is not the current node/index, swap and continue
        if( smallest != index){
            swap(index, smallest);
            bubbleDown(smallest);
        }
    }

    public int peek(){
        if(size == 0){
            throw new IllegalStateException();
        }
        return heap[0];
    }

    // Insertion in heap
    public void insert(int value) {
        if( size == capacity) {
            throw new IllegalStateException("Heap is completely filled");
        }

        // put the new value at the end of the array
        heap[size] = value;
        size++;

        // fix the heap property by bubbling up
        bubbleUp(size - 1);
    }

    // Removal (Extract Min)
    public int extractMin() {
        if (size == 0) throw new IllegalStateException("Heap is empty");

        int min = heap[0];

        // move last element to root
        heap[0] = heap[size - 1];
        size--;

        bubbleDown(0);

        return min;
    }


    // Testing MinHeap
    public static void main(String[] args) {
        MinHeap m = new MinHeap(5);

        m.insert(5);
        m.insert(20);
        m.insert(1);
        m.insert(42);
        m.insert(99);

        System.out.println("Current Min is: " + m.peek());

        System.out.println("Extracting all elements from Min Heap: ");
        while(true) {
            try {
                System.out.print(m.extractMin() + " ");
            } catch (IllegalStateException e){
                break;
            }
        }

        System.out.println();

        // In real life we use minHeap like this:
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(20);
        minHeap.add(42);
        minHeap.add(5);
        minHeap.add(1);
        minHeap.add(99);

        System.out.println("Current Min is: " + minHeap.peek());

        System.out.println("Elements in Min Heap are: ");
        while(!minHeap.isEmpty()){
            System.out.print(minHeap.poll() +  " ");
        }
    }

}
