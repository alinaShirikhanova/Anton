package map.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("язык", "Java");
        map.put("язык2", "Java");
        map.put("язык3", "Java");
        map.put("язык4", "Java");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            entry.setValue("Python");
        }
        System.out.println(map);
    }
}

