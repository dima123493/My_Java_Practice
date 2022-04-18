package SquaresOfNaturalNumbers;

import java.util.Scanner;

import static java.lang.System.*;

public class SquaresOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int number = scanner.nextInt();

        for (int i = 1; i * i <= number; i++) {
            out.println(i * i);

        }
    }
}
