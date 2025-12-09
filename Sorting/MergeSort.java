package Sorting;

import java.util.Arrays;

/*
Merge Sort - a classic divide-and-conquer algorithm known for its stability and guaranteed O(n log n) performance!

How Merge Sort Works
Merge Sort follows a simple strategy:

Divide: Split the array into two halves
Conquer: Recursively sort both halves
Combine: Merge the two sorted halves into one sorted array

Combine :
a. get size of both left and right size arrays
b. create temporary arrays and store both left and right arrays
c. define variables to move through index of both arrays and also for merge array.
d. use those definitions to combine the left and right array and merge them using while loop.

Time Complexity:
Best: O(n)
Avg: O(n log n)
Worst: O(n log n)
 */
public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);

        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while(i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array: " + Arrays.toString(arr1));
        mergeSort(arr1, 0, arr1.length-1);
        System.out.println("Sorted array:" + Arrays.toString(arr1));
    }
}
