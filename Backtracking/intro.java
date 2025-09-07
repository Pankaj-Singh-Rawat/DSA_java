package Backtracking;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(generateParenthesis(3));

    }

    public static List<String> generateParenthesis(int n) {
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
