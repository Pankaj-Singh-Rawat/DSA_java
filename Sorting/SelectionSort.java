package Sorting;

/*
Selection Sort is a simple, in-place comparison sorting algorithm that, despite its simplicity, is generally more efficient in terms of swaps than Bubble Sort.

The core idea of Selection Sort is to repeatedly find the minimum element from the unsorted portion of the list and place it at the beginning of the sorted portion.

Time Complexity:
1. Best - O(n^2)
2. Avg. - O(n^2)
3. Worst - O(n^2)
 */

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {12, 23, 3, 44, 65, 7};
        System.out.println(selectionSort(arr));
    }

    private static String selectionSort(int[] arr) {

        int size = arr.length - 1;

        for (int i = 0; i < size; i++) {
            int minIndex = i;

            for (int j = i + 1; j < size + 1; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        return Arrays.toString(arr);
    }
}
