package FloatsLoopsArrays;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Tau vyno ar pieno?");
        String preke = sc.next();
        if (preke.contains("pieno")) {
            System.out.println("kiek pinigų turite?");
            double money = sc.nextDouble();
            if (money == 0.79) {
                System.out.println("Sveikinu Jūs ką tik įsigijote pieno");
            } else if (money < 0.79) {
                System.out.println("Pieno neparduosiu į nuostolį");
            } else if (money > 0.79) {
                System.out.println("Neparduosiu, duok be grąžos");
            }
        }
        else if (preke.contains("vyno")) {
            System.out.println("O kiek pačiam metukų?");
            int amzius = sc.nextInt();
            if (amzius >= 20) {
                System.out.println("Duok 10 litų, duosiu vyno");
                            }
            else if (amzius<20) {
                System.out.println("Vaikeli užauk");
            }

        }
        else {
            System.out.println("Mes prekiaujam tik vynu ir pienu");
        }
    }
}
