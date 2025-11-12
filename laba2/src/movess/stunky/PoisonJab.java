package movess.stunky;
import ru.ifmo.se.pokemon.*;
public class PoisonJab extends PhysicalMove {
    public PoisonJab(double pow, double acc) {
        super(Type.POISON, pow, acc);

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (Math.random() <= 0.3) {
            Effect.poison(p);
        }
    }
    @Override
    protected java.lang.String describe() {
        return "колет ядом!";
    }
    
}
