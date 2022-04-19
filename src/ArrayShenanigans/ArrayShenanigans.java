package ArrayShenanigans;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class ArrayShenanigans {
    public static void main(String[] args) {
        sorting();
        comparison();
        halfArrayFilling();
        longNumbers();
        arraySizeOrIndex();
        fillAnArrayWithSquares();
        ascendingOrder();
        arrayInput();
        calculateSpecificElement();
        sumOfElementsGreaterThanN();
        sumOfElementsEntered();
        circulyShifted();/*same but better*/ circulyShifted1();
    }

    static void sorting() {
        long[] bigNumbers = {200000000L, 400000000L, 100000000L, 300000000L}; // it's unsorted

        Arrays.sort(bigNumbers); // sorting whole array

        out.println(Arrays.toString(bigNumbers)); // [100000000, 200000000, 300000000, 400000000]
    }

    static void comparison() {
        int[] numbers1 = {1, 2, 5, 8};
        int[] numbers2 = {1, 2, 5};
        int[] numbers3 = {1, 2, 5, 8};

        out.println(Arrays.equals(numbers1, numbers2)); // it prints "false"
        out.println(Arrays.equals(numbers1, numbers3)); // it prints "true"
    }

    static void halfArrayFilling() {
        int size = 10;
        char[] characters = new char[size];

        // It takes an array, start index, end index (exclusive) and the value for filling the array
        Arrays.fill(characters, 0, size / 2, 'A');
        Arrays.fill(characters, size / 2, size, 'B');

        out.println(Arrays.toString(characters)); // it prints [A, A, A, A, A, B, B, B, B, B]
    }

    static void longNumbers() {
        final long[] longNumbers = {100_000_000_001L, 100_000_000_002L, 100_000_000_003L};

        out.println(Arrays.toString(longNumbers));
    }

    static void arraySizeOrIndex() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 6;
        n = arr[arr[n]];
    }

    static void fillAnArrayWithSquares() {
        int n = 10; // the size of an array
        int[] squares = new int[n]; // creating an array with the specified size

        out.println(Arrays.toString(squares)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        /* iterating over the array */
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i; // set the value by the element index
        }

        out.println(Arrays.toString(squares)); // [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
    }

    static void ascendingOrder() {
        int[] numbers = {1, 2, 3, 4, 5, 10, 6}; // the order is broken

        boolean broken = false; // suppose the array is well-ordered

        /* iterating over the array */
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < numbers[i - 1]) { // if the order is broken
                broken = true; // write a result
                break;         // terminate the loop
            }
        }

        if (broken) {
            out.println("BROKEN");
        } else {
            out.println("OK");
        }
    }

    static void arrayInput() {
        Scanner scanner = new Scanner(in);

        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }

        out.println(Arrays.toString(array)); // output the array
    }

    static void calculateSpecificElement() {
        char[] characters = {'a', 'b', 'c', 'a', 'b', 'c', 'a'};

        int counter = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == 'a') {
                counter++;
            }
        }
        out.println(counter); // it outputs "3"
    }

    /**
     * Write a program that reads an array of ints and an integer number n. The program must sum all the array elements greater than n.
     * <p>
     * Input data format
     * <p>
     * The first line contains the size of an array.
     * The second line contains the elements of the array separated by spaces.
     * The third line contains the number n.
     * <p>
     * Output data format
     * <p>
     * Sample Input 1:
     * <p>
     * 5
     * 5 8 11 2 10
     * 8
     * Sample Output 1:
     * <p>
     * 21
     */
    static void sumOfElementsGreaterThanN() {
        Scanner scanner = new Scanner(in);
        int sizeNumber = scanner.nextInt();
        int[] size = new int[sizeNumber];
        int sum = 0;

        for (int i = 0; i < size.length; i++) {
            size[i] = scanner.nextInt();
        }

        int number = scanner.nextInt();

        for (int i = 0; i < size.length; i++) {
            int value = size[i];
            if (value > number) {
                sum += value;
            }
        }

        out.println(sum);
    }

    static void sumOfElementsEntered() {
        Scanner scanner = new Scanner(in);
        int sizeNumber = scanner.nextInt();
        int[] size = new int[sizeNumber];
        int sum = 0;

        for (int i = 0; i < size.length; i++) {
            size[i] = scanner.nextInt();
            int value = size[i];
            sum += value;
        }
        out.println(sum);
    }

    static void circulyShifted() {
        Scanner scanner = new Scanner(in);
        int sizeNumber = scanner.nextInt();
        int[] size = new int[sizeNumber];

        for (int i = 0; i < size.length; i++) {
            size[i] = scanner.nextInt();
        }
        int x = size[size.length - 1], i;
        for (i = size.length - 1; i > 0; i--) {
            size[i] = size[i - 1];
        }
        size[0] = x;

        out.println(Arrays.toString(size).replace("[", "").replace("]", "").replace(",", ""));
    }

    static void circulyShifted1() {
        Scanner scanner = new Scanner(in);
        int[] intArray = new int[scanner.nextInt()];

        for (int i = 1; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        intArray[0] = scanner.nextInt();

        for (int i : intArray) {
            out.print(i + " ");
        }
    }

}
