package org.itmo.lab3.characters;

import org.itmo.lab3.enums.Agility;
import org.itmo.lab3.printers.ConsolePrinter;
import org.itmo.lab3.printers.Printer;

import java.util.Objects;

public class Goat extends Animal {
    private Agility agility;
    private Printer printer;
    public Goat(String name, Agility agility){
        this.setName(name);
        this.agility = agility;
        printer = new ConsolePrinter();
    }
    @Override
    public void say(String phrase) {
        printer.print(this + " " + "сказал:" + " " + "\"" + phrase + "\"");
    }

    public Agility getAgility() {
        return agility;
    }

    public void setAgility(Agility agility) {
        this.agility = agility;
    }
    public void doNotCare(){
        printer.print(this + " " + "не обращает внимание");
    }
    public void goThrough(Object obj){
        printer.print(this + " " + "пролез сквозь" + " " + obj);
    }
    public void hide(Object obj){
        printer.print(this + " " + "спрятался за" + " " + obj);
    }
    public void jump(Object obj){
       printer.print(this + " " + "запрыгнул на" + " " + obj);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Goat goat = (Goat) o;
        return agility == goat.agility;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), agility);
    }
}
