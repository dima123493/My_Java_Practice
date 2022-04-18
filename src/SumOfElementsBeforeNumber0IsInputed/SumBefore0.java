package SumOfElementsBeforeNumber0IsInputed;

import java.util.Scanner;

import static java.lang.System.*;

public class SumBefore0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int sum = 0;
        int elem;
        do {
            elem = scanner.nextInt();
            sum += elem;
        } while (elem != 0);
        out.print(sum);
    }
}