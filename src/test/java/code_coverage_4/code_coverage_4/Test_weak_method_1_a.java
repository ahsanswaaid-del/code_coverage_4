package code_coverage_4.code_coverage_4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class Test_weak_method_1_a {
	// =====================================================
    // 1) 100% Clause / Condition Coverage
    //    בלי לחשוף את התקלה
    // =====================================================

    @Test
    void clauseCoverage_Atrue_Bfalse() {
        // A=true (x>0), B=false (y=0)
        // A|B = true  => if
        assertEquals(1, WeakClass_1.weakMethod(1, 0));
    }

    @Test
    void clauseCoverage_Afalse_Btrue() {
        // A=false (x=0), B=true (y>0)
        // A|B = true  => if
        assertEquals(1, WeakClass_1.weakMethod(0, 1));
    }
    // 2) Branch Coverage
    //    חייב לחשוף את התקלה
    // =====================================================

    @Test
    void branchCoverage_ifBranch() {
        // Decision true => if
        assertEquals(1, WeakClass_1.weakMethod(2, 0));
    }

    @Test
    void branchCoverage_elseBranch_exception() {
        // A=false וגם B=false => A|B=false => else
        // => 10/0 => ArithmeticException
        assertThrows(ArithmeticException.class,
                () -> WeakClass_1.weakMethod(0, 0));
    }

}
