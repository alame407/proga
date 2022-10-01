package attackes;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Discharge extends SpecialMove {
    public Discharge(){
        super(Type.ELECTRIC, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.3){
            Effect.paralyze(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует Discharge";
    }
}
