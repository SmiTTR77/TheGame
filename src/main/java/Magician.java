public class Magician extends Healer{
    public Magician(String name, String type, int health, int initiative, int defence, int attack, int energy) {
        super(name, "Маг", health, initiative, defence, attack, energy);
    }
    public Magician(String name){
        super(name,"Маг", 200, 1,30,5,3);
    }
    public Magician(){
        super("Гендальф","Маг", 200, 1,30,5,3);
    }
}
