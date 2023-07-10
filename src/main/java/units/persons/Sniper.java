package units.persons;

import units.Shooter;

public class Sniper extends Shooter {
    public Sniper(String name, String type, int health, int maxHealth, int initiative, int defence, int attack, int damage, int energy) {
        super(name, type, health, maxHealth, initiative, defence, attack, damage, energy);
    }
    public Sniper(String name){
        super(name,"Снайпер", 150, 150,1,30,50,0,3);
    }
    public Sniper(){
        super("Виталя","Снайпер", 150,150, 1,30,50,0,3);
    }
    @Override
    public String getUnitInfo() {

        return String.format("Имя: %s (%s)",
                this.name, this.type);
    }
}
