package lesson2;

import lesson2.MyArrayList;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        int n = 100000;
        Random random = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>(n);

        for (int i = 0; i < n; i++) {
            mal.add(random.nextInt(100));
        }
        long start_time = System.currentTimeMillis();
        mal.bubbleSort();
        System.out.println("BubbleSort:" + (System.currentTimeMillis() - start_time) + "ms");
        mal.clear();


        for (int i = 0; i < n; i++) {
            mal.add(random.nextInt(100));
        }
        start_time = System.currentTimeMillis();
        mal.bubbleSortOptimized();
        System.out.println("BubbleSortOptimized:" + (System.currentTimeMillis() - start_time) + "ms");
        mal.clear();

        for (int i = 0; i < n; i++) {
            mal.add(random.nextInt(100));
        }
        start_time = System.currentTimeMillis();
        mal.selectionSort();
        System.out.println("SelectionSort:" + (System.currentTimeMillis() - start_time) + "ms");
        mal.clear();

        for (int i = 0; i < n; i++) {
            mal.add(random.nextInt(100));
        }
        start_time = System.currentTimeMillis();
        mal.insertionSort();
        System.out.println("InsertionSort:" + (System.currentTimeMillis() - start_time) + "ms");




    }
}
