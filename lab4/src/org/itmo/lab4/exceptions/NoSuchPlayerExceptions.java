package org.itmo.lab4.exceptions;

import org.itmo.lab4.characters.AbstractCharacter;

public class NoSuchPlayerExceptions extends RuntimeException{
    public NoSuchPlayerExceptions(AbstractCharacter abstractCharacter){
        super(abstractCharacter + " " + "не учавствует в игре");
    }
}
