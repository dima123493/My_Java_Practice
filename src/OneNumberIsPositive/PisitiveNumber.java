package OneNumberIsPositive;

import java.util.Scanner;

import static java.lang.System.*;

public class PisitiveNumber {
    static class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(in);
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();

            boolean one = number1 > 0 && number2 <= 0 && number3 <= 0;
            boolean two = number2 > 0 && number1 <= 0 && number3 <= 0;
            boolean three = number3 > 0 && number2 <= 0 && number1 <= 0;

            out.println(one || two || three);
        }
    }
}