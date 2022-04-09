package math_problems;

public class UnitTestingMath {

    /**
     * Use this class to unit test all of the class within this package
     */

    public static void main(String[] args) {
       //Fibonacci Unit Testing
        System.out.println("The 40Th Fibonacci number is : "+ Fibonacci.fib(40));
        //Prime number Unit testing
        System.out.println("The prime numbers from 2 to 1 000 000 are : "+ PrimeNumber.primeNumbers(1000000));
    }
}
