package pokemons;

import attackes.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pichu extends Pokemon {
    public Pichu(String name, int level){
        super(name, level);
        this.setType(Type.ELECTRIC);
        this.setMove(new WildCharge(), new Swagger());
        double hp = 20,
                att = 40,
                def = 15,
                spAtt = 35,
                spDef = 35,
                speed = 60;
        this.setStats(hp, att, def, spAtt, spDef, speed);
    }
}
