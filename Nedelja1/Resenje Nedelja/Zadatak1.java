package Nedelja1;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Unosimo imena timova i njihove medalje
        String timA = sc.nextLine();
        String timB = sc.nextLine();
        int gA = sc.nextInt();
        int gB = sc.nextInt();
        int sA = sc.nextInt();
        int sB = sc.nextInt();
        int bA = sc.nextInt();
        int bB = sc.nextInt();

        // Proveravamo da li jedan tim ima vise medalja od drugog
        int sumA = gA + sA + bA;
        int sumB = gB + sB + bB;
        if (sumA > sumB)
            System.out.println(timA);
        else if (sumB > sumA)
            System.out.println(timB);
        // Ako ova dva uslova nisu ispunjena, onda imaju isti broj medalja
        // Dakle dalje proveravamo broj pojedinacnih medalja redom
        else if (gA > gB)
            System.out.println(timA);
        else if (gB > gA)
            System.out.println(timB);
        else if (sA > sB)
            System.out.println(timA);
        else if (sB > sA)
            System.out.println(timB);
        else if (bA > bB)
            System.out.println(timA);
        else if (bB > bA)
            System.out.println(timB);
        // Ako nista od ovoga ne prodje, to znaci da su potpuno isti
        else
            System.out.println("Nereseno");

    }
}
