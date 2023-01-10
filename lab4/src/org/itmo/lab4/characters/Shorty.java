package org.itmo.lab4.characters;

public class Shorty extends OrdinaryCharacter {
    public Shorty(String name, int money) {
        super(name, money);
    }
    public class Eye{
        public void close(){
            printer.print("глаз" + " " + Shorty.this + " " + "закрылся и перестал видеть");
        }
    }
    public class Eyelid{
        public void swell(){
            printer.print("веко у" + " " + Shorty.this + " " + "распухло");
        }
    }
}
