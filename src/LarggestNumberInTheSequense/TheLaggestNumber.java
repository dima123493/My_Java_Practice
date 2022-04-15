package LarggestNumberInTheSequense;

import java.util.Scanner;

public class TheLaggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int elem;
        do {
            elem = scanner.nextInt();
            if (elem >= sum) {
                sum = elem;
            }
        } while (elem != 0);
        System.out.print(sum);
    }

}
