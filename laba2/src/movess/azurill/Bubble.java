package movess.azurill;
import ru.ifmo.se.pokemon.*;
public class Bubble extends SpecialMove {
    public Bubble(double pow, double acc) {
        super(Type.WATER, pow, acc);

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (Math.random() <= 0.1) {
            p.setMod(Stat.SPEED, -1); 
        }
    }
    @Override
    protected java.lang.String describe() {
        return "создает пузырь!";
    }

}
