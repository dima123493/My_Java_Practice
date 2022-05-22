package FloorSpaseOfTheRoom;

import java.util.Scanner;

public class FloorSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()) {
            case "triangle" -> {
                double At = scanner.nextDouble(),
                        Bt = scanner.nextDouble(),
                        Ct = scanner.nextDouble(),
                        p = ((At + Bt + Ct) / 2),
                        S = Math.sqrt(p * (p - At) * (p - Bt) * (p - Ct));
                System.out.println(S);
            }
            case "rectangle" -> {
                double Ar = scanner.nextDouble(),
                        Br = scanner.nextDouble();
                System.out.println(Ar * Br);
            }
            case "circle" -> {
                double Range = scanner.nextDouble();
                System.out.println(3.14 * Range * Range);
            }
            default -> {
            }
        }
    }
}
