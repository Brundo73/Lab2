import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove {
    public Venoshock() {
        super(Type.POISON, 65, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        if (pokemon.getCondition()==Status.POISON) super.applyOppDamage(pokemon, 2 * v);
        else super.applyOppDamage(pokemon, v);
    }

    @Override
    protected String describe() {
        return "Использует Venoshock";
    }
}
