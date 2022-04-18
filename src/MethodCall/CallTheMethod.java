package MethodCall;

import java.util.Scanner;

public class CallTheMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // call the method here
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        countAreaOfParallelogram(number1, number2);
    }

    // Do not change code below
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}
