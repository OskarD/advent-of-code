package days.one;

// Now, instead of considering the next digit, it wants you to consider the digit halfway
// around the circular list. That is, if your list contains 10 items, only include a digit
// in your sum if the digit 10/2 = 5 steps forward matches it. Fortunately, your list has
// an even number of elements.

import java.util.Scanner;

public class InverseCaptchaHalfwayMatch extends InverseCaptcha {
    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        InverseCaptchaHalfwayMatch ic = new InverseCaptchaHalfwayMatch();

        while (true) {
            System.out.println("Enter captcha: ");
            String input = s.next();
            System.out.println("Solution: " + ic.solve(input));
        }
    }

    @Override
    protected char getNextComparedChar(String captcha, int currentIndex) {
        return captcha.charAt(getNextIndex(captcha.length(), currentIndex));
    }

    private int getNextIndex(int length, int currentIndex) {
        int stepsForward = length / 2;
        int nextIndex = currentIndex + stepsForward;
        return nextIndex % length;
    }
}
