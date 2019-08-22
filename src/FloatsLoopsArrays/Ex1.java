package FloatsLoopsArrays;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamsta prašau atspėti skaičių sveikąjį: ");
        int Number = sc.nextInt();
        if (Number == 30) {
            System.out.println("Sveikinu, Jūs atspėjote skaičius yra " + Number);
        }
        else if (Number <  30) {
            System.out.println("skaičius mažesnis už 30");
        }
        else {
            System.out.println("Skaičius didesnis už 30");
        }
    }
}
