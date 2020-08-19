package lesson1;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        short b = 1;
        byte c = 2;
        long d = 3;
        float e = 4;
        double f = 5;
        char g = 'c';
        boolean h = true;
        String str = "cererr";
    }

    static double calc(int a, int b, int c, int d) {
        return a * (b + ((double) c / d));
    }

    static boolean checkSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("Передано положительно число");
        } else {
            System.out.println("Передано отрицательное число");
        }
    }

    static boolean isNumberNegative(int a) {
        return a < 0;
    }

    static void printMessage(String name) {
        System.out.printf("Привет, %s!", name);
    }

    static void leapYearCheck(int y) {
        if (y % 400 == 0 || y % 100 != 0 && y % 4 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год невисокосный");
        }
    }
}
