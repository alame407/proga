package org.itmo.lab3.things;

import org.itmo.lab3.characters.Animated;
import org.itmo.lab3.printers.ConsolePrinter;
import org.itmo.lab3.printers.Printer;

import java.util.Objects;

public class Curtain {
    private String name;
    private Printer printer;
    public Curtain(String name){
        this.name=name;
        printer = new ConsolePrinter();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void restrictMovement(Animated person){
        printer.print(this + " " + "не дает возможности сильно оклонять голову" + " " + person);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curtain curtain = (Curtain) o;
        return Objects.equals(name, curtain.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
