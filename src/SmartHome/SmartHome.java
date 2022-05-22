package SmartHome;

import java.util.Scanner;

public class SmartHome {
    public static void main(String[] args) {
        accessSmartHome();
    }

    public static void controlMusic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("on/off?");
        String tumbler = scanner.next();
        if (tumbler.equals("on")) {
            System.out.println("The music is on");
        } else if (tumbler.equals("off")) {
            System.out.println("The music is off");
        } else {
            System.out.println("Invalid operation");
        }
    }

    public static void accessSmartHome() {
        Scanner scanner = new Scanner(System.in);
        final int password = 76543210;
        System.out.println("Enter password: ");
        int passwordInput = scanner.nextInt();
        if (passwordInput == password) {
            controlMusic();
        } else {
            System.out.println("Incorrect password!");
        }
    }
}
