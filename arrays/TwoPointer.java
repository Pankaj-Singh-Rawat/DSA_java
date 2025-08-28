package arrays;

import java.lang.reflect.Array;
import java.text.ListFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class TwoPointer {
    public static void main(String[] args) {

        // Problem 1:
        // numbers = [2,7,11,15], target = 9
        // Output:
        // [1,2]
        int[] num = { 2, 7, 11, 15 };
        int target = 9;

        // System.out.println(Arrays.toString(problem1(num, target)));

        int arr[] = {1,2,3,4,5,6};
        // System.out.println(Arrays.toString(reverseArray(arr)));

        // ques - 189 : leetcode
        int[] arr1 = {9,9,3,2,1,1,3,2,8};
        System.out.println(ques189(arr1));
    }

    public static HashMap ques189(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0)+ 1);
        }

        return map;
    }

    public static int[] reverseArray(int[] arr){

        int left = 0 ;
        int right = arr.length -1 ;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }

        return arr;
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
