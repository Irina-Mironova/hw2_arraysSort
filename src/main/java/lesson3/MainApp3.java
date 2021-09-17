package lesson3;

public class MainApp3 {
    public static void main(String[] args) {
       MyDeq<Integer> myDeq = new MyDeq<>(4);
       myDeq.info();
       myDeq.infoStructure();
        for (int i = 0; i < 4; i++) {
            myDeq.insertLeft(i);
            myDeq.info();
            myDeq.infoStructure();
        }
        myDeq.insertRight(100);
        myDeq.info();
        myDeq.infoStructure();
        for (int i = 0; i < 5; i++) {
            myDeq.removeRight();
            myDeq.info();
            myDeq.infoStructure();
        }
        System.out.println("");
        System.out.println("2-е задание: ");
        StringReader sr = new StringReader("Дружба крепкая");
        System.out.println(sr.stringReader());
    }
}
