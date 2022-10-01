package pokemons;

import attackes.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class TapuFini extends Pokemon {
    public TapuFini(String name, int level){
        super(name, level);
        this.setType(Type.WATER, Type.FAIRY);
        this.setMove(new Facade() ,new Confide(), new BulkUp(), new SuperPower());
        double hp = 70,
                att = 75,
                def = 115,
                spAtt = 95,
                spDef = 130,
                speed = 85;
        this.setStats(hp, att, def, spAtt, spDef, speed);
    }
}
