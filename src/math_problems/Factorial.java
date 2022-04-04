package math_problems;

public class Factorial {

    /** INSTRUCTIONS
     * Write a method to return the Factorial of any given number using Recursion, as well as iteration.
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {

        System.out.println(iterationFact(10));

        System.out.println(recursionFact(5));

    }

    public static int recursionFact(int num) {
        int x = 0;

        if (num <= 1) {
            return num;
        }

        x = x + (num * recursionFact(num-1 ) );

        return x;
    }

    public static int iterationFact(int num) {
        int x = 0;
        if (num <= 1) {
            return num;
        }

        for (int y = num - 1; y > 0; y--) {
            if (x > 0) {
                x = x * y;
            }
            else if (x == 0) {
                x += num * y;
            }
        }
        return x;
    }

}
