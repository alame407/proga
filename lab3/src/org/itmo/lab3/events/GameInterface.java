package org.itmo.lab3.events;

import org.itmo.lab3.characters.AbstractCharacter;
import org.itmo.lab3.characters.Animated;

public interface GameInterface {
    void start();
    void kickMember(AbstractCharacter player);
    void addMember(AbstractCharacter player);
    void end();
}
