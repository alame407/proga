package org.itmo.lab3.things;

import java.util.Objects;

public class Platform extends Thing {
    public Platform(String name){
        super(name);
    }
    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Platform platform = (Platform) o;
        return Objects.equals(getName(), platform.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
