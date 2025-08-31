package functional.programming;

import java.util.function.Predicate;

public class Functional {
    public static void main(String[] args) {
        IntegerFunction function = num -> num + 1;
//        Function<Integer, Integer> function = num -> num + 1;
        int result = incrementByOne(10);
//
//        int result2 = function.apply(10);
//        System.out.println(result2);


        int i = 11;
        if (i % 2 == 0) {

        } else {

        }

//        System.out.println(i % 2 == 0 ? "Четное" : "Нечетное");

//        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;


//        Predicate<Integer> isEven = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 2 == 0;
//            }
//        };
        Predicate<Integer> isEven = integer -> integer % 2 == 0;
        System.out.println(isEven.test(10));

//        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
//        integers.stream()
//                .filter(num -> num % 2 == 0)
    }

    private static int incrementByOne(int num) {
        return num + 1;
    }
}

interface MyPredicate {
    boolean test(Integer integer);
}
//
//class EvenFilter implements Predicate<Integer> {
//
//    @Override
//    public boolean test(Integer o) {
//        return o % 2 == 0;
//    }
//}

interface IntegerFunction {
    int incrementByOne(int num);
}
//
//List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
//        integers.stream()
//                .map()
