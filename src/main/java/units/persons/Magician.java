package units.persons;

import units.Healer;

public class Magician extends Healer {
    public Magician(String name, String type, int health, int maxHealth, int initiative, int defence, int attack, int damage, int energy) {
        super(name, type, health, maxHealth, initiative, defence, attack, damage, energy);
    }
    public Magician(String name){
        super(name,"Маг", 200, 200,1,30,5,0,3);
    }
    public Magician(){
        super("Гендальф","Маг", 200, 200,1,30,5,0,3);
    }
    @Override
    public String getUnitInfo() {

        return String.format("Имя: %s (%s)",
                this.name, this.type);
    }
}
