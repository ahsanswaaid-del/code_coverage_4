package code_coverage_4.code_coverage_4;

/**
 * Function 1 used in the code-coverage exercises.
 */
public class Func1 {

    public static int func1(int x, int y, int z) {
        int res = 0;

        // Note: single '&' (not '&&') evaluates both sides.
        if ((x != 0) & (y == 0)) {
            res = z / 10;
        }

        // Will throw ArithmeticException when x == 0.
        res = res / x;

        return res;
    }
}
