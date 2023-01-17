package org.itmo.lab4.inanimate;



import org.itmo.lab4.characters.Animated;
import org.itmo.lab4.printers.ConsolePrinter;
import org.itmo.lab4.printers.Printer;

import java.util.Objects;

public class Curtain extends Inanimate implements PlaceToHide {
    private Printer printer;
    private String material;
    public Curtain(String name, String material){
        super(name);
        this.material = material;
        printer = new ConsolePrinter();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void restrictMovement(Animated animated){
        printer.print(this + " " + "не дает возможности сильно оклонять голову" + " " + animated);
    }

    @Override
    public String name() {
        return getName();
    }

    @Override
    public String toString() {
        return getName() + " " + "сделанный из" + " " + material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Curtain curtain = (Curtain) o;
        return Objects.equals(material, curtain.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), material);
    }
}
