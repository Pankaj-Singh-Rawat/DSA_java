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
        System.out.println(factorial(5));

    }

    public static int factorial(int a) {
        if (a == 1) {
            return 1;
        } else if (a == 0) {
            return 0;
        } else {
            return a * factorial(a - 1);
        }
    }
}
