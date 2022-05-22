package ArrayShenanigans;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

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
        circulyShifted();/*same but better*/
        circulyShifted1();
        howManyTimesItIsInTheArray();
        minimumInTheArray();
        maximumInTheArray();
        ascendingOrder1(); /*same but better*/
        ascendingOrder2();
        doesTheArrayContainsN();
        createAnArray();
        threeDimensionalArray();
        maximumElementInMatrix();
        neighboringSeats();
        whatDoesItPrints();
        symmetricOrAsymmetricMatrix();
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
        for (char character : characters) {
            if (character == 'a') {
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

        for (int value : size) {
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
        int x = size[size.length - 1];
        int i;
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

    /**
     * Write a program that reads an array of ints and an integer number n.
     * <p>
     * The program must check how many times n occurs in the array.
     * <p>
     * Input data format
     * The first line contains the size of the input array.
     * <p>
     * The second line contains elements of the array separated by spaces.
     * <p>
     * The third line contains n.
     * <p>
     * Output data format
     * <p>
     * The result is only a single non-negative integer number.
     */

    static void howManyTimesItIsInTheArray() {
        Scanner scanner = new Scanner(in);
        int sizeNumber = scanner.nextInt();
        int[] size = new int[sizeNumber];
        int count = 0;

        for (int i = 0; i < size.length; i++) {
            size[i] = scanner.nextInt();
        }

        int number = scanner.nextInt();

        for (int j : size) {
            if (number == j) {
                count++;
            }
        }

        out.println(count);
    }

    /**
     * Write a program that reads an array of integers and finds the minimum value of the array.
     * <p>
     * Input data format
     * <p>
     * The first line contains the size of an array.
     * The second line contains elements of the array separated by spaces.
     * <p>
     * Output data format
     * <p>
     * An integer number representing the minimum in the input array.
     */
    static void minimumInTheArray() {
        Scanner scanner = new Scanner(in);
        int sizeNumber = scanner.nextInt();
        int[] size = new int[sizeNumber];

        for (int i = 0; i < size.length; i++) {
            size[i] = scanner.nextInt();
        }
        Arrays.sort(size);

        out.println(size[0]);

    }

    static void maximumInTheArray() {
        Scanner scanner = new Scanner(in);
        int sizeNumber = scanner.nextInt();
        int[] size = new int[sizeNumber];

        for (int i = 0; i < size.length; i++) {
            size[i] = scanner.nextInt();
        }
        Arrays.sort(size);

        out.println(Arrays.stream(size).max());
    }

    static void ascendingOrder1() {
        Scanner scanner = new Scanner(in);
        int sizeNumber = scanner.nextInt();
        int[] size = new int[sizeNumber];
        boolean result = true;

        for (int i = 0; i < size.length; i++) {
            size[i] = scanner.nextInt();
        }
        for (int j = 1; j < size.length; j++) {
            if (size[j] < size[j - 1]) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        System.out.println(result);
    }

    static void ascendingOrder2() {
        Scanner scanner = new Scanner(in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int[] array2 = new int[size];
        System.arraycopy(array, 0, array2, 0, size);
        Arrays.sort(array2);
        System.out.println(Arrays.equals(array, array2));
    }

    static void doesTheArrayContainsN() {
        Scanner scanner = new Scanner(in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        boolean contains = false;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();

        for (int j : array) {
            if (number == j) {
                contains = true;
                break;
            } else {
                contains = false;
            }
        }
        out.println(contains);
    }

    static void createAnArray() {
        int[][] twoDimArray = new int[2][10];

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = 1;
            }
        }
        for (int i = 0; i < twoDimArray.length; i++) {
            System.out.println(Arrays.toString(twoDimArray[i]));
        }
    }

    static void threeDimensionalArray() {
        int[][][] threeDimArray = new int[2][3][4];

        int element = 0;

        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                for (int k = 0; k < threeDimArray[i][j].length; k++) {
                    threeDimArray[i][j][k] = element;
                }
                element++;
            }
        }
        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                System.out.print(Arrays.toString(threeDimArray[i][j]) + " ");
            }
            System.out.println();
        }
    }

    static void maximumElementInMatrix() {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int max = Integer.MIN_VALUE, r = 0, c = 0;
        int num;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                num = scanner.nextInt();
                if (max < num) {
                    max = num;
                    r = i;
                    c = j;
                }
            }
        }
        scanner.close();
        System.out.println(r + " " + c);
    }

    /**
     * The cinema has n rows, each row consists of m seats (n and m do not exceed 20).
     * A two-dimensional matrix stores the information on the sold tickets:
     * the number 1 means that the ticket for this place is already sold,
     * and the number 0 means that the place is available.
     * You want to buy k tickets to neighboring seats in the same row. Find whether it can be done.
     * <p>
     * Input data format
     * <p>
     * On the input, the program gets the number of n rows and m seats.
     * Then, there are n lines, each containing m numbers (0 or 1) separated by spaces.
     * The last line contains the number k.
     * <p>
     * Output data format
     * <p>
     * The program should output the number of the row with k consecutive available seats.
     * If there are several rows with k available seats, output the first row with these seats.
     * If there is no such a row, output the number 0.
     */
    static void neighboringSeats() {
        Scanner scanner = new Scanner(System.in);
        int raws = scanner.nextInt();
        int lines = scanner.nextInt();
        int[][] x = new int[raws][lines];
        for (int i = 0; i < raws; i++) {
            for (int j = 0; j < lines; j++) {
                x[i][j] = scanner.nextInt();
            }
        }
        int xd = scanner.nextInt();
        boolean found = false;
        int count = 0;
        int row = 0;
        for (int i = 0; i < raws; i++) {
            for (int j = 0; j < lines; j++) {
                if (!found) {
                    if (x[i][j] == 0) count++;
                    else count = 0;
                    if (xd == count) {
                        found = true;
                        row = i + 1;
                    }
                }
            }
            count = 0;
        }
        System.out.println(row);
    }

    static void whatDoesItPrints() {
        int[][] c = {
                {40, 30, 25, 30, 15},
                {13, 12, 16},
                {101, 125, 114, 131}
        };

        System.out.print(c.length + " ");

        for (int[] nestedArray : c) {
            System.out.print(nestedArray.length + " ");
        }
    }

    static void symmetricOrAsymmetricMatrix() {
        Scanner sc = new Scanner(System.in);
        int i, j, row, col, flag = 1;
        System.out.println("Enter the number of rows:");
        row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        col = sc.nextInt();

        int[][] mat = new int[row][col];
        int[][] transpose = new int[row][col];

        System.out.println("Enter the elements of the matrix");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of the matrix");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }
        //To find transpose
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                transpose[j][i] = mat[i][j];
            }
        }

        if (row == col) {
            for (i = 0; i < row; i++) {
                for (j = 0; j < col; j++) {
                    if (mat[i][j] != transpose[i][j]) {
                        flag = 0;
                        break;
                    }
                }

                if (flag == 0) {
                    System.out.print("\nThe matrix is not symmetric");
                    break;
                }
            }

            if (flag == 1) {
                System.out.print("\nThe matrix is symmetric");
            }
        } else {
            System.out.print("\nThe matrix is not symmetric");
        }
    }
}

