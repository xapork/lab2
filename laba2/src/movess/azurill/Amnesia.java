package movess.azurill;
import ru.ifmo.se.pokemon.*;
public class Amnesia extends StatusMove {
    public Amnesia(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);

    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        p.setMod(Stat.SPECIAL_DEFENSE, +2);
    }
    @Override
    protected java.lang.String describe() {
        return "использует обливиэйт!";
    }
}
