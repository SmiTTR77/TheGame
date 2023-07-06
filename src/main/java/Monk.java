public class Monk extends Healer{
    public Monk(String name, int health, int initiative, int defence, int attack, int energy) {
        super(name,"Монах", health, initiative, defence,attack,energy);
    }
    public Monk(String name){
        super(name, "Монах", 100, 1, 20,20,3);
    }
    public Monk(){
        super("Моня", "Монах", 100, 1, 20,20,3);
    }
}
