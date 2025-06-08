package map.hashmap.treemap;

import java.util.Comparator;
import java.util.TreeMap;

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
        Product product1 = new Product("1", 100);
        Product product2 = new Product("1", 100);
        Product product3 = new Product("1", 100);
        TreeMap<Product, Integer> products = new TreeMap<>();
        products.put(null, 1);

//        product1.compareTo(product2);
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
        return Integer.compare(this.price, o.price);
//        return this.price - o.price;
    }
}
//Comparable
//Comparator
//tree - дерево

//Comparator