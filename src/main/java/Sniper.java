public class Sniper extends Shooter{
    public Sniper(String name, String type, int health, int initiative, int defence, int attack, int energy) {
        super(name, "Снайпер", health, initiative, defence, attack, energy);
    }
    public Sniper(String name){
        super(name,"Снайпер", 150, 1,30,50,3);
    }
    public Sniper(){
        super("Виталя","Снайпер", 150, 1,30,50,3);
    }
}
