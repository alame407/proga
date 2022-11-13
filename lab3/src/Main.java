import org.itmo.lab3.characters.Crowd;
import org.itmo.lab3.characters.Goat;
import org.itmo.lab3.enums.Agility;
import org.itmo.lab3.enums.Height;
import org.itmo.lab3.events.Game;
import org.itmo.lab3.events.GameInterface;

public class Main {
    public static void main(String[] args) {
        Goat goat = new Goat("Козлик", Agility.LOW);
        Crowd crowd = new Crowd("Толпа", Height.SHORT);
        goat.goThrough();
        goat.jump();
        goat.say("");
        crowd.laugh();
        goat.doNotCare();
        GameInterface game = new Game();
        game.addMember(crowd);
        game.addMember(goat);
        goat.hide();
        goat.setAgility(Agility.HIGH);
        game.start();
        game.kickMember(goat);
    }
}
