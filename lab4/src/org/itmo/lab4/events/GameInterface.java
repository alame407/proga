package org.itmo.lab4.events;

import org.itmo.lab4.characters.AbstractCharacter;
import org.itmo.lab4.characters.Animated;

public interface GameInterface {
    void start();
    void kickMember(AbstractCharacter player);
    void addMember(AbstractCharacter player);
    void end();
}
