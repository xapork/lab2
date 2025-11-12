package pokemonss;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import movess.azurill.*;
public class Marill extends Azurill{
    public Marill(java.lang.String name, int level) {
        super(name, level);
        this.setType(Type.WATER, Type.FAIRY);
        this.setStats(70, 20, 50, 20, 50, 40);

        Amnesia amnesia = new Amnesia(0,0 );

        this.setMove(amnesia);


    }

}