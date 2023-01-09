package org.itmo.lab4;

import org.itmo.lab4.actions.ComplexAction;
import org.itmo.lab4.actions.SimpleAction;
import org.itmo.lab4.characters.Crowd;
import org.itmo.lab4.characters.Dunno;
import org.itmo.lab4.characters.Goat;
import org.itmo.lab4.enums.Agility;
import org.itmo.lab4.enums.Height;
import org.itmo.lab4.events.Game;
import org.itmo.lab4.events.GameInterface;
import org.itmo.lab4.inanimate.*;
import org.itmo.lab4.structures.GroupOfAnimated;


public class Main {
    public static void main(String[] args) {
        Goat goat = new Goat("Козлик", Agility.LOW);
        Dunno dunno = new Dunno("Незнайка");
        GroupOfAnimated dunnoGroup = new GroupOfAnimated(dunno, goat);
        Street centralStreet = new Street("центральная улица города");
        ComplexAction go = new ComplexAction("забрели", "на", centralStreet);
        dunnoGroup.doSimpleAction(go);
        centralStreet.fill("электрическим светом");
        centralStreet.fill("весельем и музыкой");
        centralStreet.fill("гуляющими и танцующими коротышками");
        centralStreet.fill("скрипением качелей, вертящихся качелей, чертовых колес");
        Crowd crowd = new Crowd("Толпа", Height.SHORT);
        ComplexAction seat = new ComplexAction("сидели", "за", new Place() {
            String name = "столики ресторана";
            @Override
            public String toString() {
                return name;
            }
        });
        crowd.doComplexAction(seat);
        SimpleAction eat = new SimpleAction("угощалась разными вкусными блюдами");
        crowd.doSimpleAction(eat);
        ComplexAction watchWithJealous = new ComplexAction("смотрели", "на", crowd, "зависть");
        dunnoGroup.doSimpleAction(watchWithJealous);
        ComplexAction walk = new ComplexAction("бродили", "вдоль",
                new Street("тротуар кривых зеркал"));
        dunnoGroup.doComplexAction(walk);
        SimpleAction watchReflection = new SimpleAction("смотрели на свои отражения");
        dunnoGroup.doSimpleAction(watchReflection);
        DistoringMirror distoringMirror = new DistoringMirror("Одно из зеркал");
        distoringMirror.reflect(dunnoGroup);
        SimpleAction laugh1 = new SimpleAction("не смогли удержаться от смеха");
        dunnoGroup.doSimpleAction(laugh1);
        dunno.feel("стало меньше хотеться есть");
        Platform platform = new Platform("деревянный помост \"Веселый балаганчик\"");
        SimpleAction meet = new SimpleAction("собрались", "у", platform);
        crowd.doSimpleAction(meet);
        SimpleAction saw = new SimpleAction("увидели", "", crowd);

        Curtain curtain = new Curtain("занавеска");
        SimpleAction goTrough = new SimpleAction("пролез", "сквозь", crowd);
        goat.doSimpleAction(goTrough);
        SimpleAction jump = new SimpleAction("запрыгнул", "на", platform);
        goat.doSimpleAction(jump);
        SimpleAction say = new SimpleAction("сказал: \"\"");
        goat.doSimpleAction(say);
        SimpleAction laugh2 = new SimpleAction("засмеялась");
        crowd.doSimpleAction(laugh2);
        SimpleAction doNotCare = new SimpleAction("не обращает внимание", "на", crowd);
        goat.doSimpleAction(doNotCare);
        GameInterface game = new Game();
        game.addMember(crowd);
        game.addMember(goat);
        goat.hide(curtain);
        goat.setAgility(Agility.HIGH);
        game.start();
        game.kickMember(goat);
    }
}
