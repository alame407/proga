package org.itmo.lab4.exceptions;

import org.itmo.lab4.characters.AbstractCharacter;

public class NotEnoughMoneyException extends Exception{
    public NotEnoughMoneyException(AbstractCharacter animated){
        super("у" + " " + animated + " " + "недостаточно денег");
    }
}
