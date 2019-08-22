package FloatsLoopsArrays;

import java.lang.reflect.Array;
import java.util.Random;

public class Ex9 {
    public static int[] randomArray() {
        Random rnd = new Random();
        int n = rnd.nextInt(10);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rnd.nextInt(100);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }

    public static int maxNumber(int[] array) {
        int M = 0;
        for (int number : array) {
            if (M < number) {
                M = number;
            }
        }
        return M;
    }

    public static void main(String[] args) {
        int[] array = randomArray();
        printArray(array);
        System.out.printf("Max number is %d", maxNumber(array));
    }
}

