package org.itmo.lab4;

import org.itmo.lab4.actions.ComplexAction;
import org.itmo.lab4.actions.SimpleAction;
import org.itmo.lab4.characters.*;
import org.itmo.lab4.enums.Agility;
import org.itmo.lab4.enums.Height;
import org.itmo.lab4.events.GameWithBall;
import org.itmo.lab4.events.GameDodgeBall;
import org.itmo.lab4.exceptions.NoBallsLeftException;
import org.itmo.lab4.exceptions.NotEnoughMoneyException;
import org.itmo.lab4.inanimate.*;
import org.itmo.lab4.structures.Group;


public class Main {
    public static void main(String[] args) {
        Goat goat = new Goat("Козлик", Agility.LOW, (int)(Math.random()*100));
        Dunno dunno = new Dunno("Незнайка",  (int)(Math.random()*100));
        Group dunnoGroup = new Group();
        dunnoGroup.addMember(dunno);
        dunnoGroup.addMember(goat);
        Crowd crowd = new Crowd("Толпа", Height.SHORT,  (int)(Math.random()*100));
        Place tables = new Place() {
            @Override
            public String name() {
                return "столики ресторана";
            }
        };
        ComplexAction seat = new ComplexAction("сидели", "за", tables);
        crowd.doAction(seat);
        SimpleAction eat = new SimpleAction("угощалась разными вкусными блюдами");
        crowd.doAction(eat);
        ComplexAction watchWithJealous = new ComplexAction("смотрели", "на", crowd, " с завистью");
        dunnoGroup.doAction(watchWithJealous);
        ComplexAction walk = new ComplexAction("бродили", "вдоль",
                new Street("тротуар кривых зеркал"));
        dunnoGroup.doAction(walk);
        SimpleAction watchReflection = new SimpleAction("смотрели на свои отражения");
        dunnoGroup.doAction(watchReflection);
        DistoringMirror distoringMirror = new DistoringMirror("Одно из зеркал");
        distoringMirror.reflect(dunnoGroup);
        SimpleAction laugh1 = new SimpleAction("не смогли удержаться от смеха");
        dunnoGroup.doAction(laugh1);
        dunno.feel("стало меньше хотеться есть");
        Platform platform = new Platform("деревянный помост \"Веселый балаганчик\"");
        SimpleAction meet = new SimpleAction("собрались", "у", platform);
        crowd.doAction(meet);
        SimpleAction saw = new SimpleAction("увидел", "", crowd);
        Shorty shorty = new Shorty("коротышка",  (int)(Math.random()*100));
        Curtain curtain = new Curtain("занавеска", "простыня");
        ComplexAction stand =new ComplexAction("стоял", "за",curtain);
        shorty.doAction(stand);
        OrdinaryCharacter gameOwner = new OrdinaryCharacter("Хозяин балаганчика", 9999);
        GameDodgeBall.Balls balls = new GameDodgeBall.Balls(5,100);
        Place basket = new Basket("корзина", balls);
        Establishment establishment = new Establishment("Увесилительное заведение",gameOwner);
        establishment.open();
        GameWithBall gameWithShorty = new GameDodgeBall(shorty, gameOwner, balls);
        OrdinaryPlayer watchers = new OrdinaryPlayer("зрители",(int)(Math.random()*100));
        gameWithShorty.start();
        gameWithShorty.addPlayer(watchers);
        try {
            gameWithShorty.buyBall(watchers);
        }
        catch (NotEnoughMoneyException e){
            System.out.println(e.getMessage());
        }
        try {
            gameWithShorty.throwBall(watchers, 0.1);
        }
        catch (NoBallsLeftException e){
            System.out.println(e.getMessage());
        }
        SimpleAction makingFace = new SimpleAction("грамвсничал");
        shorty.doAction(makingFace);
        SimpleAction moves = new SimpleAction("дергался в сторону");
        shorty.doAction(moves);
        SimpleAction fun = new SimpleAction("веселились");
        watchers.doAction(fun);
        SimpleAction come = new SimpleAction("подошли");
        dunnoGroup.doAction(come);
        SimpleAction watch = new SimpleAction("глядели" ,"на", shorty);
        dunnoGroup.doAction(watch);
        saw.setObject("", gameOwner);
        dunno.doAction(saw);
        SimpleAction beAround = new SimpleAction("находился", "возле", basket);
        gameOwner.doAction(beAround);
        OrdinaryPlayer watcher = new OrdinaryPlayer("зритель", 100);
        gameWithShorty.addPlayer(watcher);
        for (int i=0; i<5;i++){
            try{
                gameWithShorty.buyBall(watcher);
            }
            catch (NotEnoughMoneyException e){
                System.out.println(e.getMessage());
            }
        }
        for (int i=0;i<4;i++){
            try{
                gameWithShorty.throwBall(watcher, 0);
            }
            catch(NoBallsLeftException e){
                System.out.println(e.getMessage());
            }
        }
        try{
            gameWithShorty.throwBall(watcher, 1);
            shorty.injureEyes("попадание мяча");
        }
        catch(NoBallsLeftException e){
            System.out.println(e.getMessage());
        }
        shorty.doAction(new SimpleAction("сказал, что не сможет сегодня работать"));
        shorty.doAction(new SimpleAction("ушел домой"));
        gameWithShorty.end(0);
        gameOwner.doAction(new SimpleAction("взобрался", "на", platform));
        gameOwner.doAction(new SimpleAction("закричал"));

        SimpleAction goTrough = new SimpleAction("пролез", "сквозь", crowd);
        goat.doAction(goTrough);
        SimpleAction jump = new SimpleAction("запрыгнул", "на", platform);
        goat.doAction(jump);
        SimpleAction say = new SimpleAction("сказал: \"\"");
        goat.doAction(say);
        crowd.doAction(new SimpleAction("засмеялась"));
        SimpleAction doNotCare = new SimpleAction("не обращает внимание", "на", crowd);
        goat.doAction(doNotCare);
        GameWithBall gameWithGoat = new GameDodgeBall(goat, gameOwner, balls);
        gameWithGoat.addPlayer(crowd);
        goat.hide(curtain);
        goat.setAgility(Agility.HIGH);
        gameWithGoat.start();
        try {
            gameWithGoat.buyBall(crowd);
        }
        catch (NotEnoughMoneyException e){
            System.out.println(e.getMessage());
        }
        try {
            gameWithGoat.throwBall(crowd, 1);
            goat.doAction(new SimpleAction("ошеломлен"));
        }
        catch (NoBallsLeftException e){
            System.out.println(e.getMessage());
        }
        for (int i=0;i<2;i++) {
            try {
                gameWithGoat.buyBall(crowd);
            }
            catch (NotEnoughMoneyException e){
                System.out.println(e.getMessage());
            }
        }
        for (int i=0;i<2;i++){
            try {
                gameWithGoat.throwBall(crowd, 0.5);
            }
            catch (NoBallsLeftException e){
                System.out.println(e.getMessage());
            }
        }
        goat.doAction(new SimpleAction("невольно заплакал"));
        goat.doAction(new SimpleAction("дергался из стороны в сторону"));
        goat.doAction(new SimpleAction("крепко зажмурился"));
        watchers.doAction(new SimpleAction("веселились вовсю"));
        OrdinaryCharacter passersby = new OrdinaryCharacter("прохожие", (int)(Math.random()*100));
        passersby.doAction(new SimpleAction("присоединились", "к", crowd));
        gameOwner.doAction(new SimpleAction("едва успевал получать деньги"));
        dunno.doAction(new ComplexAction("следил", "за", goat, "с замиранием сердца"));
        dunno.feel("удары доставились ему самому");
        dunno.feel("был готов поколотить всех");
        crowd.thin();
        crowd.disappear();
        gameWithGoat.end(3);
        establishment.close();
        Place dinningRoom = new Place() {
            @Override
            public String name() {
                return "столовая";
            }
        };
        dunnoGroup.doAction(new ComplexAction("сидели",  "в", dinningRoom));
        dunnoGroup.doAction(new ComplexAction("уплетали вкусный перловый суп", "с аппетитом"));
        goat.doAction(new SimpleAction("крякал от удовольствия"));
        dunno.doAction(new SimpleAction("расхваливал еду"));
    }
}
