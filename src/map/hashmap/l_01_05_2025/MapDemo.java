package map.hashmap.l_01_05_2025;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 1);
        map.put("three", 1);
        map.put(null, 0);
        map.put("four", null);
//        map.put("one", 1);
        System.out.println(map.get("one"));
//        if (map.containsKey("four"))
//            System.out.println(map.get("four"));

        Set<String> strings = map.keySet();
        System.out.println(strings);
        for (String key : strings) {
            System.out.println(key + " : " + map.get(key));
        }

        Collection<Integer> values = map.values();
        System.out.println(values);


        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getValue());
        }

        Map<Integer, Car> cars = new HashMap<>();
        cars.put(1, new Car("Лада"));
        cars.put(2, new Car("Лада"));
        cars.put(3, new Car("Лада"));
        cars.put(4, new Car("Лада"));

        for (Map.Entry<Integer, Car> entry : cars.entrySet()) {
            System.out.println(entry.getValue().getModel());
        }

        for (Map.Entry<Integer, Car> entry : cars.entrySet()) {
            if (entry.getKey() == 1){
                entry.setValue(new Car("БМВ"));
            }
        }
        System.out.println(cars);
//        Распечатать ключи и значения тех людей, у которых возраст больше 10
    }
}

class Car{
    String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
