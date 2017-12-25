package days.five;

import days.four.PassPhraseAnagram;
import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwistyMazeTest {

    private static HashMap<String, Boolean> expectedResults = new HashMap<>();

    @Test
    public void testSolve() {
        Instruction[] instructions = {
                new Instruction(0),
                new Instruction(3),
                new Instruction(0),
                new Instruction(1),
                new Instruction(-3)
        };

        Maze maze = new Maze(Arrays.asList(instructions));

        TestCase.assertEquals(maze.solve(), 5);
    }
}