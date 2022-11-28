package org.itmo.lab3.events;

import org.itmo.lab3.characters.Animated;

public interface GameInterface {
    void start();
    void kickMember(Animated player);
    void addMember(Animated player);
    void end();
}
