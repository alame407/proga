package org.itmo.lab2.attackes;

import ru.ifmo.se.pokemon.*;

public class BulkUp extends StatusMove{
    public BulkUp(){
        super(Type.FIGHTING, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.ATTACK, +1);
        pokemon.setMod(Stat.DEFENSE, +1);
    }

    @Override
    protected String describe(){
        return "использует Bulk Up";
    }
}
