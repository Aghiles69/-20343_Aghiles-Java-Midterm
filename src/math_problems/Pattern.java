package math_problems;

public class Pattern {

    /** INSTRUCTIONS
     * Read the numbers below, identify the pattern, and then implement the logic from this pattern.
     * Once done, you should test to see if you get the same output as below:
     *
     * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32...
     *
     */


    public static void main(String[] args) {
        pattern(100);
    }



    public static void pattern(int first){
        int x = 1;
        System.out.print(first + ",");
        for (int i = first; first >= 0; i--) {
            if (first < 0) {
                break;
            }
            for (int j = 10; j > 0; j--) {
                first = first -x;
                if (first < 0) {
                    break;
                }
                System.out.print((first) + ",");
            }
            x++;
        }
    }



}