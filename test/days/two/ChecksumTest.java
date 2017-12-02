package days.two;

import days.one.InverseCaptcha;
import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ChecksumTest {

    private static HashMap<String, Long> expectedResults = new HashMap<>();

    @BeforeClass
    public static void setUpClass() {
        expectedResults.put("5 1 9 5", 8L);
        expectedResults.put("7 5 3", 4L);
        expectedResults.put("2 4 6 8", 6L);
    }

    @Test
    public void testGetChecksum() {
        for (Map.Entry<String, Long> entry : expectedResults.entrySet()) {
            TestCase.assertEquals(entry.getValue(), Checksum.getChecksum(entry.getKey()));
        }
    }

}