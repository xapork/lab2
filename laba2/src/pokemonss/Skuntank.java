package pokemonss;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import movess.stunky.*;
public final class Skuntank extends Stunky{
    public Skuntank(java.lang.String name, int level) {
        super(name, level);
        this.setType(Type.POISON, Type.DARK);
        this.setStats(103, 93, 67, 71, 61, 84);

        
        PoisonJab poisonJab = new PoisonJab(80, 100);

        this.setMove(poisonJab);


    }

}
