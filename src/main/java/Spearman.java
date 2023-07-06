public class Spearman extends Soldier{
    public Spearman(String name, String type, int health, int initiative, int defence, int attack, int energy) {
        super(name, "Копейщик", health, initiative, defence, attack, energy);
    }
    public Spearman(String name){
        super(name,"Копейщик", 200, 1,40,50,3);
    }
    public Spearman(){
        super("Вася","Копейщик", 200, 1,40,50,3);
    }
}
