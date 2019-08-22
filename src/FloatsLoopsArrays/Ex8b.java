package FloatsLoopsArrays;

import java.util.Scanner;

public class Ex8b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Parašyk ką nors: ");
            String word = sc.next();
            if (word.equalsIgnoreCase("continue")) {
                continue;
            }
            System.out.println(word);

        }
    }
}
