package org.itmo.lab4.characters;

import org.itmo.lab4.enums.Agility;
import org.itmo.lab4.inanimate.PlaceToHide;

import java.util.Objects;

public class Goat extends Character {
    private Agility agility;

    public Goat(String name, Agility agility){
        super(name);
        this.agility = agility;
    }
    public Agility getAgility() {
        return agility;
    }

    public void setAgility(Agility agility) {
        this.agility = agility;
    }
    public void hide(PlaceToHide place){
        printer.print(this + " " + "спрятался за" + " " + place);
        place.restrictMovement(this);
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
