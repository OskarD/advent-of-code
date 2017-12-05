package days.two;


import java.util.Scanner;

// The spreadsheet consists of rows of apparently-random numbers. To make sure
// the recovery process is on the right track, they need you to calculate the
// spreadsheet's checksum. For each row, determine the difference between the
// largest value and the smallest value; the checksum is the sum of all of
// these differences.
public class Checksum {

    public static void main(String[] args) {
        System.out.println("Type \"end \" to end input");

        Scanner scanner = new Scanner(System.in);
        String input = "0";

        long sum = 0;

        while (!input.equals("end")) {
            sum += getChecksum(input);
            input = scanner.nextLine();
        }

        System.out.println("Result: " + sum);
    }

    public static Long getChecksum(String line) {
        String[] numbers = line.split("(\t| )+");

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (String number : numbers) {
            Long integerNumber = Long.valueOf(number);
            min = integerNumber < min ? integerNumber : min;
            max = integerNumber > max ? integerNumber : max;
        }

        return max - min;
    }
}
