package lesson3;

public class StringReader {
    private String str;

    public StringReader(String str) {
        this.str = str;
    }

    public String stringReader() {
        MyStack<Character> myStack = new MyStack<>(str.length());

        for (int i = 0; i < str.length(); i++) {
            myStack.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(myStack.pop());
        }
        System.out.println(str);
        return sb.toString();
    }
}
