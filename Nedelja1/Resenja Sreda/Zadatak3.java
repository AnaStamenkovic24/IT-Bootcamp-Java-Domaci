package Nedelja1;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {
        // Deklarisemo Scanner
        Scanner sc = new Scanner(System.in);

        // Unosimo cetvorocifren broj (pretpostavljamo da je unos korektan, nema potrebe za dodatnom proverom)
        System.out.println("Unesite cetvorocifren broj:");
        int broj = sc.nextInt();

        /*
        * Videli smo da kada na neki broj izvrsimo operaciju % 10, time izvlacimo njegovu poslednju cifru.
        * Slicno tome kada na neki broj izvrsimo operaciju / 10, time brisemo njegovu poslednju cifru.
        * Zanimljivo je primetiti da operacije % 100 i / 100 izvlace, odnosno brisu poslednje dve cifre.
        * Zapravo, ovim operacijama izlvacimo, odnosno, brisemo onoliko poslednjih cifara, koliko ima nula (koji je stepen desetke).
        * */

        int hiljade = (broj / 1000); // brisemo poslednje tri cifre
        int stotine = (broj / 100) % 10; // brisemo poslednje dve cifre, a zatim izlvacimo poslednju cifru.
        int desetice = (broj % 100) / 10; // izvlacimo poslednje dve ciffre, a zatim brisemo poslednju
        int jedinice = broj % 10; // izvlacimo poslednju cifru

        // Racunamo razliku proizvoda prvih dveju cifara i zbira drugih dveju cifara.
        int rez = hiljade * stotine - (desetice + jedinice);
        System.out.println("Rezultat operacija je: "  + rez);
    }
}
