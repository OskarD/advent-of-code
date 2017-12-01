package days.one;

//The captcha requires you to review a sequence of digits (your puzzle input)
// and find the sum of all digits that match the next digit in the list.
//The list is circular, so the digit after the last digit is the first digit in the list.

import java.util.Scanner;

public class InverseCaptcha {

    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter captcha: ");
            String input = s.next();
            System.out.println("Solution: " + solve(input));
        }
    }

    public static Long solve(String captcha) {
        long sum = 0;

        for (int i = 0; i < captcha.length(); i++) {
            char currentChar = captcha.charAt(i);
            if (currentChar == getNextComparedChar(captcha, i)) {
                sum += Character.getNumericValue(currentChar);
            }
        }

        return sum;
    }

    private static char getNextComparedChar(String captcha, int currentIndex) {
        if (currentIndex == captcha.length() - 1) {
            return captcha.charAt(0);
        }
        return captcha.charAt(++currentIndex);
    }
}
