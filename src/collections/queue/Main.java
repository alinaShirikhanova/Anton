

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());  // Читаем количество команд

        LinkedList<String> left = new LinkedList<>();
        LinkedList<String> right = new LinkedList<>();
        LinkedList<String> res = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            if (command.charAt(0) == '+') {
                right.add(command.substring(2));  // Добавляем в правую очередь
            } else if (command.charAt(0) == '-') {
                res.add(left.poll());  // Извлекаем из левой очереди
            } else if (command.charAt(0) == '*') {
                left.add(command.substring(2));  // Добавляем в левую очередь
            }

            // Балансировка очередей
            if (left.size() < right.size()) {
                left.add(right.poll());  // Переносим элемент из правой очереди в левую
            } else if (left.size() > right.size() + 1) {
                right.addFirst(left.pollLast());  // Переносим элемент из левой очереди в правую
            }
        }

        // Выводим результат
        for (String elem : res) {
            System.out.println(elem);
        }

    }
}
