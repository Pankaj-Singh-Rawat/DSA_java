package heap;

/*
The Heapify operation is the "repair" mechanism for a heap. Its sole job is to fix a violation of the heap property at a specific node.

Time: O(log n)
 */
public class HeapifyFunction {

    void heapify_max_heap(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if(right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify_max_heap(arr, n, largest);
        }
    }

    void heapify_min_heap(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }
        if(right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if(smallest != i) {
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

            heapify_min_heap(arr, n, smallest);
        }
    }
}
