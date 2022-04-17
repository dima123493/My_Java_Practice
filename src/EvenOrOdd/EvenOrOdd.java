package EvenOrOdd;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elem;
        do {
            elem = scanner.nextInt();
            if (elem % 2 == 0 && elem != 0) {
                System.out.println("even");
            }
            if (elem % 2 != 0) {
                System.out.println("odd");
            }
        } while (elem != 0);
    }
}
