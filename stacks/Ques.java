package stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Ques {

    public static void main(String[] args) {

        int[] nums1 = {4, 1, 2}, nums2 = {1, 3, 4, 2};
        System.out.println(NextGreaterElement(nums1, nums2));
    }
    private static String NextGreaterElement(int[] nums1, int[] nums2) {
        // Question 2 (Next Greater Element I)

        // Now let's try a slightly more advanced problem that uses a stack.

        // Task:
        // The next greater element of some element x in an array is the first element
        // to the right of x that is greater than x.

        // You are given two arrays of unique integers, nums1 and nums2, where nums1 is
        // a subset of nums2. For each element in nums1, find its next greater element
        // in nums2. If it does not exist, return -1.

        // Example:

        // Input: nums1 = [4, 1, 2], nums2 = [1, 3, 4, 2]

        // Output: [-1, 3, -1]

        HashMap<Integer,Integer> hm = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {
            while(!stack.isEmpty() && nums2[i] > stack.peek()){
                hm.put(stack.pop(), nums2[i]);
            }

            stack.push(nums2[i]);
        }

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = hm.getOrDefault(nums1[i], -1);
        }



        return Arrays.toString(result);
    }
}
