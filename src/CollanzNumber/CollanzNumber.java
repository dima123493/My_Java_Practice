package CollanzNumber;

import java.util.Scanner;

public class CollanzNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int collatzNumber = scanner.nextInt();
        int three = 3;
        int one = 1;

        while (collatzNumber != 1) {
            System.out.print(collatzNumber + " ");

            if ((collatzNumber % 2) == 1) {
                collatzNumber = three * collatzNumber + one;
            } else {
                collatzNumber = collatzNumber / 2;
            }
        }
        System.out.print(collatzNumber);
    }
}
