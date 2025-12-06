package Sorting;

import java.util.Arrays;

/*
QuickSort uses a "divide and conquer" strategy. The key idea is to pick a pivot element and partition the array so that:

All elements smaller than the pivot go to the left
All elements greater than the pivot go to the right
Then recursively sort both sides

The process:

Choose a pivot element (often the last element)
Partition the array around the pivot
Recursively quicksort the left subarray
Recursively quicksort the right subarray
Base case: arrays of size 0 or 1 are already sorted

Time Complexity:
Best:O(n log n)
Avg:O(n log n)
Worst:O(n²)
 */
public class QuickSort {

//     sort [5, 2, 8, 1, 9, 3]

    private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }

    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }


}
