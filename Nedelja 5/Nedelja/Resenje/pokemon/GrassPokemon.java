package pokemon;

public class GrassPokemon extends Pokemon{

    public GrassPokemon(String name,  int health) {
        super(name, "Grass", health);
    }

    @Override
    public String attack() {
        return "Napada: Travom";
    }

    @Override
    public String defend() {
        return "Brani se: Izbegava";
    }

    @Override
    public String win() {
        return "Pobedjuje: Water type";
    }

    @Override
    public String lose() {
        return "Gubi od: Fire type";
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