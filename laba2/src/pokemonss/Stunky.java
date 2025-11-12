package pokemonss;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import movess.stunky.*;
public class Stunky extends Pokemon{
    public Stunky(java.lang.String name, int level) {
        super(name, level);
        this.setType(Type.POISON, Type.DARK);
        this.setStats(63, 63, 47, 41, 41, 74);

        ShadowBall shadowBall1 = new ShadowBall(80, 100);
        Screech screech = new Screech(0, 85);

        this.setMove(shadowBall1, screech);


    }

}
