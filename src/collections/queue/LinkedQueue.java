package collections.queue;

import java.util.Deque;
import java.util.LinkedList;


public class LinkedQueue {
    public static void main(String[] args) {
        Deque<Integer> queue = new LinkedList<>();
        queue.add(9);
        queue.addLast(9);
        queue.addFirst(9);

        System.out.println(queue.poll());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollLast());

        System.out.println(queue.peek());
        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
    }
}
