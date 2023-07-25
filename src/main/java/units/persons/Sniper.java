package units.persons;

import units.Shooter;
import units.Unit;

import java.util.List;

public class Sniper extends Shooter {
    public Sniper(String name, String type, int health, int maxHealth, int initiative, int defence, int attack, int damage, int energy, int x, int y) {
        super(name, type, health, maxHealth, initiative, defence, attack, damage, energy, x, y);
    }
    public Sniper(String name, int x, int y){
        super(name,"Снайпер", 150, 150,1,30,50,0,3, x, y);
    }
    public Sniper(int x, int y){
        super("Виталя","Снайпер", 150,150, 1,30,50,0,3, x, y);
    }
    @Override
    public String getUnitInfo() {

        return String.format("Имя: %s (%s) \tПозиция: (x = %d, y = %d)",
                this.name, this.type, this.coordinates.x, this.coordinates.y);
    }

    @Override
    public void step(List<Unit> team) {
        Unit tmp = nearest(team);
        System.out.println(tmp.name + " " + coordinates.getDistance(tmp.coordinates));
    }
}
