package org.itmo.lab4.inanimate;

import org.itmo.lab4.characters.AbstractCharacter;
import org.itmo.lab4.printers.ConsolePrinter;
import org.itmo.lab4.printers.Printer;

import java.util.Objects;

public class Establishment extends Inanimate{
    private AbstractCharacter owner;
    protected Printer printer;
    public Establishment(String name, AbstractCharacter owner){
        super(name);
        this.owner = owner;
        printer = new ConsolePrinter();
    }
    public void open(){
        printer.print(owner + " " + "открыл" + this);
    }
    public void close(){
        printer.print(owner + " " + "закрыл" + this);
    }

    @Override
    public String toString() {
        return "Заведение:" + " " + getName() + ", " + "Владелец:" + " " + owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Establishment that = (Establishment) o;
        return Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), owner);
    }
}
