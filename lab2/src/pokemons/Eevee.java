package pokemons;

import attackes.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Eevee extends Pokemon {
    public Eevee(String name, int level){
        super(name, level);
        this.setType(Type.NORMAL);
        this.setMove(new DoubleTeam(), new Tackle(), new BabyDollEyes());
        double hp = 55,
                att = 55,
                def = 50,
                spAtt = 45,
                spDef = 65,
                speed = 55;
        this.setStats(hp, att, def, spAtt, spDef, speed);
    }
}
