public class Crossbowman extends Shooter{
    public Crossbowman(String name, int health, int initiative, int defence, int attack, int energy) {
        super(name, "Арбалетчик", health, initiative, defence, attack, energy);
    }
    public Crossbowman(String name){
        super(name,"Арбалетчик", 200, 1,30,45,3);
    }
    public Crossbowman(){
        super("Егорка","Арбалетчик", 200, 1,30,45,3);
    }
}
