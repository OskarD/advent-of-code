package days.one;

import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

// 1212 produces 6: the list contains 4 items, and all four digits match the digit 2 items ahead.
// 1221 produces 0, because every comparison is between a 1 and a 2.
// 123425 produces 4, because both 2s match each other, but no other digit has a match.
// 123123 produces 12.
// 12131415 produces 4.

public class InverseCaptchaHalfwayMatchTest {
    private static HashMap<String, Long> expectedResults = new HashMap<>();

    @BeforeClass
    public static void setUpClass() {
        expectedResults.put("1212", 6L);
        expectedResults.put("1221", 0L);
        expectedResults.put("123425", 4L);
        expectedResults.put("123123", 12L);
        expectedResults.put("12131415", 4L);
    }

    @Test
    public void testSolve() {
        for (Map.Entry<String, Long> entry : expectedResults.entrySet()) {
            TestCase.assertEquals(InverseCaptcha.solve(entry.getKey()), entry.getValue());
        }
    }
}