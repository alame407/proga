package org.itmo.lab3.events;

import org.itmo.lab3.characters.Animated;
import org.itmo.lab3.structures.ListOfAnimated;

public class Game implements GameInterface{
    private ListOfAnimated members;

    public Game(){
        members = new ListOfAnimated();
    }
    @Override
    public void start() {
        System.out.println("Игра началась");
    }

    @Override
    public void kickMember(Animated player) {
        if (members.contains(player)){
            members.remove(player);
            System.out.println(player + " " + "получил мячом по лбу");
        }
        else{
            System.out.println("Такого игрока нет");
        }

    }

    @Override
    public void addMember(Animated player) {
        members.add(player);
        System.out.println(player + " " + "участвует в игре");
    }

    @Override
    public void end() {
        System.out.println("Игра закончилась");
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
        return members.equals(game.members);
    }

    @Override
    public int hashCode() {
        return members.hashCode();
    }
}
