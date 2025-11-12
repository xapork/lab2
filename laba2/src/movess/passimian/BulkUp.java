package movess.passimian;
import ru.ifmo.se.pokemon.*;

public class BulkUp extends StatusMove {
    public BulkUp(double pow, double acc) {
        super(Type.FIGHTING, 0, 100);

    


    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        p.setMod(Stat.ATTACK, +1);
        p.setMod(Stat.DEFENSE, +1);
    }
    @Override
    protected java.lang.String describe() {
        return "апгрейдится!";
    }
}
