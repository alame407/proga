package org.itmo.lab3.characters;

import org.itmo.lab3.actions.SimpleAction;
import org.itmo.lab3.printers.ConsolePrinter;
import org.itmo.lab3.printers.Printer;

public class OrdinaryCharacter extends AbstractCharacter{
    protected Printer printer;
    public OrdinaryCharacter(String name){
        super(name);
        printer = new ConsolePrinter();
    }
    @Override
    public void doSimpleAction(SimpleAction action){
        printer.print(this + " " + action);
    }

}
