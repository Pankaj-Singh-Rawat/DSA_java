package strings;

public class TwoPointers {
    public static void main(String[] args) {

        // Two Pointers: Question 1

        // A palindrome is a word or phrase that reads the same forwards and backward.

        // Task:
        // Write a function that takes a string as input and returns true if it's a
        // palindrome, and false otherwise. The function should ignore spaces and
        // capitalization.

        // Example:

        // Input: "racecar"
        // Output: true

        // Input: "A man, a plan, a canal: Panama"
        // Output: true

        String input1 = "A man, a plan, a canal: Panama";
        // System.out.println(problem1(cleanString(input1)));

        // Task:
        // Given a sorted array of integers and a target sum, find if there exists a
        // pair of elements in the array whose sum is equal to the target. Return true
        // if such a pair exists, and false otherwise.

        // Example:

        // Input: array = [2, 7, 11, 15], target = 9
        // Output: true (because 2 + 7 = 9)

        int[] input2 = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(problem2(input2, target));

        // Task:
        // Given a sorted array of integers, remove the duplicates in-place such that
        // each unique element appears only once. The relative order of the elements
        // should be kept the same.

        // Return the new length of the array after removing the duplicates. The
        // elements beyond the returned length don't matter.

        // Example:

        // Input: nums = [1, 1, 2]
        // Output: 2, with the first two elements of nums being 1 and 2.

        // Input: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
        // Output: 5, with the first five elements of nums being 0, 1, 2, 3, 4.
    
        int[] input3 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(problem3(input3));
    }

    private static int problem3(int[] input) {
  
        int i = 0 ;

        for (int j = 1; j < input.length; j++) {
            if(input[j] != input[i]){
                i++;
                input[i] = input[j];
            }
        }

        return i + 1;
        
    }

    private static boolean problem2(int[] input, int target) {
        int left = 0;
        int right = input.length - 1;
        int currentSum = 0;

        while (left < right) {
            currentSum = input[left] + input[right];
            if (currentSum == target) {
                return true;
            } else if (currentSum > target) {
                right--;
            } else {
                left++;
            }
        }

        return false;
    }

    private static boolean problem1(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private static String cleanString(String input) {

        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        return new String(sb);
    }
}
