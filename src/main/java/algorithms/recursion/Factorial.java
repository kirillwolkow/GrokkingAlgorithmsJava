package algorithms.recursion;

public class Factorial {
    /**
     * This function returns the factorial of a positive integer. If input is negative, it returns -1.
     * */
    public static int calculateFactorial(final int num) {
        if (num < 0) {
            return -1;
        } else if (num == 0) {
            return 1;
        } else if (num == 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}
