package org.itmo.lab4.characters;

import org.itmo.lab4.actions.ComplexAction;
import org.itmo.lab4.actions.SimpleAction;
import org.itmo.lab4.printers.ConsolePrinter;
import org.itmo.lab4.printers.Printer;

import java.util.Objects;

public class Character extends AbstractCharacter{
    protected Printer printer;
    public Character(String name){
        super(name);
        printer = new ConsolePrinter();
    }
    @Override
    public void doSimpleAction(SimpleAction action){
        printer.print(this + " " + action);
    }

    @Override
    public void doComplexAction(ComplexAction action) {
        printer.print(this+ " " + action);
    }
}
