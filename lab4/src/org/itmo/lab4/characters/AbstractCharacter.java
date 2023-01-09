package org.itmo.lab4.characters;

import org.itmo.lab4.actions.ComplexAction;
import org.itmo.lab4.actions.SimpleAction;

import java.util.Objects;

public abstract class AbstractCharacter implements Animated{
    private String name;
    public AbstractCharacter(String name){
        this.name = name;
    }
    public abstract void doSimpleAction(SimpleAction action);
    public abstract void doComplexAction(ComplexAction action);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractCharacter that = (AbstractCharacter) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
