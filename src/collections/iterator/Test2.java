package collections.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test2 {
    public static void main(String[] args) {
                List<Integer> list = new ArrayList<>(List.of(1, 3, 5, 6, 8, 9));
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
        ListIterator<Integer> iterator = list.listIterator();
//Перебрать список с конца в начало с помощью итератора.
//        while (iterator.hasPrevious()) {
//            System.out.println(iterator.previous());
//        }
       iterator.previous();


    }
}
