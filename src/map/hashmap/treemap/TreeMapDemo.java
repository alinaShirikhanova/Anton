package map.hashmap.treemap;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
//        TreeMap<Integer, String> map = new TreeMap<>();
//        map.put(1, "one");
//        map.put(2, "one");
//        map.put(3, "one");
//
//        Integer num1 = 100;
////        System.out.println(num1.compareTo(100));
//
//        System.out.println(Integer.compare(300, 300));
//
//        TreeMap<String, Integer> map1 = new TreeMap<>();
//
//        System.out.println("Hello".compareTo("HeLllo1"));
//
//        Product product1 = new Product("1", 100);
//        Product product2 = new Product("2", 100);
//        Product product3 = new Product("1", 100);
//
//        TreeMap<Product, Integer> products = new TreeMap<>();
//        products.put(null, 1);

//        product1.compareTo(product2);
//        TreeMap<Integer, String> map = new TreeMap<>();
//        Set<Integer> integers = map.keySet();
//        for (Integer key : integers) {
//            System.out.println(key + ":" + map.get(key));
//        }

//        for (Integer integer : integers) {
//
//        }
//        for (Map.Entry<Integer, String> elem : map.entrySet()) {
//
//        }

//        map.entrySet()

        String line1 = "hello";
        String line2 = "Hello";
        System.out.println(line1.compareTo(line2));

        Product product1 = new Product("1", 100);
        Product product2 = new Product("2", 100);
        Product product3 = new Product("1", 100);

        product1.compareTo(product2);

    }
}

class Product implements Comparable<Product> {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return this.name.compareTo(o.name);


//        return Integer.compare(this.price, o.price);
//        return this.price - o.price;
    }
}
//Comparable
//Comparator
//tree - дерево

//Comparator