package org.itmo.lab4.characters;

public class Shorty extends OrdinaryCharacter {
    public Shorty(String name, int money) {
        super(name, money);
    }
    public class Eyes {
        public void close(){
            printer.print("глаза" + " " + Shorty.this + " " + "закрылись и перестали видеть");
        }
    }
    public void injureEyes(String cause){
        class Eyelid{
            public String swell(String cause){
                return "веко у" + " " + Shorty.this + " " + "распухло из-за" + " " + cause;
            }
        }
        Eyelid eyelid = new Eyelid();
        Shorty  .Eyes shortyEyes = new Eyes();
        shortyEyes.close();
        printer.print(eyelid.swell(cause));
    }
}
