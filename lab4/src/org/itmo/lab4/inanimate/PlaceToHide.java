package org.itmo.lab4.inanimate;

import org.itmo.lab4.characters.Animated;

public interface PlaceToHide extends Place{
    void restrictMovement(Animated animated);
}