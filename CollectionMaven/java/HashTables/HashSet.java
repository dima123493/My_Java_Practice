package HashTables;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class HashSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();//anything can be added
        Comparator.nullsFirst(Comparator.naturalOrder());
        System.out.println(set.size());
        fillSet(set);
        System.out.println(set.size());
    }

    public static void fillSet(Set<String> set) {
        set.add(null);
        set.add(null);
        set.add(null);
    }
}
