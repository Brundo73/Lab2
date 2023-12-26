import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Miltank p1 = new Miltank("Саша", 1);
        Oddish p2 = new Oddish("Свой", 1);
        Stunky p3 = new Stunky("Чужак", 1);
        Skuntank p4 = new Skuntank("Чужой", 1);
        Gloom p5 = new Gloom("Торч",1);
        Vileplume p6 = new Vileplume("Рома", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addFoe(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
}