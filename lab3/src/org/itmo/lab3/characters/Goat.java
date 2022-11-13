package org.itmo.lab3.characters;

import org.itmo.lab3.enums.Agility;

import java.util.Objects;

public class Goat extends Animal{
    private Agility agility;
    public Goat(String name, Agility agility){
        this.setName(name);
        this.agility = agility;
    }
    @Override
    public void say(String phrase) {
        System.out.println(this + " " + "сказал:" + " " + "\"" + phrase + "\"");
    }

    public Agility getAgility() {
        return agility;
    }

    public void setAgility(Agility agility) {
        this.agility = agility;
    }
    public void doNotCare(){
        System.out.println(this + " " + "не обращает внимание");
    }
    public void goThrough(){
        System.out.println(this + " " + "пролез сквозь толпу");
    }
    public void hide(){
        System.out.println(this + " " + "спрятался за занавеску");
    }
    public void jump(){
        System.out.println(this + " " + "запрыгнул на помост");
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
        return 31 * getName().hashCode() + agility.hashCode();
    }
}
