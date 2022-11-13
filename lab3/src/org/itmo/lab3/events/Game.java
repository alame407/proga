package org.itmo.lab3.events;

import org.itmo.lab3.characters.Animated;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Game implements GameInterface{
    private List<Animated> members;
    public Game(){
        members = new LinkedList<>();
    }
    @Override
    public void start() {
        System.out.println("Игра началась");
    }

    @Override
    public void kickMember(Animated player) {
        if (members.contains(player)) {
            System.out.println(player + " " + "получил мячом по лбу");
            members.remove(player);
        }else{
            System.out.println("Такого игрока нет");
        }
    }

    @Override
    public void addMember(Animated player) {
        System.out.println(player + " " + "участвует в игре");
        members.add(player);
    }

    @Override
    public void end() {
        System.out.println("Игра закончилась");
    }

    @Override
    public String toString() {
        return "Учатсники игры: " + members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return members.equals(game.members);
    }

    @Override
    public int hashCode() {
        return members.hashCode();
    }
}
