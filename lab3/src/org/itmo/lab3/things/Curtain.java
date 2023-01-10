package org.itmo.lab3.things;

import org.itmo.lab3.characters.Animated;
import org.itmo.lab3.printers.ConsolePrinter;
import org.itmo.lab3.printers.Printer;

public class Curtain extends Thing implements PlaceToHide {
    protected Printer printer;
    public Curtain(String name){
        super(name);
        printer = new ConsolePrinter();
    }
    public void restrictMovement(Animated animated){
        printer.print(this + " " + "не дает возможности сильно оклонять голову" + " " + animated);
    }
}
