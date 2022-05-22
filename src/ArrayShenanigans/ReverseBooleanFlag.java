package ArrayShenanigans;

public class ReverseBooleanFlag {
    public static boolean inverseFlags(boolean[] param) {
        for (int i = 0; i < param.length; i++) {
            param[i] = !param[i];
        }
        return false;
    }
}
