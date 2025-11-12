package movess.stunky;
import ru.ifmo.se.pokemon.*;
public class Screech extends StatusMove {
    public Screech(double pow, double acc) {
        super(Type.NORMAL, pow, acc);


    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        p.setMod(Stat.DEFENSE, -2); 
        
    }
    @Override
    protected java.lang.String describe() {
        return "оглушает криком!";
    }
}
