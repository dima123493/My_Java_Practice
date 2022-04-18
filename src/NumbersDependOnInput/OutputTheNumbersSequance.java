package NumbersDependOnInput;

import java.util.Scanner;

import static java.lang.System.*;

public class OutputTheNumbersSequance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int numbers = scanner.nextInt();
        for (int i = 1; i <= numbers; i++) {
            for (int j = 1; j <= i; j++) {
                out.print(i + " ");
            }
        }

        int numbers1 = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= numbers1; i++) {
            for (int j = 1; j <= i; j++) {
                out.print(i + " ");
                count++;
                if (count == numbers1) {
                    break;
                }
            }
            if (count == numbers1) {
                break;
            }
        }
    }
}
