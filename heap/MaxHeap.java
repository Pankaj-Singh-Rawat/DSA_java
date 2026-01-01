package heap;

// Max Heap
/*
Implementing a Max-Heap is identical to implementation of min heap just one fundamental difference i.e. the parent must always be greater than or equal to its children.
 */

public class MaxHeap {
    private final int[] heap;
    private int size;
    private final int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int getParentIndex(int i) {
        return (i - 1)/2;
    }
    private int getLeftChildIndex(int i) {
        return 2 * i + 1;
    }
    private int getRightChildIndex(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void bubbleUp(int index){
        while( index > 0 && heap[index] > heap[getParentIndex(index)]) {
            swap(index, getParentIndex(index));
            index = getParentIndex(index);
        }
    }

    private void bubbleDown(int index) {
        int largest = index;
        int left = getLeftChildIndex(index);
        int right = getRightChildIndex(index);

        // find the largest among the parent and children
        if( left < size && heap[left] > heap[largest]) {
            largest = left;
        }if( right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if(largest != index) {
            swap(index, largest);
            bubbleDown(largest);
        }
    }

    public void insert(int value) {
        if (size == capacity) {
            return;
        }

        heap[size] = value;
        size++;

        bubbleUp(size - 1);
    }

    // extract max (Removal)

    public int extractMax() {
        if(size == 0) {
            throw new IllegalStateException("Heap is Empty");
        }
        int max = heap[0];
        heap[0] = heap[size-1];
        size--;
        bubbleDown(0);

        return max;
    }

    public int peek() {
        if(size == 0) {
            throw new IllegalStateException("Heap is Empty");
        }
        return heap[0];
    }

    // Implementation of heap
    public static void main(String[] args) {
        MaxHeap m = new MaxHeap(5);

        m.insert(23);
        m.insert(22);
        m.insert(34);
        m.insert(253);
        m.insert(1);

        System.out.print("Largest value in heap is: ");
        System.out.println(m.peek());
        System.out.println("Elements in MaxHeap are: ");
        while(true) {
            try {
                System.out.print(m.extractMax() + " ");
            } catch (IllegalStateException e) {
                break;
            }
        }
    }
}
