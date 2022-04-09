package string_problems;

import static string_problems.Palindrome.isPalindrome;

public class UnitTestingStringProblem {

    /*
     Use this class to unit test all of the classes contained within this package
     */

    public static void main(String[] args) {

        //Palindrome unit testing
        String text = "KAYAK";
        boolean flag = isPalindrome(text);
        if (flag) {
            System.out.println("The Word " + text + " is a Palindrome");
        } else {
            System.out.println("The Word " + text + " is not a Palindrome");
        }
    }

}

