package collections.queue;

import java.util.Arrays;

public class SimpleArrayDeque<E> {
    private Object[] elements;  // Массив для хранения элементов
    private int head;           // Индекс начала очереди
    private int tail;           // Индекс конца очереди
    private int size;           // Текущий размер очереди

    private static final int INITIAL_CAPACITY = 16;

    // Конструктор
    public SimpleArrayDeque() {
        elements = new Object[INITIAL_CAPACITY];
        head = 0;
        tail = 0;
        size = 0;
    }

    // Добавление элемента в начало
    public void addFirst(E e) {
        if (size == elements.length) {
            resize(); // Расширяем массив при необходимости
        }
        // Сдвигаем head на 1 позицию влево (в кольцевой структуре)
        head = (head - 1 + elements.length) % elements.length;
        elements[head] = e;  // Помещаем элемент в начало
        size++;
    }

    // Добавление элемента в конец
    public void addLast(E e) {
        if (size == elements.length) {
            resize(); // Расширяем массив при необходимости
        }
        elements[tail] = e;  // Помещаем элемент в конец
        tail = (tail + 1) % elements.length;  // Перемещаем tail в следующий индекс (с обертыванием)
        size++;
    }

    // Удаление элемента с начала
    public E removeFirst() {
        if (size == 0) throw new IllegalStateException("Queue is empty");
        @SuppressWarnings("unchecked")
        E result = (E) elements[head];
        elements[head] = null;  // Убираем ссылку на элемент
        head = (head + 1) % elements.length;  // Перемещаем head в следующий индекс (с обертыванием)
        size--;
        return result;
    }

    // Удаление элемента с конца
    public E removeLast() {
        if (size == 0) throw new IllegalStateException("Queue is empty");
        tail = (tail - 1 + elements.length) % elements.length;  // Перемещаем tail на предыдущий индекс
        @SuppressWarnings("unchecked")
        E result = (E) elements[tail];
        elements[tail] = null;  // Убираем ссылку на элемент
        size--;
        return result;
    }
    @SuppressWarnings("unchecked")
    // Получить первый элемент без удаления
    public E peekFirst() {
        if (size == 0) return null;

        return (E) elements[head];
    }

    @SuppressWarnings("unchecked")
    // Получить последний элемент без удаления
    public E peekLast() {
        if (size == 0) return null;
        return (E) elements[(tail - 1 + elements.length) % elements.length];
    }

    // Изменение размера массива (расширение)
    private void resize() {
        int newCapacity = elements.length * 2;
        Object[] newElements = new Object[newCapacity];
        // Копируем элементы в новый массив с учётом обертывания
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[(head + i) % elements.length];
        }
        elements = newElements;
        head = 0;
        tail = size;
    }

    // Метод для проверки размера очереди
    public int size() {
        return size;
    }

    // Печать содержимого очереди (для отладки)
    public void printQueue() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[(head + i) % elements.length] + " ");
        }
        System.out.println();
    }
}