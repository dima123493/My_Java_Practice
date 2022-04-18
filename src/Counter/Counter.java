package Counter;

import java.util.Scanner;

import static java.lang.System.*;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            out.println(i+"!");
        }
        out.println();
    }
}
