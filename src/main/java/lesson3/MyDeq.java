package lesson3;

public class MyDeq<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    public MyDeq(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
        this.begin = -1;
        this.end = -1;
    }

    public MyDeq() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
        this.begin = -1;
        this.end = -1;
    }

    private int nextIndexMinus(int index) {
        if (index == -1) {
            return 0;
        } else if (index == 0) {
            return list.length - 1;
        } else {
            return index - 1;
        }
    }

    private int nextIndexPlus(int index) {
        return (index + 1) % list.length;
        }


    public void insertLeft(T item) {
        if (isFull()) {
            reCapacity((int)(size * 1.5 + 1));
        }
        size++;
        if (size == 1) {
            begin = 0;
        }
        end = nextIndexPlus(end);
        list[end] = item;
    }

    public void insertRight(T item) {
        if (isFull()) {
            reCapacity((int) (size * 1.5 + 1));
        }
        size++;
        if (size == 1) {
            end = 0;
        }
        begin = nextIndexMinus(begin);
        list[begin] = item;
    }

    public T peekLeft() {
        if (isEmpty()) {
            throw new RuntimeException("Queue isEmpty");
        }

        return list[end];
    }

    public T peekRight() {
        if (isEmpty()) {
            throw new RuntimeException("Queue isEmpty");
        }
        return list[begin];
    }

    public T removeLeft() {
        T temp = peekLeft();
        size--;
        list[end] = null;
        end = nextIndexMinus(end);
        return temp;
    }

    public T removeRight() {
        T temp = peekRight();
        size--;
        list[begin] = null;
        begin = nextIndexPlus(begin);
        return temp;
    }

    public void info() {
        StringBuilder sb = new StringBuilder();
        if (begin == end && begin == -1) {
            sb.append("[]");
            System.out.println(sb.toString());
            return;
        }
        sb.append("[");
        if (end < begin) {
            for (int i = end; i >= 0; i--) {
                if (list[i] != null) sb.append(list[i] + ", ");
            }
            for (int i = list.length-1; i >= begin; i--) {
                if (list[i] != null) sb.append(list[i] + ", ");
            }
        } else {
            if (end > begin) {
                for (int i = end; i >= 0; i--) {
                    if (list[i] != null) sb.append(list[i] + ", ");
                }
            } else {
                sb.append(list[end] + ", ");
            }
        }
        if (size !=0) sb.setLength(sb.length() - 2);
        sb.append("]");
        System.out.println(sb.toString());
    }

    public void infoStructure() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.length; i++) {
                    sb.append(list[i] + ", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append("]");
        System.out.println(sb.toString());
    }

    private void reCapacity(int newSize) {
        T[] temp = (T[]) new Object[newSize];
        int j = 0;
        if (end < begin) {
            for (int i = end; i >= 0; i--) {
                if (list[i] != null) {
                    temp[j] = list[i];
                    j++;
                }
            }
            for (int i = list.length - 1; i >= begin; i--) {
                if (list[i] != null) {
                    temp[j] = list[i];
                    j++;
                }
            }
        } else {
            if (end > begin) {
                for (int i = end; i >= 0; i--) {
                    if (list[i] != null) {
                        temp[j] = list[i];
                        j++;
                    }
                }
            }
            list = temp;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

}

