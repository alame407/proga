package attackes;

import ru.ifmo.se.pokemon.*;


public class BabyDollEyes extends StatusMove {
    public BabyDollEyes(){
        super(Type.NORMAL, 0, 100, 1, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, -1);
    }

    @Override
    protected String describe() {
        return "использует Baby-Doll Eyes";
    }
}
