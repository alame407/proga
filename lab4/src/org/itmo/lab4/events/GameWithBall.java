package org.itmo.lab4.events;

import org.itmo.lab4.characters.Player;
import org.itmo.lab4.exceptions.NoBallsLeftException;
import org.itmo.lab4.exceptions.NotEnoughMoneyException;

public interface GameWithBall {
    void start();
    void kickPlayer(Player player);
    void addPlayer(Player player);
    void end(int prize);
    void buyBall(Player player) throws NotEnoughMoneyException;
    void throwBall(Player player, double chance) throws NoBallsLeftException;
}
