package TheSmallestValue;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * A user inputs a long positive number m.
 * You need to find out what is the smallest int number n such that n! > m.
 * n!, or factorial n is a product of all natural numbers from 1 to n inclusive:
 * for example, 5! = 5 * 4 * 3 * 2 * 1.
 */

public class TheSmallestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        long number = scanner.nextLong();
        long fact = 1;
        int count = 1;
        while (fact <= number) {
            count++;
            fact *= count;
        }
        out.println(count);
    }
}
