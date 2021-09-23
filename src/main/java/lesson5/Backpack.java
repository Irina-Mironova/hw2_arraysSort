package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private final int MAX_WEIGHT = 12;
    private List<Thing> list;

    public Backpack() {
        list = new ArrayList<>();
    }

    public int getMAX_WEIGHT() {
        return MAX_WEIGHT;
    }

    public void thingsInBackpack(Thing[] things) {
        System.out.println("Наибольшая общая стоимость вещей: " + recMaxPrice(things, things.length - 1, MAX_WEIGHT));
        printThingsInBackpack(things);
    }

    private int recMaxPrice(Thing[] things, int i, int j) {
        if (i == 0 || j == 0) {
            return 0;
        }
        if (j >= things[i].weight) {
            return Math.max(recMaxPrice(things, i - 1, j), recMaxPrice(things, i - 1, j - things[i].weight) + things[i].price);
        } else {
            return recMaxPrice(things, i - 1, j);
        }
    }

    private void printThingsInBackpack(Thing[] things) {
        int j = MAX_WEIGHT;
        for (int i = things.length - 1; i >= 0; i--) {
            if (recMaxPrice(things, i, j) != recMaxPrice(things, i - 1, j)) {
                list.add(things[i]);
                j = j - things[i].weight;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).name + " = " + list.get(i).price + "; ");
        }
    }

}




