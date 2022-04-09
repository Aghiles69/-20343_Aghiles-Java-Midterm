package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     * Write a method that will print or return at least 40 Fibonacci numbers
     *
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static long fib(long n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        System.out.println("The 2nd fibonacci number is: " + fib(2));
        System.out.println("The 10th fibonacci number is: " + fib(10));
        System.out.println("The 40th fibonacci number is: " + fib(40));
    }
}
