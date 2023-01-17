package org.itmo.lab4.events;

import org.itmo.lab4.characters.AbstractCharacter;
import org.itmo.lab4.characters.Player;
import org.itmo.lab4.exceptions.NoBallsLeftException;
import org.itmo.lab4.exceptions.NoSuchPlayerException;
import org.itmo.lab4.exceptions.NotEnoughMoneyException;
import org.itmo.lab4.printers.ConsolePrinter;
import org.itmo.lab4.printers.Printer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class GameDodgeBall implements GameWithBall {
    protected Printer printer;
    private AbstractCharacter dodger;
    private AbstractCharacter owner;
    private List<Player> players;
    private Balls balls;
    public static class Balls{
        private int ballPrice;
        private int numberOfBalls;
        public Balls(int ballPrice, int numberOfBalls){
            this.ballPrice = ballPrice;
            this.numberOfBalls=numberOfBalls;
        }

        @Override
        public String toString() {
            return "мячи по цене:"+ " " + ballPrice;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Balls balls = (Balls) o;
            return ballPrice == balls.ballPrice && numberOfBalls == balls.numberOfBalls;
        }

        @Override
        public int hashCode() {
            return Objects.hash(ballPrice, numberOfBalls);
        }
    }
    public GameDodgeBall(AbstractCharacter dodger, AbstractCharacter owner, Balls balls){
        this.dodger = dodger;
        this.owner=owner;
        this.balls = balls;
        players = new ArrayList<>();
        printer = new ConsolePrinter();
    }
    @Override
    public void buyBall(Player player) throws NotEnoughMoneyException {
        if (!players.contains(player)) throw new NoSuchPlayerException(player);
        if (player.getMoney() > balls.ballPrice){
            player.setNumberOfBalls(player.getNumberOfBalls()+1);
            player.setMoney(player.getMoney() - balls.ballPrice);
            balls.numberOfBalls -= 1;
            owner.setMoney(owner.getMoney()+ balls.ballPrice);
            printer.print(player + " " + "купил мяч");
        }
        else throw new NotEnoughMoneyException((AbstractCharacter) player);
    }

    @Override
    public void throwBall(Player player, double chance) throws NoBallsLeftException {
        if(!(players.contains(player))) throw new NoSuchPlayerException(player);
        if (!(player.getNumberOfBalls()>0)) throw new NoBallsLeftException(player);
        else if (chance > Math.random()){
            printer.print(player + " " + "попал мячом по" + " " + dodger);
        }
        else{
            printer.print(player + " " + "не попал мячом по" + " " + dodger);
        }
    }
    @Override
    public void start() {
        printer.print("Игра начилась");
    }

    @Override
    public void kickPlayer(Player player) {
        if (players.contains(player)){
            players.remove(player);
        }
        else throw new NoSuchPlayerException(player);
    }

    @Override
    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public void end(int prize) {
        printer.print("Игра закончилась");
        printer.print(owner + " " + "дал" + " " + prize + " " + "сантиков" + " " + dodger);
        owner.setMoney(owner.getMoney()-prize);
        dodger.setMoney(dodger.getMoney()+prize);
    }

    @Override
    public String toString() {
        return "Игра увернись от мяча с участниками:" + " " + players;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameDodgeBall that = (GameDodgeBall) o;
        return Objects.equals(dodger, that.dodger) && Objects.equals(owner, that.owner)
                && Objects.equals(players, that.players) && Objects.equals(balls, that.balls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dodger, owner, players, balls);
    }
}
