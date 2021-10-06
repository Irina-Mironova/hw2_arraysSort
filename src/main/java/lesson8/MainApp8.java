package lesson8;

import java.util.Random;

public class MainApp8 {

    public static void main(String[] args) {

        ChainingHashMap<Integer, Integer> map = new ChainingHashMap<>(7);
        map.put(2, 2);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int number = random.nextInt(100);
            map.put(number, number);
        }

        System.out.println(map);
        map.remove(2);
        System.out.println("После удаления: ");
        System.out.println(map);


    }
}



