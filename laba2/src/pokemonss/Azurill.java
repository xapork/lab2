package pokemonss;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import movess.azurill.*;
public class Azurill extends Pokemon{
    public Azurill(java.lang.String name, int level) {
        super(name, level);
        this.setType(Type.NORMAL, Type.FAIRY);
        this.setStats(50, 20, 40, 20, 40, 20);

        Bubble bubble = new Bubble(65, 100);
        TailWhip tailWhip = new TailWhip(0, 100);

        this.setMove(bubble, tailWhip);


    }

}