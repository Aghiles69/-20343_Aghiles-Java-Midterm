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
        patFinder(100);
    }



    public static void patFinder(int num){
        int n = 1;
        System.out.print(num + ",");
        for (int i = num; num >= 0; i--) {
            for (int j = 10; j > 0; j--) {
                num = num -n;
                if (num < 0) {
                    break;
                }
                System.out.print(num + ",");
            }
            n++;
        }
    }



}


