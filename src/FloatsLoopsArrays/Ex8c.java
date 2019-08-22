package FloatsLoopsArrays;

import java.util.Scanner;

public class Ex8c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Parašyk ką nors: ");
            String word = sc.next();
            if (word.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.println(word);

        }
    }
}
