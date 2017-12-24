package days.four;

import days.two.Checksum;
import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class PassPhraseTest {

    private static HashMap<String, Boolean> expectedResults = new HashMap<>();

    @BeforeClass
    public static void setUpClass() {
        expectedResults.put("aa bb cc dd ee", true);
        expectedResults.put("aa bb cc dd aa", false);
        expectedResults.put("aa bb cc dd aaa", true);
    }

    @Test
    public void testIsValid() {
        for (Map.Entry<String, Boolean> entry : expectedResults.entrySet()) {
            System.out.println(entry.getKey());
            TestCase.assertEquals(entry.getValue(), new PassPhrase(entry.getKey()).isValid());
        }
    }
}