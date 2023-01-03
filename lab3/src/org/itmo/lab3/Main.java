package org.itmo.lab3;

import org.itmo.lab3.characters.Crowd;
import org.itmo.lab3.characters.Goat;
import org.itmo.lab3.enums.Agility;
import org.itmo.lab3.enums.Height;
import org.itmo.lab3.events.Game;
import org.itmo.lab3.events.GameInterface;
import org.itmo.lab3.things.Curtain;
import org.itmo.lab3.things.Platform;


public class Main {
    public static void main(String[] args) {
        Goat goat = new Goat("Козлик", Agility.LOW);
        Crowd crowd = new Crowd("Толпа", Height.SHORT);
        Platform platform = new Platform("помост");
        Curtain curtain = new Curtain("занавеска");
        goat.goThrough(crowd);
        goat.jump(platform);
        goat.say("");
        crowd.laugh();
        goat.doNotCare();
        GameInterface game = new Game();
        game.addMember(crowd);
        game.addMember(goat);
        goat.hide(curtain);
        goat.setAgility(Agility.HIGH);
        game.start();
        game.kickMember(goat);
    }
}
