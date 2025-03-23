package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(1);
//        Integer[] integers = {1, 2, 3, 4, 4, 2, 3, 4, 5, 5};
//        Object[] array = list.toArray();
//        Integer[] array2 = list.toArray(new Integer[0]);
//        System.out.println(Arrays.toString(array2));
//
//        for (Object elem : array) {
//            System.out.println(((Integer) elem).intValue());
//        }
////        list.add("Hello");
//        list.add(1);
////        list.get(1);
//        list.get(-1);

//        int[] newArr = Arrays.copyOf(arr, 10);
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] newArr = new int[3];
//        System.arraycopy(arr, 3, newArr, 0, 3);
//        System.out.println(Arrays.toString(newArr));
        User ivan = new User(1L, "Ваня");
        User ivan2 = new User(1L, "Ваня");

        System.out.println(ivan.equals(ivan2));


        List<User> users = List.of(
                new User(1L, "Ваня"),
                new User(2L, "Игорь"),
                new User(3L, "Катя"),
                new User(4L, "Антон")
        );

        System.out.println(users.contains(ivan));
        System.out.println(users.indexOf(ivan));
        System.out.println(users.remove(ivan));

//        Integer[] ints = {1, 2, 3, 4, 5};
//        ArrayList<Integer> newArray =(ArrayList<Integer>) Arrays.asList(ints);



    }
}


class User {
    private Long id;
    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}