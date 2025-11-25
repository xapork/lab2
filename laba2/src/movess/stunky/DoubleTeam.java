package movess.stunky;
import ru.ifmo.se.pokemon.*;
public class DoubleTeam extends StatusMove {
    public DoubleTeam(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        p.setMod(Stat.EVASION, +1);
    }
    @Override
    protected java.lang.String describe() {
        return "двойная атака!";
    }
    
}
