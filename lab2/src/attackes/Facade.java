package attackes;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected double calcBaseDamage(Pokemon p1, Pokemon p2) {
        switch(p1.getCondition()){
            case BURN, POISON, PARALYZE:
                return (0.4 * (double)p1.getLevel() + 2.0) * 2 * this.power / 150.0;
            default:
                return (0.4 * (double)p1.getLevel() + 2.0) * this.power / 150.0;
        }
    }

    @Override
    protected String describe(){
        return "использует Facade";
    }
}
