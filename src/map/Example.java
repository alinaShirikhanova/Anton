package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Example {
    public static void main(String[] args) {
        final User user = new User("Ivan");
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>(100);
        Map<String, Integer> map3 = new HashMap<>(100, 0.9f);
        Map<String, Integer> map4 = new HashMap<>(map1);

        map1.put("one", 1);
        map1.put("two", 2);
        map1.put("three", 3);

        System.out.println(map1.get("three"));


    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
