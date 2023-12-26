import ru.ifmo.se.pokemon.*;

public class Oddish extends Pokemon {
    public Oddish(String name, int lvl) {
        super(name, lvl);
        setType(Type.GRASS, Type.POISON);
        setStats(45, 50, 55, 75, 65, 30);
        setMove(new Venoshock(), new SludgeBomb());
    }
}
