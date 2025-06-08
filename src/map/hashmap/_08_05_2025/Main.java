package map.hashmap._08_05_2025;

import map.hashmap.MyLRUCache;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> numbers = new HashMap<>();
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        System.out.println(map.get(2));
        System.out.println(map.get(1));


        System.out.println(map);

        Map<Integer, String> map1 = new MyLRUCache<>(3);
        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(3, "three");

        System.out.println(map1.get(2));
        System.out.println(map1.get(1));

        System.out.println(map1.put(4, "four"));
        System.out.println();
    }
}
