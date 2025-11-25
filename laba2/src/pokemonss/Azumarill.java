package pokemonss;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import movess.azurill.*;
public final class Azumarill extends Marill{
    public Azumarill(java.lang.String name, int level) {
        super(name, level);
        this.setStats(100, 50, 80, 60, 80, 50);

        Superpower superpower = new Superpower(120, 100);

        this.addMove(superpower);


    }

}
