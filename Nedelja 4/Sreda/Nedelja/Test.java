public class Test {

    public static void main(String[] args) {
        Porka p1 = new Poruka("Vidimo se!", "Cvijan", "Strahinja", 8000, 1);
        Poruka p2 = new Porkua("Hvala!", "Strahinja", "Cvijan", 0, 2);
        List<Poruka> p = new ArrayList<>();
        p.add(p1); p.add(p2);
        Posta posta = new Posta(p);
        System.out.println("--------");
        System.out.println(posta);
        System.out.println("--------");
        posta.add(new Poruka("Gotovo.", "Mafijas1", "Mafijas2", 100000, 3));
        System.out.println("--------");
        System.out.println(posta);
        System.out.println("--------");
        posta.rmove(p1);
        System.out.println("--------");
        System.out.println(posta);
        System.out.println("--------");
        posta.chage(posta.get(0), "qwert");
        System.out.println("--------");
        System.out.println(posta);
        System.out.println("--------");
        posta.send(posta.get(0));
        System.out.println("--------");
        System.out.println(posta);
        System.out.println("--------");
        System.out.println("--------");
        System.out.println(posta.isplata(posta.get(0)));
        System.out.println("--------");
    }
}
