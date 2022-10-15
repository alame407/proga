package org.itmo.lab2.pokemons;

import org.itmo.lab2.attackes.*;
import ru.ifmo.se.pokemon.Type;

public class Espeon extends Eevee {

    public Espeon(String name, int level){
        super(name, level);
        this.setType(Type.PSYCHIC);
        this.setMove(new Tackle(), new DoubleTeam(), new BabyDollEyes(), new DazzlingGleam());
        double hp = 65,
                att = 65,
                def = 60,
                spAtt = 130,
                spDef = 95,
                speed = 110;
        this.setStats(hp, att, def, spAtt, spDef, speed);
    }
}
