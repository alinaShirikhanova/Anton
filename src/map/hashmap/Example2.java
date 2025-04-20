package map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Example2 {
    public static void main(String[] args) {
//        Map<String, Integer> map1 = new HashMap<>();
//        Map<String, Integer> map2 = new HashMap<>(100);
//        Map<String, Integer> map3 = new HashMap<>(100, 0.9f);
//        Map<String, Integer> map4 = new HashMap<>(map1);
//
//        map1.put("one", 1);
//        map1.put("two", 2);
//        map1.put("three", 3);
//        map1.put("t", 2);
//        System.out.println(map1.getOrDefault("onehhghg", 9));
        Employee employee1 = new Employee("Антон");
        Employee employee2 = new Employee("Алина");
        Employee employee3 = new Employee("Катя");

        Map<Employee, Integer> map = new HashMap<>();
        map.put(employee1, 20);
        map.put(employee2, 21);
        map.put(employee3, 56);
        System.out.println(map.containsKey(employee1));
        employee1.setName("Антон2");
        System.out.println(map.containsKey(employee1));

//        String line = "helo";
//        line = "djfjhdjhf";
//        line[0] = 'didfj'
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Objects.equals(name, employee.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(name);
//    }
}