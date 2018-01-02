package days.two;

import util.Constants;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

// It sounds like the goal is to find the only two numbers in each row where
// one evenly divides the other - that is, where the result of the division
// operation is a whole number. They would like you to find those numbers on
// each line, divide them, and add up each line's result.
public class ChecksumDivision {

    public static void main(String[] args) {
        System.out.println("Type \"end \" to end input");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        long sum = 0;

        while (!input.equals("end")) {
            sum += getChecksum(input);
            input = scanner.nextLine();
        }

        System.out.println("Result: " + sum);
    }

    public static Long getChecksum(String line) {
        String[] numbers = line.split(Constants.DELIMITER);

        long[] longNumbers = Arrays.stream(numbers)
                .mapToLong(Long::parseLong)
                .toArray();

        for (long numerator : longNumbers) {
            for (long denominator : longNumbers) {
                if(numerator == denominator) {
                    continue;
                }

                if (numerator % denominator == 0) {
                    return numerator / denominator;
                }
            }
        }

        throw new RuntimeException("Could not find any dividable combination for " + line);
    }
}
