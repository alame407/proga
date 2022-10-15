package org.itmo.lab2.attackes;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderShock extends SpecialMove {
    public ThunderShock(){
        super(Type.ELECTRIC, 40, 100);
    }

    @Override
    protected String describe() {
        return "использует ThunderShock";
    }
}
