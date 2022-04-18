package Cinema;

import java.util.Scanner;

import static java.lang.System.*;

public class CinemaSeatsAvailable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int raw = scanner.nextInt();
        int line = scanner.nextInt();
        out.println("Cinema:");
        out.println("  1 2 3 4 5 6 7 8");
        for (int i = 1; i <= raw; i++) {
            out.print(i);
            for (int j = 1; j <= line; j++) {
                out.print(" S");
            }
            out.println();
        }
    }
}
