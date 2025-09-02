package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SlidingWindow {
    public static void main(String[] args) {

        // Question 1

        // Task:
        // Given an array of positive integers and a positive integer k, find the
        // maximum sum of any contiguous subarray of size k.

        // Example:

        // Input: arr = [2, 1, 5, 1, 3, 2], k = 3
        // Output: 9

        int[] arr1 = { 2, 1, 5, 1, 3, 2 };
        int k = 3;

        System.out.println(problem1(arr1, k));

        // Question 2 (Variable Size)

        // Task:
        // Given an array of positive integers and a positive integer S, find the length
        // of the smallest contiguous subarray whose sum is greater than or equal to S.
        // If no such subarray exists, return 0.

        // Example:

        // Input: arr = [2, 1, 5, 2, 3, 2], S = 7
        // Output: 2

        int[] arr2 = { 2, 1, 5, 2, 3, 2 };
        int s = 7;
        System.out.println(problem2(arr2, s));

    }

    // variable size windows
    private static int problem2(int[] arr, int s) {

        int windowStart = 0;
        int minLength = Integer.MAX_VALUE;
        int windowSum = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];

            while(windowSum >= s){
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        

        return minLength;
    }

    private static int problem1(int[] arr, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = 0;
        max = Math.max(sum, max);

        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            max = Math.max(sum, max);
        }

        return max;
    }

    public static void frequencyCalc(String s) {
        // frequency calculation using HashMaps in Strings
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        System.out.println(hm);
    }

}