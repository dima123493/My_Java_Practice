package RegularExpressions;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String day = "(([012]\\d)|30|31)";
        String month = "(0\\d|1[0-2])";
        String year = "((19|20)\\d{2})";
        String splitter = "[/\\-.]";

        String date =
                "(" + year + splitter + month + splitter + day + ")|("
                        + day + splitter + month + splitter + year + ")";

        System.out.println(scn.nextLine()
                .matches(date) ? "Yes" : "No");
    }
}
