package org.itmo.lab2.pokemons;

import org.itmo.lab2.attackes.*;
import ru.ifmo.se.pokemon.Type;

public class Pikachu extends Pichu {
    public Pikachu(String name, int level){
        super(name, level);
        this.setType(Type.ELECTRIC);
        this.setMove(new WildCharge(), new Swagger(), new Discharge());
        double hp = 35,
                att = 55,
                def = 40,
                spAtt = 50,
                spDef = 50,
                speed = 90;
        this.setStats(hp, att, def, spAtt, spDef, speed);
    }
}
