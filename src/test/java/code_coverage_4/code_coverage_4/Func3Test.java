package code_coverage_4.code_coverage_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Tests for Func3.
 */
public class Func3Test {

    @Test
    void stamtment_t1() {
        assertThrows(ArithmeticException.class, () -> Func3.func3(10));
    }

    @Test
    void stamtment_t2() {
        assertThrows(ArithmeticException.class, () -> Func3.func3(3));
    }
    @Test
    void stamtment_t3() {
        assertThrows(ArithmeticException.class, () -> Func3.func3(9));
    }
}
