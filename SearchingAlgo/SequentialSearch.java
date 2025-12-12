package SearchingAlgo;
/*
Sequential search, also known as Linear Search, is the simplest method for finding an element within a list or array. It works by checking every element in the list sequentially, starting from the first one, until a match is found or the entire list has been checked.

The core idea is:
1. Start at the beginning of the list (index 0).
2. Compare the current element with the target value.
3. If they match, the search is successful, and the index (or true) is returned.
4. If they don't match, move to the next element and repeat.
5. If the end of the list is reached and no match is found, the search is unsuccessful (and typically returns -1 or false).

Time Complexity:
1. Best Case	O(1)
2. Worst Case	O(n),n
3. Average Case	O(n)

 */
public class SequentialSearch {
    public static void main(String[] args) {
        int[] arr = {12,32,4,35,4,6,5,76};
        System.out.println(linearSearch(arr, 6));
    }
    private static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
