package ArrayRotation;

import java.util.Scanner;

import static java.lang.System.out;

public class ArrayRotation {
    public static void main(String[] args) {
        int[][] array =
                {{9, 8, 7},
                        {6, 5, 4},
                        {3, 2, 1}};
        out.println("Before:");
        print(array);
        out.println();
        out.println("Rotate the array on 90 degrees to the right:");
        print(turnToRight(array));
        out.println();
        out.println("Rotate the array on 90 degrees to the left:");
        print(turnToLeft(array));

        rotateToRightInputFromKeyboard();
    }

    public static int[][] print(int[][] array) {
        int numbers = array.length;
        for (int[] ints : array) {
            for (int j = 0; j < numbers; ++j) {
                out.print(ints[j]);
                out.print(' ');
            }
            out.println();
        }
        return array;
    }

    public static int[][] turnToRight(int[][] array1) {
        int[][] turnedToRight = new int[array1[0].length][array1.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                turnedToRight[j][array1.length - i - 1] = array1[i][j];
            }
        }
        return turnedToRight;
    }

    public static int[][] turnToLeft(int[][] array2) {
        int[][] turnedToLeft = new int[array2[0].length][array2.length];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                turnedToLeft[array2[i].length - j - 1][i] = array2[i][j];
            }
        }
        return turnedToLeft;
    }

    static void rotateToRightInputFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int arr[][] = new int[row][column];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < column; i++) {
            for (int j = row - 1; j >= 0; j--) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

}
