package org.itmo.lab3.characters;

import org.itmo.lab3.enums.Height;

import java.util.Objects;

public class Crowd extends OrdinaryCharacter {
    private Height height;

    public Crowd(String name, Height height){
        super(name);
        this.height = height;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    @Override
    public String toString() {
        if (height == Height.SHORT){
            return getName() + " " + "коротышек";
        }
        else if (height == Height.MEDIUM){
            return getName() + " " + "среднего роста";
        }
        else{
            return getName() + " " + "высокого роста";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crowd crowd = (Crowd) o;
        return Objects.equals(getName(), crowd.getName()) && height == crowd.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), height);
    }
}
