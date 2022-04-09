package math_problems;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {

    }
    public static List<Integer> primeNumbers(int maxNumb) {
        List<Integer> primeNumbers = new ArrayList<>();

        if (maxNumb >= 2) {
            primeNumbers.add(2);
        }
        for (int i = 3; i <= maxNumb; i += 2) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }


}

