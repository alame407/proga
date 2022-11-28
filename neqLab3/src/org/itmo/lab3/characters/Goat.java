package org.itmo.lab3.characters;

import org.itmo.lab3.enums.Agility;

public class Goat extends Animal {
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
    public void goThrough(String objectInAccusativeCase){
        System.out.println(this + " " + "пролез сквозь" + " " + objectInAccusativeCase);
    }
    public void hide(String objectInAccusativeCase){
        System.out.println(this + " " + "спрятался за" + " " + objectInAccusativeCase);
    }
    public void jump(String objectInAccusativeCase){
        System.out.println(this + " " + "запрыгнул на" + " " + objectInAccusativeCase);
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
