package days.four;

import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class PassPhraseAnagramTest {

    private static HashMap<String, Boolean> expectedResults = new HashMap<>();

    @BeforeClass
    public static void setUpClass() {
        expectedResults.put("abcde fghij", true);
        expectedResults.put("abcde xyz ecdab", false);
        expectedResults.put("iiii oiii ooii oooi oooo", true);
        expectedResults.put("oiii ioii iioi iiio", false);
    }

    @Test
    public void testIsValid() {
        for (Map.Entry<String, Boolean> entry : expectedResults.entrySet()) {
            System.out.println(entry.getKey());
            TestCase.assertEquals(entry.getValue(), new PassPhraseAnagram(entry.getKey()).isValid());
        }
    }
}