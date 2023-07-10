package units.persons;

import units.Unit;

public class Peasant extends Unit {
    public Peasant(String name, String type, int health, int maxHealth, int initiative, int defence, int attack, int damage, int energy) {
        super(name, type, health, maxHealth, initiative, defence, attack, damage, energy);
    }
    public Peasant(String name){
        super(name,"Крестьянин", 150, 150,1,10,5,0,3);
    }
    public Peasant(){
        super("Иванушка","Крестьянин", 150, 150,1,10,5,0,3);
    }
    @Override
    public String getUnitInfo() {

        return String.format("Имя: %s (%s)",
                this.name, this.type);
    }
}
