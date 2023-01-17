package org.itmo.lab4.inanimate;

import java.util.Objects;

public class Basket extends Inanimate implements Place{
    private Object fill;
    public Basket(String name, Object fill){
        super(name);
        this.fill = fill;
    }

    public Object getFill() {
        return fill;
    }

    public void setFill(Object fill) {
        this.fill = fill;
    }

    @Override
    public String name() {
        return getName();
    }

    @Override
    public String toString() {
        return getName() + " " + "наполненное" + " " + fill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Basket basket = (Basket) o;
        return Objects.equals(fill, basket.fill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fill);
    }
}
