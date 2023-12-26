import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import java.lang.Math;

public class BodySlam extends PhysicalMove {
    public BodySlam() {
        super(Type.NORMAL, 85, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.3) {
            Effect.paralyze(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "Использовал BodySlam" ;
    }
}
