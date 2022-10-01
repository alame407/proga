import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle battleField = new Battle();

        TapuFini tap = new TapuFini("ОПД", 1);
        Espeon esp = new Espeon("Матан", 1);
        Pikachu pika = new Pikachu("Прога", 1);
        battleField.addFoe(tap);
        battleField.addFoe(esp);
        battleField.addFoe(pika);

        Eevee eev = new Eevee("Сериалы", 1);
        Pichu pic = new Pichu("Dota", 1);
        Raichu rai = new Raichu("YouTube", 1);
        battleField.addAlly(eev);
        battleField.addAlly(pic);
        battleField.addAlly(rai);

        battleField.go();
    }
}
