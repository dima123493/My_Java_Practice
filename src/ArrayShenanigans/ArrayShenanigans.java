package ArrayShenanigans;

import java.util.Arrays;

public class ArrayShenanigans {
    public static void main(String[] args) {
        Sorting();
        Comparison();
        HalfArrayFilling();
        LongNumbers();
        ArraySizeOrIndex();
    }

    static void Comparison() {
        int[] numbers1 = {1, 2, 5, 8};
        int[] numbers2 = {1, 2, 5};
        int[] numbers3 = {1, 2, 5, 8};

        System.out.println(Arrays.equals(numbers1, numbers2)); // it prints "false"
        System.out.println(Arrays.equals(numbers1, numbers3)); // it prints "true"
    }

    static void Sorting() {
        long[] bigNumbers = {200000000L, 400000000L, 100000000L, 300000000L}; // it's unsorted

        Arrays.sort(bigNumbers); // sorting whole array

        System.out.println(Arrays.toString(bigNumbers)); // [100000000, 200000000, 300000000, 400000000]
    }

    static void HalfArrayFilling() {
        int size = 10;
        char[] characters = new char[size];

        // It takes an array, start index, end index (exclusive) and the value for filling the array
        Arrays.fill(characters, 0, size / 2, 'A');
        Arrays.fill(characters, size / 2, size, 'B');

        System.out.println(Arrays.toString(characters)); // it prints [A, A, A, A, A, B, B, B, B, B]
    }

    static void LongNumbers() {
        final long[] longNumbers = {100_000_000_001L, 100_000_000_002L, 100_000_000_003L};

        System.out.println(Arrays.toString(longNumbers));
    }

    static void ArraySizeOrIndex(){
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = 6;
        n = arr[arr[n]];
    }
}
