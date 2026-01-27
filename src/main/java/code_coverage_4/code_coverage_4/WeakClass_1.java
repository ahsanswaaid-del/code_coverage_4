package code_coverage_4.code_coverage_4;

public class WeakClass_1 {
    public static int weakMethod(int x, int y) {
        int d = 0;
        if ((x > 0) | (y > 0)) {   
            d = 10;
        }
        return 10 / d;            // else -> 10/0 -> ArithmeticException
    }
}
