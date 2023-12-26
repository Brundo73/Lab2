import ru.ifmo.se.pokemon.*;

import java.lang.Math;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 100);
    }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.2) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "Использовал Shadow Ball";
    }
}
