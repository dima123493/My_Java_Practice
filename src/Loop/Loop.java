package Loop;

import static java.lang.System.*;

public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                out.print(j + " ");
                if (i == j) {
                    break;
                }
            }
            out.println();
        }

        //prints even numbers only
        int n = 10;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                continue;
            }
            out.print(i + " ");
        }
    }
}
