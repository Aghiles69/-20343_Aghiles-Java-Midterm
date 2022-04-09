package string_problems;

public class Permutation {

    /*
    Create a Java program to compute all permutations of any given string

        e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */

    // Implement Here
    public static boolean isPalindrome(String text) {
        boolean isPalindrome = false;

        String reversedString = reverseString(text);

        isPalindrome = text.equals(reversedString);

        return isPalindrome;
    }

    public static String reverseString(String input) {
        String reversedString = "";

        char[] inputArr = input.toCharArray();
        int n = inputArr.length;

        char[] reversedArray = new char[n];

        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            reversedArray[j] = inputArr[i];
            j++;
        }

        reversedString = String.valueOf(reversedArray);

        return reversedString;
    }
}
