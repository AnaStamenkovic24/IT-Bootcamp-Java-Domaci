package Nedelja1;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        // Deklarisemo Scanner
        Scanner sc = new Scanner(System.in);

        // Unosimo dva broja
        System.out.println("Unesite dva cela broj:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Ispisujemo rezultate
        System.out.println("Rezultati aritmetickih operacija su:");
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
    }
}
