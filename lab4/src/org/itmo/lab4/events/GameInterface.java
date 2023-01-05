package org.itmo.lab4.events;

import org.itmo.lab4.characters.Animated;

public interface GameInterface {
    void start();
    void kickMember(Animated player);
    void addMember(Animated player);
    void end();
}
