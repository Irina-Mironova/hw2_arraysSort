package lesson6;

public class MainApp6 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 0; i < 100000; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            while (map.height() < 4) {
                int n = (int) (Math.random() * 200 - 100);
                map.put(n, n);
            }
            System.out.println(map);
            if (map.isBalanced()) {
                System.out.println("Дерево сбалансировано");
                count++;
            }
        }
        System.out.println("Процент сбалансированных деревьев: " + count * 100 / 100000);
    }
}
