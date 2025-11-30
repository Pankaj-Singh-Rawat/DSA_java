package SearchingAlgo;

/*
Binary Search is a highly efficient algorithm for finding a specific target value within a sorted list or array. Unlike Sequential Search, which checks every element one by one, Binary Search dramatically reduces the search space by repeatedly dividing the list in half.

🔍 Binary Search Algorithm
Binary Search is a highly efficient algorithm for finding a specific target value within a sorted list or array. Unlike Sequential Search, which checks every element one by one, Binary Search dramatically reduces the search space by repeatedly dividing the list in half.

💡 The Core Idea:

1. The algorithm works based on the following steps:
2. Find the Middle: Find the middle element of the sorted list.
3. Compare: Compare the middle element with the target value.
4. Halve the List:
5. If the middle element is equal to the target, the search is successful.
6. If the middle element is greater than the target, the target must be in the left half of the list (since the list is sorted). The search continues only in the left half.
7. If the middle element is less than the target, the target must be in the right half of the list. The search continues only in the right half.
8. Repeat: Repeat the process on the new, smaller sub-array until the element is found or the sub-array is empty.

NOTE-> Crucial Requirement: The data must be sorted for Binary Search to work.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,23,34,46,78,99};
        System.out.println(binarySearch(arr, 78));
    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
