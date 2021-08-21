package Nedelja2;

import java.util.LinkedList;

public class Posta {
    private LinkedList<Poruka> mail;

    //Konstruktori


    //Metode

    //Dodaje poruku p ako ne postoji
    public void add(Poruka p){
        //TODO: Implement me
    }

    public void add(Poruka p, int index){
        //TODO: Implement me
    }

    //Bride poruku p ako postoji
    public void remove(Poruka p){
        //TODO: Implement me
    }

    public void remove(int index){
        //TODO: Implement me
    }

    // Sifruje poruku p u listi ako ona postoji
    public void sifruj(Poruka p, int k){
        //TODO: Implement me
    }

    public void sifruj(int index, int k){
        //TODO: Implement me
    }

    // Desifruje poruku p u listi ako ona postoji
    public void desifruj(Poruka p, int k){
        //TODO: Implement me
    }

    public void desifruj(int index, int k){
        //TODO: Implement me
    }

    // Sifruje sve poruke za k
    public void sifrujSveZaK(int k){
        //TODO: Implement me
    }

    public void desifruj(int k){
        //TODO: Implement me
    }

    // Ispisuje u konzoli poruku p i brise je iz liste
    public void send(Poruka p){
        //TODO: Implement me
    }

    /*Oblik:
    * {id}: {poruka}  // svaka u novom redu
    * */
    @Override
    public String toString() {
        return "Posta{}";
    }
}
