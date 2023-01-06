package org.itmo.lab4.characters;

import org.itmo.lab4.actions.ComplexAction;
import org.itmo.lab4.actions.SimpleAction;
import org.itmo.lab4.printers.ConsolePrinter;
import org.itmo.lab4.printers.Printer;

import java.util.Objects;

public class Character implements Animated{
    private String name;
    protected Printer printer;
    public Character(String name){
        this.name=name;
        printer = new ConsolePrinter();
    }
    public void doSimpleAction(SimpleAction action){
        printer.print(this + " " + action);
    }

    @Override
    public void doComplexAction(ComplexAction action) {
        printer.print(this + " " + action);
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
        Character animal = (Character) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
