package org.itmo.lab4.inanimate;



import org.itmo.lab4.characters.Animated;
import org.itmo.lab4.printers.ConsolePrinter;
import org.itmo.lab4.printers.Printer;

public class Curtain extends Inanimate implements PlaceToHide {
    private Printer printer;
    public Curtain(String name){
        super(name);
        printer = new ConsolePrinter();
    }
    public void restrictMovement(Animated animated){
        printer.print(this + " " + "не дает возможности сильно оклонять голову" + " " + animated);
    }
}
