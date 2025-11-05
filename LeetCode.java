import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class LeetCode {
    public static void main(String[] args) {
/*

         4. Median of Two Sorted Arrays
         Given two sorted arrays nums1 and nums2 of size m and n respectively, return
         the median of the two sorted arrays.

         The overall run time complexity should be O(log (m+n)).

         Example 1:

         Input: nums1 = [1,3], nums2 = [2]
         Output: 2.00000
         Explanation: merged array = [1,2,3] and median is 2.
         Example 2:

         Input: nums1 = [1,2], nums2 = [3,4]
         Output: 2.50000
         Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
         int[] nums1 = { 1, 2 };
         int[] nums2 = { 3, 4 };
         System.out.println(findMedianSortedArrays(nums1, nums2));

         14. Longest Common Prefix
         Easy

         Write a function to find the longest common prefix string amongst an array of
         strings.

         If there is no common prefix, return an empty string "".

         Example 1:

         Input: strs = ["flower","flow","flight"]
         Output: "fl"
         Example 2:

         Input: strs = ["dog","racecar","car"]
         Output: ""
         Explanation: There is no common prefix among the input strings.
         String[] strs = { "flower", "flow", "flight" };
         System.out.println(longestCommonPrefix(strs));

         3. Longest Substring Without Repeating Characters
         Medium

         Hint
         Given a string s, find the length of the longest substring without duplicate
         characters.

         Example 1:

         Input: s = "abcabcbb"
         Output: 3
         Explanation: The answer is "abc", with the length of 3.
         System.out.println(lengthOfLongestSubstring(" "));

         input - "iamyymai"
         System.out.println(isPallindrome());

         System.out.println(isStrictlyPalindromic(9));

         3227. Vowels Game in a String
         Medium

         Topics
         premium lock icon
         Companies

         Hint
         Alice and Bob are playing a game on a string.

         You are given a string s, Alice and Bob will take turns playing the following
         game where Alice starts first:

         On Alice's turn, she has to remove any non-empty substring from s that
         contains an odd number of vowels.
         On Bob's turn, he has to remove any non-empty substring from s that contains
         an even number of vowels.
         The first player who cannot make a move on their turn loses the game. We
         assume that both Alice and Bob play optimally.

         Return true if Alice wins the game, and false otherwise.

         The English vowels are: a, e, i, o, and u.

         Example 1:

         Input: s = "leetcoder"

         Output: true
         System.out.println(doesAliceWin("leetcoder"));

         53. Maximum Subarray
         Medium

         Topics
         premium lock icon
         Companies
         Given an integer array nums, find the subarray with the largest sum, and
         return its sum.

         Example 1:

         Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
         Output: 6
         Explanation: The subarray [4,-1,2,1] has the largest sum 6.
         int[] num = { 5, 4, -1, 7, 8 };
         System.out.println(maxSubArray(num));

         125. Valid Palindrome
         Easy

         Topics
         premium lock icon
         Companies
         A phrase is a palindrome if, after converting all uppercase letters into
         lowercase letters and removing all non-alphanumeric characters, it reads the
         same forward and backward. Alphanumeric characters include letters and
         numbers.

         Given a string s, return true if it is a palindrome, or false otherwise.

         Example 1:

         Input: s = "A man, a plan, a canal: Panama"
         Output: true
         Explanation: "amanaplanacanalpanama" is a palindrome.
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));


        5. Longest Palindromic Substring

        Example 1:
        Input: s = "babad"
        Output: "bab"
        Explanation: "aba" is also a valid answer.

        System.out.println(longestPallindrome("cbbd"));


        9. Palindrome Number

        Example 1:

        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.

        System.out.println(isPalindrome(121));


        19. Remove Nth Node From End of List

        Given the head of a linked list, remove the nth node from the end of the list and return its head.
        Example 1:
        Input: head = [1,2,3,4,5], n = 2
        Output: [1,2,3,5]

        Example 2:
        Input: head = [1], n = 1
        Output: []

        Example 3:
        Input: head = [1,2], n = 1
        Output: [1]


        27. Remove Element
        Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

        Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

        Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
        Return k.

        Example 1:

        Input: nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 2.
        It does not matter what you leave beyond the returned k (hence they are underscores).
        Example 2:

        Input: nums = [0,1,2,2,3,0,4,2], val = 2
        Output: 5, nums = [0,1,4,0,3,_,_,_]
        Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
        Note that the five elements can be returned in any order.
        It does not matter what you leave beyond the returned k (hence they are underscores).


        31. Next Permutation
        A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

        For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
        The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

        For example, the next permutation of arr = [1,2,3] is [1,3,2].
        Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
        While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
        Given an array of integers nums, find the next permutation of nums.

        The replacement must be in place and use only constant extra memory.

        Example 1:

        Input: nums = [1,2,3]
        Output: [1,3,2]
        Example 2:

        Input: nums = [3,2,1]
        Output: [1,2,3]
        Example 3:

        Input: nums = [1,1,5]
        Output: [1,5,1]

        int[] nums = {1, 1, 5};
        nextPermutation(nums);

        26. Remove Duplicates from Sorted Array

        Example 1:

        Input: nums = [1,1,2]
        Output: 2, nums = [1,2,_]

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
 */
    }

    public static int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;
        while (right < nums.length) {
            if (nums[right] == nums[left]) {
                    right++;
            }else{
                left++;
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right++;
            }
        }
        return left + 1;
    }

    public static void nextPermutation(int[] nums) {
        // breakpoint
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int right = n - 1;
            while (nums[right] <= nums[i]) {
                right--;
            }

            //swap
            int temp = nums[i];
            nums[i] = nums[right];
            nums[right] = temp;
        }

        reverse(nums, i + 1, n - 1);

    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static int removeElement(int[] nums, int val) {
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[left] = nums[i];
                left++;
            }
        }
        return left;
    }

    public static boolean isPalindrome(int x) {
        int sum = 0;
        int num = x;
        while (x > 0) {
            int temp = x % 10;
            x = x / 10;
            sum = (sum * 10) + temp;
        }

        if (num == sum) {
            return true;
        }

        return false;
    }

    public static String longestPallindrome(String s) {

        if (s.isEmpty() || s.length() < 2) {
            return s;
        }

        int start = 0;
        int maxLength = 0;
        char[] s1 = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s1, i, i);     // Odd-length case
            int len2 = expandAroundCenter(s1, i, i + 1); //even length case

            int curMax = Math.max(len1, len2);

            if (curMax > maxLength) {
                maxLength = curMax;

                start = i - (maxLength - 1) / 2;
            }
        }


        return s.substring(start, start + maxLength);
    }

    public static int expandAroundCenter(char[] s, int left, int right) {

        while (left >= 0 && right < s.length && s[left] == s[right]) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    public static boolean isPalindrome(String s) {
        String cString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cString.length() - 1;

        while (left < right) {
            if (cString.charAt(left) != cString.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    // use kaydens algo
    public static int maxSubArray(int[] nums) {

        int curSum = nums[0];
        int oSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (curSum > 0) {
                curSum += nums[i];
            } else {
                curSum = nums[i];
            }

            if (curSum > oSum) {
                oSum = curSum;
            }
        }

        return oSum;
    }

    public static boolean doesAliceWin(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' ||
                    s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u') {
                return true;
            }
        }
        return false;
    }

    public static boolean isStrictlyPalindromic(int n) {
        StringBuilder sb = new StringBuilder();
        int rem = 0;

        while (n > 0) {
            rem = n % 2;
            n /= 2;
            sb.append(rem);
        }

        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;

    }

    public static boolean isPallindrome() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String in = input.nextLine();

        int left = 0;
        int right = in.length() - 1;

        while (left < right) {

            if (in.charAt(left) != in.charAt(right)) {
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
