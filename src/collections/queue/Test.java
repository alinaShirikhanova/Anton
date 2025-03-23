package collections.queue;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        SimpleArrayDeque<Integer> deque = new SimpleArrayDeque<>();
        deque.addLast(7);
        deque.addLast(8);
        deque.addLast(3);
        deque.addLast(5);
        deque.addLast(6);
        deque.addFirst(90);

        PriorityQueue<Task> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.add(new Task("5", 5));
        priorityQueue.add(new Task("6", 6));
        priorityQueue.add(new Task("7", 7));
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

        Deque<Integer> deque1 = new ArrayDeque<>();

    }
}


class Task implements Comparable<Task> {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + '}';
    }
}
