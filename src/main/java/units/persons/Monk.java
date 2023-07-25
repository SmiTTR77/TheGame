package units.persons;

import units.Healer;
import units.Unit;

import java.util.List;

public class Monk extends Healer {
    public Monk(String name, String type, int health, int maxHealth, int initiative, int defence, int attack, int damage, int energy, int x, int y) {
        super(name, type, health, maxHealth, initiative, defence, attack, damage, energy, x, y);
    }
    public Monk(String name, int x, int y){
        super(name, "Монах", 100, 100,1, 20,20,0,3, x, y);
    }
    public Monk(int x, int y){
        super("Моня", "Монах", 100, 100,1, 20,20,0,3, x, y);
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
