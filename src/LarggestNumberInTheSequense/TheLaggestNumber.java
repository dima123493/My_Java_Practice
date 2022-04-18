package LarggestNumberInTheSequense;

import java.util.Scanner;

import static java.lang.System.*;

public class TheLaggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int sum = 0;
        int elem;
        do {
            elem = scanner.nextInt();
            if (elem >= sum) {
                sum = elem;
            }
        } while (elem != 0);
        out.print(sum);
    }

}
