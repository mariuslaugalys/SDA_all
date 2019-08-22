package Basics;

public class Swap {
    public static void main(String[] args) { //uzduotis -apkeisti skaicius 7 su 3
        int a = 7;
        int b = 3;

        int c = a;
        a = b;
        b = c;
        System.out.printf("a: %d b: %d\n", a, b);
    }
}
