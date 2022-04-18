package EvenOrOdd;

import java.util.Scanner;

import static java.lang.System.*;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int elem;
        do {
            elem = scanner.nextInt();
            if (elem % 2 == 0 && elem != 0) {
                out.println("even");
            }
            if (elem % 2 != 0) {
                out.println("odd");
            }
        } while (elem != 0);

        //Same but higher level
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            out.println(number % 2 == 0 ? "even" : "odd");
        }
    }
}
