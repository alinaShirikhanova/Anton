package map.hashmap;

import java.util.*;

public class Example {
    public static void main(String[] args) {
//        final User user = new User("Ivan");
        Map<String, Integer> map1 = new HashMap<>();
        map1.put(null, 1);
        map1.put("one", null);
        System.out.println(map1.get("one"));
//        Map<String, Integer> map2 = new HashMap<>(100);
//        Map<String, Integer> map3 = new HashMap<>(100, 0.9f);
//        Map<String, Integer> map4 = new HashMap<>(map1);
//
//        map1.put("one", 1);
//        map1.put("two", 2);
//        map1.put("three", 3);
//        map1.put("one", 9);
//        map1.put("t", 2);
//        System.out.println(map1.containsKey("two"));
//        System.out.println(map1.containsValue(3));
//        System.out.println(map1.get("poe"));
////        int value = map1.getOrDefault("м", 0) + 1;
////        map1.put("м", value);
//
//        System.out.println(map1.get("three"));
//
//        System.out.println(map1.isEmpty());
//        System.out.println(map1.size());
////        map1.clear();
////        Set<String> strings = map1.keySet();
////        for (String s : strings) {
////            System.out.println(s + " : " + map1.get(s));
////        }
//
//        Collection<Integer> values = map1.values();
//        System.out.println(values);
//
//
//        Map<String, Integer> product = new HashMap<>();
//        product.put("Pomidori", 2);
//        product.put("Jabloki", 3);
//        product.put("Ogurci", 4);
//        product.put("Banani", 5);
//
//        System.out.println(product.keySet());
//
//        List<Integer> list = new ArrayList<>(List.of(1, 3, 5, 6, 8, 9));
//
//        for (Integer i : list) {
//            list.remove(Integer.valueOf(1));
//            System.out.println(i);
//        }
//        Iterator<Integer> iterator = list.listIterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//            iterator.remove();
//        }
//        ListIterator<Integer> iterator = list.listIterator();
//Перебрать список с конца в начало с помощью итератора.
//        while (iterator.hasPrevious()) {
//            System.out.println(iterator.previous());
//        }
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
