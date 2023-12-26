public class Skuntank extends Stunky {
    public Skuntank(String name, int lvl) {
        super(name, lvl);
        setStats(103, 93, 67, 71, 61, 84);
        addMove(new PoisonJab());
    }
}
