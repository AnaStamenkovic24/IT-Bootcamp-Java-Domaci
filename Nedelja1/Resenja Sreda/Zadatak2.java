package Nedelja1;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        // Deklarisemo Scanner
        Scanner sc = new Scanner(System.in);

        // Unosimo dva broja
        System.out.println("Unesite dva cela broj:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        /*
        * Za dva broja vazi sledece pravilo:
        * "Dva broja su istog znaka akko im je proizvod strogo veci od nule"
        * (Ovde racunamo nulu kao negativan broj)
        * Dakle, imamo 4 slucaja:
        * (I) x > 0 , y > 0  => x * y > 0 : 5 * 3 = 15 > 0
        * (II) x < 0, y < 0 => x * y > 0 : (-5) * (-3) = 15 > 0
        * (III) x > 0, y < 0 => x * y < 0: 5 * (-3) = -15 < 0
        * (IV) x < 0, y > 0 => x * y < 0: (-5) * 3 = -15 < 0
        * Pa ce mo bas taj uslov da koristimo za nasu if petlju.
        * */

        if (x * y > 0){
            System.out.println("Brojevi " + x + " i " + y + " su istog znaka");
        }
        else{
            System.out.println("Brojevi " + x + " i " + y + " su razlicitog znaka");
        }

    }
}
