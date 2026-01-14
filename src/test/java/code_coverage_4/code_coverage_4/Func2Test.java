package code_coverage_4.code_coverage_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Tests for Func2.
 */
public class Func2Test {

    @Test
    void pt1_NonZero_normalCase() {
        assertEquals("p=15.00, q=1.00", Func2.func2(5f, 15f));
    }

    @Test
    void pZero_infinity() {
        assertEquals("p=0.00, q=Infinity", Func2.func2(0f, 5f));
    }

    @Test
    void pt2_NonZero_normalCase() {
        assertEquals("p=15.00, q=2.00", Func2.func2(5f, 30f));
    }
}
