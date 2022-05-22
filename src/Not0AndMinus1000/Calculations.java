package Not0AndMinus1000;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int elem;
        do {
            elem = scanner.nextInt();
            sum += elem;

            if (sum >= 1000) {
                sum = sum - 1000;
                break;
            }
        }
        while (elem != 0);

        System.out.println(sum);
    }
}