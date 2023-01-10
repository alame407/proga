package org.itmo.lab4.events;

import org.itmo.lab4.characters.AbstractCharacter;
import org.itmo.lab4.characters.Animated;
import org.itmo.lab4.exceptions.NoSuchPlayerExceptions;
import org.itmo.lab4.exceptions.NotEnoughMoneyException;
import org.itmo.lab4.inanimate.Inanimate;
import org.itmo.lab4.inanimate.PlaceToHide;
import org.itmo.lab4.printers.Printer;

public class GameDodgeBall extends Game implements GameWithBall{
    protected Printer printer;
    private Animated dodger;
    private Balls balls;
    public class Balls{
        private int ballPrice;
        public Balls(int ballPrice){
            this.ballPrice = ballPrice;
        }
        public void buyBall(AbstractCharacter player) throws NotEnoughMoneyException{
            if (player.getMoney() >= ballPrice){
                printer.print(player + " " + "купил мяч");
                player.setMoney(player.getMoney() - ballPrice);
            }
            else throw new NotEnoughMoneyException(player);
        }
        public void throwBall(AbstractCharacter fromPlayer, AbstractCharacter toPlayer, float chance){
            if (chance >= Math.random()){
                printer.print(fromPlayer + " " + "попал по"+ " " + toPlayer);
            }

        }
    }
    public GameDodgeBall(AbstractCharacter dodger, int ballPrice){
        this.dodger = dodger;
        this.balls = new Balls(ballPrice);
    }
    public GameDodgeBall(AbstractCharacter dodger, int ballPrice, AbstractCharacter ... members){
        this.dodger = dodger;
        this.balls = new Balls(ballPrice);

    }
    @Override
    public void throwBall(AbstractCharacter fromPlayer, AbstractCharacter toPlayer, float chance)throws NoSuchPlayerExceptions {
        if(!contains(fromPlayer)) throw new NoSuchPlayerExceptions(fromPlayer);
        else if (!contains(toPlayer)) throw new NoSuchPlayerExceptions(toPlayer);
        else{
            balls.throwBall(fromPlayer,toPlayer, chance);
        }
    }
}
