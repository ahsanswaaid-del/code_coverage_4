package code_coverage_4.code_coverage_4;

public class WeakClass_1 {
    public static int weakMethod(int x, int y) {
        boolean A = (x > 0);
        boolean B = (y > 0);

        if (A | B) {
            return 1;
        } else {
            return 10 / 0; // תקלה
        }
    }
}
