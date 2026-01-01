package heap;
// Heap Sort
/*
Heap Sort is a comparison based sorting technique based on Binary heap data structure.
We can think of it as an improved version of selection sort, instead of scanning the entire unsorted section to find the max number, we use heap to find it in O(log n).

Why?: It is an in-place sorting technique with guaranteed O(n log n) performance.

When?:
1. Memory is tight: Heap sort uses only O(1) space.
2. Embedded systems: there memory is limited.

To sort an array in ascending order we use max-heap

 */
public class HeapSort {

    void heap_sort(int[] arr) {
        int n = arr.length;
        // 'i' starts with n/2 - 1 cause that is the last leaf node.
        for (int i = n/2 - 1; i >= 0; i--) {
            max_heap(arr, n, i);
        }


        for (int i = n - 1; i > 0 ; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            max_heap(arr, i , 0);
        }
    }

    void max_heap(int[] arr, int n, int i) {
        int largest =  i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if(right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if(largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            max_heap(arr, n, largest);
        }
    }

    // Implementation
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        HeapSort hs = new HeapSort();
        hs.heap_sort(arr);

        System.out.println("Sorted array: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
