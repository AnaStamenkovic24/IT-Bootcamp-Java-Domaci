package Nedelja2;


public class Poruka {
    private Niska poruka;
    private Niska posiljalac;
    private Niska primalac;
    private int id; // jedinstveni broj
    /*
    * Default vrednosti:
    * poruka = posiljalac = primalac = null
    * id = 0
    * */

    //Konstruktori


    //Metode

    //Svako slovo iz poruke shiftuje za k pozicija u ASCII tabeli
    // k moze da bude negativno
    public void sifrujZaK(int k){
        //TODO: Implement me
    }

    // Desifruje poruku shiftovamo za k
    // k je isto kao iza sifrujZaK
    public void desifruj(int k){
        //TODO: Implement me
    }

    // Oblik:
    /*
    * {id}
    * {posiljalac} salje {primalac} poruku:
    * {poruka}
    * */
    @Override
    public String toString() {
        //TODO: Implement me
    }
}
