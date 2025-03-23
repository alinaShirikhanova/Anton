package collections.iterator;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
//        List<Integer> list2 = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6));
//
//        for (Integer elem : list1) {
//            System.out.println(elem);
//        }

//        Iterator<Integer> iterator1 = list1.iterator();
//        while (iterator1.hasNext()){
//            Integer nextElement = iterator1.next();
//            System.out.println(nextElement);
//        }
//
//        Iterator<Integer> iterator2 = list2.iterator();
//        while (iterator2.hasNext()){
//            Integer nextElement = iterator2.next();
//            if (nextElement == 1){
//                iterator2.remove();
//            }
//            System.out.println(nextElement);
//        }

//        Создать список строк. Распечатать все элементы списка с помощью итератора

//
//        List<String> list = new LinkedList<>(List.of("A", "B", "B", "C"));
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            if (next.equals("B")) {
//                iterator.remove();
//            }
//            System.out.println(next);
//        }
//
//        System.out.println(list);
//        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
//        for (int i = 0; i < list1.size(); i++) {
//            System.out.println(list1.get(i));
//        }

//        for (Integer elem : list) {
////            list.remove(elem);
//            System.out.println(elem);
//        }

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            if (next.equals(3)) {
//                break;
//            }
//            iterator.remove();
//            System.out.println(next);
//        }
//        iterator.forEachRemaining(System.out::println);
//        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

//        Попытаться удалить элемент во время итерации с for each
//Пробежаться по списку с помощью итератора. Удалить элемент через list напрямую и через iterator

//        int[] array = {1, 2, 3, 4, 5};
//
//        for (int elem : array) {
//            System.out.println(elem);
//        }
//

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

//        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
//        ListIterator<Integer> listIterator = list.listIterator();
//        while (listIterator.hasNext()){
//            Integer next = listIterator.next();
//            if (next % 2 == 0) {
//                listIterator.previous();
//                listIterator.add(10);
//                listIterator.next();
//            }
//        }
//        System.out.println(list);
//        while (listIterator.hasNext()){
//            if (listIterator.next() % 2 == 0){
//                listIterator.set(100);
//            }
//        }
//        System.out.println(list);
//        List<?> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
//        List<?> reversed = new ArrayList<>();
//        ListIterator<?> listIterator = list.listIterator(list.size());
//        while (listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }
//        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
//        ListIterator<Integer> iterator = list.listIterator();
//
//        while (iterator.hasNext()){
//            System.out.println("Индекс: " + iterator.nextIndex() + " Элемент: " + iterator.next());
//        }
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        ListIterator<Integer> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            System.out.println("Индекс: " + iterator.previousIndex() + " Элемент: " + iterator.previous());
        }






    }
}
