package lesson4;

public class LinkedQueue<T> {
    private MyLinkedList<T> list;

    public LinkedQueue() {
        list = new MyLinkedList<>();
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Queue isEmpty");
        }

        return list.getFirst();
    }

    public void insert(T item) {
        list.insertLast(item);
    }

    public T remove() {
        T temp = peekFront();
        list.removeFirst();
        return temp;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public int indexOf(T item) {
        return list.indexOf(item);
    }
}
