package org.itmo.lab4.exceptions;
import org.itmo.lab4.characters.Player;

public class NoSuchPlayerException extends RuntimeException{
    public NoSuchPlayerException(Player player){
        super(player + " " + "не учавствует в игре");
    }
}
