package attackes;

import ru.ifmo.se.pokemon.*;

public class SuperPower extends PhysicalMove {
    public SuperPower(){
        super(Type.FIGHTING, 120, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.DEFENSE, -1);
        pokemon.setMod(Stat.ATTACK, -1);
    }

    @Override
    protected String describe(){
        return "использует SuperPower";
    }
}
