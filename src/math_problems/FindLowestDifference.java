package math_problems;

public class FindLowestDifference {

    /** INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays
     * HINT: The lowest number that isn't shared between these arrays is 1
     */

    public static void main(String[] args) {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};
        int min1 = array1[0];
        for (int k : array1) {
            if (k < min1)
                min1 = k;
        }

        int min2 = array2[0];
        for (int j : array2) {
            if (j < min2)
                min2 = j;
        }

    }
    }








