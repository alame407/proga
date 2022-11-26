package org.itmo.lab3.events;

import org.itmo.lab3.characters.Animated;

public class Game implements GameInterface{
    private Animated[] members;
    private int numberOfPlayers;
    public Game(){
        members = new Animated[100];
        numberOfPlayers = 0;
    }
    @Override
    public void start() {
        System.out.println("Игра началась");
    }

    @Override
    public void kickMember(Animated player) {
        boolean inArray = false;
        int indexInArray = -1;
        for (int i=0; i<numberOfPlayers; i++){
            if (members[i].equals(player)){
                inArray = true;
                indexInArray = i;
            }
        }
        if (inArray){
            Animated[] newMembrs = new Animated[100];
            int currentIndex = 0;
            for (int i = 0; i<numberOfPlayers; i++){
                if (i!=indexInArray){
                    newMembrs[currentIndex] = members[i];
                    currentIndex++;
                }
            }
            members = newMembrs;
            numberOfPlayers--;
            System.out.println(player + " " + "получил мячом по лбу");
        }
        else{
            System.out.println("Такого игрока нет");
        }

    }

    @Override
    public void addMember(Animated player) {
        if (numberOfPlayers < 100) {
            System.out.println(player + " " + "участвует в игре");
            members[numberOfPlayers] = player;
            numberOfPlayers += 1;
        }
        else{
            System.out.println("Уже максимальное количество участников");
        }
    }

    @Override
    public void end() {
        System.out.println("Игра закончилась");
    }

    @Override
    public String toString() {
        String string = "Участники игры: [";
        for (int i=0; i<numberOfPlayers; i++){
            string += members[i];
            if (i != numberOfPlayers-1){
                string += " ";
            }
        }
        string += "]";
        return string;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        if (numberOfPlayers!= game.numberOfPlayers){
            return false;
        }
        for (int i=0; i < numberOfPlayers; i++){
            if (members[i]!=game.members[i]) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (int i = 0; i < numberOfPlayers; i++){
            hash = hash*31+members[i].hashCode();
        }
        return hash;
    }
}
