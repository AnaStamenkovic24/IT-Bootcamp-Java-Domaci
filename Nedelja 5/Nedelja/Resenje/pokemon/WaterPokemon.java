package pokemon;

public class WaterPokemon extends Pokemon{

    public WaterPokemon(String name,  int health) {
        super(name, "Water", health);
    }

    @Override
    public String attack() {
        return "Napada: Vodom";
    }

    @Override
    public String defend() {
        return "Brani se: Vodom";
    }

    @Override
    public String win() {
        return "Pobedjuje: Fire type";
    }

    @Override
    public String lose() {
        return "Gubi od: Grass type";
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
