package SumOfIntegersFromAToB;

import java.util.Scanner;

import static java.lang.System.*;

public class FromAToB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = 0;
        for (int i = number1; i <= number2; i++) {
            sum += i;
        }
        out.println(sum);

    }
}
