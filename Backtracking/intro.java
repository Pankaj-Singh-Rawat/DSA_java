package Backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class intro {
    // What is Backtracking?

    // Backtracking is a systematic way to solve problems by exploring every
    // possible path to a solution. If a path leads to a dead end or doesn't satisfy
    // the problem's constraints, the algorithm "backtracks" (undoes its previous
    // step) and tries a different path. It's a methodical form of trial and error
    // often used to find all possible solutions to a problem.

    // A backtracking algorithm typically has the following components:

    // A state that represents the current progress toward a solution.
    // Choices at each state that lead to new states.
    // Constraints that determine whether a choice is valid.
    // A goal that indicates a solution has been found.
    
    public static void main(String[] args) {
        // question 1
        System.out.println(generateParenthesis(3));

        // question 2
        int[] nums = { 1, 2, 3 };
        System.out.println(generateSubSets(nums));

    }

    public static List<List<Integer>> generateSubSets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subsets_backtracking(result, new ArrayList<>(), nums, 0);
        return result;
    }

    public static void subsets_backtracking(List<List<Integer>> result, List<Integer> currentSubset, int[] nums,
            int start) {

        result.add(new ArrayList<>(currentSubset));

        for (int i = start; i < nums.length; i++) {
            currentSubset.add(nums[i]); // adds element by index

            subsets_backtracking(result, currentSubset, nums, i + 1); // works with the element added

            currentSubset.remove(currentSubset.size() - 1); //decreases element from subset
        }

    }

    public static List<String> generateParenthesis(int n) {
        // Question 1: Generating Parentheses

        // Problem: Given n, generate all combinations of well-formed parentheses.

        // The Core Idea: Think of this as building a string, character by character. At
        // each step, you have a choice: add an open parenthesis ( or a close
        // parenthesis ). But these choices are limited by two simple rules:

        // You can only add an open parenthesis ( if you haven't used up all n of them
        // yet.

        // You can only add a close parenthesis ) if you have more open parentheses
        // currently in your string than close parentheses. This prevents a ) from
        // appearing before its matching (.

        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String currentString, int openCount, int closeCount, int n) {
        // Base Case: A valid combination is found when the string length is 2*n.
        if (currentString.length() == 2 * n) {
            result.add(currentString);
            return; // Stop and "backtrack" to the previous state.
        }

        // Choice 1: Add an open parenthesis '('
        // You can add an open parenthesis as long as the number of open parentheses
        // used
        // is less than the total number of pairs 'n'.
        if (openCount < n) {
            backtrack(result, currentString + "(", openCount + 1, closeCount, n);
        }

        // Choice 2: Add a close parenthesis ')'
        // You can add a close parenthesis only if the number of open parentheses used
        // is greater than the number of close parentheses used. This ensures
        // the string is "well-formed" and parentheses are closed in the correct order.
        if (closeCount < openCount) {
            backtrack(result, currentString + ")", openCount, closeCount + 1, n);
        }
    }
}
