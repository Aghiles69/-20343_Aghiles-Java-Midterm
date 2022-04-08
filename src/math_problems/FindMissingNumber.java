package math_problems;

public class FindMissingNumber {

    /** INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static void main(String[] args)  {
        int[] array = new int[] {10, 2, 1, 9, 5, 3, 7, 8, 6};

        System.out.println(findMissingNum(array, array.length));

    }




    public static int findMissingNum(int[] array, int length) {
        int misNum = 1;
        for (int i = 2; i <= (length + 1); i++) {
            misNum = misNum + i;
            misNum = misNum - array[i - 2];
        }
        return misNum;
    }

}
