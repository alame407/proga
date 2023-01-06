package org.itmo.lab4.inanimate;

import org.itmo.lab4.printers.ConsolePrinter;
import org.itmo.lab4.printers.Printer;

public class DistoringMirror extends Inanimate{
    protected Printer printer;
    public DistoringMirror(String name) {
        super(name);
        printer = new ConsolePrinter();
    }
    public void reflect(Object object){
        printer.print(this + " " + "исказило" + object);
    }
}
