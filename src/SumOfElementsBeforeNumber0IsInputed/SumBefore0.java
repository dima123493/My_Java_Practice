package SumOfElementsBeforeNumber0IsInputed;

import java.util.Scanner;

public class SumBefore0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int elem;
        do {
            elem = scanner.nextInt();
            sum += elem;
        } while (elem != 0);
        System.out.print(sum);
    }
}
