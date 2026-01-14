package code_coverage_4.code_coverage_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Tests for Func1.
 */
public class Func1Test {

    // T1: (x != 0)=TRUE, (y==0)=TRUE
    @Test
    void t1_trueTrue() {
        assertEquals(5, Func1.func1(1, 0, 50));
    }

    // T2: (x != 0)=FALSE, (y==0)=TRUE -> divide by zero
    @Test
    void t2_falseTrue_throws() {
        assertThrows(ArithmeticException.class, () -> Func1.func1(0, 0, 10));
    }

    // T3: (x != 0)=TRUE, (y==0)=FALSE
    @Test
    void t3_trueFalse() {
        assertEquals(0, Func1.func1(1, 1, 30));
    }
}
