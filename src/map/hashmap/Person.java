package map.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * В классе Person определить 2 поля (name и age). Создать словарь из 3 персонов.
 * 2 раза вызвать containsKey (изменив перед вторым вызовом age или имя)
 *
 * Переопределить hashcode, чтобы он вычислялся на базе имени и возраста
 * 2 раза вызвать containsKey (изменив перед вторым вызовом age или имя)
 */
public class Person {
    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class PersonHashMap {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Person person1 = new Person("Тузик", 10);
        Person person2 = new Person("Кеша", 20);
        Person person3 = new Person("Мурзик", 30);
        map.put(person1, "Тузик");
        System.out.println(map.containsKey(person1));
    }
}
