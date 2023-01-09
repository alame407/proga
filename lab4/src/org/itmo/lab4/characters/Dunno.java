package org.itmo.lab4.characters;

public class Dunno extends Character{
    public Dunno(String name) {
        super(name);
    }
    public void feel(String feelings){
        printer.print(this + " " + "почувствовал, что" + " " + feelings);
    }
}
