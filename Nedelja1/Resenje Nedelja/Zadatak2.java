package Nedelja1;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        * Primetimo da je broj x deljiv sa 15 akko je deljiv sa 3 i sa 5
        * Dakle za deljivost sa 15 ne moramo da imamo specijalan uslov,
        * vec mozemo da njega obradimo ujedno sa slucajem za 3 i 5 na sledeci nacin
        * */

        int n = sc.nextInt();
        // Cim imamo "od do", to odmah znaci da koristimo for petlju
        for (int i = 1; i <= n; i++) {
            // Inicijalizujemo String ispis na slucaj kada nije deljivo ni sa 5 ni sa 3
            String ispis =  i + ": ";
            if (i % 3 == 0)
                ispis += "Fizz"; // Ako je trenutni broj deljiv sa 3, dodajemo rec Fizz
            /*
            * Sada nam opet treba if, a ne else if, jer zelimo da ga obradimo nezavisno
            * od toga da li je broj deljiv sa 3 ili ne
            * */
            if (i % 5 == 0)
                ispis += "Buzz"; // AKo je trenutni broj deljiv sa 5, dodajemo rec Buzz

            /*
            * Ovim, recimo broj 15, ce da ispuni oba uslova, i bice ispisano 15: FizzBuzz, sto smo i hteli
            * */
            System.out.println(ispis);
        }

    }
}
