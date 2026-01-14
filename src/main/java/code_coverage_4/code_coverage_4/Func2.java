package code_coverage_4.code_coverage_4;

/**
 * Function 2 used in the code-coverage exercises.
 */
public class Func2 {

    public static String func2(float p, float q) {

        if (p != 0) {
            p = p + 10;
        }

        // For float/double, division by 0 yields Infinity / NaN (no exception).
        q = q / p;

        return String.format("p=%.2f, q=%.2f", p, q);
    }
}
