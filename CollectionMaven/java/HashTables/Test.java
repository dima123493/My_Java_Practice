package HashTables;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new CustomHashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("2", 22);
        for (var entry : map) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println(map.get("3"));
        System.out.println(map.contains("4"));
    }
}
