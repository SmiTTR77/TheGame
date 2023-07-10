package units.persons;

import units.Shooter;
import units.Unit;

public class Crossbowman extends Shooter {
    public Crossbowman(String name, String type, int health, int maxHealth, int initiative, int defence, int attack, int damage, int energy) {
        super(name, type, health, maxHealth, initiative, defence, attack, damage, energy);
        this.type = "Арбалетчик";
    }

    public Crossbowman(String name){
        super(getName(),"Арбалетчик", 200, 200,1,30,45,0,3);
    }
    public Crossbowman(){
        super("Егорка","Арбалетчик", 200, 200,1,30,45,0,3);
    }

    @Override
    public String getUnitInfo() {

        return String.format("Имя: %s (%s)",
                this.name, this.type);
    }
}
