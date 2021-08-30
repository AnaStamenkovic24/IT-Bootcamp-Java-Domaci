package pokemon;

public class FirePokemon extends Pokemon{

    public FirePokemon(String name,  int health) {
        super(name, "Fire", health);
    }

    @Override
    public String attack() {
        return "Napada: Vatrom";
    }

    @Override
    public String defend() {
        return "Brani se: Telesno";
    }

    @Override
    public String win() {
        return "Pobedjuje: Grass type";
    }

    @Override
    public String lose() {
        return "Gubi od: Water type";
    }

    @Override
    public String logAll() {
        StringBuilder sb = new StringBuilder();
        sb.append(attack()).append("\n")
                .append(defend()).append("\n")
                .append(win()).append("\n")
                .append(lose()).append("\n");
        return sb.toString();
    }
}

