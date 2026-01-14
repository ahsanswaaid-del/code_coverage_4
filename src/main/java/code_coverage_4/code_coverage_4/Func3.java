package code_coverage_4.code_coverage_4;

/**
 * Function 3 used in the code-coverage exercises.
 */
public class Func3 {

    public static String func3(int x) {
        int result = 10;

        if (x > 0) {
            result = result / x;
        }

        // Always throws ArithmeticException.
        result = result / 0;

        return String.format("result=%d", result);
    }
}
