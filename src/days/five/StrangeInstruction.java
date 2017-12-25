package days.five;

public class StrangeInstruction implements InstructionInterface {

    private int value;

    StrangeInstruction(int value) {
        this.value = value;
    }

    @Override
    public int perform() {
        return value >= 3 ? value-- : value++;
    }
}
