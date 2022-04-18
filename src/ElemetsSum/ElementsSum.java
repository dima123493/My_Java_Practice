package ElemetsSum;

import java.util.Scanner;

import static java.lang.System.*;

public class ElementsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            int elem = scanner.nextInt();
            sum += elem;
        }

        out.println(sum);

    }
}