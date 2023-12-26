import ru.ifmo.se.pokemon.*;

public class Stunky extends Pokemon {
    public Stunky(String name, int lvl) {
        super(name, lvl);
        setStats(63, 63, 47, 41, 41, 74);
        setType(Type.DARK, Type.POISON);
        setMove(new AcidSpray(), new VenomDrench(), new ShadowBall());
    }
}
