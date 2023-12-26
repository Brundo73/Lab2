public class Gloom extends Oddish {
    public Gloom(String name, int lvl) {
        super(name, lvl);
        setStats(60, 65, 70, 85, 75, 40);
        addMove(new Growth());
    }
}
