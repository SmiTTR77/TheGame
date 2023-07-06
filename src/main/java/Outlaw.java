public class Outlaw extends Soldier{
    public Outlaw(String name, String type, int health, int initiative, int defence, int attack, int energy) {
        super(name, "Разбойник", health, initiative, defence, attack, energy);
    }
    public Outlaw(String name){
        super(name,"Разбойник", 200, 2,50,35,3);
    }
    public Outlaw(){
        super("Соловей","Разбойник", 200, 2,50,35,3);
    }
}
