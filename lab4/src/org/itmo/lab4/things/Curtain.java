package org.itmo.lab4.things;



import org.itmo.lab4.characters.Animated;
import org.itmo.lab4.printers.ConsolePrinter;
import org.itmo.lab4.printers.Printer;

import java.util.Objects;

public class Curtain extends Thing implements PlaceToHide {
    private Printer printer;
    public Curtain(String name){
        super(name);
        printer = new ConsolePrinter();
    }
    public void restrictMovement(Animated character){
        printer.print(this + " " + "не дает возможности сильно оклонять голову" + " " + character);
    }
}
