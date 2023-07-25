package units.persons;

import units.Soldier;
import units.Unit;

import java.util.List;

public class Spearman extends Soldier {
    public Spearman(String name, String type, int health, int maxHealth, int initiative, int defence, int attack, int damage, int energy, int x, int y) {
        super(name, type, health, maxHealth, initiative, defence, attack, damage, energy, x, y);
    }
    public Spearman(String name, int x, int y){
        super(name,"Копейщик", 200, 200,1,40,50,0,3, x, y);
    }
    public Spearman(int x, int y){
        super("Вася","Копейщик", 200, 200,1,40,50,0,3, x, y);
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
