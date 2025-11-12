package movess.passimian;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide(double pow, double acc) {
            super(Type.ROCK, pow, acc);

        }
        @Override
        protected void applyOppEffects(Pokemon p) {
            super.applyOppEffects(p);
            if (Math.random() <= 0.3) {
                Effect.flinch(p); 
            }
        }
        @Override
        protected java.lang.String describe() {
            return "бросает камни и пытается заставить противника вздрогнуть!";
        }

}
