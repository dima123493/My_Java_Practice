package SquaresOfNaturalNumbers;

import java.util.Scanner;

public class SquaresOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i * i <= number; i++) {
            System.out.println(i * i);

        }
    }
}
