package lesson5;

public class MainApp5 {
    public static Thing[] things = {
            new Thing("thing0", 0, 0),
            new Thing("thing1", 10, 7),
            new Thing("thing2", 4, 3),
            new Thing("thing3", 2, 1),
            new Thing("thing4", 6, 5),
            new Thing("thing5", 7, 4)};

    public static void main(String[] args) {

        //возведение в степень с помощью рекурсии:

        System.out.println(recDegree(255, 1));
        System.out.println(recDegree(2, 5));
        System.out.println(recDegree(3, 2));
        System.out.println(recDegree(3, 1));


        System.out.println();
        System.out.println("Задача2:");
        Backpack backpack = new Backpack();
        System.out.println("Вместимость рюкзака: " + backpack.getMAX_WEIGHT());
        backpack.thingsInBackpack(things);
    }

    //(задача 1)  возведение в степень с помощью рекурсии
    public static int recDegree(int a, int b) {
        if (b == 0) {
            return 1;
        }
          return recDegree(a, b - 1) * a;
    }


    public static void reversPrint(char[] arr) {
        reversPrint(arr, arr.length - 1);
    }

    private static void reversPrint(char[] arr, int n) {
        if (n < 0) {
            return;
        }
        System.out.print(arr[n]);
        reversPrint(arr, n - 1);
    }

    public static int recMultiply(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return recMultiply(a, b - 1) + a;
    }

    public static int multiply(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        return sum;
    }

    public static int recTriangleNum(int n) {
        if (n == 1) {
            return 1;
        }
        return recTriangleNum(n - 1) + n;
    }

    public static int triangleNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long recFibo(int n) {
        System.out.print(n + " ");
        if (n < 3) {
            return 1;
        }
        return recFibo(n - 1) + recFibo(n - 2);
    }

    public static long fibo(int n) {
        long a = 1;
        long b = 1;
        for (int i = 3; i <= n; i++) {
            b = b + a;
            a = b - a;
        }
        return b;
    }


    public static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int recFact(int n) {
        if (n == 1) {
            return 1;
        }
        return recFact(n - 1) * n;
    }


}

