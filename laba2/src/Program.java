import pokemonss.Azumarill;
import pokemonss.Azurill;
import pokemonss.Marill;
import pokemonss.Passimian;
import pokemonss.Skuntank;
import pokemonss.Stunky;
import ru.ifmo.se.pokemon.*;

public class Program {
    public static void main(String[] args) {
        start();
    }
    private static void start() {
        Battle b = new Battle();

        Passimian p1 = new Passimian("Обезьян", 1);
        Stunky p2 = new Stunky("Скунс", 1);
        Skuntank p3 = new Skuntank("Хвостатый", 1);
        Azurill p4 = new Azurill("Пузырек", 1);
        Marill p5 = new Marill("Марилл", 1);
        Azumarill p6 = new Azumarill("Азумарилл", 1);

        b.addAlly(p6);
        b.addAlly(p1);
        b.addAlly(p4);

        b.addFoe(p2);
        b.addFoe(p5);
        b.addFoe(p3);

        b.go();
    }
        
    
}
