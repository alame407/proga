package org.itmo.lab4.inanimate;

import org.itmo.lab4.enums.DayTime;

public class Environment extends Inanimate{
    private DayTime dayTime;
    public Environment(String name, DayTime dayTime) {
        super(name);
        this.dayTime = dayTime;
    }

    public void setDayTime(DayTime dayTime) {
        this.dayTime = dayTime;
    }
}
