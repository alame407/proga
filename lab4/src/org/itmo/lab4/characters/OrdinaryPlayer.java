package org.itmo.lab4.characters;

public class OrdinaryPlayer extends OrdinaryCharacter implements Player{
    private int numberOfBalls;
    public OrdinaryPlayer(String name, int money){
        super(name, money);
        numberOfBalls = 0;
    }

    @Override
    public void setNumberOfBalls(int numberOfBalls) {
        this.numberOfBalls = numberOfBalls;
    }

    @Override
    public int getNumberOfBalls() {
        return numberOfBalls;
    }
}
