package pokemon;

public abstract class Pokemon implements Attackable{
    String name, type;
    int health;

    public abstract String logAll(); //Ispisuje kako pokemon napada, kako se brani, koga pobedjuje i od koga gubi
}
