package movess.stunky;
import ru.ifmo.se.pokemon.*;
public class ShadowBall extends SpecialMove {
    public ShadowBall(double pow, double acc) {
        super(Type.GHOST, pow, acc);


    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (Math.random() <= 0.2) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1); 
        }
    }
    @Override
    protected java.lang.String describe() {
        return "кидается теневым шаром!";
    }
}
