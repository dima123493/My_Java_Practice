package Cinema;

import java.util.Scanner;

import static java.lang.System.out;

public class CinemaSeatsAvailableAndTaken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int raw = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        System.out.println("Cinema:");
        System.out.print(" ");
        String[] topRow = new String[raw + 1];

        for (int i = 1; i < topRow.length; i++) {
            topRow[i] = String.valueOf(i);
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 1; i <= raw; i++) {
            System.out.print(i);

            for (int j = 1; j <= seats; j++) {
                System.out.print(" S");
            }
            System.out.println();
        }

        System.out.println();
        out.println("Enter a row number:");
        int selectedRow = scanner.nextInt();
        out.println("Enter a seat number in that row:");
        int selectedSeat = scanner.nextInt();
        //System.out.println("Total income: $" + amount);
        //int amount = 0;
        int firstHalfSeatPrice = 10;
        int secondHalfSeatPrice = 8;
        int prisePerSeat = 0;

/*        if (raw * seats <= 60) {
            amount = raw * seats * firstHalfSeatPrice;
        } else if (raw * seats > 60) {
            amount = (((raw / 2) * (seats) * firstHalfSeatPrice) + (((raw + 1) / 2) * (seats) * secondHalfSeatPrice));
        }*/

        if (raw * seats <= 60) {
            prisePerSeat = firstHalfSeatPrice;
        } else if (raw * seats > 60 && (raw / 2) >= selectedRow) {
            prisePerSeat = firstHalfSeatPrice;
        } else {
            prisePerSeat = secondHalfSeatPrice;
        }

        out.println();
        out.print("Ticket price: " + "$" + prisePerSeat);
        out.println();
        System.out.println("Cinema:");
        System.out.print(" ");

        for (int i = 1; i < topRow.length; i++) {
            topRow[i] = String.valueOf(i);
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 1; i <= raw; i++) {
            System.out.print(i);

            for (int j = 1; j <= seats; j++) {
                if (i == selectedRow && j == selectedSeat) {
                    System.out.print(" B");
                } else {
                    System.out.print(" S");
                }
            }
            System.out.println();
        }
    }
}
