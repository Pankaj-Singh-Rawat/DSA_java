import java.util.*;

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

        35. Search Insert Position
        Example 1:
        Input: nums = [1,3,5,6], target = 5
        Output: 2
        Example 2:
        Input: nums = [1,3,5,6], target = 2
        Output: 1
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 7));

        LeetCode - 28
        Given two strings needle and haystack, return the index of the first
        occurrence of needle in haystack, or -1 if needle is not part of haystack.
        Input: haystack = "sadbutsad", needle = "sad"
        Output: 0
        Explanation: "sad" occurs at index 0 and 6.
        The first occurrence is at index 0, so we return 0.

        String needle = "a";
        String haystack = "a";
        System.out.println(strStr(haystack, needle));

        Problem - 344
        Write a function that reverses a string. The input string is given as an array of characters s.
        You must do this by modifying the input array in-place with O(1) extra memory.

        Input: s = ["h","e","l","l","o"]
    `   Output: ["o","l","l","e","h"]

        char[] input = {'h','e','l','l','o'};

        Problem - 345
        Reverse Vowels of a String
        Given a string s, reverse only all the vowels in the string and return it.
        The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

        Input: s = "IceCreAm"
        Output: "AceCreIm"
        Explanation:
        The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

        Problem - 844
        Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
        Note that after backspacing an empty text, the text will continue empty.

        Input: s = "ab#c", t = "ad#c"
        Output: true
        Explanation: Both s and t become "ac".

        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s,t));

        Problem 234

        Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

        Input: head = [1,2,2,1]
        Output: true

        Problem - 925
        Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

        You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

        Input: name = "alex", typed = "aaleex"
        Output: true
        Explanation: 'a' and 'e' in 'alex' were long pressed.

        String name = "alex", typed = "aalex";
        System.out.println(isLongPressedName(name, typed));

        Problem - 125

        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
        Given a string s, return true if it is a palindrome, or false otherwise.

        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.

        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome1(input));

        Problem - 567
        Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
        In other words, return true if one of s1's permutations is the substring of s2.

        Example 1:
        Input: s1 = "ab", s2 = "eidbaooo"
        Output: true
        Explanation: s2 contains one permutation of s1 ("ba").

        String s1 = "pankaj", s2 = "";
        System.out.println(checkPermutation(s1,s2));

        Problem - 1:

        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));


        Problem - 26:
        Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

        Consider the number of unique elements in nums to be k. After removing duplicates, return the number of unique elements k.
        The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.

        Input: nums = [1,1,2]
        Output: 2, nums = [1,2,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
        It does not matter what you leave beyond the returned k (hence they are underscores).

        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates1(arr));

        Problem - 27:
        Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
        Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
        Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
        Return k.

        Example 1:
        Input: nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 2.
        It does not matter what you leave beyond the returned k (hence they are underscores).

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement1(nums, val));

        Problem - 35. Search Insert Position

        Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
        You must write an algorithm with O(log n) runtime complexity.

        Example 1:
        Input: nums = [1,3,5,6], target = 5
        Output: 2

        int[] nums = {1,3,5,6}; int target = 7;
        System.out.println(searchInsert1(nums, target));

        Problem - 53:
        Given an integer array nums, find the subarray with the largest sum, and return its sum.

        Example 1:
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray1(nums));


    }

    private static int maxSubArray1(int[] nums) {
        // Kayden's Algprithm
        int maxOfTwo = nums[0];
        int theMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxOfTwo = Math.max(maxOfTwo + nums[i], nums[i]);
            theMax = Math.max(maxOfTwo, theMax);
        }

        return theMax;
    }


    public static int searchInsert1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) /2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static int removeElement1(int[] nums, int val) {
        int left = 0;
        int count = 0;
        while (left < nums.length) {
            if( nums[left] != val ) {
                nums[count] = nums[left];
                count++;
            }
            left++;
        }

        return count;
    }

    public static int removeDuplicates1(int[] nums) {
        int left = 0;
        int right = 1;
        while(right < nums.length) {
            if(nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }
            right ++;
        }


        return left + 1;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int required = target - nums[i];

            if(map.containsKey(required)) {
                return new int[] {map.get(required), i};
            }

            map.put(nums[i], i);
        }

        return null;
    }

    public static boolean checkPermutation(String s1, String s2) {
        if(s1.length() > s2.length()) return  false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int j = 0; j < s1.length(); j++) {
            arr1[s1.charAt(j) - 'a']++;
            arr2[s2.charAt(j) - 'a']++;
        }

        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if(matches(arr1, arr2)) return true;

            arr2[s2.charAt(i + s1.length()) - 'a']++;
            arr2[s2.charAt(i) - 'a']--;
        }

        return matches(arr1, arr2);
    }
    
    public static boolean matches(int[] s1, int[] s2) {
        for (int i = 0; i < 26; i++) {
            if(s1[i] != s2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome1(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }


    public static boolean isLongPressedName(String name, String typed) {

        int np = 0;
        int tp = 0;

        while (tp < typed.length()) {
            if (np < name.length() && name.charAt(np) == typed.charAt(tp)) {
                np++;
                tp++;
            } else if (tp > 0 && typed.charAt(tp - 1) == typed.charAt(tp)) {
                tp++;
            } else {
                return false;
            }
        }


        return np == name.length();
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        while (slow != null) {
            ListNode nextTemp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextTemp;
        }

        ListNode left = head;
        ListNode right = prev;
        while (right != null) {
            if (left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public static Stack<Character> build(String s) {

        Stack<Character> stack1 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                stack1.push(s.charAt(i));
            } else if (!stack1.isEmpty()) {
                stack1.pop();
            }
        }

        return stack1;
    }

    public static String reverseVowels(String s) {
        // do for Vowels only not all characters
        char[] str = s.toCharArray();
        int left = 0;
        int right = str.length - 1;

        while (left < right) {
            if (!checkVowels(str[left])) {
                left++;
                continue;
            }
            if (!checkVowels(str[right])) {
                right--;
                continue;
            }

            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left++;
            right--;
        }
        return String.valueOf(str);

    }

    public static boolean checkVowels(char c) {
        return switch (Character.toLowerCase(c)) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };

    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char c = s[left];
            s[left] = s[right];
            s[right] = c;
            left++;
            right--;
        }
    }

    public static int strStr(String haystack, String needle) {

        int hLen = haystack.length();
        int nLen = needle.length();

        if (hLen < nLen) {
            return -1;
        }

        for (int i = 0; i <= hLen - nLen; i++) {
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;
        while (right < nums.length) {
            if (nums[right] == nums[left]) {
                right++;
            } else {
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
