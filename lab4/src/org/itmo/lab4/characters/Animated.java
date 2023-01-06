package org.itmo.lab4.characters;

import org.itmo.lab4.actions.ComplexAction;
import org.itmo.lab4.actions.SimpleAction;

public interface Animated {
    void doSimpleAction(SimpleAction action);
    void doComplexAction(ComplexAction action);
}
