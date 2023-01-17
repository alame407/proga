package org.itmo.lab4.structures;

import org.itmo.lab4.actions.SimpleAction;
import org.itmo.lab4.characters.AbstractCharacter;
import org.itmo.lab4.printers.ConsolePrinter;
import org.itmo.lab4.printers.Printer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {
    protected Printer printer;
    private List<AbstractCharacter> members;
    public Group(){
        members = new ArrayList<>();
        printer = new ConsolePrinter();
    }
    public void addMember(AbstractCharacter member){
        members.add(member);
    }
    public void kickMember(AbstractCharacter member){
        members.remove(member);
    }
    public void doAction(SimpleAction simpleAction){
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
        Group group = (Group) o;
        return Objects.equals(members, group.members);
    }

    @Override
    public int hashCode() {
        return members.hashCode();
    }
}
