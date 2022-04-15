package Counter;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i+"!");
        }
        System.out.println();
    }
}
