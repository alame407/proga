package org.itmo.lab2;
import org.itmo.lab2.pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle battleField = new Battle();

        TapuFini tapFini = new TapuFini("ОПД", 1);
        Espeon espeon = new Espeon("Матан", 1);
        Pikachu pikachu = new Pikachu("Прога", 1);
        battleField.addFoe(tapFini);
        battleField.addFoe(espeon);
        battleField.addFoe(pikachu);

        Eevee eevee = new Eevee("Сериалы", 1);
        Pichu pichu = new Pichu("Dota", 1);
        Raichu raichu = new Raichu("YouTube", 1);
        battleField.addAlly(eevee);
        battleField.addAlly(pichu);
        battleField.addAlly(raichu);

        battleField.go();
    }
}
