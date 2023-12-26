import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected double calcBaseDamage(Pokemon pokemon, Pokemon pokemon1) {
        if (pokemon.getCondition()==Status.BURN || pokemon.getCondition()==Status.POISON || pokemon.getCondition()==Status.PARALYZE) {
            this.power = 140;
            return super.calcBaseDamage(pokemon, pokemon1);
        }
        return super.calcBaseDamage(pokemon, pokemon1);
    }

    @Override
    protected String describe() {
        return "Использовал Facade";
    }
}
