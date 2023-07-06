public class Peasant extends Unit{
    public Peasant(String name, String type, int health, int initiative, int defence, int attack, int energy) {
        super(name, "Крестьянин", health, initiative, defence, attack, energy);
    }
    public Peasant(String name){
        super(name,"Крестьянин", 150, 1,10,5,3);
    }
    public Peasant(){
        super("Иванушка","Крестьянин", 150, 1,10,5,3);
    }
}
