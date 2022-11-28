package org.itmo.lab3.characters;

import org.itmo.lab3.enums.Height;

public class Crowd implements Animated{
    private String name;
    private Height height;

    public Crowd(String name, Height height){
        this.name = name;
        this.height = height;
    }
    @Override
    public void say(String phrase) {
        System.out.println(this + "сказали:" + " " + "\"" + phrase + "\"");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }
    public void laugh(){
        System.out.println(this + " " + "засмеялась");
    }

    @Override
    public String toString() {
        if (height == Height.SHORT){
            return name + " " + "коротышек";
        }
        else if (height == Height.MEDIUM){
            return name + " " + "среднего роста";
        }
        else{
            return name + " " + "высокого роста";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crowd crowd = (Crowd) o;
        return name.equals(crowd.name) && height == crowd.height;
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + height.hashCode();
    }
}
