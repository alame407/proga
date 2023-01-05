package org.itmo.lab4.events;

import org.itmo.lab4.characters.Animated;
import org.itmo.lab4.printers.ConsolePrinter;
import org.itmo.lab4.printers.Printer;
import org.itmo.lab4.structures.ListOfAnimated;

import java.util.Objects;

public class Game implements GameInterface{
    private ListOfAnimated members;
    private Printer printer;

    public Game(){
        members = new ListOfAnimated();
        printer = new ConsolePrinter();
    }
    @Override
    public void start() {
        printer.print("Игра началась");
    }

    @Override
    public void kickMember(Animated player) {
        if (members.contains(player)){
            members.remove(player);
            printer.print(player + " " + "получил мячом по лбу");
        }
        else{
            printer.print("Такого игрока нет");
        }

    }

    @Override
    public void addMember(Animated player) {
        members.add(player);
        printer.print(player + " " + "участвует в игре");
    }

    @Override
    public void end() {
        printer.print("Игра закончилась");
    }

    @Override
    public String toString() {
        return "Участники игры: " + members.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(members, game.members);
    }

    @Override
    public int hashCode() {
        return members.hashCode();
    }
}
