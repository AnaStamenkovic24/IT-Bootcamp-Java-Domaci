package Nedelja;

public class Poruka {
    private String poruka;
    private String posiljalac;
    private String primalac;
    int suma;
    int id;

    /*Konstruktori*/

    /*Metode*/
    // TODO: setter i getter

    // U konzoli ispisuje, ako je suma nenegativna:
    // {posiljalac} salje {suma} para {primalac}-u, uz poruku:
    // {poruka}
    // a ako je suma negativna:
    // {posiljalac} primac {suma} para od {primalac}-a, uz poruku:
    // {poruka}
    public void posalji(){
        //TODO: Implement me
    }

    // Ispisuje:
    // {posiljalac} i {prilamalac} vrse tranzakciju od {suma}, uz poruku: {poruka} ({id})

    @Override
    public String toString() {
        return "Poruka{}";
    }
}
