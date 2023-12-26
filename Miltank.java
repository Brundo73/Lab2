import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Miltank extends Pokemon {

    private double maxHP;

    public Miltank(String name, int level) {
        super(name, level);
        setStats(95.0, 80.0, 105, 40, 70, 100);
        double maxHP = 95.0;
        setType(Type.NORMAL);
        setMove(new BodySlam(), new DefenseCurl(), new HammerArm());
    }



}
