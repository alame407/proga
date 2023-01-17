package org.itmo.lab4.exceptions;

import org.itmo.lab4.characters.Player;

public class NoBallsLeftException extends Exception{
    public NoBallsLeftException(Player player){
        super("у" + " " + player + " " + "не осталось мячей");
    }
}
