package lesson3;

public class MyQueue<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    //0 1 2 3 4
    //        B
    //    E
    //1 5     8

    public MyQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyQueue() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Queue isEmpty");
        }

        return list[begin];
    }

    public void insert(T item) {
        if (isFull()) {
            //Расширение массива***
            reCapacity((int) (list.length * 1.5 + 1));
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public T remove() {
        T temp = peekFront();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length - 1;
    }

    private void reCapacity(int newSize) {
        T[] temp = (T[]) new Object[newSize];
        if (end < begin) {
            System.arraycopy(list, begin, temp, 0, (list.length - begin));
            System.arraycopy(list, 0, temp, (list.length - begin), end);
            begin = 0;
            end = list.length - begin + end;
        } else {
            if (end > begin) {
                System.arraycopy(list, begin, temp, 0, (end - begin));
                end = end - begin;
                begin = 0;
            }
        }
        list = temp;
    }

}
