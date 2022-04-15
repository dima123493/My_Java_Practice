package OneNumberIsPositive;
import javafx.scene.Parent;

import java.util.Scanner;

public class PisitiveNumber {
    static class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();

            boolean one = number1 > 0 && number2 <= 0 && number3 <= 0;
            boolean two = number2 > 0 && number1 <= 0 && number3 <= 0;
            boolean three = number3 > 0 && number2 <= 0 && number1 <= 0;

            System.out.println(one || two || three);
        }
    }
}