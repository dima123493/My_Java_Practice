package ArrayShenanigans;

import java.util.Arrays;
import java.util.Scanner;

public class GetFirstAndLastFromTheArray {
    public static int[] getFirstAndLast(int[] parameters) {

        int temp = parameters[parameters.length - 1];
        int firts = parameters[0];

        return new int[]{firts, temp};
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}
