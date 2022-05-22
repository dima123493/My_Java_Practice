package ArrayShenanigans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class ArrayDelition {
    public static void main(String[] args) {
        List<String> debugTask = new ArrayList<>(Arrays.asList("1", null, "2", "3", "4"));
        out.println(debugTask);
        var iterator = debugTask.iterator();
        while (iterator.hasNext()) {
            var elelemt = iterator.next();
            if ("1".equals(elelemt)) {
                iterator.remove();
            }
        }
        out.println(debugTask);
    }
}
