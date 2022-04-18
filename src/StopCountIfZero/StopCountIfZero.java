package StopCountIfZero;

import java.util.Scanner;

import static java.lang.System.*;

public class StopCountIfZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int counter = 0;
        while (scanner.nextInt() != 0){
            counter++;
        }
        out.println(counter);
    }
}
