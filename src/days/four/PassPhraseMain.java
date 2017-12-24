package days.four;

import java.util.Scanner;

public class PassPhraseMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = "";
        int correctPassPhrases = 0;

        System.out.println("Type \"end \" to end input");

        while(!input.equals("end")) {
            if(input.length() > 0 && new PassPhrase(input).isValid()) {
                correctPassPhrases++;
            }

            input = s.nextLine();
        }

        System.out.println("Result: " + correctPassPhrases);
    }
}
