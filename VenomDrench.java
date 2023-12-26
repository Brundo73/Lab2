import ru.ifmo.se.pokemon.*;

import java.io.ObjectInputFilter;

public class VenomDrench extends StatusMove {
    public VenomDrench() {
        super(Type.POISON, 0, 100);
    }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (pokemon.getCondition()==Status.POISON) {
            pokemon.setMod(Stat.ATTACK, -1);
            pokemon.setMod(Stat.SPECIAL_ATTACK, -1);
            pokemon.setMod((Stat.SPEED), -1);
        }
    }

    @Override
    protected String describe() {
        return "Использовал Venom Drench";
    }
}
