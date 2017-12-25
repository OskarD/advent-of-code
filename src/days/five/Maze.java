package days.five;

import java.util.List;

public class Maze {
    private final List<InstructionInterface> instructions;

    Maze(List<InstructionInterface> instructions) {
        this.instructions = instructions;
    }

    public int solve() {
        int currentStep = 0;
        int stepCount = 0;

        try {
            //noinspection InfiniteLoopStatement
            while(true) {
                currentStep += instructions.get(currentStep).perform();
                stepCount++;
            }
        } catch (IndexOutOfBoundsException e) {
            return stepCount;
        }
    }


}
