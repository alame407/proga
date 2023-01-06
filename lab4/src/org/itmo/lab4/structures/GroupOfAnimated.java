package org.itmo.lab4.structures;


import org.itmo.lab4.actions.SimpleAction;
import org.itmo.lab4.characters.Animated;
import org.itmo.lab4.characters.Character;
import org.itmo.lab4.printers.ConsolePrinter;
import org.itmo.lab4.printers.Printer;

import java.util.Objects;

public class GroupOfAnimated{
    private Printer printer;
    private ListOfAnimated members;
    public GroupOfAnimated(){
        members = new ListOfAnimated();
        printer = new ConsolePrinter();
    }
    public void addMember(Character member){
        members.add(member);
    }
    public void kickMember(Animated member){
        members.remove(member);
    }
    public void doSimpleAction(SimpleAction simpleAction){
        printer.print(this + " " + simpleAction);
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
        GroupOfAnimated group = (GroupOfAnimated) o;
        return Objects.equals(members, group.members);
    }

    @Override
    public int hashCode() {
        return members.hashCode();
    }
}
