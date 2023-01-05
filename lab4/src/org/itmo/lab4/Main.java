package org.itmo.lab4;

import org.itmo.lab4.actions.SimpleAction;
import org.itmo.lab4.characters.Crowd;
import org.itmo.lab4.characters.Goat;
import org.itmo.lab4.enums.Agility;
import org.itmo.lab4.enums.Height;
import org.itmo.lab4.events.Game;
import org.itmo.lab4.events.GameInterface;
import org.itmo.lab4.things.Curtain;
import org.itmo.lab4.things.Platform;


public class Main {
    public static void main(String[] args) {
        Goat goat = new Goat("Козлик", Agility.LOW);
        Crowd crowd = new Crowd("Толпа", Height.SHORT);
        Platform platform = new Platform("помост");
        Curtain curtain = new Curtain("занавеска");
        SimpleAction goTrogh = new SimpleAction("пролез");
        goTrogh.setObject("Сквозь", crowd);
        goat.doSimpleAction(goTrogh);
        SimpleAction jump = new SimpleAction("запрыгнул");
        jump.setObject("на", platform);
        goat.doSimpleAction(jump);
        SimpleAction say = new SimpleAction("сказал: \"\"");
        goat.doSimpleAction(say);
        SimpleAction laugh = new SimpleAction("засмеялась");
        crowd.doSimpleAction(laugh);
        SimpleAction doNotCare = new SimpleAction("не обращает внимание");
        goat.doSimpleAction(doNotCare);
        GameInterface game = new Game();
        game.addMember(crowd);
        game.addMember(goat);
        goat.hide(curtain);
        goat.setAgility(Agility.HIGH);
        game.start();
        game.kickMember(goat);
    }
}
