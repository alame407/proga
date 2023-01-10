package org.itmo.lab4.characters;

public class Dunno extends OrdinaryCharacter {
    public Dunno(String name, int money) {
        super(name, money);
    }
    public void feel(String feelings){
        printer.print(this + " " + "почувствовал, что" + " " + feelings);
    }
}
