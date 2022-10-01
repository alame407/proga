package pokemons;

import attackes.*;
import ru.ifmo.se.pokemon.Type;

public class Raichu extends Pikachu{
    public Raichu(String name, int level) {
        super(name, level);
        this.setType(Type.ELECTRIC);
        this.setMove(new WildCharge(), new Swagger(), new Discharge(), new ThunderShock());
        double hp = 60,
                att = 90,
                def = 55,
                spAtt = 90,
                spDef = 80,
                speed = 110;
        this.setStats(hp, att, def, spAtt, spDef, speed);
    }
}
