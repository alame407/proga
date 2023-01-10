package org.itmo.lab4.characters;

import org.itmo.lab4.actions.ComplexAction;
import org.itmo.lab4.actions.SimpleAction;

import java.util.Objects;

public abstract class AbstractCharacter implements Animated{
    private String name;
    private int money;
    public AbstractCharacter(String name, int money){
        this.name = name;
        this.money = money;
    }
    public abstract void doSimpleAction(SimpleAction action);
    public abstract void doComplexAction(ComplexAction action);

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

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
