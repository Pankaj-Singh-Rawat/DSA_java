package Sorting;

/*
Imagine you're sorting playing cards in your hand. You pick up cards one by one, and each time you get a new card, you insert it into its correct position among the cards you're already holding. That's exactly how insertion sort works!

The process:

Start with the second element (assume the first element is already "sorted")
Compare it with elements before it
Shift larger elements to the right to make space
Insert the element in its correct position
Repeat for all remaining elements

Time Complexity:
Best: O(n)
Average: O(n^2)
Worst: O(n^2)
 */

import java.util.Arrays;

public class InsertionSort {

//    Initial: [5, 2, 4, 6, 1, 3]
//
//    Pass 1: [5, 2, 4, 6, 1, 3] → [2, 5, 4, 6, 1, 3]  (insert 2)
//    Pass 2: [2, 5, 4, 6, 1, 3] → [2, 4, 5, 6, 1, 3]  (insert 4)
//    Pass 3: [2, 4, 5, 6, 1, 3] → [2, 4, 5, 6, 1, 3]  (6 already in place)
//    Pass 4: [2, 4, 5, 6, 1, 3] → [1, 2, 4, 5, 6, 3]  (insert 1 at start)
//    Pass 5: [1, 2, 4, 5, 6, 3] → [1, 2, 3, 4, 5, 6]  (insert 3)

    public static void main(String[] args) {
        int[] arr1 = {5, 2, 4, 6, 1, 3};
        System.out.println(insertionSort(arr1));
    }

    private static String insertionSort(int[] arr){

        for (int i =1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

        return Arrays.toString(arr);
    }

}
