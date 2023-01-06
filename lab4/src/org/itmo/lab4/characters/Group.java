package org.itmo.lab4.characters;


import org.itmo.lab4.actions.SimpleAction;
import org.itmo.lab4.structures.ListOfAnimated;
import org.itmo.lab4.printers.ConsolePrinter;
import org.itmo.lab4.printers.Printer;

import java.util.Objects;

public class Group{
    private Printer printer;
    private ListOfAnimated members;
    public Group(){
        members = new ListOfAnimated();
        printer = new ConsolePrinter();
    }
    public void addMember(Character member){
        members.add(member);
    }
    public void kickMember(Animated member){
        members.remove(member);
    }
    public void simpleAction(SimpleAction simpleAction){
        printer.printSimpleAction(this, simpleAction);
    }
    @Override
    public String toString() {
        String string = members.toString();
        string = string.substring(1, string.length() -1);
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(members, group.members);
    }

    @Override
    public int hashCode() {
        return members.hashCode();
    }
}
