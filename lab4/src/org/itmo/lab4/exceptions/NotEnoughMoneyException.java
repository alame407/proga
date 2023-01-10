package org.itmo.lab4.exceptions;

import org.itmo.lab4.characters.Animated;

public class NotEnoughMoneyException extends Exception{
    public NotEnoughMoneyException(Animated animated){
        super("у" + " " + animated + " " + "недостаточно денег");
    }
}
