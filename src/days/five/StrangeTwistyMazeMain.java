package days.five;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StrangeTwistyMazeMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = "";
        List<InstructionInterface> instructions = new ArrayList<>();

        System.out.println("Type \"end \" to end input");

        while (!input.equals("end")) {
            if(input.length() > 0) {
                instructions.add(new StrangeInstruction(Integer.parseInt(input)));
            }
            input = s.nextLine();
        }

        System.out.println("Result: " + new Maze(instructions).solve());
    }
}
