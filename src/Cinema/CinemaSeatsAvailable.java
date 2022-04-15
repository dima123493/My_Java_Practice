package Cinema;

import java.util.Scanner;

public class CinemaSeatsAvailable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int raw = scanner.nextInt();
        int line = scanner.nextInt();
        System.out.println("Cinema:");
        System.out.println("  1 2 3 4 5 6 7 8");
        for (int i = 1; i <= raw; i++) {
            System.out.print(i);
            for (int j = 1; j <= line; j++) {
                System.out.print(" S");
            }
            System.out.println();
        }
    }
}
