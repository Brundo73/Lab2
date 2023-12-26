public class Vileplume extends Gloom {

    public Vileplume(String name, int lvl) {
        super(name, lvl);
        setStats(75, 80, 85, 110, 90, 50);
        addMove(new Facade());
    }
}
