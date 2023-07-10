package units.persons;

import units.Healer;

public class Monk extends Healer {
    public Monk(String name, String type, int health, int maxHealth, int initiative, int defence, int attack, int damage, int energy) {
        super(name, type, health, maxHealth, initiative, defence, attack, damage, energy);
    }
    public Monk(String name){
        super(name, "Монах", 100, 100,1, 20,20,0,3);
    }
    public Monk(){
        super("Моня", "Монах", 100, 100,1, 20,20,0,3);
    }
    @Override
    public String getUnitInfo() {

        return String.format("Имя: %s (%s)",
                this.name, this.type);
    }
}
