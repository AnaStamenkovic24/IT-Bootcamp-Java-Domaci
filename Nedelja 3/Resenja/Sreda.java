public class Resenja {

    public static void bilbord(String msg){
        // zamenjumeo sva pojavljivanja ovih simbola sa pranzom niskom, tj. brisemo ih!
        msg = msg.replaceAll("\\$", "").replaceAll("#", "").replaceAll("@", "");
        // Karakater $ moramo da "eskejpujemo" pomocu eskejp sekvence jer je on specijalan karakter u javi!
        System.out.println(msg);
    }

    public static String uncensore(String censore, String[] kljuc, String[] decode){
        // Prolazimo kroz cenzurisanu rec i zamenjujemo svaki kljuc sa desifrovanom porukom
        for (int i = 0; i < kljuc.length; i++) {
            censore = censore.replace(kljuc[i], decode[i]);
        }
        return censore;
    }

    public static boolean isValid(String pass){
        // Ako je kraci ili jednak 8 onda vrati false
        if (pass.length() <= 8)
            return false;
        char[] chars = pass.toCharArray(); // prebaci string u niz karaktera
        for (int i = 0; i < chars.length; i++) { // prodji kroz svaki karakter posebno
            if (Character.isUpperCase(chars[i])) // ako je veliko slovo, onda ono postoji pa je password validan
                return true;
        }
        // Nismo pronasli ni jedno veliko slovo, dakle password nije validan
        return false;
    }


    public static void main(String[] args) {
        //bilbord("Vo$z$ite $#@pazlj@i######vo!#");
        /*String cen = "#### !! @@@@@@ ^^^^^^";
        String[] kljuc = {"####", "!!", "@@@@@@", "^^^^^^"};
        String[] decode = {"Paja", "patak,", "dobio", "zadatak"};
        System.out.println(uncensore(cen, kljuc, decode));*/
        //System.out.println(isValid("Strahinja123"));

    }
}
