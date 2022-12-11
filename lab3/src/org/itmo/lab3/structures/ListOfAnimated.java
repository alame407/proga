package org.itmo.lab3.structures;

import org.itmo.lab3.characters.Animated;

public class ListOfAnimated {
    private final static int DEFAULT_SIZE = 10;
    private final static int DEFAULT_INCREASE = 10;
    private int size;
    private int currentMaxSize;
    private Animated[] elements;
    public ListOfAnimated(){
        elements = new Animated[DEFAULT_SIZE];
        size = 0;
        currentMaxSize = DEFAULT_SIZE;
    }
    public void add(Animated element){
        if (size < currentMaxSize){
            elements[size] = element;
            size++;
        }
        else{
            Animated[] newList = new Animated[currentMaxSize+DEFAULT_INCREASE];
            for (int i=0; i<size;i++){
                newList[i] = elements[i];
            }
            newList[size] = element;
            elements = newList;
            size++;
            currentMaxSize += DEFAULT_INCREASE;
        }
    }
    public boolean contains(Animated element){
        for (int i=0; i<size; i++){
            if (elements[i].equals(element)) return true;
        }
        return false;
    }

    public void remove(Animated element){
        boolean inArray = false;
        int indexInArray = -1;
        for (int i=0; i<size; i++){
            if (elements[i].equals(element)){
                inArray = true;
                indexInArray = i;
                break;
            }
        }
        if (inArray){
            size--;
            for (int i=indexInArray;i<size;i++){
                elements[i] = elements[i+1];
            }
            elements[size] = null;
        }
    }
    @Override
    public String toString(){
        String string = "[";
        for (int i=0; i<size; i++){
            string += elements[i];
            if (i != size -1){
                string += " ";
            }
        }
        string += "]";
        return string;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (int i=0; i<size; i++){
            hash = 31*hash+elements[i].hashCode();
        }
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListOfAnimated that = (ListOfAnimated) o;
        if (size != that.size) return false;
        for (int i=0; i<size; i++){
            if (elements[i] != that.elements[i]) return false;
        }
        return true;
    }
}
