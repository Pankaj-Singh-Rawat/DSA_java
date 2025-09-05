package Recursion;

public class Intro {
    public static void main(String[] args) {
        /*
         * Any method which calls itself is called recursive.
         * -> A recursive method solves a problem by calling a copy of itself to work on
         * a smaller problem.
         * This is called the recursion step.
         * 
         * ->Generally , loops are turned into recursive functions when
         * they are compiled or interpreted.
         * 
         */

        // Format of recursive function :
        /*
         * if(test for the base case){
         * return some base case
         * }else if(test for another base case){
         * return other base case value
         * -> the recursive case
         * }
         * else{
         * return (some work then a recursive call)
         * }
         */

        // Example - 1: find factorial of number
        System.out.println(problem_one(5));

        // Question 2 (The Fibonacci Sequence)

        // Task:
        // Write a function to find the nth
        // number in the Fibonacci sequence using recursion.

        // The Fibonacci sequence is a series of numbers where each number is the sum of
        // the two preceding ones. The sequence starts with 0 and 1.

        // Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...

        // Formula: F(n)=F(n−1)+F(n−2)

        // F(0)=0

        // F(1)=1

        // Example:

        // Input: n = 5

        // Output: 5 (The 5th number in the sequence, starting from index 0)
        System.out.println(problem_two(8));

        // Question 3 (Sum of Digits)

        // Task:
        // Write a recursive function to find the sum of the digits of a positive
        // integer.

        // Example:

        // Input: n = 123

        // Output: 6 (because 1+2+3=6)
        System.out.println(problem_three(123));

        // Question 4 (Power of a Number)

        // Task:
        // Write a recursive function to calculate the power of a number. Given an
        // integer base and a non-negative integer exponent, return base raised to the
        // power of exponent.

        // Example:

        // Input: base = 2, exponent = 4

        // Output: 16 (because 2
        // 4
        // =2×2×2×2=16)

        System.out.println(problem_four(2, 4));

        // Question 5 (Reverse a String)

        // Task:
        // Write a recursive function to reverse a string.

        // Example:

        // Input: "hello"

        // Output: "olleh"
        System.out.println(problem_five("pankaj"));
    }

    private static String problem_five(String a){
        if(a.length() <= 0){
            return a;
        }

        String remaining = a.substring(1);
        char firstChar = a.charAt(0);
        return problem_five(remaining) + firstChar;
    }

    private static int problem_four(int base, int power) {

        if (power == 0) {
            return 1;
        }

        return base * problem_four(base, power - 1);
    }

    private static int problem_three(int n) {

        if (n == 0) {
            return n;
        }

        return (n % 10) + problem_three(n / 10);
    }

    private static int problem_two(int n) {

        if (n <= 1) {
            return n;
        }

        return problem_two(n - 1) + problem_two(n - 2);
    }

    public static int problem_one(int a) {
        if (a == 1 || a == 0) {
            return 1;
        } else if (a == 0) {
            return 0;
        } else {
            return a * problem_one(a - 1);
        }
    }
}
