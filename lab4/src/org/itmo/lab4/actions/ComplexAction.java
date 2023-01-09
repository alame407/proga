package org.itmo.lab4.actions;
import org.itmo.lab4.inanimate.Place;

import java.util.Objects;

public class ComplexAction extends SimpleAction{
    private String placePreposition;
    private Place place;
    private String emotion;
    public ComplexAction(String action, String emotion){
        super(action);
        this.emotion = emotion;
    }
    public ComplexAction(String action, String placePreposition, Place place){
        super(action);
        this.placePreposition = placePreposition;
        this.place = place;
    }
    public ComplexAction(String action, String preposition, Object object, String emotion){
        super(action, preposition, object);
        this.emotion = emotion;
    }
    public ComplexAction(String action, String placePreposition, Place place, String emotion){
        super(action);
        this.placePreposition = placePreposition;
        this.place = place;
        this.emotion = emotion;
    }
    public ComplexAction(String action, String preposition, Object object, String placePreposition, Place place){
        super(action, preposition, object);
        this.placePreposition = placePreposition;
        this.place = place;
    }
    public ComplexAction(String action, String preposition, Object object, String placePreposition, Place place,
                         String emotion){
        super(action, preposition, object);
        this.placePreposition = placePreposition;
        this.place = place;
        this.emotion = emotion;
    }
    public void setPlace(String placePreposition, Place place){
        this.placePreposition = placePreposition;
        this.place = place;
    }
    public void setEmotion(String emotion){
        this.emotion = emotion;
    }

    @Override
    public String toString() {
        String string = super.toString();
        if (!(placePreposition==null || placePreposition.equals(""))){
            string += " " + placePreposition;
        }
        if (place!=null ){
            string += " " + place;
        }
        if (!(emotion==null || emotion.equals(""))){
            string += " " + "с" + " " + emotion;
        }
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ComplexAction that = (ComplexAction) o;
        return Objects.equals(placePreposition, that.placePreposition) && Objects.equals(place, that.place) &&
                Objects.equals(emotion, that.emotion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), placePreposition, place, emotion);
    }
}
