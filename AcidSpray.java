import ru.ifmo.se.pokemon.*;

public class AcidSpray extends SpecialMove {
    public AcidSpray() {
        super(Type.POISON, 40, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_DEFENSE, -2);
    }

    @Override
    protected String describe() {
        return "Использовал Acid Spray";
    }
}
