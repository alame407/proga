package org.itmo.lab4.inanimate;

import java.util.Objects;

public abstract class Inanimate {
    private String name;
    public Inanimate(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inanimate inanimate = (Inanimate) o;
        return Objects.equals(name, inanimate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
