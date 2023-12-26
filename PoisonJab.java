import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import static java.lang.Math.random;

public class PoisonJab extends PhysicalMove {
    public PoisonJab() {
        super(Type.POISON, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (random()<0.3) {
            Effect.poison(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "Использовал Poison Jab";
    }
}
