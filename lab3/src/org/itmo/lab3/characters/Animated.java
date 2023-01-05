package org.itmo.lab3.characters;

import org.itmo.lab3.actions.SimpleAction;

public interface Animated {
    void doSimpleAction(SimpleAction action);
    void setName(String name);
    String getName();
}
