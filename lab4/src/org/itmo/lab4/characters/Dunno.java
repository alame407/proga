package org.itmo.lab4.characters;

public class Dunno extends Character{
    public Dunno(String name) {
        super(name);
    }
    public void spot(String spotted){
        printer.print(this + " " + "заметил, что" + " " + spotted);
    }
}
