package days.five;

public class Instruction {

    private int value;

    Instruction(int value) {
        this.value = value;
    }

    public int perform() {
        return value++;
    }
}
