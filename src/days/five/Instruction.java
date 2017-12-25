package days.five;

public class Instruction implements InstructionInterface {

    private int value;

    Instruction(int value) {
        this.value = value;
    }

    @Override
    public int perform() {
        return value++;
    }
}
