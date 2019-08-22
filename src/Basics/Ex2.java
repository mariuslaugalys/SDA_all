package Basics;

import java.util.Scanner;

public class Ex2 { //uzd klientas iveda skaiciu su kableliu, reikia isvesti su 2 sk. po kablelio
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter price: ");
        double price = sc.nextDouble();
        System.out.printf("Price is: %.2f", price);
    }
}
