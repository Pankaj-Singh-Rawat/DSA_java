package strings;
// Kadane's Algorithm

/*
Most efficient way to find the Maximum Sum Subarray within a one-dimensional array of numbers.
 */
public class KadaneAlgo {
    public static void main(String[] args) {
    int[] arr = {1,234,-23,54,-24,5,6,-21,68,7};

        System.out.println(kadaneAlgo(arr));
    }

    static int kadaneAlgo(int[] arr) {
        int max_So_far = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
             currentMax = Math.max(arr[i], currentMax + arr[i]);

             max_So_far = Math.max(currentMax, max_So_far);
        }

        return max_So_far;
    }
}
