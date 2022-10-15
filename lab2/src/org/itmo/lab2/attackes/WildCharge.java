package org.itmo.lab2.attackes;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class WildCharge extends PhysicalMove {
    public WildCharge(){
        super(Type.ELECTRIC, 90, 100);
    }

    protected void applySelfDamage(Pokemon pokemon, double damage) {
        pokemon.setMod(Stat.HP, (int)Math.round(damage / 4.0));
    }

    @Override
    protected String describe() {
        return "использует Wild Charge";
    }
}
