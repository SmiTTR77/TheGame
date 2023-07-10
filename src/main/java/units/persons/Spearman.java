package units.persons;

import units.Soldier;

public class Spearman extends Soldier {
    public Spearman(String name, String type, int health, int maxHealth, int initiative, int defence, int attack, int damage, int energy) {
        super(name, type, health, maxHealth, initiative, defence, attack, damage, energy);
    }
    public Spearman(String name){
        super(name,"Копейщик", 200, 200,1,40,50,0,3);
    }
    public Spearman(){
        super("Вася","Копейщик", 200, 200,1,40,50,0,3);
    }
    @Override
    public String getUnitInfo() {

        return String.format("Имя: %s (%s)",
                this.name, this.type);
    }
}
