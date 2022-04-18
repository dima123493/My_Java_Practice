package MaxElementDivisibleBy4;

import java.util.Scanner;

import static java.lang.System.*;

public class MaxDivisibleBy4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int number1 = scanner.nextInt();
        int max4 = 0;
        int number;
        for (int i = 0; i < number1; i++) {
            number = scanner.nextInt();
            int divideBy = 4;
            if (number % divideBy == 0) {
                if (max4 >= number) {
                    continue;
                }
                max4 = number;
            }
        }
        out.println(max4);
    }
}
