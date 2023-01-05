package org.itmo.lab4.characters;

import org.itmo.lab4.actions.SimpleAction;

public interface Animated {
    void doSimpleAction(SimpleAction action);
    void setName(String name);
    String getName();
}
