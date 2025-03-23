package collections.queue;

import java.util.ArrayList;

public class PriorityQueueHeap {
    private ArrayList<Integer> heap = new ArrayList<>();

    // Метод вставки элемента
    public void add(int value) {
        heap.add(value); // Добавляем в конец массива
        int currentIndex = heap.size() - 1;

        // Всплытие
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;

            // Если текущий элемент меньше родителя, меняем их местами
            if (heap.get(currentIndex) < heap.get(parentIndex)) {
                swap(currentIndex, parentIndex);
                currentIndex = parentIndex; // Двигаемся вверх
            } else {
                break; // Если порядок соблюдён, выходим
            }
        }
    }

    // Вспомогательный метод для обмена элементов
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public int poll() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }

        // Минимальный элемент — корень
        int minValue = heap.get(0);

        // Заменяем корень последним элементом
        int lastValue = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, lastValue);
            heapifyDown(0); // Восстанавливаем порядок кучи
        }

        return minValue;
    }

    // Просеивание вниз
    private void heapifyDown(int index) {
        int size = heap.size();

        while (index < size) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int smallest = index;

            // Сравниваем с левым потомком
            if (leftChild < size && heap.get(leftChild) < heap.get(smallest)) {
                smallest = leftChild;
            }

            // Сравниваем с правым потомком
            if (rightChild < size && heap.get(rightChild) < heap.get(smallest)) {
                smallest = rightChild;
            }

            // Если нужно поменять местами
            if (smallest != index) {
                swap(index, smallest);
                index = smallest; // Переходим вниз
            } else {
                break; // Если порядок соблюдён, выходим
            }
        }
    }

    // Для отладки
    public void printHeap() {
        System.out.println(heap);
    }
}