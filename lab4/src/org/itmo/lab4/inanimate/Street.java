package org.itmo.lab4.inanimate;

import org.itmo.lab4.printers.ConsolePrinter;
import org.itmo.lab4.printers.Printer;

public class Street extends Inanimate implements Place{
    protected Printer printer;
    public Street(String name) {
        super(name);
        printer = new ConsolePrinter();
    }
     public void fill(String object){
        printer.print(this + " " + "наполнились" + object);
     }
}
