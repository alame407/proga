package org.itmo.lab3.things;

import java.util.Objects;

public class Curtain {
    private String name;
    public Curtain(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curtain curtain = (Curtain) o;
        return Objects.equals(name, curtain.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}