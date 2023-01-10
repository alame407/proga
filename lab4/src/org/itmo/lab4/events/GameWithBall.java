package org.itmo.lab4.events;

import org.itmo.lab4.characters.AbstractCharacter;
import org.itmo.lab4.characters.Animated;

public interface GameWithBall extends GameInterface{
    void throwBall(AbstractCharacter fromPlayer, AbstractCharacter toPlayer, float chance);
}
