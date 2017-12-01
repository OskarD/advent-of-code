package days.one;

// Now, instead of considering the next digit, it wants you to consider the digit halfway
// around the circular list. That is, if your list contains 10 items, only include a digit
// in your sum if the digit 10/2 = 5 steps forward matches it. Fortunately, your list has
// an even number of elements.

public class InverseCaptchaHalfwayMatch extends InverseCaptcha {
    private static char getNextComparedChar(String captcha, int currentIndex) {
        if (currentIndex == captcha.length() - 1) {
            return captcha.charAt(0);
        }
        return captcha.charAt(++currentIndex);
    }
}
