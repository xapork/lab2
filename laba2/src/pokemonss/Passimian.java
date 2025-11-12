package pokemonss;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import movess.passimian.*;
public class Passimian extends Pokemon{
    public Passimian(java.lang.String name, int level) {
        super(name, level);
        this.setType(Type.FIGHTING);
        this.setStats(100, 120, 90, 40, 60, 80);

        RockSlide rockSlide = new RockSlide(75, 100);
        BulkUp bulkUp = new BulkUp(0, 0);
        QuickAttack quickAttack = new QuickAttack(40, 100, 1);
        CloseCombat closeCombat = new CloseCombat(120, 100);

        this.setMove(rockSlide, bulkUp, quickAttack, closeCombat);


    }

}
