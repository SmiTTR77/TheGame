package units.persons;

import units.Soldier;

public class Outlaw extends Soldier {
    public Outlaw(String name, String type, int health, int maxHealth, int initiative, int defence, int attack, int damage, int energy) {
        super(name, type, health, maxHealth, initiative, defence, attack, damage, energy);
    }
    public Outlaw(String name){
        super(name,"Разбойник", 200, 200,2,50,35,0,3);
    }
    public Outlaw(){
        super("Соловей","Разбойник", 200, 200,2,50,35,0,3);
    }
    @Override
    public String getUnitInfo() {

        return String.format("Имя: %s (%s)",
                this.name, this.type);
    }
}
