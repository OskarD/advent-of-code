package days.one;

import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

// 1122 produces a sum of 3 (1 + 2) because the first digit (1) matches the second digit and the third digit (2) matches the fourth digit.
// 1111 produces 4 because each digit (all 1) matches the next.
// 1234 produces 0 because no digit matches the next.
// 91212129 produces 9 because the only digit that matches the next one is the last digit, 9.

public class InverseCaptchaTest {
    private static HashMap<String, Long> expectedResults = new HashMap<>();

    @BeforeClass
    public static void setUpClass() {
        expectedResults.put("1122", 3L);
        expectedResults.put("1111", 4L);
        expectedResults.put("1234", 0L);
        expectedResults.put("91212129", 9L);
    }

    @Test
    public void testSolve() {
        for (Map.Entry<String, Long> entry : expectedResults.entrySet()) {
            TestCase.assertEquals(InverseCaptcha.solve(entry.getKey()), entry.getValue());
        }
    }
}