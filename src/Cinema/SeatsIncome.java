package Cinema;

import java.util.Scanner;

public class SeatsIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int raw = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        System.out.println("Total income:");

        if(raw*seats<=60){
            System.out.println("$"+raw*seats*10);
            //if total seats more than 60, first half costs 10 bucks per\seat and 8 for the rest.
        } else if (raw*seats>60){
            System.out.println("$"+ (((raw/2)*(seats)*10) + (((raw+1)/2)*(seats)*8)));
        }
    }
}
