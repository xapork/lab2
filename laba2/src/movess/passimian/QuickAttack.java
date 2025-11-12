package movess.passimian;
import ru.ifmo.se.pokemon.*;
public class QuickAttack extends PhysicalMove {
    public QuickAttack(double pow, double acc, int priority) {
            super(Type.NORMAL, pow, acc);

        }
        @Override
        protected java.lang.String describe() {
            return "быстро атакует!";
        }

}


    
