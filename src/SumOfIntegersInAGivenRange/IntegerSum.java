package SumOfIntegersInAGivenRange;

import java.util.Scanner;

public class IntegerSum {
    /**
     * The method calculates the sum of integers in a given range
     *
     * @param from inclusive
     * @param to   exclusive
     * @return the sum (long)
     */
    public static long sumInRange(int from, int to) {
        long i, sum = 0;
        for (i = from; i < to; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    }
}
