package days.five;

import days.four.PassPhraseAnagram;
import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

public class TwistyMazeTest {

    private static HashMap<String, Boolean> expectedResults = new HashMap<>();

    private int[] INSTRUCTIONS = {0, 3, 0, 1, -3};

    @Test
    public void testSolve() {
        List<InstructionInterface> instructions = new ArrayList<>();

        for (int instruction : INSTRUCTIONS) {
            instructions.add(new Instruction(instruction));
        }

        Maze maze = new Maze(instructions);

        TestCase.assertEquals(5, maze.solve());
    }

    @Test
    public void testStrangeSolve() {
        List<InstructionInterface> instructions = new ArrayList<>();

        for (int instruction : INSTRUCTIONS) {
            instructions.add(new StrangeInstruction(instruction));
        }

        Maze maze = new Maze(instructions);

        TestCase.assertEquals(10, maze.solve());
    }
}