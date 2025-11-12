package movess.azurill;
import ru.ifmo.se.pokemon.*;
public class TailWhip extends StatusMove {
    public TailWhip(double pow, double acc) {
        super(Type.NORMAL, pow, acc);


    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        p.setMod(Stat.DEFENSE, -1); 
        
    }
    @Override
    protected java.lang.String describe() {
        return "ударяет хвостом!";
    }
    
}
