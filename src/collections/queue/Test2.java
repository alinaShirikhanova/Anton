package collections.queue;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> queue1 = new LinkedList<>();
        Deque<Integer> queue2 = new ArrayDeque<>();









//
//        queue.add(3);
//        System.out.println(queue.poll());
//
//        queue.add(8);
//        System.out.println(queue.pollLast());

        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.poll());


//        Queue<Integer> queue1 = new PriorityQueue<>(Comparator.reverseOrder());
//        queue1.add(4);
//        queue1.add(3);
//        queue1.add(2);
//        queue1.add(1);

//        System.out.println(queue1.poll());
//        System.out.println(queue1.poll());
//        System.out.println(queue1.poll());
//        System.out.println(queue1.poll());
    }
}
