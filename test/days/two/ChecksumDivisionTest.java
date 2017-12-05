package days.two;

import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ChecksumDivisionTest {

    private static HashMap<String, Long> expectedResults = new HashMap<>();

    @BeforeClass
    public static void setUpClass() {
        expectedResults.put("5 9 2 8", 4L);
        expectedResults.put("9 4 7 3", 3L);
        expectedResults.put("3 8 6 5", 2L);
    }

    @Test
    public void testGetChecksum() {
        for (Map.Entry<String, Long> entry : expectedResults.entrySet()) {
            System.out.println(entry.getKey());
            TestCase.assertEquals(entry.getValue(), ChecksumDivision.getChecksum(entry.getKey()));
        }
    }

}