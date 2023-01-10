package org.itmo.lab3.events;

import org.itmo.lab3.characters.AbstractCharacter;
import org.itmo.lab3.characters.Animated;
import org.itmo.lab3.printers.ConsolePrinter;
import org.itmo.lab3.printers.Printer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Game implements GameInterface{
    private List<Animated> members;
    protected Printer printer;

    public Game(){
        members = new ArrayList<>();
        printer = new ConsolePrinter();
    }
    public Game(Animated ... members) {
        this.members = new ArrayList<>(List.of(members));
        printer = new ConsolePrinter();
    }
    @Override
    public void start() {
        printer.print("Игра началась");
    }

    @Override
    public void kickMember(AbstractCharacter player) {
        if (members.contains(player)){
            members.remove(player);
            printer.print(player + " " + "получил мячом по лбу");
        }
        else{
            printer.print("Такого игрока нет");
        }

    }

    @Override
    public void addMember(AbstractCharacter player) {
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
