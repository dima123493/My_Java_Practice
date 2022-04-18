package Cinema;

import java.util.Scanner;

import static java.lang.System.*;

public class SeatsIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.println("Enter the number of rows:");
        int raw = scanner.nextInt();
        out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        out.println("Total income:");

        if(raw*seats<=60){
            out.println("$"+raw*seats*10);
            //if total seats more than 60, first half costs 10 bucks per\seat and 8 for the rest.
        } else if (raw*seats>60){
            out.println("$"+ (((raw/2)*(seats)*10) + (((raw+1)/2)*(seats)*8)));
        }
    }
}
