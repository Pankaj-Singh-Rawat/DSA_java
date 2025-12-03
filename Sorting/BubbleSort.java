package Sorting;

/*
Bubble Sort is one of the simplest sorting algorithms. It works by repeatedly swapping adjacent elements if they are in the wrong order. The process is repeated until no swaps are needed, which indicates the list is sorted.

The name "Bubble Sort" comes from the way smaller or larger elements "bubble up" to their correct position in the array with each pass.

Time Complexity:
1. Best - O(n)
2. Avg. - O(n^2)
3. Worst - O(n^2)
 */

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {12,23,3,4,465,5,7};
        System.out.println(bubbleSort(arr));
    }
    private static String bubbleSort(int[] arr){
        int size = arr.length - 1;

        for (int i = 0; i < size - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < size - i; j++) {
                if(arr[j] > arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                swapped = true;
            }
            if (!swapped){
                break;
            }
        }

        return Arrays.toString(arr);
    }
}
