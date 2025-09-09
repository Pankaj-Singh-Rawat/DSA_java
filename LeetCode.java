import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class LeetCode {
    public static void main(String[] args) {
        // 4. Median of Two Sorted Arrays
        // Given two sorted arrays nums1 and nums2 of size m and n respectively, return
        // the median of the two sorted arrays.

        // The overall run time complexity should be O(log (m+n)).

        // Example 1:

        // Input: nums1 = [1,3], nums2 = [2]
        // Output: 2.00000
        // Explanation: merged array = [1,2,3] and median is 2.
        // Example 2:

        // Input: nums1 = [1,2], nums2 = [3,4]
        // Output: 2.50000
        // Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        System.out.println(findMedianSortedArrays(nums1, nums2));

        // 14. Longest Common Prefix
        // Easy

        // Write a function to find the longest common prefix string amongst an array of
        // strings.

        // If there is no common prefix, return an empty string "".

        // Example 1:

        // Input: strs = ["flower","flow","flight"]
        // Output: "fl"
        // Example 2:

        // Input: strs = ["dog","racecar","car"]
        // Output: ""
        // Explanation: There is no common prefix among the input strings.
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));

        // 3. Longest Substring Without Repeating Characters
        // Medium

        // Hint
        // Given a string s, find the length of the longest substring without duplicate
        // characters.

        // Example 1:

        // Input: s = "abcabcbb"
        // Output: 3
        // Explanation: The answer is "abc", with the length of 3.
        System.out.println(lengthOfLongestSubstring("   "));


        // input - "iamyymai"
        System.out.println(isPallindrome());

    }

    public static boolean isPallindrome(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String in = input.nextLine();

        int left = 0 ;
        int right = in.length() - 1;

        while (left < right ){

            if(in.charAt(left) != in.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;

    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0;
        int left = 0;

        if (s == null || s.length() == 0) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {

            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            maxLen = Math.max(maxLen, i - left + 1);
        }

        return maxLen;
    }

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        int index = 0;

        String first = strs[0];
        String last = strs[strs.length - 1];

        while (index < first.length() && index < last.length()
                && first.charAt(index) == last.charAt(index)) {
            index++;
        }

        return first.substring(0, index);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] mergedArray = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k] = nums1[i];
                i++;
                k++;
            } else {
                mergedArray[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < nums1.length) {
            mergedArray[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            mergedArray[k] = nums2[j];
            j++;
            k++;
        }

        double meadian = 0.0;

        int len = mergedArray.length;
        if (len % 2 != 0) {
            meadian = mergedArray[len / 2];
        } else {
            meadian = (mergedArray[(len / 2)] + mergedArray[(len / 2) - 1]) / 2.0;
        }

        return meadian;
    }
}
