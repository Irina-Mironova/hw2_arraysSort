package lesson4;

public class MainApp4 {
    public static void main(String[] args) {
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        linkedQueue.insert(1);
        linkedQueue.insert(2);
        linkedQueue.insert(4);
        linkedQueue.insert(16);

        System.out.println("Поиск элемента 4: " + linkedQueue.indexOf(4));
        System.out.println("Поиск элемента 22: " + linkedQueue.indexOf(22));

        System.out.println(linkedQueue.remove());
        System.out.println(linkedQueue.remove());
        System.out.println(linkedQueue.remove());
        System.out.println(linkedQueue.remove());

    }
}
