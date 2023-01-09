package org.itmo.lab3.actions;

import java.util.Objects;

public class SimpleAction {
    private String action;
    private String preposition;
    private Object object;
    public SimpleAction(String action){
        this.action = action;
    }
    public SimpleAction(String action, String preposition, Object object){
        this.action = action;
        this.preposition = preposition;
        this.object = object;
    }
    public void setAction(String action){
        this.action = action;
    }
    public void setObject(String preposition, Object object) {
        this.preposition = preposition;
        this.object = object;
    }
    @Override
    public String toString() {
        String string = action;
        if (!(preposition==null || preposition.equals(""))){
            string += " " + preposition;
        }
        if (object!=null ){
            string += " " + object;
        }
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleAction that = (SimpleAction) o;
        return Objects.equals(action, that.action) && Objects.equals(preposition, that.preposition) &&
                Objects.equals(object, that.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, preposition, object);
    }
}
