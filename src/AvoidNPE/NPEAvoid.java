package AvoidNPE;

import java.util.Scanner;

public class NPEAvoid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        str1 = "null".equalsIgnoreCase(str1) ? null : str1;
        str2 = "null".equalsIgnoreCase(str2) ? null : str2;

        System.out.println(concatStrings(str1, str2));

    }

    public static String concatStrings(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return "";
        }
        if (str1 != null && str2 == null) {
            return str1;
        }
        if (str1 == null && str2 != null) {
            return str2;
        }
        if ("null".equals(str1) && "null".equals(str2)) {
            System.out.println("null");
        }
        if ("null".equals(str1) && str2 == null) {
            System.out.println(str1);
        }
        if (str1 == null && "null".equals(str2)) {
            System.out.println(str2);
        }
        if (str1 == "null" && str2 == "null") {
            System.out.println("null");
        }
        return str1 != null ? str1.concat(str2) : null;
        //return str1 != null ? str2 != null ? str1 + str2 : str1 : str2 != null ? str2 : "";
    }
}
