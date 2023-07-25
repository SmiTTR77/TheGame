package units.persons;
import units.Shooter;
import units.Unit;

import java.util.List;

public class Crossbowman extends Shooter {
    public Crossbowman(String name, String type, int health, int maxHealth, int initiative, int defence, int attack, int damage, int energy, int x, int y) {
        super(name, type, health, maxHealth, initiative, defence, attack, damage, energy, x, y);
        this.type = "Арбалетчик";
    }

    public Crossbowman(String name, int x, int y){
        super(getName(),"Арбалетчик", 200, 200,1,30,45,0,3, x, y);
    }
    public Crossbowman(int x, int y){
        super("Егорка","Арбалетчик", 200, 200,1,30,45,0,3, x, y);
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
