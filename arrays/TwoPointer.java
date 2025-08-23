package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class TwoPointer {
    public static void main(String[] args) {

        // Problem 1:
        // numbers = [2,7,11,15], target = 9
        // Output:
        // [1,2]
        int[] num = { 2, 7, 11, 15 };
        int target = 9;

        System.out.println(Arrays.toString(problem1(num, target)));
    }

    public static int[] problem1(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];

            if (currentSum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }

}
